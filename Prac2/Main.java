package Prac2;

import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner input=new Scanner(System.in);

        System.out.println("Default car:");
        Car car_1 = new Car();
        System.out.println(car_1);
        car_1.Print_age();
        System.out.println("\n");

        System.out.println("Second car:");
        Car car_2 = new Car("Haval", "red", "NO", 2005);
        System.out.println(car_2.toString());
        car_2.Print_age();
        System.out.println("\n");

        System.out.println("Third car:");
        Car car_3 = new Car("Lada", "model");
        System.out.println(car_3.toString());
        System.out.println("\n");

        System.out.println("Fourth car:");
        Car car_4=new Car("red", "color");
        System.out.println(car_4.toString());
        System.out.println("\n");

        System.out.println("Fifth car:");
        Car car_5=new Car("ЕСТЬ", "license");
        System.out.println(car_5.toString());
        System.out.println("\n");

        System.out.println("Sixth car:");
        Car car_6=new Car("2014", "year");
        System.out.println(car_6.toString());
        System.out.println(car_6.Print_age());
    }
}