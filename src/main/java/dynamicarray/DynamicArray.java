package dynamicarray;

import java.lang.reflect.Array;
import java.util.Iterator;

public class DynamicArray<T> implements Iterable<T>{

    public T[] arr;
    public int len = 0;
    public int capacity = 0;

    public DynamicArray() {
        this(16); // this is default size
    }

    public DynamicArray(int capacity) {
        if (capacity<0) throw new IllegalArgumentException("capacity cannot be negative" + capacity);
        this.capacity = capacity;
        arr = (T[]) new Object[capacity];
    }

    public int size() {
        return len;
    }

    public boolean isEmpty() {
        return  size()==0;
    }

    public T get(int index) {
        return arr[index];
    }

    public void set(int index, T item) {
        arr[index] = item;
    }

    // remove a element at specific index
    public void removeAt(int index) {
        if(index < 0 || index > len) throw new IndexOutOfBoundsException("Not valid index");
        T[] data = (T[])new Object[len-1];
        for (int i = 0; i < data.length; i++) {

        }

    }

    @Override
    public Iterator<T> iterator() {
        return null;
    }


}
