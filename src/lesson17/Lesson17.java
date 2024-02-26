package lesson17;

public class Lesson17 {
    public static void main(String[] args) {
        Dog dog = new Dog("Bobik","gray", 4);
        dog.voice();
        dog.setName("Vasyl");
        System.out.println("Name: " + dog.getName() + ", " + "color: " + dog.color + ", " +  "age: " + dog.age + ".");
    }
}
