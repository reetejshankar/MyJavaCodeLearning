package CollectionAndStreamAPI.QueueInterface;

import java.util.PriorityQueue;

public class PriorityQueueClass {
    public static void main(String[] args) {
        PriorityQueue<String> pq = new PriorityQueue<>();
        pq.offer("Red");
        pq.offer("Green");
        pq.offer("Blue");
        pq.offer("Yellow");

        System.out.println("Priority queue contents: " + pq);
        System.out.println("1. Removed: " + pq.poll());
        System.out.println("2. Removed: " + pq.poll());
        System.out.println("3. Viewed: " + pq.peek());
        System.out.println("4. Viewed: " + pq.peek());
        System.out.println("5. Removed: " + pq.remove());
        System.out.println("6. Removed: " + pq.remove());
        System.out.println("7. Viewed: " + pq.peek());
        System.out.println("Priority queue contents: " + pq);
        System.out.println("7. Viewed: " + pq.element());
    }
}
