package Lesson03.DotOperator;

// MovieTest.java
public class MovieTest {
    public static void main(String[] args) {
        Movie m1 = new Movie();
        m1.title = "Inception";
        m1.genre = "Sci-Fi";
        m1.rating = 9;
        m1.description = "En uhyggelig psykologisk thriller";
        m1.playIt();

        Movie m2 = new Movie();
        m2.title = "The Dark Knight";
        m2.genre = "Action";
        m2.rating = 10;
        m2.description = "En actionpræget klassiker";
        m2.playIt();

        Movie m3 = new Movie();
        m3.title = "Frozen";
        m3.genre = "Animation";
        m3.rating = 8;
        m3.description = "En genial børnefilm";
        m3.playIt();

        Movie m4 = new Movie();
        m4.title = "The Wolf of Wall Street";
        m4.genre = "Drama";
        m4.rating = 10;
        m4.description = "Den bedste film nogensinde produceret. Et mesterværk af Scorsese";
        m4.playIt();
    }
}
