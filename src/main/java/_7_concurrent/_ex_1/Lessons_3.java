package _7_concurrent._ex_1;

/**
 * Напишите программу, которая создает четыре нити, исполняющие одну и ту же функцию.
 * Эта функция должна распечатать последовательность текстовых строк, переданных как параметр.
 * Каждая из созданных нитей должна распечатать различные последовательности строк.
 */
public class Lessons_3 {
    public static void main(String[] args) {
        Runnable r1 = () -> {
            for (int i = 0; i < 5; i++) {
                print("tr1 " + i);
            }
        };

        Runnable r2 = () -> {
            for (int i = 0; i < 5; i++) {
                print("tr2 " + i);
            }
        };

        Runnable r3 = () -> {
            for (int i = 0; i < 5; i++) {
                print("tr3 " + i);
            }
        };

        Runnable r4 = () -> {
            for (int i = 0; i < 5; i++) {
                print("tr1 " + i);
            }
        };

        new Thread(r1).start();
        new Thread(r2).start();
        new Thread(r3).start();
        new Thread(r4).start();
    }

    static void print(String str) {
        System.err.println(str);
    }
}
