package _6_io._ex;


import java.io.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Задан файл с java-кодом. Прочитать текст программы из файла и все слова public в
 * объявлении атрибутов и методов класса заменить на слово private.
 * Результат сохранить в другой заранее созданный файл.
 */

public class Ex_5 {
    public static void converterPublicPrivate(InputStream is, OutputStream os) {
        String regx = "public";
        Pattern pattern = Pattern.compile(regx);
        InputStreamReader inputStreamReader = new InputStreamReader(is);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);

        OutputStreamWriter outputStreamWriter = new OutputStreamWriter(os);
        BufferedWriter bufferedWriter = new BufferedWriter(outputStreamWriter);

        String str;

        try {
            while ((str = bufferedReader.readLine()) != null) {
                Matcher matcher = pattern.matcher(str);
                bufferedWriter.write(matcher.replaceAll("private") + "\n");
            }
            bufferedWriter.flush();
        } catch (IOException ex) {

        }
    }

    public static void main(String[] args) throws FileNotFoundException {
        converterPublicPrivate(new FileInputStream("Pushkin"), new FileOutputStream("Output"));
    }

}
