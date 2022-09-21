package project.controllers;

import project.entity.Account;
import project.entity.Payment;
import project.entity.Tariff;
import project.repository.AccountRepository;
import project.service.AccountService;

import java.util.ArrayList;

public class AccountControllers implements AccountService {
    private AccountRepository accountRepository = new AccountRepository();

    public AccountControllers() {
    }

    Account account1 = new Account("Kravchenko Andrey Vitaliyovich", 18, 0506767334, "Vodafone", Tariff.SuperNet_Pro, 15.23, 7.90, new ArrayList<>(), false, false);

    Payment payment1 = new Payment(60, "01.06.2022");
    Payment payment2 = new Payment(120, "02.05.2022");
    Payment payment3 = new Payment(200, "06.04.2022");


    @Override
    public void drawUpAnAgreement(int number) {
        account1.getPaymentList().add(payment1);
        account1.getPaymentList().add(payment2);
        account1.getPaymentList().add(payment3);
        accountRepository.accountList.add(account1);
        System.out.println("Account draw up agreement");
    }

    @Override
    public void openAccount(int number) {

        for (Account account : accountRepository.accountList) {
            if (number == account.getNumbers()) {
                if (account.isStatusAccount() == false) {
                    account.setStatusAccount(true);
                    System.out.println("Account open");
            } else {
                    System.out.println("Account has been open");
                }
            } else {
                System.out.println("No such account");
            }
        }
    }

    @Override
    public void openNumber(int number) {

        for (Account account : accountRepository.accountList) {
            if (number == account.getNumbers()) {
                if (account.isStatusNumber() == false) {
                    account.setStatusAccount(true);
                    System.out.println("Number open");
                } else {
                    System.out.println("Number has been open");
                }
            } else {
                System.out.println("No such account");
            }
        }
    }

    @Override
    public void editAccount(int number) {

        for (Account account : accountRepository.accountList) {
            if (number == account.getNumbers()) {
                System.out.println(account);

                account.setName("Shinkevich Andrey Vitaliyovich");
                account.setAge(19);
                account.setNumbers(0561111111);

                System.out.println(account);
                } else {
                System.out.println("No such account");
            }
        }
    }

    @Override
    public void getInfoAccount(int number) {

        for (Account account: accountRepository.accountList) {
            if (number == account.getNumbers()) {
                System.out.println("All info account: " + account.toString());
            } else {
                System.out.println("No such account");
            }
        }
    }

    @Override
    public void checkBalanceAndTraffic(int number) {

        for (Account account: accountRepository.accountList) {
            if (number == account.getNumbers()) {
                System.out.println("Balance account: " + account.getBalance() + ", traffic account: " + account.getTraffic());
            } else {
                System.out.println("No such account");
            }
        }
    }

    @Override
    public void getInfoPayments(int number) {

        for (Account account: accountRepository.accountList) {
            if (number == account.getNumbers()) {
                System.out.println("Get info payment: " + account.getPaymentList().toString());
            } else {
                System.out.println("No such account");
            }
        }
    }

    @Override
    public void changeTariff(int number) {

        for (Account account: accountRepository.accountList) {
            if (number == account.getNumbers()) {
                System.out.println(account);

                account.setTariff(Tariff.Joice);

                System.out.println(account);
            } else {
                System.out.println("No such account");
            }
        }
    }

    @Override
    public void changeOperator(int number) {

        for (Account account: accountRepository.accountList) {
            if (number == account.getNumbers()) {
                System.out.println(account);

                account.setOperator("Kiyvstar");

                System.out.println(account);
            } else {
                System.out.println("No such account");
            }
        }
    }

    @Override
    public void topUpAccount(int number) {

        for (Account account: accountRepository.accountList) {
            if (number == account.getNumbers()) {
                System.out.println(account);

                double countMoney = 200;
                double newBalance = account.getBalance() + countMoney;
                account.setBalance(newBalance);

                System.out.println(account);
            } else {
                System.out.println("No such account");
            }
        }
    }

    @Override
    public void closeAccount(int number) {

        for (Account account : accountRepository.accountList) {
            if (number == account.getNumbers()) {
                if (account.isStatusAccount() == true) {
                    account.setStatusAccount(false);
                    System.out.println("Account close");
                } else {
                    System.out.println("Account has been close");
                }
            } else {
                System.out.println("No such account");
            }
        }
    }

    @Override
    public void closeNumber(int number) {

        for (Account account : accountRepository.accountList) {
            if (number == account.getNumbers()) {
                if (account.isStatusAccount() == true) {
                    account.setStatusAccount(false);
                    System.out.println("Number close");
                } else {
                    System.out.println("Number has been close");
                }
            } else {
                System.out.println("No such account");
            }
        }
    }
}
