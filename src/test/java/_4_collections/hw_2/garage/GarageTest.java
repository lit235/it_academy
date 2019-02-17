package _4_collections.hw_2.garage;

import org.junit.Assert;
import org.junit.Test;

import java.awt.*;


public class GarageTest {

    @Test
    public void putCar() {
        Car bus = new Bus("Ford", "Sprint", 2005, Color.BLACK, 1500);
        Car truck = new Truck("Gazele", "ГАЗ-2705", 2005, Color.BLUE, 1300);
        Car minivan = new Minivan("Honda", "Van", 2010, Color.DARK_GRAY, 1000);

        Garage garage = new Garage();

        Assert.assertTrue(garage.putCar(bus));
        Assert.assertTrue(garage.putCar(truck));
        Assert.assertTrue(garage.putCar(minivan));
        Assert.assertFalse(garage.putCar(null));

    }

    @Test
    public void getCar() {
        Car bus = new Bus("Ford", "Sprint", 2005, Color.BLACK, 1500);
        Car truck = new Truck("Gazele", "ГАЗ-2705", 2005, Color.BLUE, 1300);
        Car minivan = new Minivan("Honda", "Van", 2010, Color.DARK_GRAY, 1000);
        Car minivan2 = new Minivan("Honda", "Van", 2010, Color.DARK_GRAY, 1000);
        Car minivan3 = new Minivan("Honda", "Van", 2010, Color.DARK_GRAY, 1000);

        Garage garage = new Garage();
        garage.putCar(bus);
        garage.putCar(truck);
        garage.putCar(minivan);
        garage.putCar(minivan2);
        garage.putCar(minivan3);

        Assert.assertTrue(garage.getCar(bus));
        Assert.assertFalse(garage.getCar(bus));
        Assert.assertTrue(garage.getCar(truck));
        Assert.assertFalse(garage.getCar(truck));
        Assert.assertTrue(garage.getCar(minivan));
        Assert.assertTrue(garage.getCar(minivan));
        Assert.assertTrue(garage.getCar(minivan));
        Assert.assertFalse(garage.getCar(minivan));

    }

    @Test
    public void numberOfCars() {
        Car truck = new Truck("Gazele", "ГАЗ-2705", 2005, Color.BLUE, 1300);
        Car minivan = new Minivan("Honda", "Van", 2010, Color.DARK_GRAY, 1000);
        Car minivan2 = new Minivan("Honda", "Van", 2010, Color.DARK_GRAY, 1000);
        Car minivan3 = new Minivan("Honda", "Van", 2010, Color.DARK_GRAY, 1000);

        Garage garage = new Garage();
        garage.putCar(minivan);
        garage.putCar(minivan2);
        garage.putCar(minivan3);

        Assert.assertEquals(garage.numberOfCars(minivan), new Integer(3));
        Assert.assertEquals(garage.numberOfCars(truck), new Integer(0));


    }
}