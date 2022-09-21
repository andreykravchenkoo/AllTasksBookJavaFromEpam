package project.entity;

import java.util.Objects;

public class Actor {
    private int id;
    private String name;
    private String dateOfBirthday;

    public Actor(int id, String name, String dateOfBirthday) {
        this.id = id;
        this.name = name;
        this.dateOfBirthday = dateOfBirthday;
    }

    public Actor() {

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

    public String getDateOfBirthday() {
        return dateOfBirthday;
    }

    public void setDateOfBirthday(String dateOfBirthday) {
        this.dateOfBirthday = dateOfBirthday;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Actor actor = (Actor) o;
        return id == actor.id && Objects.equals(name, actor.name) && Objects.equals(dateOfBirthday, actor.dateOfBirthday);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, dateOfBirthday);
    }

    @Override
    public String toString() {
        return "Actor{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", dateOfBirthday='" + dateOfBirthday + '\'' +
                '}';
    }
}
