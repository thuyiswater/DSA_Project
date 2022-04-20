import java.util.*;

public class Main {

    static Scanner input = new Scanner(System.in);
    static MyArrayList<Customer> CustomersList = new MyArrayList<>();

    public static void main(String[] args) throws Exception {

        DataHandler.readFile(CustomersList);

        while (true) {

            System.out.println("\n\t\t\t\t\t Welcome to Record Management for Intelligent Tracking (RMIT)");
            System.out.println("Menu: ");
            System.out.printf("\n1. Add a new customer\n" +
                    "2. Update an existing customer\n" +
                    "3. Search for customers\n" +
                    "4. Exit\n");
            System.out.print("\nPlease select an option by enter the number: ");

            int option = Integer.parseInt(input.next());
<<<<<<< HEAD
            
=======

>>>>>>> 706cdbbfeba8654e84673459bbef94c881a9e967
            switch (option) {
                case 1:
                    AddCustomer.insert(CustomersList);
                    break;
                case 2:
                    System.out.println("Update");
                    break;
                case 3:
                    System.out.println("\nSearch type: ");
                    System.out.println("1. Search for one customer");
                    System.out.println("2. Search for a list of Customer");
                    System.out.print("\nPlease select an option by enter the number: ");

                    option = Integer.parseInt(input.next());
                    
                    if (option == 1) {
                        Search.ExactSearch(CustomersList);
                    } else {
                        Search.PartialSearch(CustomersList);
                    }
                    break;
                case 4:
                    DataHandler.writeFile(CustomersList);
                    System.exit(0);
                default:
                    System.out.println("Invalid option");
                    System.exit(0);
            }
        }
    }
}
