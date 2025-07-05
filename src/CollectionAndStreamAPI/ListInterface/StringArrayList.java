package CollectionAndStreamAPI.ListInterface;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StringArrayList {
    public static void main(String[] args) {

        List<String> List = new ArrayList<>();
        System.out.println(List.getClass().getName());

        List<String> List1 = (List<String>) Arrays.asList("Mon", "Tue");
        System.out.println(List1.getClass().getName());
        List1.set(1, "Wed");
        System.out.println(List1.get(1));

        String[] array = { "Apple", "Banana", "Cherry" };
        List<String> List2 = (List<String>) Arrays.asList(array);
        System.out.println(List2.getClass().getName());

        List<String> List4 = new ArrayList<>(List2);
        List4.add("Mango");
        System.out.println(List4);

        // List<Integer> List3 = List.of(1,2,3,4); // don't work

    }
}
