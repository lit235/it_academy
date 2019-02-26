package _7_concurrent._ex_1;

/**
 * Модифицируйте программу упр. 1 так, чтобы вывод родительской нити производился после завершения дочерней.
 */
public class Lessons_2 {
    public static void main(String[] args) throws InterruptedException {
        Runnable runnable = () -> {
            for (int i = 0; i < 10; i++) {
                System.err.println("tred " + i);
            }
        };

        Thread thread = new Thread(runnable);
        thread.start();

        thread.join();

        for (int i = 0; i < 10; i++) {
            System.err.println("Main" + i);
        }

    }
}
