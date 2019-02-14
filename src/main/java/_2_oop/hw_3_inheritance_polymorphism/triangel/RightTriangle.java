package _2_oop.hw_3_inheritance_polymorphism.triangel;

import _2_oop.hw_1_class.Point;

public class RightTriangle extends Triangle {
    public RightTriangle(Point pointA, Point pointB, Point pointC) {
        super(pointA, pointB, pointC);
    }

    @Override
    public double area() {
        return getPointA().distance(getPointB()) * getPointA().distance(getPointC()) / 2;
    }

    @Override
    public String toString() {
        return "RightTriangle " + super.toString();
    }

    public static boolean isRightTriangle(Point pointA, Point pointB, Point pointC) {
        return Math.abs(Math.pow(pointA.distance(pointB), 2) +
                Math.pow(pointA.distance(pointC), 2) -
                Math.pow(pointB.distance(pointC), 2)) < EPSILON;
    }

    public static RightTriangle randomRightTriangle(int n) {
        Triangle t;
        do {
            t = Triangle.randomTriangle(n);
        } while (isRightTriangle(t.getPointA(), t.getPointB(), t.getPointC()));
        return new RightTriangle(t.getPointA(), t.getPointB(), t.getPointC());
    }
}
