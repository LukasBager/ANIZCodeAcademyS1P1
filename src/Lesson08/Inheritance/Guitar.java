package Lesson08.Inheritance;


// Subklasse: Guitar
class Guitar extends Instrument {
    private int strings;

    public Guitar(String name, int strings, String brand) {
        super(name, "Strenge", brand);
        this.strings = strings;
    }


    @Override
    public String toString() {
        return "Guitar: " + name + ", strings: " + strings + ", brand: " + brand;
    }

    public void strum() {
        System.out.println(name + " bliver strummmet: Strum Strum!");
    }
}
