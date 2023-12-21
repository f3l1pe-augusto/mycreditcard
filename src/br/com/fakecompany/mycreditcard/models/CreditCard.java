package br.com.fakecompany.mycreditcard.models;

public class CreditCard {
    private final int number;
    private String name;
    private final String bank;
    private double limit;

    public CreditCard(final int number, String bank, double limit) {
        this.number = number;
        this.bank = bank;
        this.limit = limit;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public double getLimit() {
        return limit;
    }

    @Override
    public String toString() {
        return "Credit card number: " + number + "\nBank: " + bank + "\nLimit: " + limit;
    }
}
