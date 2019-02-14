package _2_oop.hw_3_inheritance_polymorphism;

import _2_oop.hw_3_inheritance_polymorphism.triangel.EquilateralTriangle;
import _2_oop.hw_3_inheritance_polymorphism.triangel.IsoscelesTriangle;
import _2_oop.hw_3_inheritance_polymorphism.triangel.RightTriangle;
import _2_oop.hw_3_inheritance_polymorphism.triangel.Triangle;

public class TestFigure {
    public static void main(String[] args) {
        Figure[] figures = new Figure[100];
        int n = 5;
        for (int i = 0; i < figures.length; i += 4) {
            figures[i] = Triangle.randomTriangle(n);
            figures[i + 1] = RightTriangle.randomRightTriangle(n);
            figures[i + 2] = IsoscelesTriangle.randomIsoscelesTriangle(n);
            figures[i + 3] = EquilateralTriangle.randomEquilateralTriangle(n);
        }
        for (int i = 0; i < figures.length-1; i++) {
            for (int j = i + 1; j < figures.length; j++) {
                if (figures[i].areaCompar(figures[j])) {
                    System.out.println("площадь треугольника " + figures[i]
                            + "\nравна площади треугольника " + figures[j]+"\n");
                }
            }
        }

    }
}
