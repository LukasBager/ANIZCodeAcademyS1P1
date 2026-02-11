package Lesson03.Constructors;

public class Circle01 {
    private double radius;
    public String name;

    // Konstruktør
    public Circle01(double radius, String name) {
        this.radius = radius;
        this.name = name;
    }

    // Beregn areal
    public double beregnAreal() {
        return Math.PI * radius * radius;
    }
}
