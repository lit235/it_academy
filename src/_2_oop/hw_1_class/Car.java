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
    private double distance;

    public Car(double fuelСonsumption) {
        this.fuelСonsumption = fuelСonsumption;
    }

    public void setTankCapacity(double tankCapacity) {
        this.tankCapacity = tankCapacity;
    }

    public double getDistance() {
        return distance;
    }

    public void setDistance(double distance) {
        this.distance = distance;
    }

    public void fillUpGas(double liter) {
        setTankCapacity(getTankCapacity() + liter);
    }

    public double getFuelСonsumption() {
        return fuelСonsumption;
    }

    public void setFuelСonsumption(double fuelСonsumption) {
        this.fuelСonsumption = fuelСonsumption;
    }

    public double getTankCapacity() {
        return tankCapacity;
    }

    public String moveCar(double moveKm) {
        double consumGas = moveKm * getFuelСonsumption() / 100;
        if (consumGas > getTankCapacity()) {
            setDistance(getDistance() + 100 * getTankCapacity() / getFuelСonsumption());
            setTankCapacity(0);
            return "Машина остановилась, недостаточно топлива";
        }
        this.tankCapacity -= consumGas;
        this.distance += moveKm;
        return "Пройденый путь:" + getDistance() + " остаток топлива:" + getTankCapacity();

    }


}
