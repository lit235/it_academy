package _2_oop.hw_3_inheritance_polymorphism.quadrilateral;

import _2_oop.hw_1_class.Point;
import _2_oop.hw_3_inheritance_polymorphism.Figure;
import _2_oop.hw_3_inheritance_polymorphism.triangel.Triangle;

public class Quadrilateral implements Figure {
    private Point pointA;
    private Point pointB;
    private Point pointC;
    private Point pointD;

    public Quadrilateral(Point pointA, Point pointB, Point pointC, Point pointD) {
        this.pointA = pointA;
        this.pointB = pointB;
        this.pointC = pointC;
        this.pointD = pointD;
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

    public Point getPointD() {
        return pointD;
    }

    @Override
    public double area() {
        Triangle triangleABC = new Triangle(pointA, pointB, pointC);
        Triangle triangleADC = new Triangle(pointA, pointD, pointC);
        return triangleABC.area() + triangleADC.area();
    }

    @Override
    public double perimeter() {
        return pointA.distance(pointB) +
                pointB.distance(pointC) +
                pointC.distance(pointD) +
                pointD.distance(pointA);

    }

    @Override
    public String toString() {
        return "pointA=" + pointA +
                ", pointB=" + pointB +
                ", pointC=" + pointC +
                ", pointD=" + pointD;
    }

}
