package project;

import java.util.List;
import java.util.Objects;

public class Account {
    private String nameOwner;
    private long numbersAccount;
    private static long moneyForAccount;
    private Operation operation;

    public Account(String nameOwner, long numbersAccount, long moneyForAccount, Operation operation) {
        this.nameOwner = nameOwner;
        this.numbersAccount = numbersAccount;
        this.moneyForAccount = moneyForAccount;
        this.operation = operation;
    }

    public String getNameOwner() {
        return nameOwner;
    }

    public void setNameOwner(String nameOwner) {
        this.nameOwner = nameOwner;
    }

    public long getNumbersAccount() {
        return numbersAccount;
    }

    public void setNumbersAccount(long numbersAccount) {
        this.numbersAccount = numbersAccount;
    }

    public static long getMoneyForAccount() {
        return moneyForAccount;
    }

    public static void setMoneyForAccount(long moneyForAccount) {
        Account.moneyForAccount = moneyForAccount;
    }

    public Operation getOperation() {
        return operation;
    }

    public void setOperation(Operation operation) {
        this.operation = operation;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Account account = (Account) o;
        return numbersAccount == account.numbersAccount && moneyForAccount == account.moneyForAccount && Objects.equals(nameOwner, account.nameOwner) && Objects.equals(operation, account.operation);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nameOwner, numbersAccount, moneyForAccount, operation);
    }

    @Override
    public String toString() {
        return "Account{" +
                "nameOwner='" + nameOwner + '\'' +
                ", numbersAccount=" + numbersAccount +
                ", moneyForAccount=" + moneyForAccount +
                ", operation=" + operation +
                '}';
    }

    public static class Operation {

        public void withdraw(long amountOfMoney) {
            System.out.println("The amount of money you choose to enter: " + amountOfMoney);
            long money = getMoneyForAccount() - amountOfMoney;
            setMoneyForAccount(money);
            System.out.println("Money for account: " + getMoneyForAccount());
        }

        public void deposit(long amountOfMoney) {
            System.out.println("The amount of money you choose to enter: " + amountOfMoney);
            long money = getMoneyForAccount() + amountOfMoney;
            setMoneyForAccount(money);
            System.out.println("Money for account: " + getMoneyForAccount());
        }

        public void transfer(Account account, long amountOfMoney) {
            System.out.println("The amount of money you choose to enter: " + amountOfMoney);
            System.out.println("Money in your account: " + getMoneyForAccount());
            System.out.println("Money on the account to which the transfer is made: " + account.getMoneyForAccount());
            long yourMoney = getMoneyForAccount() - amountOfMoney;
            setMoneyForAccount(yourMoney);
            long notYourMoney = account.getMoneyForAccount() + amountOfMoney;
            account.setMoneyForAccount(notYourMoney);
            System.out.println("Money for your account: " + getMoneyForAccount());
            System.out.println("Money for account to which the transfer is made: " + account.getMoneyForAccount());
        }
    }
}
