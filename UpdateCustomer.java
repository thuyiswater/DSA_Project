import java.util.*;

public class UpdateCustomer {

    static Scanner sc = new Scanner(System.in);
    
    public static int binarySearch(MyArrayList<Customer> arr, String value) throws Exception{
        int left = 0;
        int right = arr.size() - 1;
        
        while (left <= right) {
            int mid = (left + right) / 2;
            if (value.compareTo(arr.get(mid).getID()) < 0) {
                right = mid - 1;
            } else if (value.compareTo(arr.get(mid).getID()) > 0) {
                left = mid + 1;
            } else return mid;
        }
        // no match value
        return -1;
    }

    // public static void wait() {

    // }

    public static void updateCustomer(MyArrayList<Customer> arr) throws Exception{
        System.out.print("Please enter an user's ID: ");
        String input = sc.nextLine();

        // check if user exist in csv file
        int index = binarySearch(arr, input);
        // notify if user not exist
        if(index == - 1) {
            System.out.println("No user found");
            return;
        }
        System.out.print("Which field do you want to update\n" + "1. First name\n" + 
        "2. Last name\n" + "3. Phone\n" + "Select an option by enter a number: ");
        int option = Integer.parseInt(sc.next());

        DataHandler.readFile(arr);
        if (option == 1) {
            System.out.print("\nEnter new first name: ");
            String newLastName = sc.nextLine();
            // DataHandler.writeFile(arr);
        } else if (option == 2) {
            DataHandler.readFile(arr);
            System.out.println("Enter new last name: ");
        }

    }

}

