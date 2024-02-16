package lesson15;
/**
 * AIT-TR, Java Basic, Cohort42.1, Lesson #15
 * @author Boiko Yaroslav
 * @version 16.02.24
 */
public class Lesson15 {
    public static void main(String[] args) {
        int a = 10;
        Cat cat = new Cat();//"Murzik", "White", 3);
        cat.voice();
        System.out.println(cat.name + ", " + cat.color + ", " + cat.age);

        Cat cat1 = new Cat("Barsik", "Black", 5, 10);
        cat1.voice();
        System.out.println(cat1.name + ", " + cat1.color + ", " + cat1.age);
        cat1.eat(8);
        System.out.println(cat1.satiated());
    }
}
