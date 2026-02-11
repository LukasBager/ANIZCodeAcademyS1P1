package Lesson04.Costructor;

public class Rectangle {

    private double length;
    private double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public double getPerimeter() {
        double perimeter = length * 2 + width * 2;
        return perimeter;
    }

    public double getArea() {
        double area = length * width;
        return area;
    }

    public void showInfo() {
        System.out.println("Length: " + length);
        System.out.println("Width: " + width);
        System.out.println("Perimeter: " + this.getPerimeter());
        System.out.println("Area: " + this.getArea());
    }



}
