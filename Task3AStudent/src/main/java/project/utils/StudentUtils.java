package project.utils;

import project.entity.Student;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StudentUtils {
    List<Student> studentList = new ArrayList<>();

    public void addStudent(Student st) {
        studentList.add(st);
    }

    public void listGroup() {
        System.out.println("List group: ");

        for (Student st: studentList) {
            System.out.println(st);
        }
    }

    public void studentFaculty(String faculty) {
        System.out.println("List of students of a given faculty: ");

        for (Student st : studentList) {
            if (st.getFaculty().equals(faculty)) {
                System.out.println(st);
            }
        }
    }

    public void studentFacultyAndCourse(String faculty, int course) {
        System.out.println("lists of students for each faculty and course: ");

        for (Student st: studentList) {
            if (st.getFaculty().equals(faculty) & st.getCourse() == course) {
                System.out.println(st);
            }
        }
    }

    public void bornAfter(int year) {
        System.out.println("A list of students born after a given year: ");

        for (Student st: studentList) {
            if (st.getDateOfBirthday() > year) {
                System.out.println(st);
            }
        }
    }
}
