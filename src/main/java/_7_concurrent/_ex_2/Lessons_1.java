package _7_concurrent._ex_2;

/**
 * Модифицируйте программу ex_1.1 так, чтобы вывод родительской и дочерней нитей был синхронизован:
 * сначала родительская нить выводила первую строку, затем дочерняя,
 * затем родительская вторую строку и т.д. Используйте мьютексы.
 * Запрещается использовать явные (yield()) и неявные (sleep() и т.д.)
 * передачи управления между нитями и ожидание в цикле.
 */
public class Lessons_1 {
    public static Object mutex = new Object();

    public void print(String str) throws InterruptedException {
        synchronized (mutex) {
            mutex.notify();
            System.err.println(str);
            mutex.wait();
        }
    }

    public static void main(String[] args) throws InterruptedException {
        Lessons_1 l = new Lessons_1();
        Runnable r1 = () -> {
            for (int i = 0; i < 10; i++) {
                try {
                    l.print("tread 1");
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        };

        Thread tr1 = new Thread(r1);
        tr1.start();

        for (int i = 0; i < 100; i++) {
           synchronized (mutex){
               mutex.notify();
               l.print("main");
           }
        }
    }
}
