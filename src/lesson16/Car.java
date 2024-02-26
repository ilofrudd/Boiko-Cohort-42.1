package lesson16;
/**
 * AIT-TR, Java Basic, Cohort42.1, HW #16
 * @author Boiko Yaroslav
 * @version 21.02.24
 */
public class Car {
    int maxVolume;
    int realVolume;

    public Car(int maxVolume) {
        this.maxVolume = maxVolume;
        this.realVolume = 0;
    }
    public void refill(PetrolStation petrolStation) {
        int fuel = petrolStation.amountFuel();
        if(fuel > maxVolume - realVolume) {
            fuel = maxVolume - realVolume;
        }
        realVolume += fuel;
        petrolStation.consumptionFuel(fuel);
    }

}
