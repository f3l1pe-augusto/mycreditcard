package br.com.fakecompany.mycreditcard.main;

import br.com.fakecompany.mycreditcard.models.CreditCard;
import br.com.fakecompany.mycreditcard.models.Product;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        CreditCard creditCard = new CreditCard(1236985474, "ByteBank", 1000);
        creditCard.setName("Felipe Augusto Ferreira");

        double funds = creditCard.getLimit();

        System.out.println("\n*************** ByteBank **************************");
        System.out.println("Name: " + creditCard.getName());
        System.out.println(creditCard);
        System.out.println("***************************************************");

        Scanner scanner = new Scanner(System.in);
        List<String> list = new LinkedList<>();

        while (true) {
            System.out.println("\n*************** Shopping Mall ***************");
            System.out.println("1 - Shoes");
            System.out.println("2 - Electronics");
            System.out.println("3 - Clothes");
            System.out.println("4 - Toys");
            System.out.println("5 - Foods");
            System.out.println("***********************************************");

            System.out.println("What do you want to buy?: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    if (funds >= 90){
                        list.add("Shoes");
                        funds -= 90;
                    }
                    else {
                        System.out.println("Insufficient funds");
                    }
                    break;
                case 2:
                    if (funds >= 400){
                        list.add("Electronics");
                        funds -= 400;
                    }
                    else {
                        System.out.println("Insufficient funds");
                    }
                    break;
                case 3:
                    if (funds >= 30){
                        list.add("Clothes");
                        funds -= 30;
                    }
                    else {
                        System.out.println("Insufficient funds");
                    }
                    break;
                case 4:
                    if (funds >= 20){
                        list.add("Toys");
                        funds -= 20;
                    }
                    else {
                        System.out.println("Insufficient funds");
                    }
                    break;
                case 5:
                    if (funds >= 10){
                        list.add("Foods");
                        funds -= 10;
                    }
                    else {
                        System.out.println("Insufficient funds");
                    }
                    break;
                default:
                    System.out.println("Invalid option!");
                    break;
            }
            System.out.println("\nCurrent funds: " + funds);

            if (funds == 0) {
                break;
            }

            System.out.println("Do you want to buy another thing? (1 - Yes / 0 - No): ");
            int ans = scanner.nextInt();
            scanner.nextLine(); // Consumes the new line character

            if (ans == 0) {
                break;
            }
        }

        Collections.sort(list);

        System.out.println("\n***************** Shopping List *****************");
        for (String shop : list) {
            System.out.println(shop);
        }
        System.out.println("*************************************************");
    }
}
