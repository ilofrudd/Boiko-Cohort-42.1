package lesson15;

import java.sql.SQLOutput;
import java.util.Scanner;

/**
 * AIT-TR, Java Basic, Cohort42.1, HW #15
 * @author Boiko Yaroslav
 * @version 19.02.24
 */
public class HomeWork15 {
    public static void main(String[] args) {
        //my idea
        System.out.println("Fuel calculator");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Your car");
        Fuel fuel = new Fuel("Ford", "Focus", "Gray");
        System.out.println("Car brand: " + fuel.brand + "; Car model: " + fuel.model + "; Car color: " + fuel.color);
        System.out.println("Enter  fuel consumption per 100 km");
        fuel.averageFuelConsumption(scanner.nextDouble());
        System.out.println("Enter the distance (km)");
        fuel.drive(scanner.nextDouble());
        System.out.println("Required for travel (liters)");
        System.out.println(fuel.needFuel() + "l");
        System.out.println("Enter the fuel price (EUR)");
        fuel.fuelPrice(scanner.nextDouble());
        System.out.println("Adventure price");
        System.out.println(fuel.adventurePrice() + " EUR");
        //Task 2
        System.out.println("The Car");
        Car car = new Car(5, 50);
        if (car.startEngine()) {
            System.out.println("Drive: " + car.drive(50));
            System.out.println("Fuel: " + car.fuel);
        }
    }

}
