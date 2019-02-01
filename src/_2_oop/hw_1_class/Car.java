/**
 * Реализуйте класс Саг, моделирующий передвижение автомобиля на бензино­ вом топливе по оси х.
 * Предоставьте методы для передвижения автомобиля на заданное количество километров,
 * заполнения топливного бака заданным ко­ личеством литров бензина,
 * вычисления расстояния, пройденного от начала координат, а также уровня топлива в баке.
 * Укажите расход топлива (в км/ч) в качестве параметра конструктора данного класса.
 */
package _2_oop.hw_1_class;

public class Car {
    private double fuelСonsumption;
    private double tankCapacity;

    public double getDistance() {
        return distance;
    }

    private double distance;

    public Car(double fuelСonsumption) {
        this.fuelСonsumption = fuelСonsumption;
    }

    public void fillUpGas(double liter) {
        tankCapacity += liter;
    }

    public double getTankCapacity() {
        return tankCapacity;
    }

    public String moveCar(double moveKm) {
        double consumGas= moveKm*this.fuelСonsumption/100;
        if (consumGas>this.tankCapacity){
            return "Недостаточно топлива";
        }
        this.tankCapacity-=consumGas;
        this.distance+=moveKm;
        return "Пройденый путь:"+getDistance()+" остаток топлива:"+getTankCapacity();

    }


}
