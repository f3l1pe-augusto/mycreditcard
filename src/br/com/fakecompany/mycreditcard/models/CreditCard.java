package br.com.fakecompany.mycreditcard.models;

public class CreditCard {
    private final int number;
    private String name;
    private final String bank;
    private final double limit;

    private double funds;

    public CreditCard(final int number, String bank, double limit) {
        this.number = number;
        this.bank = bank;
        this.limit = limit;
        this.funds = limit;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public double getFunds() {
        return funds;
    }

    public boolean shop(double price) {
        if (funds >= price){
            funds -= price;
            return true;
        }
        System.out.println("Insufficient funds");
        return false;
    }

    @Override
    public String toString() {
        return "Credit card number: " + number + "\nBank: " + bank + "\nLimit: " + limit;
    }
}
