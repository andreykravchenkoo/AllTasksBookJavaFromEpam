package project.entity;

import java.util.Objects;

public class Payment {
    private double sumOfMoney;
    private String date;

    public Payment(double sumOfMoney, String date) {
        this.sumOfMoney = sumOfMoney;
        this.date = date;
    }

    public double getSumOfMoney() {
        return sumOfMoney;
    }

    public void setSumOfMoney(double sumOfMoney) {
        this.sumOfMoney = sumOfMoney;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Payment payment = (Payment) o;
        return Double.compare(payment.sumOfMoney, sumOfMoney) == 0 && Objects.equals(date, payment.date);
    }

    @Override
    public int hashCode() {
        return Objects.hash(sumOfMoney, date);
    }

    @Override
    public String toString() {
        return "Payment{" +
                "sumOfMoney=" + sumOfMoney +
                ", date='" + date + '\'' +
                '}';
    }
}
