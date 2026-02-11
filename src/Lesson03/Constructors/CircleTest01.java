package Lesson03.Constructors;

public class CircleTest01 {

    public static void main(String[] args) {
        OpretCirkler();
    }

    public static void OpretCirkler() {
        // Opret cirkler
        Circle01 c1 = new Circle01(5, "Cirkel 1");
        UdskrivArealer(c1);
        Circle01 c2 = new Circle01(10, "Cirkel 2");
        UdskrivArealer(c2);
        Circle01 c3 = new Circle01(25, "Cirkel 3");
        UdskrivArealer(c3);

    }

    public static void UdskrivArealer(Circle01 c) {
        // Udskriv arealer
        System.out.println("Areal af cirkel: " + c.beregnAreal());
    }
}
