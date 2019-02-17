package _4_collections.hw_2.garage;

import java.util.HashMap;
import java.util.Map;

public class Garage {
    private Map<Car, Integer> garage = new HashMap<>();

    public boolean putCar(Car car) {
        this.garage.put(car, this.garage.containsKey(car) ? this.garage.get(car) + 1 : 1);
        return true;
    }

    public boolean getCar(Car car) {
        if (!this.garage.containsKey(car)) {
            return false;
        }
        this.garage.put(car, this.garage.get(car) - 1);
        if (this.garage.get(car) < 1) {
            this.garage.remove(car);
        }
        return true;
    }

    public Integer numberOfCars(Car car) {
        return (!this.garage.containsKey(car)) ? 0 : this.garage.get(car);
    }

}
