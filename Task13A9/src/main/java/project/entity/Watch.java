package project.entity;

import java.util.Objects;

public class Watch {
    private int id;
    private String brand;
    private String type;
    private int price;
    private int amount;
    private int manufacturerId;

    public Watch(int id, String brand, String type, int price, int amount, int manufacturerId) {
        this.id = id;
        this.brand = brand;
        this.type = type;
        this.price = price;
        this.amount = amount;
        this.manufacturerId = manufacturerId;
    }

    public Watch() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public int getManufacturerId() {
        return manufacturerId;
    }

    public void setManufacturerId(int manufacturerId) {
        this.manufacturerId = manufacturerId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Watch watch = (Watch) o;
        return id == watch.id && price == watch.price && amount == watch.amount && manufacturerId == watch.manufacturerId && Objects.equals(brand, watch.brand) && Objects.equals(type, watch.type);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, brand, type, price, amount, manufacturerId);
    }

    @Override
    public String toString() {
        return "Watch{" +
                "id=" + id +
                ", brand='" + brand + '\'' +
                ", type='" + type + '\'' +
                ", price=" + price +
                ", amount=" + amount +
                ", manufacturerId=" + manufacturerId +
                '}';
    }
}
