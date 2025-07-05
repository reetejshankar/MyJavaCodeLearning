package CollectionAndStreamAPI.ListInterface;

import java.util.ArrayList;
import java.util.List;

public class SortingArray {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);

        list.sort(null);
        // Collections.sort(list);
        System.out.println(list);
    }
}
