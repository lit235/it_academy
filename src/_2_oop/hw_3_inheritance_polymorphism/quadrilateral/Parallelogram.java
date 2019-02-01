package _2_oop.hw_3_inheritance_polymorphism.quadrilateral;

import _2_oop.hw_1_class.Point;
import _2_oop.hw_3_inheritance_polymorphism.Vector;

public class Parallelogram extends Quadrilateral {
    public Parallelogram(Point pointA, Point pointB, Point pointC, Point pointD) {
        super(pointA, pointB, pointC, pointD);
    }

    public Parallelogram(Point pointA, Point pointB, Point pointC) {
        this(pointA, pointB, pointC, createPointD(pointA, pointB, pointC));
    }

    @Override
    public double perimeter() {
        return getPointA().distance(getPointB()) * 2 + getPointB().distance(getPointC()) * 2;
    }

    @Override
    public String toString() {
        return "Parallelogram " + super.toString();
    }

    private static Point createPointD(Point pointA, Point pointB, Point pointC) {
        Vector vectorAC = new Vector(pointA, pointC);
        Vector vectorBC = new Vector(pointB, pointC);
        Vector vectorAD = vectorAC.subtract(vectorBC);
        return vectorAD.getPointEnd(pointA);
    }

}
