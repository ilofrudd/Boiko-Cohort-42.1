package lesson15;
/**
 * AIT-TR, Java Basic, Cohort42.1
 * @author Boiko Yaroslav
 * @version 19.02.24
 */
public class Adventure {
    String brand;
    String model;
    String color;
   double fuelConsumption;
   double distance;
   double price;

   public Adventure(String brand, String model, String color) {
      this.brand = brand;
      this.model = model;
      this.color = color;
   }

   public void averageFuelConsumption (double fuelConsumption) {
       this.fuelConsumption = fuelConsumption;
   }
   public void drive (double distance) {
       this.distance = distance;
   }

   public double needFuel() {
       return fuelConsumption/100 * distance;
   }
   public void fuelPrice(double price) {
       this.price = price;
   }
   public double adventurePrice() {
       return needFuel() * price;
   }





}
