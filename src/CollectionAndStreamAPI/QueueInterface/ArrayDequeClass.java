package CollectionAndStreamAPI.QueueInterface;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Iterator;

public class ArrayDequeClass {
    public static void main(String[] args) {
        Deque<String> deque1 = new ArrayDeque<>();
        deque1.addLast("Red");
        deque1.addLast("Green");
        deque1.addFirst("Blue");

        System.out.println("Deque Contents");
        for (Iterator iter = deque1.iterator(); iter.hasNext();) {
            System.out.println(iter.next());
        }
        System.out.println("Reverse Deque");
        for (Iterator iter = deque1.descendingIterator(); iter.hasNext();) {
            System.out.println(iter.next());
        }
        System.out.println("First color: " + deque1.getFirst());
        System.out.println("First Last: " + deque1.getLast());
        System.out.println("Deque contains \"Yellow\":" + deque1.contains("Yellow"));
    }
}
