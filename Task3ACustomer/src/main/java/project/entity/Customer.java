package project.entity;

import java.util.Objects;

public class Customer {
    private int ID;
    private String name;
    private String address;
    private int creditCardNumbers;
    private int bankAccountNumber;

    public Customer(int ID, String name, String address, int creditCardNumbers, int bankAccountNumber) {
        this.ID = ID;
        this.name = name;
        this.address = address;
        this.creditCardNumbers = creditCardNumbers;
        this.bankAccountNumber = bankAccountNumber;
    }

    public int getID() {
        return ID;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public int getCreditCardNumbers() {
        return creditCardNumbers;
    }

    public int getBankAccountNumber() {
        return bankAccountNumber;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Customer customer = (Customer) o;
        return ID == customer.ID && creditCardNumbers == customer.creditCardNumbers && bankAccountNumber == customer.bankAccountNumber && Objects.equals(name, customer.name) && Objects.equals(address, customer.address);
    }

    @Override
    public int hashCode() {
        return Objects.hash(ID, name, address, creditCardNumbers, bankAccountNumber);
    }

    @Override
    public String toString() {
        return "Customer{ " +
                "ID= " + ID +
                ", name= " + name + '\'' +
                ", address= " + address + '\'' +
                ", creditCardNumbers= " + creditCardNumbers +
                ", bankAccountNumber= " + bankAccountNumber +
                '}';
    }
}
