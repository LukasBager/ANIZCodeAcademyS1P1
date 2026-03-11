package Lesson14.ArrayListOgEnum;


import java.util.ArrayList;
//With ArrayList
public class HogwartsArrayList {
    public static void main(String[] args) {
        // Opret ArrayList til elever
        ArrayList<Elev> elever = new ArrayList<>();

        // Tilføj elever
        elever.add(new Elev("Harry", Hus.GRYFFINDOR, Fag.FORSVAR_MOD_MØRKE_KUNSTER));
        elever.add(new Elev("Hermione", Hus.GRYFFINDOR, Fag.FORTRYLLELSER));
        elever.add(new Elev("Draco", Hus.SLYTHERIN, Fag.FORSVAR_MOD_MØRKE_KUNSTER));
        elever.add(new Elev("Luna", Hus.RAVENCLAW, Fag.ASTROLOGI));
        elever.add(new Elev("Cedric", Hus.HUFFLEPUFF, Fag.ELIXIR));

        // Udskriv alle elever
        System.out.println("Elever på Hogwarts:");
        for (Elev e : elever) {
            System.out.println(e);
        }

        // Find alle elever i Gryffindor
        System.out.println("\nElever i Gryffindor:");
        for (Elev e : elever) {
            if (e.getHus() == Hus.GRYFFINDOR) {
                System.out.println(e.getNavn());
            }
        }
        System.out.println("\nElever hvis yndlingsfag er Forsvar mod Mørke Kunster:");
        for (Elev e : elever) {
            if (e.getFavoritFag() == Fag.FORSVAR_MOD_MØRKE_KUNSTER) {
                System.out.println(e.getNavn());
            }
        }

    }

}
