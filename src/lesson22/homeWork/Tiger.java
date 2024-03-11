package lesson22.homeWork;

public class Tiger extends Cat {
    private int strength;

    public Tiger(String name, int age, String color, int strength) {
        super(name, age, color);
        this.strength = strength;
    }

    @Override
    public void eat() {
        System.out.println(name + " the tiger is eating.");
    }

    public void roar() {
        System.out.println(name + " the tiger roars with strength " + strength + ".");
    }
}