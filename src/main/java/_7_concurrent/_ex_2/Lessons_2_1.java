package _7_concurrent._ex_2;

import java.util.*;

/**
 * Родительская нить программы должна считывать вводимые пользователем строки и
 * помещать их в начало связанного списка.Строки длиннее 80символов можно
 * разрезать на несколько строк.При вводе пустой строки программа должна выдавать
 * текущее состояние списка.Дочерняя нить пробуждается каждые пять секунд и сортирует
 * список в лексикографическом порядке(используйте Collections.sort(...)).
 * Все операции над списком должны синхронизоваться при помощи мьютекса.
 */
public class Lessons_2_1 {
    static List<String> list = new ArrayList<>();
    static final Object mutex = new Object();

    static void sort() throws InterruptedException {
        synchronized (mutex) {
            mutex.wait();
            Collections.sort(list);
            Thread.sleep(5000);
        }
    }

}