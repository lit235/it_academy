package _4_collections.hw_2.garage;

import java.awt.*;

public class Bus extends Car {
    public Bus(String brand, String model, Integer manufacture, Color color, Integer weight) {
        super(brand, model, manufacture, color, weight, "Автобус");
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
