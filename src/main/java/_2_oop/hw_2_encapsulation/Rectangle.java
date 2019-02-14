package _2_oop.hw_2_encapsulation;

import _2_oop.hw_1_class.Point;

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
public class Rectangle {
    private Point pointA;
    private Point pointB;
    private Point pointC;

    public Rectangle(Point pointA, Point pointC) {
        this.pointA = pointA;
        this.pointC = pointC;
        this.pointB = new Point(pointC.getX(), pointA.getY());
    }

    public Rectangle(Point pointA, Point pointB, Point pointC) {
        this.pointA = pointA;
        this.pointB = pointB;
        this.pointC = pointC;
    }

    public double lengthDiagonal() {
        return this.pointA.distance(this.pointC);
    }

    public double area() {
        return this.pointA.distance(this.pointB) * this.pointC.distance(this.pointB);

    }

}
