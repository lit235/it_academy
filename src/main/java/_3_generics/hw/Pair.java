package _3_generics.hw;

/**
 * Реализуйте обобщенный класс Pair, позволяющий сохранять пару элемен­ тов типа Е.
 * Предоставьте методы доступа для получения первого и второго эле­ ментов.
 */
public class Pair<E> {
    private E first;
    private E second;

    public Pair(E first, E second) {
        this.first = first;
        this.second = second;
    }

    public E getFirst() {
        return first;
    }

    public void setFirst(E first) {
        this.first = first;
    }

    public E getSecond() {
        return second;
    }

    public void setSecond(E second) {
        this.second = second;
    }
}
