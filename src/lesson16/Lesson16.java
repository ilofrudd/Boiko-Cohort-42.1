package lesson16;
/**
 * AIT-TR, Java Basic, Cohort42.1, Lesson #16
 * @author Boiko Yaroslav
 * @version 19.02.24
 */
public class Lesson16 {
    public static void main(String[] args) {
        // Creating a plate with a certain capacity
        Plate plate = new Plate(100);
        // Creating an array of cats with different levels of appetite
        Cat[] cats = new Cat[3];
        cats[0] = new Cat(30);
        cats[1] = new Cat(50);
        cats[2] = new Cat(20);
        // Adding food to the plate
        plate.add(90);
        // Feeding the cats from the plate
        for (Cat cat : cats) {
            cat.eat(plate);
            System.out.println("Cat ate. Food left in plate: " + plate.amountFood());
            System.out.println("Cat's volume: " + cat.realVolume);
            System.out.println();
        }
    }
}
