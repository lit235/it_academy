package _8_1_java8.hw_1;


import java.util.*;
import java.util.function.Function;
import java.util.regex.Pattern;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;


/**
 * Пусть дан список строк List. Найдите в нем строку, содержащую максимальное число строчных букв.
 * Чтобы код правильно работал, когда входной список пуст, можете возвращать объект типа Optional<String>.
 */
public class SmallLetters {
    public static Optional<String> max(List<String> list) {
        return list.stream()
                .max(Comparator.comparing(s -> Pattern.compile("[^a-zа-я]")
                                .splitAsStream(s)
                                .map(String::length)
                                .reduce(0, Integer::sum)
                        /*s.replaceAll("[^a-zа-я]", "").length()*/));

    }

}
