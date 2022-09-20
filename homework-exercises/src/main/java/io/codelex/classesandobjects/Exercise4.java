package io.codelex.classesandobjects;
import io.codelex.classesandobjects.Classes.Movie;

import java.util.Arrays;
import java.util.Objects;

public class Exercise4 {
    public static void main(String[] args) {
        Movie movie1 = new Movie("Casino Royale","Eon Productions","PG13");
        Movie movie2 = new Movie("Glass","Buena Vista International","PG13");
        Movie movie3 = new Movie("Spider-Man: Into the Spider-Verse","Columbia Pictures");
        Movie[] movies = {movie1,movie2,movie3};
        System.out.println(Arrays.toString(getPG(movies)));
    }
    public static String[] getPG(Movie[] movieArray) {
        String[] pgMovies = new String[movieArray.length];
        for (int i = 0; i < movieArray.length; i++) {
            if (Objects.equals(movieArray[i].getRating(), "PG")) {
                pgMovies[i] = movieArray[i].getTitle();
            }
        }
        return pgMovies;
    }
}
