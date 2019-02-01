package _2_oop.hw_3_inheritance_polymorphism.triangel;

import _2_oop.hw_1_class.Point;
import _2_oop.hw_3_inheritance_polymorphism.Figure;

public class Triangle implements Figure {
    private Point pointA;
    private Point pointB;
    private Point pointC;

    public Triangle(Point pointA, Point pointB, Point pointC) {
        this.pointA = pointA;
        this.pointB = pointB;
        this.pointC = pointC;
    }

    public Point getPointA() {
        return pointA;
    }

    public Point getPointB() {
        return pointB;
    }

    public Point getPointC() {
        return pointC;
    }

    @Override
    public double area() {
        double sp = perimeter() / 2;   //semi-perimeter
        return Math.sqrt(sp * (sp - pointA.distance(pointB)) *
                (sp - pointB.distance(pointC)) *
                (sp - pointC.distance(pointA)));
    }

    @Override
    public double perimeter() {
        return pointA.distance(pointB) +
                pointB.distance(pointC) +
                pointC.distance(pointA);
    }

    @Override
    public String toString() {
        return "A=" + pointA + ", B=" + pointB + ", C=" + pointC;
    }
}
