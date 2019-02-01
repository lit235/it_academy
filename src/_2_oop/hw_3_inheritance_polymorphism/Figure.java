package _2_oop.hw_3_inheritance_polymorphism;

public interface Figure {
    double EPSILON = 0.001d; //Точность вычисления сравнения в Double

    double area();

    double perimeter();

    default boolean areaCompar(Figure figure) {
        return this.area() - figure.area() < EPSILON;
    }

}
