package project;

public class Customer {
    private String name;
    private int taskAmount;

    public Customer(String name, int taskAmount) {
        this.name = name;
        this.taskAmount = taskAmount;
    }

    public String getName() {
        return name;
    }

    public int getTaskAmount() {
        return taskAmount;
    }

    @Override
    public String toString() {
        return getName();
    }
}
