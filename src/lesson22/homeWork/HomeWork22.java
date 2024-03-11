package lesson22.homeWork;
/**
 * AIT-TR, Java Basic, Cohort42.1, HW #22
 * @author Boiko Yaroslav
 * @version 06.03.24
 */
public class HomeWork22 {
    public static void main(String[] args) {
        Animal animal = new Animal("Generic Animal", 5);
        animal.eat();
        animal.sleep();

        Cat cat = new Cat("Whiskers", 3, "Brown");
        cat.eat();
        cat.sleep();
        cat.meow();

        Tiger tiger = new Tiger("Stripes", 7, "Orange", 10);
        tiger.eat();
        tiger.sleep();
        tiger.meow();
        tiger.roar();
    }
}
