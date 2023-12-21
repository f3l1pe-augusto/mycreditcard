package br.com.fakecompany.mycreditcard.models;

public class Product {
    private final String name;
    private final double price;
    private final String brand;

    public double getPrice() {
        return price;
    }

    public Product(String name, int price, String brand) {
        this.name = name;
        this.price = price;
        this.brand = brand;
    }

    public void showInfo() {
        System.out.println("Name: " + name + " Price: US$" + price + " Brand: " + brand);
    }

    @Override
    public String toString() {
        return "Name: " + name + " Price: US$" + price + " Brand: " + brand;
    }
}
