package project.entity;

import java.util.Objects;

public class Movie {
    private int id;
    private String title;
    private String actors;
    private String releaseDate;
    private String country;

    public Movie(int id, String title, String actors, String releaseDate, String country) {
        this.id = id;
        this.title = title;
        this.actors = actors;
        this.releaseDate = releaseDate;
        this.country = country;
    }

    public Movie() {

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getActors() {
        return actors;
    }

    public void setActors(String actors) {
        this.actors = actors;
    }

    public String getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(String releaseDate) {
        this.releaseDate = releaseDate;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Movie movie = (Movie) o;
        return id == movie.id && Objects.equals(title, movie.title) && Objects.equals(actors, movie.actors) && Objects.equals(releaseDate, movie.releaseDate) && Objects.equals(country, movie.country);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, title, actors, releaseDate, country);
    }

    @Override
    public String toString() {
        return "Movie{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", actors='" + actors + '\'' +
                ", releaseDate='" + releaseDate + '\'' +
                ", country='" + country + '\'' +
                '}';
    }
}
