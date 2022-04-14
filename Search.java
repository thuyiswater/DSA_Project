import java.util.*;
import java.lang.Math;

public class Search {

    static Scanner input = new Scanner(System.in);  // get user input

    // ----------------------------- B I N A R Y  S E A R C H ------------------------------------
    
    public static int BinarySearch(ArrayList<String> arr, String value) {

        int left = 0;  // set index
        int right = arr.size() - 1;  

        while (left <= right) {

            int mid = (left + right) / 2;  // middle value index
                
            if (value.compareTo(arr.get(mid)) < 0) {  // go left
                right = mid - 1;  // move pointer to left
            }
            else if (value.compareTo(arr.get(mid)) > 0) {  // go right
                left = mid + 1;  // move pointer to right
            }
            else {  // match value
                return mid;  // return the index of matched value
            }
        }
        return -1;  // no match result
    }

    // ------------------------------ E X A C T  S E A R C H -------------------------------------

    public static void ExactSearch(ArrayList<String> arr) {

        System.out.print("\nPlease enter a complete user's ID: ");
        String value = input.nextLine();  // get input

        int index = BinarySearch(arr, value);  // result from binary search

        if (index != -1) {
            System.out.println("User found");
            return;
        } 
        System.out.println("User not found");
    }

    // ---------------------------- P A R T I A L  S E A R C H -----------------------------------

    public static int IndexSearch(ArrayList<String> arr, String target, String value) {

        int left = 0;  // set index
        int right = arr.size() - 1;  

        while (left <= right) {

            int mid = (left + right) / 2;  // middle value index
                
            if (arr.get(mid).contains(value) == true) {
                return mid;
            }
            else if (value.compareTo(arr.get(mid)) < 0) {  // go left
                right = mid - 1;  // move pointer to left
            }
            else if (value.compareTo(arr.get(mid)) > 0) {  // go right
                left = mid + 1;  // move pointer to right
            }
        }
        return -1;  // not match result
    }

    public static void ValueSearch(ArrayList<String> arr, int index, String value) {

        // loop to left side
        for (int i = index - 1; i >= 0; i--) {
            if (arr.get(i).contains(value) == false) {  // exit if the next value does not contain the search value
                break;
            }
            System.out.println(arr.get(i));
        }

        // loop to right
        for (int i = index + 1; i < arr.size(); i++) {
            if (arr.get(i).contains(value) == false) {   // exit if the next value does not contain the search value
                break;
            }
            System.out.println(arr.get(i));
        }
    }

    public static void PartialSearch(ArrayList<String> arr) {

        System.out.print("\nPlease enter customer's ID (5 > 8 letters): ");
        String value = input.nextLine();  // get input

        if (value.length() < 5 || value.length() > 8) {  // search value must (5 < x < 8)
            System.out.println("Only 5 to 8 letters!");
            return;
        } 

        // calculate number of 0 need to add
        double zero = Math.pow(10, 10 - value.length());  
        String target = value + String.valueOf((int) zero).substring(1);  // convert to string and add to input

        // BinarySearch to find matching value
        int index = IndexSearch(arr, target, value); 

        if (index == -1) {  // no matching
            System.out.println("User not found");
            return;
        } 

        // loop forward and backward for matching value
        System.out.println(arr.get(index));
        ValueSearch(arr, index, value);
    }

    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<String>();

        list.add("abc11134");
        list.add("bre55353");  
        list.add("cdd12443");  
        list.add("cdd23467");  
        list.add("cdd34343");
        list.add("cdd45746");  
        list.add("gjg34336");  
        list.add("hww23556"); 
        list.add("ikh78823"); 

        // ExactSearch(list);
        PartialSearch(list);
    }
}