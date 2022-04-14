import java.util.*;

public class BinarySearch {

    static Scanner input = new Scanner(System.in);
    
    public static String Search(ArrayList<String> arr, String value) {

        int left = 0;  // 1st value in list
        int right = arr.size() - 1;  // last value in list

        while (left <= right) {

            int mid = (left + right) / 2;
                
            if (value.compareTo(arr.get(mid)) < 0) {  // go left
                right = mid - 1;
            }

            else if (value.compareTo(arr.get(mid)) > 0) {  // go right
                left = mid + 1;
            }

            else {  // match value
                return value;
            }
        }
        return null;  // not match result
    }

    public static void ExactSearch(ArrayList<String> arr) {

        System.out.print("\nPlease enter a complete user's ID: ");
        String value = input.nextLine();  // get input

        String result = Search(arr, value);  // result from binary search

        if (result == value) {
            System.out.println("User found");
        } else {
            System.out.println("User not found");
        }
    }

    public static void PartialSearch(ArrayList<String> arr) {

        System.out.println("Please enter customer's ID (5 > 8 letters): ");
        String value = input.nextLine();  // get input
    }

    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<String>();

        list.add("a");
        list.add("b");  
        list.add("c");
        list.add("d");  
        list.add("e");  
        list.add("f");  
        list.add("g");  
        list.add("h"); 
        list.add("i"); 

        ExactSearch(list);
    }
}