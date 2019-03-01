package _7_concurrent.hw_2;

import java.util.LinkedList;
import java.util.Random;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * Задан LinkedList, представляющий собой хранилище целых чисел.
 * Метод produce бесконечно добавляет в этот список случайные числа, однако максимальное количество,
 * которое он может добавить равно 10.
 * Метод consume бесконечно считывает числа с какой-то случайной задержкой (от 0 до 10 мс).\
 * Сделать так, чтобы метод produce добавлял числа только тогда, когда не превышен лимит,
 * а метод consume забирал их только тогда, когда в списке что-нибудь есть.
 * <p>
 * Методы должны корректно работать в многопоточной среде. Используйте отдельную блокировку
 * чтения-записи. Использовать метод removeFirst у  для получения элемента.
 * Создать и запустить два различных потока, один из которых вызывает produce, а другой - consume.
 * Продемонстрировать корректность работы хранилища с помощью вывода сообщений в консоль о добавлении,
 * получении и текущем размере хранилища на этапах добавления и получения.
 */
public class UtilArrayList {
    private LinkedList<Integer> list;
    private final int maxLengt = 10;
    private final Lock lock = new ReentrantLock(true);
    private final Condition empty = lock.newCondition();
    private final Condition full = lock.newCondition();


    public UtilArrayList(LinkedList<Integer> list) {
        this.list = list;
    }

    public void produce() {
        lock.lock();
        try {
            while (list.size() >= 10) {
                System.err.println("Список переполнен " + list.size());
                full.await();
            }
            int randNumber = new Random().nextInt();
            System.err.println("Добавляем случайное число " + randNumber);
            list.add(randNumber);
            empty.signal();
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            lock.unlock();
        }
    }

    public Integer consume() {
        lock.lock();
        try {
            while (list.isEmpty()) {
                System.err.println("Список пуст");
                empty.await();
            }
            Integer number = list.removeFirst();
            System.err.println("Извлекли число " + number);
            full.signal();
            return number;
        } catch (InterruptedException ex) {
            ex.printStackTrace();
            return null;
        } finally {
            lock.unlock();
        }
    }

    public static void main(String[] args) throws InterruptedException {
        UtilArrayList utilArrayList = new UtilArrayList(new LinkedList<>());

        Thread consumeThread = new Thread(() -> {
            while (true) {
                utilArrayList.consume();
                try {
                    Thread.sleep(Math.round(10));
                } catch (InterruptedException e) {
                    e.printStackTrace();

                }
            }
        });
        consumeThread.setDaemon(true);
        consumeThread.start();

        Thread produceThred = new Thread(() -> {
            while (true) {
                utilArrayList.produce();
            }
        });
        produceThred.setDaemon(true);
        produceThred.start();

        Thread.sleep(10_000);
    }
}
