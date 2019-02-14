Написать Iterable<Pair<Integer>> принимающий List<Pair<Integer>> который возвращает итератор max
чисел из Pair из предыдущего задания (т.е. Iterator<Integer>) от этих Pair<Integer>. Наподобие такого.
for(Integer max : new PairMaxIterable(asList(Pair(1,2), Pair(3,2), Pair(1,5)))){
            System.out.print(max + " ");
}
должен вывести 1 3 5

***Сделать для PairMaxIterable утилитный параметризованный метод maxPairs с аргуметом List<Pair<E>>
или varargs E... Наподобие interval, только параметризованный.