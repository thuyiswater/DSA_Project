import java.util.*;

public class Main {

    static Scanner input = new Scanner(System.in);
    static MyArrayList<Customer> customerList = new MyArrayList<>();

    public static void main(String[] args) throws Exception {

        DataHandler.readFile(customerList);

        while (true) {

            System.out.println("\n\t\t\t\t\t Welcome to Record Management for Intelligent Tracking (RMIT)");
            System.out.println("Menu: ");
            System.out.printf("\n1. Add a new customer\n" +
                    "2. Update an existing customer\n" +
                    "3. Search for customers\n" +
                    "4. Exit\n");
            System.out.print("\nPlease select an option by enter the number: ");

            int option = input.nextInt();

            switch (option) {
                case 1:
                    AddCustomer.insert(customerList);
                    new Buffer().buff();
                    break;
                case 2:
                    UpdateCustomer.updateCustomer(customerList);
                    new Buffer().buff();
                    break;
                case 3:
                    System.out.println("\nSearch type: ");
                    System.out.println("1. Search for one customer");
                    System.out.println("2. Search for a list of Customer");
                    System.out.print("\nPlease select an option by enter the number: ");

                    int option2 = input.nextInt();

                    if (option2 == 1) {
                        Search.exactSearch(customerList);
                        new Buffer().buff();
                    } else {
                        Search.partialSearch(customerList);
                        new Buffer().buff();
                    }
                    break;

                case 4:
                    DataHandler.writeFile(customerList);
                    System.exit(0);
                default:
                    System.out.println("Invalid option");
                    System.exit(0);
            }
        }
    }
}
