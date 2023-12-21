package br.com.fakecompany.mycreditcard.main;

import br.com.fakecompany.mycreditcard.models.*;

import java.util.*;

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
        List<Product> list = new LinkedList<>();

        Shoes shoes = new Shoes("Nike Air Jordan", 200, "Nike");
        Electronics electronics = new Electronics("IPad", 800, "Apple");
        Clothes clothes = new Clothes("White T-Shirt", 50, "Calvin Klein");
        Toys toys = new Toys("Barbie", 20, "Mattel");
        Foods foods = new Foods("X-Burger", 10, "McDonald's");

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
                    shoes.showInfo();
                    if (funds >= 200){
                        list.add(shoes);
                        funds -= 200;
                    }
                    else {
                        System.out.println("Insufficient funds");
                    }
                    break;
                case 2:
                    electronics.showInfo();
                    if (funds >= 800){
                        list.add(electronics);
                        funds -= 800;
                    }
                    else {
                        System.out.println("Insufficient funds");
                    }
                    break;
                case 3:
                    clothes.showInfo();
                    if (funds >= 50){
                        list.add(clothes);
                        funds -= 50;
                    }
                    else {
                        System.out.println("Insufficient funds");
                    }
                    break;
                case 4:
                    toys.showInfo();
                    if (funds >= 20){
                        list.add(toys);
                        funds -= 20;
                    }
                    else {
                        System.out.println("Insufficient funds");
                    }
                    break;
                case 5:
                    foods.showInfo();
                    if (funds >= 10){
                        list.add(foods);
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

        list.sort(Comparator.comparing(Product :: getPrice));

        System.out.println("\n***************** Shopping List *****************");
        for (Product product : list) {
            System.out.println(product);
        }
        System.out.println("*************************************************");
    }
}
