package Lesson04.Conditionals;


// TivoliRide.java
public class TivoliRide {
    int minHeight;
    String name;

    public TivoliRide(int minHeight, String name) {
        this.minHeight = minHeight;
        this.name = name;
    }

    public void checkHeight(int height) {
        System.out.println("Velkommen til " + name + "!");
        if (height >= minHeight) {
            System.out.println("Du er høj nok! Hop ombord 🎢");
        } else {
            System.out.println("Beklager, du skal være mindst " + minHeight + " cm høj 😢");
        }
    }
}
