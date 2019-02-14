package _4_collections.hw_1;

import _3_generics.hw.Pair;

import java.util.List;

import static java.util.Arrays.asList;

public class Test {
    public static void main(String[] args) {
        List<Pair<Integer>> pairList = asList(new Pair(1, 2), new Pair(1, 2), new Pair(1, 2), new Pair(1, 2),
                new Pair(1, 2), new Pair(1, 2), new Pair(3, 2), new Pair(1, 5));

        for (Integer max : new PairMaxIterable(pairList)) {
            System.out.print(max + " ");
        }

        System.out.println("\n*************");

        for (Object max : PairMaxIterable.pairMaxInterval(5, 7, pairList)) {
            System.out.print(max + " ");
        }

        System.out.println("\n*************");

        for (Object max : PairMaxIterable.pairMaxInterval(1, 4, asList(new Pair("0qewwwww", "d0wfwew"),
                new Pair("z1qewwwww", "d1wfwew"), new Pair("z2qewwwww", "d2wfwew"), new Pair("3qew", "d3wfwew"),
                new Pair("4qew", "d4wfwew"), new Pair("5qew", "d5wfwew")))) {
            System.out.print(max + " ");
        }
    }
}
