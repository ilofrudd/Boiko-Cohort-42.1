package lesson15;

public class Car {
    String brand;
    String model;
    String color;
   double fuelConsumption;
   double distance;

   public Car(String brand, String model, String color,  double fuelConsumption) {
      this.brand = brand;
      this.model = model;
      this.color = color;
      this.fuelConsumption = fuelConsumption;
   }

   public void drive (double distance) {
       this.distance = distance;
   }

   public double fuel() {
       return fuelConsumption/100 * distance;
   }





}
