package Queue;

public class IntQueue {

    private int[] arr;
    private int front, end, size;

    public IntQueue(int maxSize) {
        front = end = 0;
        size = maxSize + 1;  // we need one extra slot
        arr = new int[size];
    }

    public boolean isEmpty() {
        return front == end;
    }

    public int size() {
        if (front > end) return (end + size - front);
        return end - front;
    }

    public int peek() {
        return arr[front];
    }

    public void enqueue(int value) {
        arr[end+1] = value;
        end++;
    }

}
