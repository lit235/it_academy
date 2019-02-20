package _6_io._ex;

import java.io.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Задан файл с текстом, найти и вывести в консоль все слова,
 * для которых последняя буква одного слова совпадает с первой буквой следующего слова
 */
public class Ex_3 {
    public static void printWord(String str) {
        String regs = "(\\w+?)(\\w)\\s+(\\w)";
        Pattern pattern = Pattern.compile(regs);
        Matcher matcher = pattern.matcher(str);
        while (matcher.find()) {
            if (matcher.group(2).equals(matcher.group(3))) {
                System.out.println(matcher.group(1) + matcher.group(2));
            }
        }
    }

    public static void main(String[] args) {

        printWord("wjhwjwjw     whjhjk kfnvnf oijjnln");
    }
}
