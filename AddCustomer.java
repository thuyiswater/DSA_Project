public class AddCustomer {
    public static void insert(MyArrayList<Customer> arr, Customer value) throws Exception {
        int left = 0;  // 1st value in list
        int right = arr.size() - 1;  // last value in list
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
        //add value
        else if (value.getID().compareTo(arr.get(left).getID()) < 0) {
           arr.add(left, value);
        }
        // biggest value
        else if (value.getID().compareTo(arr.get(left).getID()) > 0) {
            arr.add(left + 1, value);
        }
        else {  // match value
            System.out.println("User already exist");
            return;
        }
    }
}