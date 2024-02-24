package stack;

public class IntStack {

    private int[] ar;
    private int pos=0;

    public IntStack(int maxSize) {
        this.ar = new int[maxSize];
    }

    // Returns the number of elements insize the stack
    public int size() {
        return pos;
    }

    // check stack is empty
    public boolean isEmpty() {
        return pos == 0;
    }

    // add element to the top
    public void push (int value) {
        ar[pos++] = value;
    }

    // remove element from the top
    public void pop () {

    }

}
