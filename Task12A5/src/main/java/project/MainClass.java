package project;

public class MainClass {
    public static void main(String[] args) {
        Thread thread = new Thread(new BusStation());
        thread.start();
    }
}
