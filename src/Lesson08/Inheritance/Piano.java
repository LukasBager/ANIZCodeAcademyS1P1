package Lesson08.Inheritance;

class Piano extends Instrument {

    private int keys;


    public Piano(String name, int keys, String brand) {
        super(name, "Piano", brand);
        this.keys = keys;
    }


    public void pressKeys() {
        System.out.println("Piano spilles: Pling Plong!");
    }


    @Override
    public String toString() {
        return "Piano: " + name + ", keys: " + keys + ", brand: " + brand;
    }

}
