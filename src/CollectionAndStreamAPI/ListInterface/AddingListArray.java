package CollectionAndStreamAPI.ListInterface;

import java.util.ArrayList;
import java.util.List;

public class AddingListArray {
    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(0, 0);
        // System.out.println(list);

        List<Integer> list1 = List.of(4, 5, 6, 7, 8, 9);

        list.remove(Integer.valueOf(1));

        list.addAll(list1);
        System.out.println(list);

        System.out.println("--------------------");

        List<String> fruits = new ArrayList<>();
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Cherry");
        fruits.add("Banana");
        fruits.add("Date");

        fruits.remove("Banana");

        System.out.println(fruits);

    }
}
