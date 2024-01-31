package lesson7;

import java.util.Random;
import java.util.Scanner;

public class HomeWork7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        do {
            double g = 9.81;
            double dist = random.nextInt(1000);
            int attempts = 0;
            double speed;
            double angle;
            double range;
            double blastRadius = 15.0;
            System.out.println("You need to hit the target at " + dist + "m. You have 5 attempts.");
            while (attempts < 5) {
                System.out.println("Enter the initial speed (m/s): ");
                speed = scanner.nextDouble();
                System.out.println("Enter the launch angle (degrees): ");
                angle = scanner.nextDouble();
                range = (speed * speed) * Math.sin(2 * Math.toRadians(angle)) / g;
                if (Math.abs(dist - range) <= blastRadius) {
                    System.out.println("Target hit, nice shot! Distance: " + dist + "m");
                    break;
                } else {
                    attempts++;
                    if (range > dist) {
                        System.out.println("Projectile overshot! Try again.");
                    } else {
                        System.out.println("Projectile fell short! Try again.");
                    }
                }
            }
            if (attempts == 5) {
                System.out.println("Out of attempts. You lose! The distance was: " + dist + "m");
            }
            System.out.println("Play again? [1-yes, 0-no]");
        } while (scanner.nextInt() == 1);
    }
}