package Lesson04.Conditionals;

import java.util.Scanner;

public class TivoliRideTestScanner {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        TivoliRide ride = new TivoliRide(140, "Loopmaster 3000"); // minimumshøjde 140 cm
        TivoliRide ride2 = new TivoliRide(130, "Den Gamle Rutsjebane");

        System.out.print("Indtast din højde i cm: ");
        int height = scanner.nextInt();

        check(ride, height);
        check(ride2, height);

        scanner.close();

    }

    public static void check(TivoliRide ride, int height) {

        ride.checkHeight(height); // Test
    }
}

