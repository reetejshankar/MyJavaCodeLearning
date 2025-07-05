package CollectionAndStreamAPI.MapInterface;

import java.util.concurrent.ConcurrentSkipListMap;

public class CoucurrentSkipListMapDemo {
    public static void main(String[] args) {
        ConcurrentSkipListMap<Integer, String> color = new ConcurrentSkipListMap<>();

        color.put(1, "Red");
        color.put(2, "Green");
        color.put(5, "White");
        color.put(4, "Yellow");

        System.out.println("Descending CSLM: " + color.descendingMap());
        System.out.println("First entry: " + color.firstEntry());
        System.out.println("Last entry: " + color.lastEntry());
    }
}
