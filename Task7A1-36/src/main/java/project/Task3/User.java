package project.Task3;

import java.util.Objects;

public class User {
    private int id;
    private String firstName;
    private String secondName;
    private int age;
    private String country;

    public User(int id, String firstName, String secondName, int age, String country) {
        this.id = id;
        this.firstName = firstName;
        this.secondName = secondName;
        this.age = age;
        this.country = country;
    }

    public int getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getSecondName() {
        return secondName;
    }

    public int getAge() {
        return age;
    }

    public String getCountry() {
        return country;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return id == user.id && age == user.age && Objects.equals(firstName, user.firstName) && Objects.equals(secondName, user.secondName) && Objects.equals(country, user.country);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, firstName, secondName, age, country);
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", secondName='" + secondName + '\'' +
                ", age=" + age +
                ", country='" + country + '\'' +
                '}';
    }
}
