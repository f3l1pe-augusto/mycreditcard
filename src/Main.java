public class Main {
    public static void main(String[] args) {
        CreditCard creditCard = new CreditCard(1236985474, "ByteBank", 10000);
        creditCard.setName("Felipe Augusto Ferreira");

        System.out.println("\n*************** Welcome to ByteBank ***************");
        System.out.println("Name: " + creditCard.getName());
        System.out.println(creditCard);
        System.out.println("*****************************************************");
    }
}
