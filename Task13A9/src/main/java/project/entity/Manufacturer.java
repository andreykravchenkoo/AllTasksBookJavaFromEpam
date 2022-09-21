package project.entity;

import java.util.Objects;

public class Manufacturer {
    private int id;
    private String title;
    private String country;

    public Manufacturer(int id, String title, String country) {
        this.id = id;
        this.title = title;
        this.country = country;
    }

    public Manufacturer() {
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
        Manufacturer that = (Manufacturer) o;
        return id == that.id && Objects.equals(title, that.title) && Objects.equals(country, that.country);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, title, country);
    }

    @Override
    public String toString() {
        return "Manufacturer{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", country='" + country + '\'' +
                '}';
    }
}
