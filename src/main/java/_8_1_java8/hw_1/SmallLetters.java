package _8_1_java8.hw_1;


import java.util.*;

/**
 * Пусть дан список строк List. Найдите в нем строку, содержащую максимальное число строчных букв.
 * Чтобы код правильно работал, когда входной список пуст, можете возвращать объект типа Optional<String>.
 */
public class SmallLetters {
    public static Optional<String> max(List<String> list) {
        return list.stream()
                .max(Comparator.comparingLong(s -> s.replaceAll("[^a-zа-я]", "").length()));

    }
}
