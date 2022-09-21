package project;

import java.util.ArrayList;

public class MainClass {
    public static void main(String[] args) {
        Payment payment = new Payment("ATB", new ArrayList<>());
        Payment.Product product = new Payment.Product("Ches", 30);
        Payment.Product product2 = new Payment.Product("Bear", 60);
        payment.getProductList().add(product);
        payment.getProductList().add(product2);
        payment.setCost();
        System.out.println(payment);
    }
}
