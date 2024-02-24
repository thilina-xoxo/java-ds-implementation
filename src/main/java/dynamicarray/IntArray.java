package dynamicarray;

import java.util.Arrays;
import java.util.Iterator;

public class IntArray implements Iterable {

    private static final int DEFAULT_CAP = 1 << 3;

    public int[] arr;
    public int len =0;
    public int capacity =0;

    // initialize array with default capacity
    public IntArray () {
        this.arr = new int[DEFAULT_CAP];
    }

    // initialize array with certain value
    public IntArray(int capacity) {
        if (capacity<0) throw new IllegalArgumentException("Illegal capacity" + capacity);
        this.capacity = capacity;
        this.arr = new int[capacity];
    }

    // make array dynamic array, create array using a given array
    public IntArray(int[] arr) {
        if(arr == null) throw new IllegalArgumentException("Array can not be null");
        this.arr = Arrays.copyOf(arr, arr.length);
        capacity = len = arr.length;
    }

    // return the size of the array
    public int size() {
        return this.len;
    }

    // return isEmpty
    public boolean isEmpty() {
        return len == 0;
    }

    // To get/set values without method call overhead you can do
    // array_obj.arr[index] instead, you can gain about 10x the speed! // note here
    public int get(int index) {
        return arr[index];
    }

    public void set(int index, int elem) {
        arr[index] = elem;
    }

    // add element to dynamic array
    public void add(int elem) {
        if( len + 1 >= capacity  ) {
            if ( capacity == 0 ) capacity = 1;
            else capacity *= 2;
            arr = new int[capacity];
        }
        arr[len++] = elem;
    }

    // Iterator implementation
    // not understand this implementation

    @Override
    public Iterator<Integer> iterator() {
        return new java.util.Iterator<Integer>() {
            int index =0;

            public boolean hasNext() {
                return  index < len;
            }

            public Integer next() {
                return arr[index++];
            }

            public void remove() {
                throw new UnsupportedOperationException();
            }
        };
    }

}
