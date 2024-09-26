package Prak4.app;

import Prak4.vehicles.ElectricCar;
import Prak4.vehicles.Car;
import Prak4.vehicles.Vehicle;

public class TestCar {
    public static void main(String[] args) {
        Car myCar = new Car("Toyota", "1111", "white", 10, "Ivan", 111, "Gasoline");
        ElectricCar myElectricCar = new ElectricCar("Tesla", "2222", "black", 2, "Petr", 111);

        System.out.println(myCar.toString());
        System.out.println(myElectricCar.toString()+"\n");
        myCar.setColor("red");
        myElectricCar.setBatteryCapacity(120);
        System.out.println(myCar.toString());
        System.out.println(myElectricCar.toString()+"\n");

        Vehicle f;

        f = myCar;
        System.out.println(f);

        f = myElectricCar;
        System.out.println(f);

    }
}

