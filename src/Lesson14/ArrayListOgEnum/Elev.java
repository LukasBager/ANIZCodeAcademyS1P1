package Lesson14.ArrayListOgEnum;

//Elev
public class Elev {
    private String navn;
    private Hus hus;
    private Fag favoritFag;

    public Elev(String navn, Hus hus, Fag favoritFag) {
        this.navn = navn;
        this.hus = hus;
        this.favoritFag = favoritFag;
    }

    public String getNavn() {
        return navn;
    }

    public Hus getHus() {
        return hus;
    }

    public Fag getFavoritFag() {
        return favoritFag;
    }

    @Override
    public String toString() {
        return navn + " - " + hus;
    }
}
