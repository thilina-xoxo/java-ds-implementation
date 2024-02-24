package stack;

// implementation using doubly linked list

import java.util.EmptyStackException;
import java.util.Iterator;
import java.util.LinkedList;

public class Stack<T> implements Iterable {

    private LinkedList<T> list;

    public Stack() {
        list = new LinkedList<T>();
    }

    // return the size of the stack
    public int size() {
        return list.size();
    }

    // check if the stack is empty
    public boolean isEmpty() {
        return size() == 0;
    }

    // add element to stack
    public void push(T item) {
        list.addLast(item);
    }

    // remove element from the stack
    public T pop() {
        if(isEmpty()) throw new EmptyStackException();
        T item = list.removeLast();
        return item;
    }

    // allow users to itterate using iterator
    @Override
    public Iterator iterator() {
        return null;
    }
}
