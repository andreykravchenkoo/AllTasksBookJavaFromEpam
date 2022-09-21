package project.main;

import project.entity.Abiturient;
import project.utils.Utils;

public class MainClass {
    public static void main(String[] args) {
        Utils utils = new Utils();

        Abiturient abiturient1 = new Abiturient(12345, "Kravchenko Andrey", "Topol", 0506164774, new int[]{3, 5, 4, 4});
        Abiturient abiturient2 = new Abiturient(13452, "Shvida Anastasia", "Slobozanskoe", 0665432177, new int[]{5, 5, 4, 4});
        Abiturient abiturient3 = new Abiturient(13535, "Koliagin Danil", "Topol", 0506245674, new int[]{2, 2, 3, 2});
        Abiturient abiturient4 = new Abiturient(25345, "Shevchenko Danil", "Titovo", 05642355642, new int[]{2, 2, 3, 2});
        Abiturient abiturient5 = new Abiturient(12835, "Gydoshnik Aleksander", "Topol", 0556164774, new int[]{4, 4, 4, 4});

        utils.addAbiturient(abiturient1);
        utils.addAbiturient(abiturient2);
        utils.addAbiturient(abiturient3);
        utils.addAbiturient(abiturient4);
        utils.addAbiturient(abiturient5);

        utils.showAbiturient();
        System.out.println("");
        utils.poorGrades();
        System.out.println("");
        utils.gradeHigher(10);

    }
}
