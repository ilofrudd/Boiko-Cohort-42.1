package lesson26.homeWork26;

public class HomeWork26 {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[3];
        shapes[0] = new Circle(8);
        shapes[1] = new Rectangle(13, 9);
        shapes[2] = new Triangle(7, 10, 6);

        double totalArea = 0;
        double totalPerimeter = 0;

        for (Shape shape : shapes) {
            totalArea += shape.calculateArea();
            totalPerimeter += shape.calculatePerimeter();
        }

        System.out.println("Total area: " + totalArea);
        System.out.println("Total perimeter: " + totalPerimeter);
    }
}
