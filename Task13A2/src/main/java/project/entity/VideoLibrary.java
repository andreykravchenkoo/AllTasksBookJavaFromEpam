package project.entity;

import java.util.List;
import java.util.Objects;

public class VideoLibrary {
    private int id;
    private String movie;
    private String actor;
    private String producer;

    public VideoLibrary(int id, String movie, String actor, String producer) {
        this.id = id;
        this.movie = movie;
        this.actor = actor;
        this.producer = producer;
    }

    public VideoLibrary(String movie, String actor, String producer) {
        this.movie = movie;
        this.actor = actor;
        this.producer = producer;
    }

    public VideoLibrary() {

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMovie() {
        return movie;
    }

    public void setMovie(String movie) {
        this.movie = movie;
    }

    public String getActor() {
        return actor;
    }

    public void setActor(String actor) {
        this.actor = actor;
    }

    public String getProducer() {
        return producer;
    }

    public void setProducer(String producer) {
        this.producer = producer;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        VideoLibrary that = (VideoLibrary) o;
        return Objects.equals(movie, that.movie) && Objects.equals(actor, that.actor) && Objects.equals(producer, that.producer);
    }

    @Override
    public int hashCode() {
        return Objects.hash(movie, actor, producer);
    }

    @Override
    public String toString() {
        return "VideoLibrary{" +
                "movie='" + movie + '\'' +
                ", actor='" + actor + '\'' +
                ", producer='" + producer + '\'' +
                '}';
    }
}
