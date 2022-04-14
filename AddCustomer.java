import java.util.ArrayList;
public class AddCustomer {
    public static void insert(ArrayList<String> arr, String value) {
        int left = 0;  // 1st value in list
        int right = (int) Math.ceil(arr.size() - 1);  // last value in list
        while (left < right) {
            int mid = (left + right) / 2;
            if (value.compareTo(arr.get(mid)) > 0) {
                left = mid + 1;
            } else {
                right = mid;
            }
        }
        //add value
        if (value.compareTo(arr.get(left)) < 0) {
           arr.add(left, value);
        }
        // biggest value
        else if (value.compareTo(arr.get(left)) > 0) {
            arr.add(left + 1, value);
        }
        else {  // match value
            System.out.println("User already exist");
            return;
        }
    }


    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<String>();

        list.add("a");  
        list.add("c");  
        list.add("e");  
        list.add("f");  
        list.add("g"); 
        list.add("h"); 
        list.add("n"); 
        list.add("s");
        list.add("w"); 

        insert(list, "w");

        System.out.println(list);
    }
}