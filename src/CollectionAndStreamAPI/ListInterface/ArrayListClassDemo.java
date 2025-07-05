package CollectionAndStreamAPI.ListInterface;

import java.util.ArrayList;
import java.util.List;

public class ArrayListClassDemo {
    public static void main(String[] args) {
        List<String> list1 = new ArrayList<>();
        System.out.println("List size is : " + list1.size());

        for (int i = 1; i <= 5; i++) {
            // System.out.println(list1.get(i));
            list1.add("" + i);
        }
        System.out.println("List of numbers added: " + list1);
        list1.set(4, "20");
        System.out.println("Modified list of number: " + list1);
        System.out.println("Value at index 4 is: " + (String) list1.get(3));
    }
}
