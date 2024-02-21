package lesson16;
/**
 * AIT-TR, Java Basic, Cohort42.1, HW #16
 * @author Boiko Yaroslav
 * @version 21.02.24
 */
public class PetrolStation {
    int capacity;
    int fuel;

    public PetrolStation(int capacity) {
        this.capacity = capacity;
        this.fuel = 0;
    }
    public void add(int fuel) {
        if (this.fuel + fuel <= capacity) {
            this.fuel += fuel;
        }else {
            System.out.println("Cannot add fuel, capacity exceeded");
        }

    }
    public int amountFuel() {
        return fuel;
    }
    public void consumption(int fuel) {
        this.fuel -= fuel;
    }
}

