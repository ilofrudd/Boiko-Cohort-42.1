package lesson27;
/**
 * AIT-TR, cohort 42.1, Java Basic, Lesson #27
 * @author Boiko Yaroslav
 * @version 15.03.24
 */
public class Lesson27 {
    public static void main(String[] args) {
        Figure[] figures = new Figure[3];
        figures[0] = new Circle(8);
        figures[1] = new Rectangle(13, 9);
        figures[2] = new Triangle(6, 6, 6);
        for (Figure figure : figures) {
            System.out.println(figure.getClass().getSimpleName());
            System.out.println(figure.calculateArea());
            System.out.println(figure.calculatePerimeter());
        }
    }
}
