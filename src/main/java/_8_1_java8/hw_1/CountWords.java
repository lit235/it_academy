package _8_1_java8.hw_1;

import java.util.Map;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toMap;

/**
 * Пусть дан поток, элементы которого - слова. Посчитайте, сколько раз встречается каждое слово.
 * При следующих исходных данных должен быть возвращен такой объект Мар:[John -> 3, Paul -> 2, George -> 1]:
 * Stream<String> names = Stream.of("John", "Paul", "George", "John", "Paul", "John")
 */
public class CountWords {
    public static Map<String, Integer> count(Stream<String> stream) {
        return stream.collect(toMap(s -> s, s -> 1, Integer::sum));
    }
}
