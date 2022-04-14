// import java.util.ArrayList;
// import java.lang.Math;

// public class add {
    
//     public static void insert(ArrayList<String> arr, String value) {

//         int left = 0;  // 1st value in list
//         int right = (int) Math.ceil(arr.size() - 1);  // last value in list

//         while (left <= right) {

//             int mid = (right + left) / 2; 
//             if (left == right) {  // 2 pointer met

//                 if (value.compareTo(arr.get(mid)) < 0) {  // add to left
//                     arr.add(mid - 1, value);
//                 }
//                 else if (value.compareTo(arr.get(mid)) > 0) {  // add to right
//                     arr.add(mid + 1, value);
//                 }
//                 return;
//             }
                
//             else if (value.compareTo(arr.get(mid)) > 0) {  // go right
//                 left = mid + 1;
//             }

//             else if (value.compareTo(arr.get(mid)) < 0) {  // go left           
//                 right = mid;
//             }

//             else {  // match value
//                 System.out.println("User already exist");
//                 return;
//             }

//            // arr.add(left - 1, value);
//         }
//     }

//     public static void main(String[] args) {

//         ArrayList<String> list = new ArrayList<String>();

//         list.add("a");  
//         list.add("c");  
//         list.add("e");  
//         list.add("f");  
//         list.add("g"); 
//         list.add("h"); 
//         list.add("n"); 
//         list.add("s");
//         list.add("w"); 

//         System.out.println(list);

//         insert(list, "d");

//         //add in right order: b, i, j , k, l, m, x, y, z
//         //can not add (because left > right so the while loop stop, need to find a way to fix this): d, o, p , q, r
//         //add wrong order(should be before w instead of s): t, u, v
//         //match value did not inform: a, f, h, w
//         System.out.println(list);
//     }
// }