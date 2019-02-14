package _3_generics.hw.task_3;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Реализуйте обобщенный класс Table<K, V>, управляющий списочным массивом, состоящим из элементов типа Entry<K, V>.
 * Предоставьте методы для получения значения, связанного с ключом,
 * установки значения по заданному ключу и удаления ключа.
 */
public class Table<K extends Comparable<K>, V> {
    private List<Entry<K, V>> list;

    public Table() {
        list = new ArrayList<>();
    }

    public List<V> getValue(K key) {
        List<V> listValues = new ArrayList<>();
        for (Entry entry : list) {
            if (((K) entry.getKey()).compareTo(key) == 0) {
                listValues.add((V) entry.getValue());
            }
        }
        return listValues;
    }

    public void setValue(K key, V value) {
        for (Entry entry : list) {
            if (((K) entry.getKey()).compareTo(key) == 0) {
                entry.setValue(value);
            }
        }
    }

    public void delForKey(K key) {
        Iterator iteratorr = list.iterator();
        Entry<K, V> entry;
        while (iteratorr.hasNext()) {
            entry = (Entry<K, V>) iteratorr.next();
            if (entry.getKey().compareTo(key) == 0) {
                iteratorr.remove();
            }
        }
    }
}
