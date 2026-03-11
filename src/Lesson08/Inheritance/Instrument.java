package Lesson08.Inheritance;


// Superklasse: Instrument
class Instrument {
    protected String name;
    protected String type; // fx Strenge, Blæs, Slag
    protected String brand;

    public Instrument(String name, String type, String brand) {
        this.name = name;
        this.type = type;
        this.brand = brand;
    }


    @Override
    public String toString() {
        return "Instrument: " + name + ", type: " + type;
    }

    public void play() {
        System.out.println(name + " spilles...");
    }
}
