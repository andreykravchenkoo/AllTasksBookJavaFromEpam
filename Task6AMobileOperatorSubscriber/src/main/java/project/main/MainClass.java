package project.main;

import project.controllers.AccountControllers;

public class MainClass {
    public static void main(String[] args) {
        AccountControllers accountControllers = new AccountControllers();

        accountControllers.drawUpAnAgreement(0506767334);
        System.out.println("");
        accountControllers.openAccount(0506767334);
        System.out.println("");
        accountControllers.openNumber(0506767334);
        System.out.println("");
        accountControllers.editAccount(0506767334);
        System.out.println("");
        accountControllers.getInfoAccount(0561111111);
        System.out.println("");
        accountControllers.checkBalanceAndTraffic(0561111111);
        System.out.println("");
        accountControllers.getInfoPayments(0561111111);
        System.out.println("");
        accountControllers.changeTariff(0561111111);
        System.out.println("");
        accountControllers.changeOperator(0561111111);
        System.out.println("");
        accountControllers.topUpAccount(0561111111);
        System.out.println("");
        accountControllers.closeAccount(0561111111);
        System.out.println("");
        accountControllers.closeNumber(0561111111);
    }
}
