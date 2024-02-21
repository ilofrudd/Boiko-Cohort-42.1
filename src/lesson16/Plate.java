package lesson16;
/**
 * AIT-TR, Java Basic, Cohort42.1, Lesson #16
 * @author Boiko Yaroslav
 * @version 19.02.24
 */
public class Plate {
    int capacity;
    int food;

    public Plate(int capacity) {
        this.capacity = capacity;
        this.food = 0;
    }
    public void add(int food) {
        if (this.food + food <= capacity) {
            this.food += food;
        }else {
            System.out.println("Cannot add food, plate is filled");
        }
    }
    public int amountFood() {
        return food;
    }
    public void feeding(int food) {
        this.food -= food;
    }
}
