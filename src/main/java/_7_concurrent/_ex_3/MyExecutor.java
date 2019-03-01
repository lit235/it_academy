package _7_concurrent._ex_3;


import org.jetbrains.annotations.NotNull;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * Реализуйте свой java.util.concurrent.Executor на основе многопоточной очереди.
 */
public class MyExecutor implements Executor {
    private final int maxRunnable;
    private BlockingQueue<Runnable> runnableQuene;

    public MyExecutor(int maxRunnable) {
        this.maxRunnable = maxRunnable;
        this.runnableQuene = new ArrayBlockingQueue<>(this.maxRunnable);
        startThreadPool();
    }


    @Override
    public void execute(@NotNull Runnable runnable) {
        try {
            this.runnableQuene.put(runnable);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    private void startThreadPool() {
        Thread worker = new Thread(() -> {
            while (!Thread.currentThread().isInterrupted()) {
                try {
                    Thread tr = new Thread(this.runnableQuene.take());
                    tr.setDaemon(true);
                    tr.start();
                    tr.join();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

            }
        });
        worker.setDaemon(true);

        for (int i = 0; i < this.maxRunnable; i++) new Thread(worker).start();
    }

    public static void main(String[] args) throws InterruptedException {
        MyExecutor myExecutor = new MyExecutor(5);
        AtomicInteger integer = new AtomicInteger();
        for (int i = 0; i < 10; i++) {
            Runnable runnable = () -> {
                System.out.println("Thread ->"+integer.getAndIncrement());
                try {
                    Thread.sleep(10000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            };
            myExecutor.execute(runnable);
        }
        Thread.sleep(1000);
        System.out.println("main exit");

    }
}
