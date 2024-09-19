package Prac3.vehicles;

public class ElectricCar extends Car {
    private int batteryCapacity;

    public ElectricCar(String ownerName, int insuranceNumber, int batteryCapacity) {
        super(ownerName, insuranceNumber, "Electric");
        this.batteryCapacity = batteryCapacity;
    }

    public void set_BatteryCapacity(int batteryCapacity) {
        this.batteryCapacity = batteryCapacity;
    }

    public int get_BatteryCapacity() {
        return batteryCapacity;
    }
}