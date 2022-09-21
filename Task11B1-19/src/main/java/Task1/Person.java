package Task1;

import java.util.Objects;

public class Person {
    private int ID;

    public Person(int ID) {
        this.ID = ID;
    }

    public int getID() {
        return ID;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return ID == person.ID;
    }

    @Override
    public int hashCode() {
        return Objects.hash(ID);
    }

    @Override
    public String toString() {
        return "Person{" +
                "ID=" + ID +
                '}';
    }
}
