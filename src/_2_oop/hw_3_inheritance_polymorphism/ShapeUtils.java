package _2_oop.hw_3_inheritance_polymorphism;


import _2_oop.hw_3_inheritance_polymorphism.quadrilateral.Quadrilateral;
import _2_oop.hw_3_inheritance_polymorphism.triangel.Triangle;

public class ShapeUtils {
    static boolean isTriangle(Figure figure) {
        return figure instanceof Triangle;
    }

    static boolean isQuadrilateral(Figure figure) {
        return figure instanceof Quadrilateral;
    }
}
