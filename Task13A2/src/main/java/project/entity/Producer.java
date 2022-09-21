package project.entity;

import java.util.Objects;

public class Producer {
    private int id;
    private String name;
    private String dateOfBirthday;

    public Producer(int id, String name, String dateOfBirthday) {
        this.id = id;
        this.name = name;
        this.dateOfBirthday = dateOfBirthday;
    }

    public Producer() {

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
        Producer producer = (Producer) o;
        return id == producer.id && Objects.equals(name, producer.name) && Objects.equals(dateOfBirthday, producer.dateOfBirthday);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, dateOfBirthday);
    }

    @Override
    public String toString() {
        return "Producer{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", dateOfBirthday='" + dateOfBirthday + '\'' +
                '}';
    }
}
