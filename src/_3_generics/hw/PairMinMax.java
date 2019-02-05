package _3_generics.hw;

import java.util.Comparator;

/**
 * Видоизмените класс из предыдущего упражнения, введя методы шах () и m in ()
 * для получения наибольшего и наименьшего из двух элементов.
 * Наложите со­ ответствующее ограничение на обобщенный тип Е.
 */
public class PairMinMax<T extends Comparable<T>> extends Pair<T> {
    public PairMinMax(T first, T second) {
        super(first, second);
    }

    public T pairMax() {
        return   super.getFirst().compareTo(super.getSecond()) > 0 ? super.getFirst() : super.getSecond();
    }
    public T pairMin() {
        return  super.getFirst().compareTo(super.getSecond()) < 0 ? super.getFirst() : super.getSecond();
    }
}
