package br.com.fakecompany.mycreditcard.main;

import br.com.fakecompany.mycreditcard.models.CreditCard;
import br.com.fakecompany.mycreditcard.models.ShoppingList;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        CreditCard creditCard = new CreditCard(1236985474, "ByteBank", 10000);
        creditCard.setName("Felipe Augusto Ferreira");

        System.out.println("\n*************** Welcome to ByteBank ***************");
        System.out.println("Name: " + creditCard.getName());
        System.out.println(creditCard);
        System.out.println("*****************************************************");

        ShoppingList shoppingList = new ShoppingList();

        Scanner scanner = new Scanner(System.in);
        List<String> list = new LinkedList<>();

        while (true) {
            System.out.println("What do you want to buy?: ");
            String shop = scanner.nextLine();
            list.add(shop);

            System.out.println("Do you want to buy another thing? (1 - yes / 0 - no): ");
            int ans = scanner.nextInt();
            scanner.nextLine(); // Consume the new line character

            if (ans == 0) {
                break;
            }
        }

        for (String shop : list) {
            System.out.println(shop);
        }
    }
}
