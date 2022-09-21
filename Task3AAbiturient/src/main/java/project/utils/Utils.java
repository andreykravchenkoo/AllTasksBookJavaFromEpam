package project.utils;

import project.entity.Abiturient;

import java.util.*;

public class Utils {
    List<Abiturient> abiturientList = new ArrayList<>();

    public void addAbiturient(Abiturient ab) {
        abiturientList.add(ab);
    }

    public void showAbiturient() {
        for (Abiturient ab : abiturientList) {
            System.out.println(ab);
        }
    }

    public void poorGrades() {
        System.out.println("List of applicants with unsatisfactory grades: ");

        for (Abiturient ab : abiturientList) {
            int average = 0;
            int sum = 0;

            for (int i = 0 ; i < ab.getGrade().length; i++) {
                sum += ab.getGrade()[i];
            }

            average = sum / ab.getGrade().length;

            if (average <= 2) {
                System.out.println(ab);
                System.out.println("Average grade: " + average);
            }
        }
    }

    public void gradeHigher(int grade) {
        System.out.println("A list of applicants whose scores are higher than the specified: ");

        for (Abiturient ab : abiturientList) {
            int sum = 0;

            for (int i = 0 ; i < ab.getGrade().length; i++) {
                sum += ab.getGrade()[i];
            }

            if (sum > grade) {
                System.out.println(ab);
                System.out.println("Sum: " + sum + " specified number: " + grade);
            }
        }
    }

}
