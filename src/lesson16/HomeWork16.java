package lesson16;
/**
 * AIT-TR, Java Basic, Cohort42.1, HW #16
 * @author Boiko Yaroslav
 * @version 21.02.24
 */
public class HomeWork16 {
    public static void main(String[] args) {
        PetrolStation petrolStation = new PetrolStation(2000);
        Car[] cars = new Car[3];
        cars[0] = new Car(70);
        cars[1] = new Car(50);
        cars[2] = new Car(100);
        petrolStation.add(400);
        for (Car car : cars) {
            car.refill(petrolStation);
            System.out.println("Refueled the car. Fuel in the car: " + car.realVolume);
            System.out.println("Fuel left in station: " + petrolStation.amountFuel());
            System.out.println();
        }

    }
}
