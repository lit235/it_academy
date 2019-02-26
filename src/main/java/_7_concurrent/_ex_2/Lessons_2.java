package _7_concurrent._ex_2;

import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.concurrent.CopyOnWriteArrayList;

/**
 * Родительская нить программы должна считывать вводимые пользователем строки и
 * помещать их в начало связанного списка.Строки длиннее 80символов можно
 * разрезать на несколько строк.При вводе пустой строки программа должна выдавать
 * текущее состояние списка.Дочерняя нить пробуждается каждые пять секунд и сортирует
 * список в лексикографическом порядке(используйте Collections.sort(...)).
 * Все операции над списком должны синхронизоваться при помощи мьютекса.
 */
public class Lessons_2 {
    static List<String> list = new CopyOnWriteArrayList<>();

    static void add(String str) {
        if (str.length() > 80) {

        } else list.add(str);
    }

    static void print() {
        System.out.println(list);
    }

    static void sort() {
        list.sort(Comparator.naturalOrder());
    }

    public static void main(String[] args) {
        Scanner cs = new Scanner(System.in);
        Thread t = new Thread(new Runnable() {
            @Override
            public void run() {
                while (!Thread.currentThread().isInterrupted()) {
                    try {
                        Thread.sleep(5000);
                        sort();

                    } catch (InterruptedException e) {
                        break;
                    }
                }
            }
        });

        t.start();

        Boolean flag = true;
        String str;
        while (flag) {
            str = cs.next();
            System.out.println(str.length());
            if (str.equals("p")) {
                print();
            } else if (str.equals("y")) {
                flag = false;
            } else {
                add(str);
            }
        }
        t.interrupt();
    }
}
