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

    public long getNumber() {
        return number;
    }

    public String getBank() {
        return bank;
    }

    public double getLimit() {
        return limit;
    }

    @Override
    public String toString() {
        return "Credit card number: " + this.getNumber() + "\nBank: " + this.getBank() + "\nLimit: " + this.getLimit();
    }
}
