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
        int amount = sc.nextInt();
        sc.nextLine();

        LoanItems[] items = new LoanItems[amount];

        for (int i = 0; i < amount; i++) {

            System.out.print("Enter type (Book/Video/Electronic Kit) ");
            String type = sc.nextLine();

            System.out.print("Enter title: ");
            String title = sc.nextLine();

            System.out.print("Enter price: ");
            double price = sc.nextDouble();
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
            } else {
                System.out.println("Enter model");
                String model = sc.nextLine();
                items[i] = new ElectronicKit(type, title, price, year, loanDays, model);
            }
        }

        System.out.println("---- Before sorting ----");
        print(items);
        sortByPrice(items);

        System.out.println("\n---- After sorting ----");
        print(items);

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