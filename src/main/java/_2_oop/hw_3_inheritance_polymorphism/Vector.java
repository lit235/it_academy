package _2_oop.hw_3_inheritance_polymorphism;

import _2_oop.hw_1_class.Point;

public class Vector {
    private Point pointAB;

    public Vector(Point pointAB) {
        this.pointAB = pointAB;
    }

    public Vector(Point pointA, Point pointB) {
        this.pointAB = pointB.translate(-pointA.getX(),-pointA.getY());
    }

    public Vector addition(Vector vector) {
        Point pointAB = vector.getPointAB();
        return new Vector(pointAB.translate(this.pointAB.getX(),this.pointAB.getY()));
    }

    public Vector subtract(Vector vector) {
        return new Vector(this.pointAB,vector.getPointAB());
    }

    public Point getPointAB() {
        return pointAB;
    }
    public Point getPointEnd(Point pointA){
        return pointA.translate(this.pointAB.getX(),this.pointAB.getY());
    }
}
