import java.util.*;
import java.io.*;

public class DataHandler {
    public static void main(String[] args) throws Exception {
        MyArrayList<String> myArr = new MyArrayList<String>();
        myArr.add("1");
        myArr.add("2");
        myArr.add("3");
        myArr.add(1,"X");
        for (int i = 0; i < myArr.size(); i++) {
            System.out.println(myArr.get(i));
        }

        BufferedReader reader = new BufferedReader(new FileReader("data.csv"));
        reader.readLine(); // skip 1st line
        String line = reader.readLine();
        
        reader.close();
    }
}

class MyArrayList<T> {
    private Object[] elements;
    private int size;
    private static final int DEFAULT_CAPACITY = 1000;

    public MyArrayList() {
        elements = (T[]) new Object[DEFAULT_CAPACITY];
        size = 0;
    }

    public void add(T obj) {
        if (size > elements.length) {
            increaseCapa();
        }
        elements[size] = obj;
        size++;
    }

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

    public T get(int index) throws Exception {
        if(index < size){
            return (T) elements[index];
        } else {
            throw new ArrayIndexOutOfBoundsException();
        }
    }

    private void increaseCapa() {
        int newSize = elements.length * 2;
        elements = Arrays.copyOf(elements, newSize);
    }

    public int size() {
        return size;
    }
}
