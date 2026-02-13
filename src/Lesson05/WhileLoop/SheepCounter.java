package Lesson05.WhileLoop;

public class SheepCounter {
    private int sheep;
    private int maxSheep = 50;

    public SheepCounter(int sheep) {
        this.sheep = sheep;
    }

    public void countSheep() {
        int i = 50;
        while (i >= 0) {
            System.out.println("Sheep number " + i + " 🐑");
            i -= 2;
        }
        System.out.println("You fall asleep... 😴");
    }
}
