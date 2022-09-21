package project.entity;

import java.util.Objects;

public class Galaxy {
    private int id;
    private String name;

    public Galaxy(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public Galaxy() {

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Galaxy galaxy = (Galaxy) o;
        return id == galaxy.id && Objects.equals(name, galaxy.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name);
    }

    @Override
    public String toString() {
        return "Galaxy{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
