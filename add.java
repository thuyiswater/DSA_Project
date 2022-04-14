import java.util.ArrayList;
public class add {
    public static void insert(ArrayList<String> arr, String value) {
        int left = 0;
        int right = arr.size() - 1;

        while (left <= right) {
            int mid = (left + right) / 2;
           // System.out.println(mid);
            if (value.compareTo(arr.get(mid)) == 1 || value.compareTo(arr.get(mid)) == -1) {
                System.out.println("dcc");
                    arr.add(mid, value);
                    break;
            }
            else if (value.compareTo(arr.get(mid)) < 0) {
                System.out.println(value.compareTo(arr.get(mid)));
                right = mid - 1;
                System.out.println(right + " right");
            }
            else if (value.compareTo(arr.get(mid)) > 0) {
                System.out.println(value.compareTo(arr.get(mid)));
                left = mid + 1;
                System.out.println(left + " left");
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
        list.add("z");

        insert(list, "d");
        System.out.println(list);
    }


}