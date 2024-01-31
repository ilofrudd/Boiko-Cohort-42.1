package lesson7;
/**
 * AIT-TR, cohort 42.1, Java Basic, Lesson #7
 *
 * @version 29-Jan-24
 */
import java.util.Random;
import java.util.Scanner;

public class GuessTheNumber {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        do {
            int number = random.nextInt(10);
            int attempts = 0;
            int answer = -1;
            while (answer != number && attempts < 3) {
                attempts++;
                System.out.println("Guess the number [0..9]: ");
                answer = scanner.nextInt();
                if (answer < number) {
                    System.out.println("Your number is less");
                } else if (answer > number) {
                    System.out.println("Your number is biggest");
                }
            }
            if (answer == number) {
                System.out.println("You are winner!");
            } else {
                System.out.println("You lose! It was: " + number);
            }
            System.out.println("Play again [1-yes, 0-no]");
        } while (scanner.nextInt() == 1);
    }
}
