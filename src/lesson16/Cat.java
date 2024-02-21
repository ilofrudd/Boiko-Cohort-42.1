package lesson16;
/**
 * AIT-TR, Java Basic, Cohort42.1, Lesson #16
 * @author Boiko Yaroslav
 * @version 19.02.24
 */
public class Cat {
    int maxVolume;
    int realVolume;

    public Cat(int maxVolume) {
        this.maxVolume = maxVolume;
        this.realVolume = 0;
    }
    public void eat(Plate plate) {
        int food = plate.amountFood();
        if(food > maxVolume - realVolume) {
            food = maxVolume - realVolume;
        }
        realVolume += food;
        plate.feeding(food);
    }
}
