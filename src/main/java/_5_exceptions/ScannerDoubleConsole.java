package _5_exceptions;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Напишите метод public List readValues() throws ..., читающий числа с плавающей точкой из ввода консоли,
 * через Scanner. Сгенерируйте подходящие исключения, если ввод если введены данные, не относящиеся
 * к числам с плавающей точкой. Ввод:
 * <p>
 * 1 2 3 4 aaaa
 */
public class ScannerDoubleConsole {
    public List readValues()  {
        Scanner cs = new Scanner(System.in);
        List<Double> doubleList = new ArrayList<>();
        try {
            while (cs.hasNext()) {
                doubleList.add(Double.valueOf(cs.next()));
        }

        } catch (NumberFormatException ex) {
            System.err.println(ex);
        }
        return doubleList;
    }

    public static void main(String[] args) {
        System.out.println(new ScannerDoubleConsole().readValues());
    }
}
