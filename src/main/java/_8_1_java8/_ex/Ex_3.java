package _8_1_java8._ex;

import java.util.stream.Stream;

/**
 * Найдите исполнителя с самым длинным именем. В решении воспользуйтесь коллектором и функцией высшего порядка reduce.
 * Сравните обе реализации: какую проще писать, а какую - читать?
 * При следующих исходных данных должно быть возвращено имя "Stuart Sutcliffe":
 * Stream<String> names = Stream.of("John Lennon", "Paul McCartney",
 * "George Harrison", "Ringo Starr", "Pete Best", "Stuart Sutcliffe");
 */
public class Ex_3 {
    public static void main(String[] args) {
        Stream<String> names = Stream.of("John Lennon", "Paul McCartney",
                 "George Harrison", "Ringo Starr", "Pete Best", "Stuart Sutcliffe");
       // System.out.println( names.max((s1,s2)->s1.length()-s2.length()).orElse("Nyma"));

        System.out.println( names.reduce("",(accum, s)->accum.length()>s.length()? accum:s));

    }
}
