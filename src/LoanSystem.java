import java.util.Scanner;


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
        int amount = 0;
        LoanItems[] items;
        if (sc.hasNextInt()) {
            items = new LoanItems[amount];
            amount = sc.nextInt();
            sc.nextLine();

            for (int i = 0; i < amount; i++) {

                System.out.print("Enter type (Book/Video/ElectronicKit) ");
                String type = sc.nextLine();

                System.out.print("Enter title: ");
                String title = sc.nextLine();

                System.out.print("Enter price: ");
                double price;
                if (sc.hasNextDouble()) {
                    price = sc.nextDouble();
                } else {
                    price = 0;
                    System.out.println("You did not enter a number, defaulting to price of 0");
                }
                sc.nextLine();

                System.out.print("Enter year: ");
                int year = sc.nextInt();
                sc.nextLine();

                System.out.print("Enter loan days: ");
                int loanDays = sc.nextInt();
                sc.nextLine();

                //opret objekt
                if (type.equalsIgnoreCase("Book")) {
                    System.out.print("Enter author: ");
                    String author = sc.nextLine();
                    items[i] = new Book(type, title, price, year, loanDays, author);
                } else if (type.equalsIgnoreCase("Video")) {
                    System.out.println("Enter runtime");
                    double runTime = sc.nextDouble();
                    sc.nextLine();
                    items[i] = new Video(type, title, price, year, loanDays, runTime);
                } else if (type.equalsIgnoreCase("ElectronicKit")) {
                    System.out.println("Enter model");
                    String model = sc.nextLine();
                    items[i] = new ElectronicKit(type, title, price, year, loanDays, model);
                } else {
                    System.out.println("You did not choose a valid type of Loan Item, defaulting to Book");
                    System.out.print("Enter author: ");
                    String author = sc.nextLine();
                    items[i] = new Book(type, title, price, year, loanDays, author);
                }
            }

            System.out.println("---- Before sorting ----");
            print(items);
            sortByPrice(items);

            System.out.println("\n---- After sorting ----");
            print(items);


        } else {
            items = new LoanItems[0];
            System.out.println("You did not enter a number, terminating program");
        }





        sc.close();

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