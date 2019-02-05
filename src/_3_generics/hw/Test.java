package _3_generics.hw;

public class Test {
    public static void main(String[] args) {

        System.out.println(new PairMinMax<Integer>(2,4).pairMax());
        System.out.println(new PairMinMax<Integer>(2,4).pairMin());
        System.out.println( new PairMinMax<String>("ddwwd","dwwdwwa").pairMax());
        System.out.println( new PairMinMax<String>("ddwwd","dwwdwwa").pairMin());
    }
}
