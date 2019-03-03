package _7_concurrent._ex_3;


import org.jetbrains.annotations.NotNull;

import java.util.Collection;
import java.util.List;
import java.util.concurrent.*;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * Реализуйте свой java.util.concurrent.Executor на основе многопоточной очереди.
 */
public class MyExecutor implements ExecutorService {
    private final int maxRunnable;
    private BlockingQueue<Runnable> runnableQuene;
    private volatile boolean stop = false;
    private List<Thread> listWorker;


    public MyExecutor(int maxRunnable) {
        this.maxRunnable = maxRunnable;
        this.runnableQuene = new LinkedBlockingQueue<>();
        startThreadPool();
    }

    @Override
    public void execute(@NotNull Runnable runnable) {
        if (!stop) {
            try {
                this.runnableQuene.put(runnable);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    private void startThreadPool() {
        Runnable worker = () -> {
            while (!Thread.currentThread().isInterrupted() || this.stop) {
                try {
                    Thread tr = new Thread(this.runnableQuene.take());
                    if (this.stop)
                        return;
                    tr.setDaemon(true);
                    tr.start();
                    tr.join();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

            }
        };

        for (int i = 0; i < this.maxRunnable; i++) {
            Thread thread = new Thread(worker);
            thread.setDaemon(true);
            thread.start();
        }
    }

    public static void main(String[] args) throws InterruptedException {
        MyExecutor myExecutor = new MyExecutor(2);
        AtomicInteger integer = new AtomicInteger();
        for (int i = 0; i < 10; i++) {
            Runnable runnable = () -> {
                int g = integer.getAndIncrement();
                System.err.println("Thread start->" + g);
                try {
                    Thread.sleep(1000);
                    System.err.println("Thread stop->" + g);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            };
            myExecutor.execute(runnable);
        }
        System.err.println("_________");
        Thread.sleep(3000);
        System.out.println(myExecutor.shutdownNow().toArray());
        Thread.sleep(4000);
        System.out.println("main exit");

    }

    @Override
    public void shutdown() {
        this.stop = true;

    }


    @Override
    public List<Runnable> shutdownNow() {
        this.stop=true;
        return null;
    }

    @Override
    public boolean isShutdown() {
        return false;
    }

    @Override
    public boolean isTerminated() {
        return false;
    }

    @Override
    public boolean awaitTermination(long l, @NotNull TimeUnit timeUnit) throws InterruptedException {
        return false;
    }

    @NotNull
    @Override
    public <T> Future<T> submit(@NotNull Callable<T> callable) {
        return null;
    }

    @NotNull
    @Override
    public <T> Future<T> submit(@NotNull Runnable runnable, T t) {
        return null;
    }

    @NotNull
    @Override
    public Future<?> submit(@NotNull Runnable runnable) {
        return null;
    }

    @NotNull
    @Override
    public <T> List<Future<T>> invokeAll(@NotNull Collection<? extends Callable<T>> collection) throws InterruptedException {
        return null;
    }

    @NotNull
    @Override
    public <T> List<Future<T>> invokeAll(@NotNull Collection<? extends Callable<T>> collection, long l, @NotNull TimeUnit timeUnit) throws InterruptedException {
        return null;
    }

    @NotNull
    @Override
    public <T> T invokeAny(@NotNull Collection<? extends Callable<T>> collection) throws InterruptedException, ExecutionException {
        return null;
    }

    @Override
    public <T> T invokeAny(@NotNull Collection<? extends Callable<T>> collection, long l, @NotNull TimeUnit timeUnit) throws InterruptedException, ExecutionException, TimeoutException {
        return null;
    }
}
