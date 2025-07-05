package CollectionAndStreamAPI.QueueInterface;

import java.util.LinkedList;
import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;

public class QueueClass {
    public static void main(String[] args) {

        LinkedList<Integer> list = new LinkedList<>();
        list.addLast(1); // enqueue
        list.addLast(2); // enqueue
        list.addLast(3);
        System.out.println(list);

        Integer i = list.removeFirst();
        System.out.println(i);
        System.out.println(list);
        list.getFirst(); // peek

        System.out.println("--------------");

        Queue<Integer> qp = new LinkedList<>();
        qp.add(1);
        System.out.println(qp.size());
        System.out.println(qp.remove()); // throw exception if enpty
        System.out.println(qp.poll()); // null

        System.out.println(qp.element()); // throw exception if empty
        System.out.println(qp.peek());

        System.out.println("---------------");

        Queue<Integer> qp1 = new ArrayBlockingQueue<>(2);
        System.out.println(qp1.add(1)); // true
        System.out.println(qp1.offer(2)); // true

        // System.out.println(qp1.offer(3)); // throws exception
        System.out.println(qp1.offer(3)); // false
    }
}
