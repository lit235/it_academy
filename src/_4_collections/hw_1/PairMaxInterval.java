package _4_collections.hw_1;

import _3_generics.hw.Pair;

import java.util.Iterator;
import java.util.List;

public class PairMaxInterval<E extends Comparable<E>> implements Iterable<E> {
    private int start;
    private int end;
    private List<Pair<E>> pairList;

    public PairMaxInterval(int start, int end, List<Pair<E>> pairList) {
        this.start = start;
        this.end = end;
        this.pairList = pairList;
    }

    @Override
    public Iterator<E> iterator() {
        return new PairMaxIterator<E>(this.start, this.end, this.pairList);
    }
}
