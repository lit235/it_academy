package _2_oop.hw_3_inheritance_polymorphism.triangel;

import _2_oop.hw_1_class.Point;

public class IsoscelesTriangle extends Triangle {
    public IsoscelesTriangle(Point pointA, Point pointB, Point pointC) {
        super(pointA, pointB, pointC);
    }

    @Override
    public String toString() {
        return "IsoscelesTriangle " + super.toString();
    }
    public static boolean isIsoscelesTriangle(Point pointA, Point pointB, Point pointC){
        return Math.abs(pointA.distance(pointB) - pointA.distance(pointC)) < EPSILON;
    }
}
