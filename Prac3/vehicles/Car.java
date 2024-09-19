package Prac3.vehicles;

public class Car {
    private String ownerName;
    private int insuranceNumber;

    protected String engineType;


    public Car(String ownerName, int insuranceNumber, String engineType) {
        this.ownerName = ownerName;
        this.insuranceNumber = insuranceNumber;
        this.engineType = engineType;
    }

    public void set_OwnerName() {
        this.ownerName = ownerName;
    }

    public void set_InsuranceNumber() {
        this.insuranceNumber = insuranceNumber;
    }

    public String get_OwnerName() {
        return ownerName;
    }

    public int get_InsuranceNumber() {
        return insuranceNumber;
    }

    public void set_EngineType(String engineType) {
        this.engineType = engineType;
    }

    public String get_EngineType() {
        return engineType;
    }
}