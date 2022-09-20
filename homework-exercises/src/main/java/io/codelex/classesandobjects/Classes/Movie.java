package io.codelex.classesandobjects.Classes;

import java.util.Objects;

public class Movie {
    private String title;
    private String studio;
    private String rating;

    public Movie(String title, String studio, String rating) {
        this.title = title;
        this.studio = studio;
        this.rating = rating;
    }
    public Movie(String title, String studio) {
        this.title = title;
        this.studio = studio;
        this.rating = "PG";
    }
    public String getTitle() {
        return title;
    }
    public String getRating() {
        return rating;
    }
}
