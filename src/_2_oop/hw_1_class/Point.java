/**
 * Создать класс Point, описывающий точку в двумерных координатах.
 * Полями этого класса должны быть координаты x и y.
 * Класс должен иметь один конструктор, принимающий координаты x и y.
 * Сделайте информацию о координатах скрытой, а получить её можно только
 * с помощью методов доступа (get/set). Создать метод distance,
 * принимающий объект Point и определяющий расстояние до неё.
 * <p>
 * *(Дополнительно) Сделайте этот класс неизменяемым.
 * Предоставьте методы translate() и scale(). В частности, метод translate()
 * должен перемещать точку на определенное расстояние в направлении координат х и у ,
 * а метод scale() — изменять масштаб по обеим координатам на заданный коэффициент.
 * Реализуйте эти методы таким образом, чтобы они возвращали новые точки в качестве результата.
 * Например, в следующей строке кода:\
 * Point р = new Point(3, 4).translate(1, 3).scale(2);
 * в переменной р должна быть установлена точка с координатами
 * Point(8, 14), т.е. new Point(3, 4).translate(1, 3) == new Point(4, 7), а new Point(4, 7).scale(2) == Point(8, 14)
 */

package _2_oop.hw_1_class;

public class Point {
    private double x;
    private double y;

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double distance(Point point) {
        return Math.sqrt(Math.pow(point.getX() - this.x, 2) + Math.pow(point.y - this.y, 2));
    }

    public Point translate(double x, double y) {
        return new Point(this.x + x, this.y + y);
    }

    public Point scale(int scal) {
        return new Point(this.x * scal, this.y * scal);
    }

    @Override
    public String toString() {
        return "Point{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }

    public static Point randomPoint(int n) {
        return new Point(Math.random() * n, Math.random() * n);
    }
}
