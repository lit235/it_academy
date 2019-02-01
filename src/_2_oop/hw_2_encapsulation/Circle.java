/**
 * Продолжение задачи 1. Используя класс точки, создать класс Rectangle, описывающий прямоугольник,
 * и класс Circle описывающий круг. В них должны храниться поля типа Point в роли координат.
 * Создать следующие методы в классе Rectangle:
 * - Высчитывающий длину диагонали
 * Методы в классе Circle:
 * - Высчитывающий длину окружности. У обоих классов должен быть метод нахождения площади.
 * Написать программу, тестовый класс с методом main, демонстрирующим создание объекта класса
 * Rectangle и применение вышеперечисленных методов.
 */

package _2_oop.hw_2_encapsulation;

import _2_oop.hw_1_class.Point;

public class Circle {
    private Point centr;
    private double radius;

    public Circle(Point centr, double radius) {
        this.centr = centr;
        this.radius = radius;
    }

    public double lengthCircle() {
        return 2 * Math.PI * this.radius;
    }

    public double area() {
        return Math.PI * Math.pow(this.radius, 2);
    }
}
