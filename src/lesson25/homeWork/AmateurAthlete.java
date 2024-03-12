package lesson25.homeWork;

public class AmateurAthlete extends Human {
    @Override
    public void run() {
        System.out.println("Amateur athlete is running at 15 km/h");
        takeRest(10);
    }
}
