package linkedlist;

import java.util.Iterator;

public class DoublyLinkedList<T> implements Iterable<T> {

    private int size = 0;
    private Node<T> head = null;
    private Node<T> tail = null;

    public static class Node <T> {
        private T data;
        private Node<T> prev, next;

        public Node(T data, Node<T> prev, Node<T> next) {
            this.data = data;
            this.prev = prev;
            this.next = next;
        }

        @Override
        public String toString () {
            return  data.toString();
        }

    }

    // clean linked list
    public void clear() {
        Node<T> trav = head;

        while(trav.next != null) {
            Node<T> next = trav.next;
            trav.prev = trav.next = null;
            trav.data = null;
            trav = next;
        }

        head = tail = trav = null;

    }

    // Return the size of this linked list
    public int size() {
        return size;
    }

    // Is this linked list empty?
    public boolean isEmpty() {
        return size() == 0;
    }

    // Add an element to the tail of the linked list, O(1)
    public void add(T elem) {
        addLast(elem);
    }

    // Add a node to the tail of the linked list, O(1)
    private void addLast(T elem) {
        if(isEmpty()) {
            head = tail = new Node<T>(elem,null, null);
        }
        tail.next = new Node<T>(elem,tail,null);
        tail = tail.next;
        size++;
    }

    // Add a node to the head of the linked list, O(1)
    private void addFirst(T elem) {
        if(isEmpty()) {
            head = tail = new Node<T>(elem,null, null);
        }
        head.prev = new Node<T> (elem, null, head);
        head = head.prev;
        size++;
    }

    // Remove a node at a particular index, (O(n))
//    public T removeAt(int index) {
//        if (index < 0 || index > size) throw new RuntimeException("Illegal argument");
//
//        int i ;
//        Node<T> trav;
//
//        if (size < index/2) {
//            for ( i=0, trav = head ; i != index ; i++) {
//                trav = trav.next;
//            }
//        }
//
//        else {
//
//        }
//    }

    // remove arbitury node from a linked list

    // Iterator
    @Override
    public Iterator<T> iterator() {
        return new java.util.Iterator<T>() {
            private Node<T> trav = head;

            @Override
            public boolean hasNext() {
                return trav.next != null;
            }

            @Override
            public T next() {
                T data = trav.data;
                trav = trav.next;

                return data;
            }

            @Override
            public void remove() {
                throw new UnsupportedOperationException();
            }
        };

    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("[");

        Node<T> trav = head;

        while (trav != null) {
            sb.append(trav.data);
            trav = trav.next;
        }

        sb.append("]");
        return sb.toString();
    }
}
