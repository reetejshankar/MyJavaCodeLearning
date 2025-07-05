package CollectionAndStreamAPI.SetInterface;

import java.util.Iterator;
import java.util.concurrent.ConcurrentSkipListSet;

public class ConcurrentSkipListSetClass {
    public static void main(String[] args) {
        @SuppressWarnings("unused")
        ConcurrentSkipListSet<String> Colors = new ConcurrentSkipListSet<>();

        Colors.add("Red");
        Colors.add("Green");
        Colors.add("Blue");
        Colors.add("Yellow");

        @SuppressWarnings("unused")
        Iterator iterator = Colors.iterator();
        System.out.println("Ascending CSLS: ");

        while (iterator.hasNext()) {
            System.out.println(iterator.next() + " ");
        }
        System.out.println("\nDescending CSLS: " + Colors.descendingSet());
        System.out.println("Lower Element: " + Colors.lower("Green"));
        System.out.println("Higer element: " + Colors.higher("Yellow"));
    }
}
