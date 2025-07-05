package CollectionAndStreamAPI.SetInterface;

import java.util.SortedSet;
import java.util.TreeSet;

public class TreeSetClass {
    public static void main(String[] args) {
        @SuppressWarnings("unused")
        SortedSet<String> colors = new TreeSet<>();

        // Adding new elements to a TreeSet
        colors.add("Blue");
        colors.add("Pink");
        colors.add("White");
        colors.add("Orange");

        System.out.println("Colors: " + colors);

        // Duplicate elements are ignored
        colors.add("White");
        System.out.println("After adding duplicate element \"White\" : " + colors);

        // This will be allowed because it is in lowercase.
        colors.add("blue");
        System.out.println("After adding \"Blue\"  : " + colors);
    }
}
