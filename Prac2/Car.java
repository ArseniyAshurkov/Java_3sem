package Prac2;

public class Car
{
    private String model;
    private String color;
    private String license;
    private int year;
    private final int current_year=2024;

    Car(String model, String color, String license, int year){
        this.model = model;
        this.color = color;
        this.license = license;
        this.year = year;
    }

    Car(){
        this("default model", "default color", "default license", 0);
    }

    Car(String params, String choice){
        switch(choice){
            case "model":
                this.model = params;
                break;
            case "color":
                this.color = params;
                break;
            case "license":
                this.license = params;
                break;
            case "year":
                this.year = Integer.parseInt(params);
                break;
            default:
                System.out.println("Error!");
        }
    }
    String getModel(){
        return model;
    }
    void setModel(String params){
        this.model = params;
    }
    String getLicense(){
        return license;
    }
    void setLicense(String params){
        this.license = params;
    }
    String getColor(){
        return color;
    }
    void setColor(String params){
        this.color = params;
    }
    int getYear(){
        return year;
    }
    void setYear(int params){
        this.year = params;
    }
//    void To_String(){
//        System.out.println("Model: " + model);
//        System.out.println("Color: " + color);
//        System.out.println("License: " + license);
//        System.out.println("Year: " + year);
//    }
//    public String toString(){
//        return ("Model: " + model+"\n"+ "Color: " + color+"\n" + "License: " + license + "\n" + "Year: " + year);
//    }
    String Print_age(){
        return("Age: "+(current_year - year));
    }
}