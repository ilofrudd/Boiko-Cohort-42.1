package lesson15;

import java.util.Scanner;

/**
 * AIT-TR, Java Basic, Cohort42.1, HW #15
 * @author Boiko Yaroslav
 * @version 19.02.24
 */
public class HomeWork15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Your car");
        Car car = new Car("Ford, ", "Focus", "Gray", 8.5);
        System.out.println(car.brand + ", " + car.model + ", " + car.color);
        System.out.println("Enter the distance (km)");
        car.drive(scanner.nextDouble());
        System.out.println("Required for travel (liters)");
        System.out.println(car.fuel() + "l");
    }

}
