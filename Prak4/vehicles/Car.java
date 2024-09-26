package Prak4.vehicles;

public class Car extends Vehicle {
    public Car(String model, String license, String color, int year, String ownerName, int insuranceNumber, String engineType) {
        super(model, license, color, year, ownerName, insuranceNumber, engineType);
    }

    public String vehicleType() {
        return "Car";
    }


    public String toString() {
        return (getModel() + " " + getLicense() + " " + getColor() + " " + getYear() + " " + getOwnerName() + " " + getInsuranceNumber() + " " + getEngineType());
    }
}
