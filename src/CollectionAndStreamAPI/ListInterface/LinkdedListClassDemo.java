package CollectionAndStreamAPI.ListInterface;

import java.util.LinkedList;

public class LinkdedListClassDemo {
    public static void main(String[] args) {

        LinkedList<String> linkedL1 = new LinkedList<>();
        linkedL1.add("Mary Wilson");
        linkedL1.add("Elvis Fetcher");
        linkedL1.add("Martin Luther");
        linkedL1.add("Jack Dawson");
        linkedL1.add("John Smith");
        System.out.println("Linked List contects: " + linkedL1);
        linkedL1.removeLast();
        System.out.println("Modified Linked List contacts: " + linkedL1);
    }
}
