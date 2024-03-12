package lesson25.homeWork;

public class ProfessionalAthlete extends AmateurAthlete {
    @Override
    public void run() {
        System.out.println("Professional athlete is running at 25 km/h");
        takeRest(5);
    }
}
