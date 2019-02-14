package _4_collections.hw_2.garage;

import java.awt.*;

/**
 * Создать абстрактный класс Car, представляющий собой автомобиль.
 * Добавить в него поля: марка, модель, год выпуска + несколько своих.
 * Создать 3 класса, являющихся наследниками Car. Переопределить во всех 3-х классах методы
 * equals(), hashCode() и toString() Создать класс Garage, хранящий в себе HashMap автомобилей,
 * в котором ключом является объект автомобиля, значением - количество точно таких автомобилей в гараже.
 * Добавить в класс Garage методы для парковки, выезда авто, а также для получения количества определенного
 * вида автомобилей. Продемонстрировать работу гаража.
 * public abstract class Car {
 */
public abstract class Car {
    private final String brand;
    private final String model;
    private final Integer manufacture;
    private final Color color;
    private final Integer weight;
    private final String tupeOfCar;

    public Car(String brand, String model, Integer manufacture, Color color, Integer weight, String tupeOfCar) {
        this.brand = brand;
        this.model = model;
        this.manufacture = manufacture;
        this.color = color;
        this.weight = weight;
        this.tupeOfCar = tupeOfCar;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public Integer getManufacture() {
        return manufacture;
    }

    public Color getColor() {
        return color;
    }

    public Integer getWeight() {
        return weight;
    }

    public String getTupeOfCar() {
        return tupeOfCar;
    }

    @Override
    public int hashCode() {

        return this.toString().hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null || obj instanceof Car) {
            Car car = (Car) obj;
            return this.weight.equals(car.getWeight()) &&
                    this.brand.equals(car.getBrand()) &&
                    this.color.equals(car.getColor()) &&
                    this.model.equals(car.getModel()) &&
                    this.manufacture.equals(car.getManufacture()) &&
                    this.tupeOfCar.equals(car.getTupeOfCar());
        }
        return false;
    }

    @Override
    public String toString() {
        return "\nТип машины - " + this.tupeOfCar +
                "\nМарка  - " + this.brand +
                "\nМодель - " + this.model +
                "\nГод выпуска - " + this.manufacture +
                "\nЦвет - " + this.color +
                "\nРегистрационный номер - " + this.weight;
    }
}
