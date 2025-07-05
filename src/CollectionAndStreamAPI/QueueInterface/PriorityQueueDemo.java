package CollectionAndStreamAPI.QueueInterface;

import java.util.PriorityQueue;

public class PriorityQueueDemo {
    public static void main(String[] args) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        pq.add(15);
        pq.add(10);
        pq.add(30);
        pq.add(5);
        // System.out.println(pq.remove()); // 5
        // System.out.println(pq.remove()); // 10
        // System.out.println(pq.peek()); // 15

        while (!pq.isEmpty()) {
            System.out.println(pq.poll());
        }
    }
}
