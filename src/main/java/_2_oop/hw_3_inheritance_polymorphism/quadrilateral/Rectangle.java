package _2_oop.hw_3_inheritance_polymorphism.quadrilateral;

import _2_oop.hw_1_class.Point;


public class Rectangle extends Parallelogram {
    public Rectangle(Point pointA, Point pointB, Point pointC, Point pointD) {
        super(pointA, pointB, pointC, pointD);
    }

    public Rectangle(Point pointA, Point pointB, Point pointC) {
        super(pointA, pointB, pointC);
    }

    @Override
    public double area() {
        return getPointA().distance(getPointB()) * getPointA().distance(getPointD());
    }

    @Override
    public String toString() {
        return "Rectangle " + super.toString();
    }
}
