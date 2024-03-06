package lesson22.HomeWork;

public class Cat extends Animal {
    private String color;

    public Cat(String name, int age, String color) {
        super(name, age);
        this.color = color;
    }

    @Override
    public void eat() {
        System.out.println(name + " the cat is eating.");
    }

    public void meow() {
        System.out.println(name + " the cat says meow.");
    }
}
