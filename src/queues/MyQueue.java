package queues;

public class MyQueue {
    private int[] arr;
    private int front;
    private int rear;
    private int size;
    private int capacity;

    public MyQueue(int capacity) {
        this.capacity = capacity;
        arr = new int[capacity];
        front = 0;
        rear = -1;
        size = 0;
    }

    // Adds an item to the queue
    public void enqueue(int item) {
        if (size == capacity) {
            throw new RuntimeException("Queue overflow: Cannot enqueue to a full queue.");
        }
        rear = (rear + 1) % capacity;
        arr[rear] = item;
        size++;
    }

    // Removes and returns the front item
    public int dequeue() {
        if (isEmpty()) {
            throw new RuntimeException("Queue underflow: Cannot dequeue from an empty queue.");
        }
        int item = arr[front];
        front = (front + 1) % capacity;
        size--;
        return item;
    }

    // Returns the front item without removing it
    public int top() {
        if (isEmpty()) {
            throw new RuntimeException("Queue is empty: No elements to show.");
        }
        return arr[front];
    }

    // Returns true if the queue is empty
    public boolean isEmpty() {
        return size == 0;
    }

    // Returns the number of items in the queue
    public int size() {
        return size;
    }


}
