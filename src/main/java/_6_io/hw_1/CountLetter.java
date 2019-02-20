package _6_io.hw_1;

import org.jetbrains.annotations.NotNull;

import java.io.*;
import java.util.Map;
import java.util.TreeMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Задан файл со стихотворением Александра Пушкина.
 * Определить частоту повторяемости всех букв в стихотворении, игнорируя регистр.
 * Вывести результат в файл в виде:
 * а - 15
 * б - Output
 * и т.д.
 */
public class CountLetter {
    private Map<Character, Integer> lettersMap;
    private final int bufferReaderSize = 1024;
    private final String regx = "[а-яА-Я]";

    public CountLetter() {
        cleanLettersMap();
    }

    public void count(@NotNull InputStream in, @NotNull OutputStream out) throws IOException {
        cleanLettersMap();

        BufferedReader textReader = new BufferedReader(new InputStreamReader(in), bufferReaderSize);
        String text;
        while ((text = textReader.readLine()) != null) {
            addLetters(text);
        }

        Writer textWriter = new BufferedWriter(new OutputStreamWriter(out), bufferReaderSize);
        this.lettersMap.forEach((k, v) -> {
            try {
                textWriter.write(k + " - " + v + "\n");
            } catch (IOException e) {
                e.printStackTrace();
            }
        });
        textWriter.flush();
    }

    public void addLetters(@NotNull String text) {
        Matcher rusLetters = Pattern.compile(this.regx).matcher(text);

        while (rusLetters.find()) {
            addMapLetter(rusLetters.group().charAt(0));
        }
    }

    private void addMapLetter(Character letter) {
        this.lettersMap.put(letter, this.lettersMap.getOrDefault(letter, 0) + 1);
    }

    public void cleanLettersMap() {
        this.lettersMap = new TreeMap<>();
    }

    public static void main(String[] args) {

        try (InputStream in = new FileInputStream("Pushkin");
             OutputStream out = new FileOutputStream("Output")) {

            new CountLetter().count(in, out);

        } catch (IOException ex) {

        }
    }
}
