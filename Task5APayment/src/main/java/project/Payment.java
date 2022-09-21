package project;

import java.util.List;
import java.util.Objects;

public class Payment {
    private String name;
    private List<Product> productList;
    private int cost;

    public Payment(String name, List<Product> productList) {
        this.name = name;
        this.productList = productList;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Product> getProductList() {
        return productList;
    }

    public void setProductList(List<Product> productList) {
        this.productList = productList;
    }

    public int getCost() {
        return cost;
    }

    public void setCost() {
        for (Product product : productList) {
            this.cost += product.getPriceProduct();
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Payment payment = (Payment) o;
        return cost == payment.cost && Objects.equals(name, payment.name) && Objects.equals(productList, payment.productList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, productList, cost);
    }

    @Override
    public String toString() {
        return "Payment{" +
                "name='" + name + '\'' +
                ", productList=" + productList +
                ", cost=" + cost +
                '}';
    }


    public static class Product {
        private String nameProduct;
        private int priceProduct;

        public Product(String nameProduct, int priceProduct) {
            this.nameProduct = nameProduct;
            this.priceProduct = priceProduct;
        }

        public String getNameProduct() {
            return nameProduct;
        }

        public void setNameProduct(String nameProduct) {
            this.nameProduct = nameProduct;
        }

        public int getPriceProduct() {
            return priceProduct;
        }

        public void setPriceProduct(int priceProduct) {
            this.priceProduct = priceProduct;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Product product = (Product) o;
            return priceProduct == product.priceProduct && Objects.equals(nameProduct, product.nameProduct);
        }

        @Override
        public int hashCode() {
            return Objects.hash(nameProduct, priceProduct);
        }

        @Override
        public String toString() {
            return "Product{" +
                    "nameProduct='" + nameProduct + '\'' +
                    ", priceProduct=" + priceProduct +
                    '}';
        }


    }
}
