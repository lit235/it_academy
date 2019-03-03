package _6_io.hw_1_1;

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

    public void count(@NotNull File inFile, @NotNull File outFile) throws IOException {
        cleanLettersMap();
        try (BufferedReader textReader = new BufferedReader(new InputStreamReader(new FileInputStream(inFile)), bufferReaderSize);
             Writer textWriter = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(outFile)), bufferReaderSize);
        ) {
            String text;
            while ((text = textReader.readLine()) != null) {
                addLetters(text);
            }

            this.lettersMap.forEach((k, v) -> {
                try {
                    textWriter.write(k + " - " + v + "\n");
                } catch (IOException e) {
                    e.printStackTrace();
                }
            });
            textWriter.flush();
        } catch (IOException ex) {
            throw new UncheckedIOException(ex);
        }
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

    private void cleanLettersMap() {
        this.lettersMap = new TreeMap<>();
    }

    public static void main(String[] args) throws IOException {
        File in = new File("Pushkin");
        File out = new File("Output");


            new CountLetter().count(in, out);


    }
}
