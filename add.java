import java.util.ArrayList;
import java.lang.Math;

public class add {
    
    public static void insert(ArrayList<String> arr, String value) {

        int left = 0;  // 1st value in list
        int right = (int) Math.ceil(arr.size() - 1);  // last value in list

        while (left <= right) {

            int mid = left + (right - left) / 2; 
            System.out.println(mid + " mid");
           
            if (left == right) {  // 2 pointer met

                if (value.compareTo(arr.get(mid)) < 0) {  // add to left
                    arr.add(mid - 1, value);
                }
                else if (value.compareTo(arr.get(mid)) > 0) {  // add to right
                    arr.add(mid + 1, value);
                }
                return;
            }
                
            else if (value.compareTo(arr.get(mid)) > 0) {  // go right
                System.out.println(left + " Left before");
                left = mid + 1;
                System.out.println(left + " left after");
                System.out.println("-----------");
            }

            else if (value.compareTo(arr.get(mid)) < 0) {  // go left
                System.out.println(right + "right before");
                right = mid - 1;
                System.out.println(right + "right after");
                System.out.println("-----------");
                
            }

            else {  // match value
                System.out.println("User already exist");
                return;
            }
        }
    }

    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<String>();

        list.add("a");
        list.add("b");  
        list.add("c");  
        list.add("e");  
        list.add("f");  
        list.add("g"); 
        list.add("h"); 
        list.add("i"); 

        insert(list, "x");
        System.out.println(list);
    }
}