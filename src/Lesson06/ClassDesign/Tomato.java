package Lesson06.ClassDesign;

public class Tomato {

    private String color;
    private double weight;

    public Tomato() {
        this.color = "unknown";
        this.weight = 0;
    }

    public Tomato(String color, double weight) {
        this.color = color;
        this.weight = weight;
    }


    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }


    public double weight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }


    @Override
    public String toString() {
        return "Tomato [color=" + color + ", weight=" + weight + "g]";
    }

}
