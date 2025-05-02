package queues;

public class Main {

    // Demonstrates the functionality
    public static void main(String[] args) {
        try {
            MyQueue queue = new MyQueue(3);
            System.out.println("Is queue empty? " + queue.isEmpty());

            queue.enqueue(10);
            queue.enqueue(20);
            queue.enqueue(30);

            System.out.println("Top element: " + queue.top());
            System.out.println("Size: " + queue.size());

            System.out.println("Dequeued: " + queue.dequeue());
            System.out.println("Top after dequeue: " + queue.top());

            System.out.println("Enqueueing 40...");
            queue.enqueue(40);

            System.out.println("Trying to enqueue 50 to full queue...");
            queue.enqueue(50); // Should throw exception

        } catch (RuntimeException e) {
            System.err.println("Error: " + e.getMessage());
        }
    }
}
