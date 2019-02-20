package _6_io._ex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Задан файл с текстом. В каждой строке найти и вывести наибольшее число цифр, идущих подряд.
 */
public class Ex_4 {
    public static void maxNumbers(String str) {
        String regx = "\\d+";
        Pattern pattern = Pattern.compile(regx);
        Matcher matcher = pattern.matcher(str);
        String out = "";
        while (matcher.find()) {
            if (matcher.group().length() > out.length()) {
                out = matcher.group();
            }
        }
        System.out.println(out);
    }

    public static void main(String[] args) {
        maxNumbers("wefwf23eregergreg545564g egerg rthrth erth44  g rth rthrthrth7777");
    }
}
