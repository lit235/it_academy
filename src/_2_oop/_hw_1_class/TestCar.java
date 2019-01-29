package _2_oop._hw_1_class;

import _2_oop._hw_1_class.Car;

import java.util.Scanner;

public class TestCar {
    public static void main(String[] args) {
        Car car1 = new Car(10);
        Scanner cs = new Scanner(System.in);
        while (true) {
            System.out.println("Введите 0 - Выход, 1 - Для заправки, 2 - движения, 3 - что-бы узнать пройденый путь");
            switch (cs.nextInt()) {
                case 0:
                    return;
                case 1:
                    car1.fillUpGas(cs.nextDouble());
                    System.out.println("Машина заправлена, топлива в баке:" + car1.getTankCapacity());
                    break;
                case 2:
                    System.out.println(car1.moveCar(cs.nextDouble()));
                    break;
                case 3:
                    System.out.println("Пройденный путь в км:" + car1.getDistance());
                    break;
            }
        }
    }
}
