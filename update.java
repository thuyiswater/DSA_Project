import java.util.Scanner;

public class Update {
    Scanner sc = new Scanner(System.in);
    public int binarySearch(MyArrayList<Customer> arr, String value) throws Exception{
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
        return -1;
    }

    public void updateCustomer(MyArrayList<Customer> arr) throws Exception{
        System.out.print("Please enter an user's ID: ");
        String input = sc.nextLine();

        int index = binarySearch(arr, input);

        if(index == - 1) {
            System.out.println("No user found");
        }
        System.out.print("Which field you want to update\n" + "1. First name\n"
        + "2. Last name\n" + "3. Phone\n" + "PLease choose an option by enter the number: ");
    }
}
