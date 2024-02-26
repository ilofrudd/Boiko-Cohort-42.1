package lesson17;

public class Dog {
    private String name;
    public String color;
    public int age;

    public void setName(String name) {
        if (name != null) {
            this.name = name;
        }
    }
    public String getName() {
        return name;
    }
    public Dog(String name, String color, int age) {
        this.name = name;
        this.color = color;
        this.age = age;
    }
    public void voice() {
        System.out.println("Woof!");
    }
}
