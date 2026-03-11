package Lesson14.ArrayListOgErrorHandling;

import java.util.ArrayList;
import java.util.Scanner;
//Garage
class Garage {
    private ArrayList<Car> cars = new ArrayList<>();

    public void addCar(Car car) {
        cars.add(car);
    }

    public void listCars() {
        System.out.println("Cars in the garage:");
        for (int i = 0; i < cars.size(); i++) {
            System.out.println(i + ": " + cars.get(i).getInfo());
        }
    }

    public void removeCar() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter index of car to remove");
        int index;
        try {
            index = scanner.nextInt();
            Car removed = cars.remove(index);
            System.out.println("Removed: " + removed.getInfo());
        } catch (IndexOutOfBoundsException e) {
            index = scanner.nextInt();
            System.out.println("Error: No car at index " + index);
        } catch (NumberFormatException e) {
            System.out.println("Invalid value entered.");
        }
    }
}
