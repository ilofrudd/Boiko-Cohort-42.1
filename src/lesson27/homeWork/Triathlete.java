package lesson27.homeWork;

public class Triathlete implements Swimmer, Runner {
    @Override
    public void swim() {
        System.out.println("Triathlete is swimming");
    }

    @Override
    public void run() {
        System.out.println("Triathlete is running");
    }
}