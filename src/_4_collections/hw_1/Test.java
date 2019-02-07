package _4_collections.hw_1;

import static java.util.Arrays.asList;
import _3_generics.hw.Pair;

import java.util.List;

public class Test {
    public static void main(String[] args) {
        for (Integer max : new PairMaxIterable(asList(new Pair(1, 2), new Pair(3, 2), new Pair(1, 5)))) {
            System.out.print(max + " ");
        }
    }
}
