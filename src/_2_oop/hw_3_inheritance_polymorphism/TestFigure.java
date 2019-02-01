package _2_oop.hw_3_inheritance_polymorphism;

import _2_oop.hw_1_class.Point;
import _2_oop.hw_3_inheritance_polymorphism.triangel.EquilateralTriangle;
import _2_oop.hw_3_inheritance_polymorphism.triangel.IsoscelesTriangle;
import _2_oop.hw_3_inheritance_polymorphism.triangel.RightTriangle;

import java.util.LinkedList;

public class TestFigure {
    public static void main(String[] args) {
        LinkedList<Figure> listFigure = new LinkedList();
        Point pointA, pointB, pointC;
        while (listFigure.size() < 100) {
            pointA = Point.randomPoint(10);
            pointB = Point.randomPoint(10);
            pointC = Point.randomPoint(10);
            if (RightTriangle.isRightTriangle(pointA, pointB, pointC)) {
                listFigure.add(new RightTriangle(pointA, pointB, pointC));
            } else if (IsoscelesTriangle.isIsoscelesTriangle(pointA, pointB, pointC)) {
                listFigure.add(new IsoscelesTriangle(pointA, pointB, pointC));
            } else if (EquilateralTriangle.isEquilateralTriangle(pointA, pointB, pointC)) {
                listFigure.add(new EquilateralTriangle(pointA, pointB, pointC));
            }
        }

        for (Figure figure : listFigure) {
            System.out.println(ShapeUtils.isTriangle(figure));
            System.out.println(ShapeUtils.isQuadrilateral(figure));
        }
    }
}
