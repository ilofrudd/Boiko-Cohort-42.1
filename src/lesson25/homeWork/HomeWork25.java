package lesson25.homeWork;
/**
 * AIT-TR, cohort 42.1, Java Basic, HW #25
 * @author Boiko Yaroslav
 * @version 12.03.24
 */
public class HomeWork25 {
    public static void main(String[] args) {
        System.out.println("__TASK1__");
        Human human = new Human();
        human.run();

        AmateurAthlete amateur = new AmateurAthlete();
        amateur.run();

        ProfessionalAthlete pro = new ProfessionalAthlete();
        pro.run();
        System.out.println("__TASK2__");
        Vehicle[] vehicles = new Vehicle[3];
        vehicles[0] = new Car();
        vehicles[1] = new Bicycle();
        vehicles[2] = new Motorcycle();

        for (Vehicle vehicle : vehicles) {
            vehicle.startEngine();
        }
    }
}
