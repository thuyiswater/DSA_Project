import java.util.*;
import java.io.*;

public class DataHandler {
    public static void main(String[] args) throws Exception {
    
        //test functions
        MyArrayList<String> myArr = new MyArrayList<String>();
        myArr.add("1");
        myArr.add("2");
        myArr.add("3");
        myArr.add(1,"X");
        for (int i = 0; i < myArr.size(); i++) {
            System.out.println(myArr.get(i));
        }

        //read and write file nhưng đang đợi chị Thủy push class Customer lên mới làm típ đc
        BufferedReader reader = new BufferedReader(new FileReader("data.csv"));
        String line = reader.readLine();
        
        reader.close();
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
