package _7_concurrent._ex_1;

/**
 * Напишите программу, которая создает Thread.
 * Используйте атрибуты по умолчанию. Родительская и вновь созданная нити должны
 * распечатать по десять строк текста.
 */
public class Lessons_1 {
    public static void main(String[] args) {
        Runnable tred = () -> {
            for (int i = 0; i < 10; i++) {
                System.err.println("tred " + i);
            }
        };

        new Thread(tred).start();
        for (int i = 0; i < 10; i++) {
            System.err.println("Main" + i);
        }
    }
}
