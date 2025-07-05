package CollectionAndStreamAPI.ListInterface;

import java.util.Arrays;
import java.util.LinkedList;

public class LinkdedListClass {
    public static void main(String[] args) {

        // Node node1 = new Node();
        // Node node2 = new Node();
        // node2.value = 2;
        // node1.value = 1;
        // node1.next = node2;
        // node2.next = null;

        LinkedList<Integer> linkedList = new LinkedList<>();
        linkedList.add(1);
        linkedList.add(2);
        linkedList.add(3);
        linkedList.get(2); // 0(n)
        linkedList.addLast(4); // 0(1)
        linkedList.addFirst(0); // 0(1)
        linkedList.getFirst();
        linkedList.getLast();
        linkedList.removeIf(x -> x % 2 == 0);
        System.out.println(linkedList);

        System.out.println("----------------");

        LinkedList<String> animals = new LinkedList<>(Arrays.asList("Cat", "Dog", "Elephant"));
        LinkedList<String> animalsToRemove = new LinkedList<>(Arrays.asList("Dog", "Lion"));
        animals.removeAll(animalsToRemove);
        System.out.println(animals);
    }
}
