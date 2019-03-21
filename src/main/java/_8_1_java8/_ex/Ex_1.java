package _8_1_java8._ex;

/**
 * Напишите функциональный интерфейс, который принимает 3 аргумента и возвращает тип boolean.
 */
public class Ex_1 {
    @FunctionalInterface
    interface MyFunction<T extends Number> {
        boolean set(T x, T y, T z);
    }

    public static void main(String[] args) {
        MyFunction<Integer> myFunction = (x, y, z) -> x + y + z > 0;
        System.out.println(myFunction.set(2, 4, 6));
    }
}
