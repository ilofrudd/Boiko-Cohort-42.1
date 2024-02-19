package lesson15;
/**
 * AIT-TR, Java Basic, Cohort42.1, HW #15
 * @author Boiko Yaroslav
 * @version 19.02.24
 */
public class Car {
    double fuel;
    double fuelVolume;
    boolean engineON;

    public Car(double fuel, double fuelVolume) {
        this.fuel = fuel;
        this.fuelVolume = fuelVolume;
        this.engineON = false;
    }

    public void refuel(double fuel) {
        if (this.fuel + fuel > fuelVolume) {
           this.fuel = fuelVolume;
            return;
        }
        this.fuel += fuel;
    }
    public double drive(int distance) {
        if(!engineON) {
            return 0;
        }
        // TODO recalcuate real distance  if fuel not enought
        fuel -= 0.05 * distance;
        return distance;
    }
    public boolean startEngine() {
        engineON = fuel > 0;
        return engineON;
    }
}
