package Lesson03.DotOperator;

// Movie.java
public class Movie {
    String title;
    String genre;
    int rating;
    String description;

    void playIt() {

        System.out.println("Playing the movie: " + title + " (" + genre + ") - Rating: " + rating + " - Description: " + description);
    }
}