package project;

import java.util.ArrayList;

public class MainClass {
    public static void main(String[] args) {
        Account account = new Account("Andrey Kravchenko", 5168-2312-2311-2223, 5435, new Account.Operation());
        Account account2 = new Account("Danil Koliagin", 5168-2222-2311-2223, 1000, new Account.Operation());
        account.getOperation().withdraw(500);
        account.getOperation().deposit(25000);
        account.getOperation().transfer(account2, 25000);
    }
}
