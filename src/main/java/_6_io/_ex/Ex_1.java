package _6_io._ex;

import java.io.*;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * Задан файл с многострочным тестом. Прочитать и вывести этот файл в консоль построчно.
 */
public class Ex_1 {
    public static void printFile() {
        try (InputStream inputStream = new FileInputStream("Pushkin")) {
            InputStreamReader inputStreamReader = new InputStreamReader(inputStream);
            BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
            String str;
            while ((str = bufferedReader.readLine())!=null){
                System.out.println(str);

            }

        }catch (Exception ex)
        {}
    }

    public static void main(String[] args) {

        printFile();
    }
}
