package project.Task7;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class MainClass {
    public static void main(String[] args) {
        List<Student> studentList = new ArrayList<>();

        Student student1 = new Student("Andrey", 18, 11);
        Student student2 = new Student("Danil", 17, 5);
        Student student3 = new Student("Nastya", 17, 10);
        Student student4 = new Student("Kolya", 18, 8);
        Student student5 = new Student("Danya", 18, 7);

        studentList.add(student1);
        studentList.add(student2);
        studentList.add(student3);
        studentList.add(student4);
        studentList.add(student5);

        Collections.sort(studentList, Comparator.comparing(Student::getName));

        System.out.println("Sorted by grade above 8 points: ");
        System.out.println(studentList.stream().filter(((Predicate<? super Student>) s -> s.getGrade() > 8)).sorted(Comparator.comparing(Student::getGrade)).collect(Collectors.toList()));
        System.out.println(studentList.stream().sorted(Comparator.comparing(Student::getName)).collect(Collectors.toList()));
    }
}
