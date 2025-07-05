package CollectionAndStreamAPI.ListInterface;

import java.util.ArrayList;

public class ListArray {
    public static void main(String[] args) {

        ArrayList<Integer> List = new ArrayList<>();
        List.add(1); // 0
        List.add(5); // 1
        List.add(80); // 2

        System.out.println(List.get(2));
        System.out.println("--------------------");
        System.out.println(List.size());
        System.out.println("--------------------");
        System.out.println(List.contains(5));
        System.out.println(List.contains(50));
        List.add(2, 50); // set the value
        List.set(2, 50); // replace the number
        System.out.println("--------------------");
        // List.remove(2);
        for (int s : List) {
            System.out.println(s);
        }

        System.out.println(List);

    }
}
