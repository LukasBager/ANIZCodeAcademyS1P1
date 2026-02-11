package Lesson04.Costructor;

import java.util.Scanner;

public class RectangleTest {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("What is the length of the triangle?");
        double length = scanner.nextDouble();

        System.out.println("What is the width of the triangle?");
        double width = scanner.nextDouble();

        Rectangle r1 = new Rectangle(length, width);
        r1.showInfo();

        scanner.close();

    }

}
