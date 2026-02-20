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

        LoanItems[] arr = new LoanItems[amount];

        for (int i = 0; i < amount; i++) {

            System.out.println("\nType (Book/Video/Elektronickit) ");
            String type = sc.nextLine();
            System.out.print("Type: ");
            String Type = sc.nextLine();

            System.out.println("Indtast Title");
            String title = sc.nextLine();

            System.out.print("Price: ");
            double price = sc.nextDouble();
            sc.nextLine();
            System.out.print("Year: ");
            String year = sc.nextLine();

            System.out.print("Loandays");
            String loanDays = sc.nextLine();
            //opret objekt
            if (type.equalsIgnoreCase("Book")) {
                items[i] = new Book(title, price, year, loanDays);

            } else if (type.equalsIgnoreCase("Video")) {
                items[i] = new Video(title, price, year, loanDays);

            } else {
                items[i] = new Elektronickit(title, price, year, loanDays);
            }
        }
        LoanItems[] items = new LoanItems[3];
        items[0] = new Book("Java Basics", 200, "2021", 14);
        items[1] = new Video("OOP tutorial", 150, "2022", 7);
        items[2] = new ElectronicKit("Arduino Kit", 500, "2023", 30);

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