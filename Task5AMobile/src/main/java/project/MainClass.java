package project;

public class MainClass {
    public static void main(String[] args) {
        Mobile mobile = new Mobile("Iphone", "13 pro max", new Mobile.ModelProperties(5000, 6, 6, 512, 15000));

        System.out.println(mobile);
    }
}
