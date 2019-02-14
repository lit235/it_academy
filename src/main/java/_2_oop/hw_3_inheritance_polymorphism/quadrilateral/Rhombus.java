package _2_oop.hw_3_inheritance_polymorphism.quadrilateral;

import _2_oop.hw_1_class.Point;

public class Rhombus extends Parallelogram {
    public Rhombus(Point pointA, Point pointB, Point pointC, Point pointD) {
        super(pointA, pointB, pointC, pointD);
    }

    public Rhombus(Point pointA, Point pointB, Point pointC) {
        super(pointA, pointB, pointC);
    }

    @Override
    public double area() {
        return getPointA().distance(getPointD()) * getPointB().distance(getPointC());
    }

    @Override
    public double perimeter() {
        return getPointA().distance(getPointB()) * 4;
    }

    @Override
    public String toString() {
        return "Rhombus " + super.toString();
    }
}
