package CollectionAndStreamAPI.ListInterface;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ConvertingToArray {
    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();

        list.add(1);
        list.add(2);
        list.add(3);

        Object[] array = list.toArray();
        list.toArray(Integer[]::new);

        System.out.println(Arrays.toString(array));
    }
}
