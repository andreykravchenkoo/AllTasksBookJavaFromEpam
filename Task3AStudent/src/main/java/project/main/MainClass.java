package project.main;

import project.entity.Student;
import project.utils.StudentUtils;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MainClass {
    public static void main(String[] args) {
        StudentUtils studentUtils = new StudentUtils();

        Student student1 = new Student(12345, "Kravchenko Andrey Vitalievich", 2003, "Topol 1", 0506164774, "123", 3, "55");
        Student student2 = new Student(12346, "Shvidka Anastasia Volodimirivna", 2005, "Slobozhanskoe", 0665432444, "123", 1, "60");
        Student student3 = new Student(12347, "Shevchenko Danil Olegovich", 2004, "Titovo", 0501234567, "123", 3, "55");
        Student student4 = new Student(12348, "Koliagin Danil Sergeevich", 2004, "Topol 1", 0555564774, "124", 1, "70");
        Student student5 = new Student(12349, "Shvidkiy Oleksie Volodimirovich", 2007, "Slobozhanskoe", 0503564774, "198", 1, "60");

        studentUtils.addStudent(student1);
        studentUtils.addStudent(student2);
        studentUtils.addStudent(student3);
        studentUtils.addStudent(student4);
        studentUtils.addStudent(student5);

        studentUtils.listGroup();
        System.out.println("");
        studentUtils.studentFaculty("123");
        System.out.println("");
        studentUtils.studentFacultyAndCourse("123", 3);
        System.out.println("");
        studentUtils.bornAfter(2004);
    }
}
