package Prac3.app;

import Prac3.vehicles.Car;
import Prac3.vehicles.ElectricCar;

public class Main {
    public static void main(String[] args) {

        Car myCar = new Car("Петя", 1111, "Бензин");
        System.out.println("Владелец машины: " + myCar.get_OwnerName());
        System.out.println("Страховой номер машины: " + myCar.get_InsuranceNumber());
        System.out.println("Тип двигателя машины: " + myCar.get_EngineType()+"\n");


        ElectricCar myElectricCar = new ElectricCar("Вася", 1234, 120);
        System.out.println("Владелец электромобиля: " + myElectricCar.get_OwnerName());
        System.out.println("Страховой номер электромобиля: " + myElectricCar.get_InsuranceNumber());
        System.out.println("Тип двигателя электромобиля: " + myElectricCar.get_EngineType());
        System.out.println("Емкость батареи: " + myElectricCar.get_BatteryCapacity() +"\n");


        myElectricCar.set_BatteryCapacity(25000);
        System.out.println("Новая емкость батареи: " + myElectricCar.get_BatteryCapacity());
    }
}