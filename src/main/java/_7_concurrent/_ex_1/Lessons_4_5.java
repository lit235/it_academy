package _7_concurrent._ex_1;

import java.util.concurrent.atomic.AtomicInteger;


/**
 * Дочерняя нить должна распечатывать текст на экран.
 * Через две секунды после создания дочерней нити, родительская нить должна прервать ее.
 */
public class Lessons_4_5 {
    public static void main(String[] args) throws InterruptedException {
        AtomicInteger ai = new AtomicInteger();
        Runnable r1 = () -> {
            while (true) {
                for (int i = 0; i < 100_000; i++) {
                    Math.sin((double) i);
                }
                System.err.println("thred  " + ai.getAndIncrement());
                if (Thread.currentThread().isInterrupted()){
                    System.err.println("thred interapt");
                    break;
                }
            }
        };

        System.err.println("start thred");

        Thread t1 = new Thread(r1);
        t1.start();

        Thread.sleep(5000);

        System.err.println("Interapt");
        t1.interrupt();

    }

}
