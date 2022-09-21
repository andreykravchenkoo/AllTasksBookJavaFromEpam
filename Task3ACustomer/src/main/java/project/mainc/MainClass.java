package project.mainc;

import project.entity.Customer;
import project.utils.Utils;

public class MainClass {
    public static void main(String[] args) {
        Utils utils = new Utils();

        Customer customer1 = new Customer(12345, "Kravchenko Andrey Vitalievich", "Topol 1", 57486883, 33445);
        Customer customer2 = new Customer(12346, "Shvidka Anastasia Volodimirivna", "Slobozanskoe", 23145678, 12345);
        Customer customer3 = new Customer(12347, "Koliagin Danil Sergeevich", "Topol 1", 30968375, 54321);
        Customer customer4 = new Customer(12348, "Shevchenko Danil Olegovich", "Titovo", 12344321, 67895);
        Customer customer5 = new Customer(12349, "Dydnik Nokolai Valerevich", "Slobozanskoe", 67588890, 37757);

        utils.addCustomers(customer1);
        utils.addCustomers(customer2);
        utils.addCustomers(customer3);
        utils.addCustomers(customer4);
        utils.addCustomers(customer5);

        utils.sortAlphabet();
        utils.showCustomers();
        System.out.println("");
        utils.numberInterval(10000000, 40000000);
    }
}
