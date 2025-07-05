package CollectionAndStreamAPI.QueueInterface;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;

public class DequeDemo {
    public static void main(String[] args) {

        // double-ended queue
        Deque<Integer> deque1 = new ArrayDeque<>(); // faster iteration, low memory, no null allowed
        deque1.addFirst(10);
        deque1.addLast(20);
        deque1.offerFirst(5);
        deque1.offerLast(25);
        // 5, 10, 20, 25
        System.out.println(deque1);

        System.out.println("First Element: " + deque1.getFirst()); // Output 5
        System.out.println("Last Element: " + deque1.getLast()); // Output 25
        deque1.removeFirst(); // removes 5
        deque1.pollLast(); // removes 25

        for (int i : deque1) {
            System.out.println(i);
        }

        Deque<Integer> deque2 = new LinkedList<>(); // insertion, deletion somewhere in middle
        System.out.println(deque2);
    }
}
