package project.utils;

import project.entity.Customer;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Utils{
    List<Customer> customerList = new ArrayList<>();

    public void addCustomers(Customer cs) {
        customerList.add(cs);
    }

    public void showCustomers() {
        for (Customer cs : customerList) {
            System.out.println(cs);
        }
    }

    public void sortAlphabet() {
        Comparator<Customer> customerComparator = Comparator.comparing(Customer::getName);

        Collections.sort(customerList, customerComparator);
    }

    public void numberInterval(int from, int to) {
        System.out.println("list of buyers who have a credit card number in the range from " + from + " to " + to + " : ");
        for (Customer cs: customerList) {
            if (cs.getCreditCardNumbers() > from & cs.getCreditCardNumbers() < to) {
                System.out.println(cs);
            }
        }
    }
}
