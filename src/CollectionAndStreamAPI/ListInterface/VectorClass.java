package CollectionAndStreamAPI.ListInterface;

import java.util.LinkedList;
import java.util.Vector;
public class VectorClass {
    public static void main(String[] args) {

        Vector<Integer> vector1 = new Vector<>(5, 3);
        vector1.add(1);
        vector1.add(1);
        vector1.add(1);
        vector1.add(1);
        vector1.add(1);
        System.out.println((int) vector1.capacity());
        vector1.add(1);
        System.out.println((int) vector1.capacity());
        vector1.add(1);
        vector1.add(1);
        System.out.println((int) vector1.capacity());
        vector1.add(1);
        System.out.println((int) vector1.capacity());

        System.out.println("-------------");

        LinkedList<Integer> linkedList = new LinkedList<>();
        linkedList.add(1);
        linkedList.add(2);
        linkedList.add(3);

        Vector<Integer> vector = new Vector<>(linkedList);
        System.out.println(vector);
    }
}
