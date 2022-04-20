import java.util.*;

public class AddCustomer {
    static Scanner input = new Scanner(System.in);

    public static void insert(MyArrayList<Customer> arr) throws Exception {

        Customer value = new Customer();

        System.out.println("\nPlease enter a new customer's information: ");
        System.out.print("\nID: ");
        value.setID(input.nextLine());
        System.out.print("\nFirst name: ");
        value.setFirstName(input.nextLine());
        System.out.print("\nLast name: ");
        value.setLastName(input.nextLine());
        System.out.print("\nPhone number: ");
        value.setPhone(input.nextLine());

        if (add(arr, value)) {
            System.out.println("\nSuccesfully added!\n");
        } else {
            System.out.println("\nCustomer already exists\n");
        }

    }

    public static boolean add(MyArrayList<Customer> arr, Customer value) throws Exception {
        int left = 0; // 1st value in list
        int right = arr.size() - 1; // last value in list

        while (left < right) {

            int mid = (left + right) / 2;
            if (value.getID().compareTo(arr.get(mid).getID()) > 0) {
                left = mid + 1;
            } else {
                right = mid;
            }
        }
        if (right < 0) {
            arr.add(value);
        }
        // add value
        else if (value.getID().compareTo(arr.get(left).getID()) < 0) {
            arr.add(left, value);
        }
        // biggest value
        else if (value.getID().compareTo(arr.get(left).getID()) > 0) {
            arr.add(left + 1, value);
        } else { // match value
            return false;
        }
        return true;
    }
}