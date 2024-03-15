package lesson26.homeWork26;

public class Triangle extends Shape{
    private double s1;
    private double s2;
    private double s3;

    public Triangle(double s1, double s2, double s3) {
        this.s1 = s1;
        this.s2 = s2;
        this.s3 = s3;
    }

    @Override
    protected double calculateArea() {
        double s = calculatePerimeter() / 2; // half perimeter
        return Math.sqrt(s * (s - s1) * (s - s2) * (s - s3));
    }

    @Override
    protected double calculatePerimeter() {
        return s1 + s2 + s3;
    }
}
