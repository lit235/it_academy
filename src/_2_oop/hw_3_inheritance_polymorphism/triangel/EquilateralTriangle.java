package _2_oop.hw_3_inheritance_polymorphism.triangel;

import _2_oop.hw_1_class.Point;

public class EquilateralTriangle extends IsoscelesTriangle {
    public EquilateralTriangle(Point pointA, Point pointB, Point pointC) {
        super(pointA, pointB, pointC);
    }

    @Override
    public double perimeter() {
        return getPointA().distance(getPointB()) * 3;
    }

    @Override
    public String toString() {
        return "EquilateralTriangle " + super.toString();
    }

    public static boolean isEquilateralTriangle(Point pointA, Point pointB, Point pointC) {
        return Math.abs(pointA.distance(pointB) - pointB.distance(pointC)) < EPSILON &&
                Math.abs(pointB.distance(pointC) - pointC.distance(pointA)) < EPSILON;
    }
}
