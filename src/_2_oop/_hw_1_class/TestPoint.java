package _2_oop._hw_1_class;

public class TestPoint {
    public static void main(String[] args) {
        Point point = new Point(3, 4).translate(1, 3).scale(2);
        System.out.println(point.getX() + "  " + point.getY());
    }
}
