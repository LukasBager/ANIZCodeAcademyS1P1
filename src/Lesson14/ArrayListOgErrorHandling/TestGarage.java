package Lesson14.ArrayListOgErrorHandling;

import java.util.Scanner;

//Test Garage
public class TestGarage {
    public static void main(String[] args) {
        Garage garage = new Garage();
        Scanner sc = new Scanner(System.in);

        garage.addCar(new Car("Tesla", "Model 3", FuelType.ELECTRIC));
        garage.addCar(new Car("Toyota", "Corolla", FuelType.PETROL));

        garage.listCars();

        // Remove valid index
        garage.removeCar();

        // Try to remove invalid index -> triggers catch
        garage.removeCar();


    }
}
