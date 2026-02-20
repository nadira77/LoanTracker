import java.util.Scanner;

import static java.lang.IO.println;

public class LoanSystem {
    //*
// * Test class demonstrating:
// * - Abstraction
// * - Inheritance
// * - Polymorphism
// * - Arrays
// * - Manual sorting
// * - Input validation
// */
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Hvor mange items vil du låne?");
        int amount = sc.nextInt();

        //validere brugerens input
        if (amount < 0 || !sc.hasNextInt()) {
            System.out.println("Du skal skrive et positivt tal");
        }

        LoanItems[] items = new LoanItems[amount];

        for (int i = 0; i < amount; i++) {

            System.out.println("\nEnter Type (Book/Video/Elektronickit) ");
            String type = sc.nextLine();

            System.out.println("Enter Title");
            String title = sc.nextLine();

            System.out.print("Enter Price: ");
            double price = sc.nextDouble();

            System.out.print("Enter Year: ");
            int year = sc.nextInt();

            System.out.print("Enter Loandays");
            int loanDays = sc.nextInt();

            //opret objekt
            if (type.equalsIgnoreCase("Book")) {
                System.out.println("Enter Author");
                String author = sc.nextLine();
                items[i] = new Book(type, title, price, year, loanDays, author);
            } else if (type.equalsIgnoreCase("Video")) {
                System.out.println("Enter Runtime");
                double runTime = sc.nextDouble();
                items[i] = new Video(type, title, price, year, loanDays, runTime);
            } else {
                System.out.println("Enter model");
                String model = sc.nextLine();
                items[i] = new ElectronicKit(type, title, price, year, loanDays, model);
            }
        }

        System.out.println("---- Before sorting ----");
        println(items);
        sortByPrice(items);

        System.out.println("\n---- After sorting ----");
        print(items);
        sc.close();

        // Udskriv alle items

        System.out.println("\n--- Lånte items ---");
        for (LoanItems item : items) {
            System.out.println(item);
        }
    }

    public static void print(LoanItems[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }


    public static void sortByPrice(LoanItems[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {

            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j].getPrice() > arr[j + 1].getPrice()) {

                    LoanItems temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }
}