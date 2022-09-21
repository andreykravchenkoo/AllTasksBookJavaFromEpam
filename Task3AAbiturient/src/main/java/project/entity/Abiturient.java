package project.entity;

import java.util.Arrays;
import java.util.Objects;

public class Abiturient {
    private int ID;
    private String name;
    private String address;
    private int phone;
    private int grade[];

    public Abiturient(int ID, String name, String address, int phone, int[] grade) {
        this.ID = ID;
        this.name = name;
        this.address = address;
        this.phone = phone;
        this.grade = grade;
    }

    public int getID() {
        return ID;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public int getPhone() {
        return phone;
    }

    public int[] getGrade() {
        return grade;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Abiturient that = (Abiturient) o;
        return ID == that.ID && phone == that.phone && Objects.equals(name, that.name) && Objects.equals(address, that.address) && Arrays.equals(grade, that.grade);
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(ID, name, address, phone);
        result = 31 * result + Arrays.hashCode(grade);
        return result;
    }

    @Override
    public String toString() {
        return "Abiturient{ " +
                "ID="  + ID +
                ", name= " + name + '\'' +
                ", address= " + address + '\'' +
                ", phone= " + phone +
                ", grade= " + Arrays.toString(grade) +
                '}';
    }
}
