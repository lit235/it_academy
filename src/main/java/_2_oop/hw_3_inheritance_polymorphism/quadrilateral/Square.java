package _2_oop.hw_3_inheritance_polymorphism.quadrilateral;

import _2_oop.hw_1_class.Point;

public class Square extends Rhombus {
    public Square(Point pointA, Point pointB, Point pointC, Point pointD) {
        super(pointA, pointB, pointC, pointD);
    }

    public Square(Point pointA, Point pointB, Point pointC) {
        super(pointA, pointB, pointC);
    }

    @Override
    public double area() {
        return Math.pow(getPointA().distance(getPointB()), 2d);
    }

    @Override
    public String toString() {
        return "Square" + super.toString();
    }
}
