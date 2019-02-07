package _4_collections.hw_1;

import _3_generics.hw.Pair;
import _3_generics.hw.PairMinMax;

import java.util.Iterator;
import java.util.List;

/**
 * Написать Iterable<Pair<Integer>> принимающий List<Pair<Integer>> который возвращает
 * итератор max чисел из Pair из предыдущего задания (т.е. Iterator<Integer>) от этих Pair<Integer>.
 * Наподобие такого.
 * for(Integer max : new PairMaxIterable(asList(Pair(1,2), Pair(3,2), Pair(1,5)))){
 * System.out.print(max + " ");
 * }
 */
public class PairMaxIterable implements Iterable<Integer> {

    private Iterator iterator;

    public PairMaxIterable(List list) {
        iterator = new Iterator<Integer>() {
            Iterator listIterator = list.iterator();

            @Override
            public boolean hasNext() {
                return listIterator.hasNext();
            }

            @Override
            public Integer next() {
                PairMinMax pairMinMax = new PairMinMax((Pair<Integer>) listIterator.next());
                return (Integer) pairMinMax.pairMax();
            }
        };
    }

    @Override
    public Iterator iterator() {
        return iterator;
    }
}
