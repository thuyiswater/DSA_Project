import java.util.*;
import java.io.*;

public class DataHandler {
    public static void main(String[] args) throws Exception {

        MyArrayList<Customer> CustomersList = new MyArrayList<>();
    
        //read and write file 
        BufferedReader reader = new BufferedReader(new FileReader("customer.csv"));
        reader.readLine();
        String line = reader.readLine();
        while (line != null) {
            String[] splitData = line.split(",");
            Customer tempCus = new Customer(splitData[0], splitData[1], splitData[2], splitData[3]);
            // CustomersList.add(tempCus);
            AddCustomer.insert(CustomersList, tempCus);
            line = reader.readLine();
        }
        reader.close();

        //print ID of elements in list
        for (int i = 0; i < CustomersList.size(); i++) {
            System.out.println(CustomersList.get(i).getID());
        }
    }
}

// implement ArrayList
class MyArrayList<T> {
    private Object[] elements;
    private int size;
    private static int DEFAULT_CAPACITY = 1000; // temporary capacity of array when first created

    // constructor
    public MyArrayList() {
        elements = (T[]) new Object[DEFAULT_CAPACITY];
        size = 0;
    }

    // method: add element to the last position
    public void add(T obj) {
        if (size > elements.length) {
            increaseCapa();
        }
        elements[size] = obj;
        size++;
    }

    // method: add element to a specific position
    public void add(int index, T obj) {
        if (size > elements.length) {
            increaseCapa();
        }
        for (int i = size-1; i > index-1; i--) {
            elements[i+1] = elements[i]; 
        }
        elements[index] = obj;
        size++;
    }

    // method: return element of a specific position
    public T get(int index) throws Exception {
        if(index < size){
            return (T) elements[index];
        } else {
            throw new ArrayIndexOutOfBoundsException();
        }
    }

    // automatically increase capacity of array when full
    private void increaseCapa() {
        int newSize = elements.length * 2;
        elements = Arrays.copyOf(elements, newSize);
    }

    // return number of element in arrays, not full capacity
    public int size() {
        return size;
    }
}
