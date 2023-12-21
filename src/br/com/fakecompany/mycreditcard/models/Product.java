package br.com.fakecompany.mycreditcard.models;

public class Product {
    private String name;
    private double price;
    private String brand;

    public Product(String name, int price, String brand) {
        this.name = name;
        this.price = price;
        this.brand = brand;
    }

    public void showInfo() {
        String info = """
                Name: %s
                Price: %.2f
                Brand: %s
                """.formatted(name, price, brand);
    }
}
