package _2_oop.hw_2_encapsulation;

import _2_oop.hw_1_class.Point;

public class Test {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(new Point(2, 2), new Point(6, 6));
        System.out.println("Плошчадь прямоугольник " + rectangle.area());
        System.out.println("Длинна диоганали прямоугольник " + rectangle.lengthDiagonal());
        Circle circle= new Circle(new Point(2,4),33);
        System.out.println("Длинна окружности "+circle.lengthCircle());
        System.out.println("Плошчадь окружности "+circle.area());
    }
}
