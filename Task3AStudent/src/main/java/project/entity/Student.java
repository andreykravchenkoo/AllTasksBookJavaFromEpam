package project.entity;

import java.util.Collection;
import java.util.Objects;

public class Student{
    private int ID;
    private String name;
    private int dateOfBirthday;
    private String address;
    private int phoneNumber;
    private String faculty;
    private int course;
    private String group;

    public Student(int ID, String name, int dateOfBirthday, String address, int phoneNumber, String faculty, int course, String group) {
        this.ID = ID;
        this.name = name;
        this.dateOfBirthday = dateOfBirthday;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.faculty = faculty;
        this.course = course;
        this.group = group;
    }

    public int getID() {
        return ID;
    }

    public String getName() {
        return name;
    }

    public int getDateOfBirthday() {
        return dateOfBirthday;
    }

    public String getAddress() {
        return address;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public String getFaculty() {
        return faculty;
    }

    public int getCourse() {
        return course;
    }

    public String getGroup() {
        return group;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return ID == student.ID && phoneNumber == student.phoneNumber && course == student.course && Objects.equals(name, student.name) && Objects.equals(dateOfBirthday, student.dateOfBirthday) && Objects.equals(address, student.address) && Objects.equals(faculty, student.faculty) && Objects.equals(group, student.group);
    }

    @Override
    public int hashCode() {
        return Objects.hash(ID, name, dateOfBirthday, address, phoneNumber, faculty, course, group);
    }

    @Override
    public String toString() {
        return "Student{ " +
                "ID = " + ID +
                ", name = " + name + '\'' +
                ", dateOfBirthday = " + dateOfBirthday + '\'' +
                ", address = " + address + '\'' +
                ", phoneNumber = " + phoneNumber +
                ", faculty = " + faculty + '\'' +
                ", course = " + course +
                ", group = " + group + '\'' +
                '}';
    }
}
