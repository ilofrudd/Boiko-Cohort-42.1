package lesson15;

public class Fuel {
    String brand;
    String model;
    String color;
   double fuelConsumption;
   double distance;

   public Fuel(String brand, String model, String color, double fuelConsumption) {
      this.brand = brand;
      this.model = model;
      this.color = color;
      this.fuelConsumption = fuelConsumption;
   }

   public void drive (double distance) {
       this.distance = distance;
   }

   public double needFuel() {
       return fuelConsumption/100 * distance;
   }





}
