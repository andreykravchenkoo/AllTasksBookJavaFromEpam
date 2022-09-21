package project.entity;

import java.util.List;
import java.util.Objects;

public class Account extends Subscriber {
    private long numbers;
    private String operator;
    private Tariff tariff;
    private double balance;
    private double traffic;
    private List<Payment> paymentList;
    private boolean statusNumber;
    private boolean statusAccount;

    public Account(String name, int age, long numbers, String operator, Tariff tariff, double balance, double traffic, List<Payment> paymentList, boolean statusNumber, boolean statusAccount) {
        super(name, age);
        this.numbers = numbers;
        this.operator = operator;
        this.tariff = tariff;
        this.balance = balance;
        this.traffic = traffic;
        this.paymentList = paymentList;
        this.statusNumber = statusNumber;
        this.statusAccount = statusAccount;
    }

    public long getNumbers() {
        return numbers;
    }

    public void setNumbers(long numbers) {
        this.numbers = numbers;
    }

    public String getOperator() {
        return operator;
    }

    public void setOperator(String operator) {
        this.operator = operator;
    }

    public Tariff getTariff() {
        return tariff;
    }

    public void setTariff(Tariff tariff) {
        this.tariff = tariff;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getTraffic() {
        return traffic;
    }

    public void setTraffic(double traffic) {
        this.traffic = traffic;
    }

    public List<Payment> getPaymentList() {
        return paymentList;
    }

    public void setPaymentList(List<Payment> paymentList) {
        this.paymentList = paymentList;
    }

    public boolean isStatusNumber() {
        return statusNumber;
    }

    public void setStatusNumber(boolean statusNumber) {
        this.statusNumber = statusNumber;
    }

    public boolean isStatusAccount() {
        return statusAccount;
    }

    public void setStatusAccount(boolean statusAccount) {
        this.statusAccount = statusAccount;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Account account = (Account) o;
        return numbers == account.numbers && Double.compare(account.balance, balance) == 0 && Double.compare(account.traffic, traffic) == 0 && statusNumber == account.statusNumber && statusAccount == account.statusAccount && Objects.equals(operator, account.operator) && tariff == account.tariff && Objects.equals(paymentList, account.paymentList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), numbers, operator, tariff, balance, traffic, paymentList, statusNumber, statusAccount);
    }

    @Override
    public String toString() {
        return "Account{" +
                "numbers=" + numbers +
                ", operator='" + operator + '\'' +
                ", tariff=" + tariff +
                ", balance=" + balance +
                ", traffic=" + traffic +
                ", paymentList=" + paymentList +
                ", statusNumber=" + statusNumber +
                ", statusAccount=" + statusAccount +
                '}';
    }
}
