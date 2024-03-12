package lesson25.homeWork;

public class Human {
    public void run() {
        System.out.println("Human is running at 10 km/h");
        takeRest(15);
    }

    protected void takeRest(int minutes) {
        System.out.println("Resting for " + minutes + " minutes");
    }
}