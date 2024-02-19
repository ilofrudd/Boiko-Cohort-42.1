package lesson15;

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
        Fuel fuel = new Fuel("Ford, ", "Focus", "Gray", 8.5);
        System.out.println(fuel.brand + ", " + fuel.model + ", " + fuel.color);
        System.out.println("Enter the distance (km)");
        fuel.drive(scanner.nextDouble());
        System.out.println("Required for travel (liters)");
        System.out.println(fuel.needFuel() + "l");

        //Task 2
        System.out.println("The Car");
        Car car = new Car(5, 50);
        if (car.startEngine()) {
            System.out.println("Drive: " + car.drive(50));
            System.out.println("Fuel: " + car.fuel);
        }
    }

}
