package Lesson08.Inheritance;


// Main klasse
public class MusicTest {
    public static void main(String[] args) {

        test();
    }

    public static void test()
    {
        Instrument guitar = new Guitar("Fender", 6, "Fender");
        Instrument drum = new Drum("Yamaha", true, "Yamaha");
        Instrument piano = new Piano("Yamaha", 50, "Yamaha");

        System.out.println(guitar);
        guitar.play();
        if (guitar instanceof Guitar) ((Guitar) guitar).strum();

        System.out.println();

        System.out.println(drum);
        drum.play();
        if (drum instanceof Drum) ((Drum) drum).hit();

        System.out.println();

        System.out.println(piano);
        piano.play();
        if (piano instanceof Piano) ((Piano) piano).pressKeys();
    }
}
