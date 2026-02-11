package Lesson04.Costructor.Triangle;

public class TriangleTest {
    public static void main(String[] args) {
        Triangle t1 = new Triangle(3, 4, 5);
        t1.showInfo();

        System.out.println();

        Triangle t2 = new Triangle(6, 6, 6);
        t2.showInfo();

        System.out.println();

        Triangle t3 = new Triangle(6, 6, 8);
        t3.showInfo();

        System.out.println();

        compareTriangles(t1, t2);

        System.out.println();


        t1.scaleTriangle(5);
        t1.showInfo();

        System.out.println();

        t2.scaleTriangle(7);
        t2.showInfo();

    }

    public static void compareTriangles(Triangle t1, Triangle t2) {
        double areal1 = t1.getArea();
        double areal2 = t2.getArea();
        if (areal1 > areal2) {
            System.out.println("Trekant 1 har det største areal");
        } else {
            System.out.println("Trekant 2 har det største areal");
        }
    }
}