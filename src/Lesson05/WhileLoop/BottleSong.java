package Lesson05.WhileLoop;

public class BottleSong {
    private int bottles;

    public BottleSong(int bottles) {
        this.bottles = bottles;
    }

    public void sing() {
        while (bottles > 0) {
            System.out.println(bottles + " bottles of beer on the wall, " + bottles + " bottles of beer!");
            bottles--;
            System.out.println("Take one down, pass it around, " + bottles + " bottles of beer on the wall.\n");
        }
        System.out.println("No more bottles of beer on the wall! 🍾");
    }
}