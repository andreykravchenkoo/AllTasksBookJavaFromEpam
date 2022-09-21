package project.service;

public interface AccountService {
    void drawUpAnAgreement(int number);
    void openAccount(int number);
    void openNumber(int number);
    void editAccount(int number);
    void getInfoAccount(int number);
    void checkBalanceAndTraffic(int number);
    void getInfoPayments(int number);
    void changeTariff(int number);
    void changeOperator(int number);
    void topUpAccount(int number);
    void closeAccount(int number);
    void closeNumber(int number);
}
