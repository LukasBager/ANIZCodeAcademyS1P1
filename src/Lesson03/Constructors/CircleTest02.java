package Lesson03.Constructors;


public class CircleTest02 {
    public static void main(String[] args) {
        circleAreal();
    }

    public static void circleAreal()
    {
        // Opret cirkler
        Circle01 c1 = new Circle01(5, "Cirkel 1");
        Circle01 c2 = new Circle01(10, "Cirkel 2");
        Circle01 c3 = new Circle01(25, "Cirkel 3");

        printOut(c1);
        printOut(c2);
        printOut(c3);

        /*
        // Udskriv og vurder arealer
        double areal1 = c1.beregnAreal();
        double areal2 = c2.beregnAreal();
        double areal3 = c3.beregnAreal();

        System.out.println("Areal af cirkel 1: " + areal1);
        if (areal1 > 200) {
            System.out.println("Cirklen 1 er stor!");
        } else {
            System.out.println("Cirklen 1 er lille.");
        }

        System.out.println("Areal af cirkel 2: " + areal2);
        if (areal2 > 200) {
            System.out.println("Cirklen 2 er stor!");
        } else {
            System.out.println("Cirklen 2 er lille.");
        }

        System.out.println("Areal af cirkel 3: " + areal3);
        if (areal3 > 200) {
            System.out.println("Cirklen 3 er stor!");
        } else {
            System.out.println("Cirklen 3 er lille.");
        }
         */


    }

    public static void printOut(Circle01 circle) {
        double areal = circle.beregnAreal();
        System.out.println("Areal af " + circle.name + ": " + areal);
        if (areal > 200) {
            System.out.println(circle.name + " er stor!");
        } else {
            System.out.println(circle.name + " er lille.");
        }
    }

}
