package CollectionAndStreamAPI.ListInterface;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

class StringLengthComparator implements Comparator<String> {

    @Override
    // s2.length() - s1.length() --> descen length words
    // s1 - s2 --> acce length words
    public int compare(String s1, String s2) {
        return s2.length() - s1.length();
    }

}

class MyComprator implements Comparator<Integer> {

    @Override
    // o1 - o2 -> accen.
    // o2 - o1 -> desc.
    public int compare(Integer o1, Integer o2) {
        return o2 - o1;
    }

}
public class ComparatorClass {
    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();
        list.add(2);
        list.add(1);
        list.add(3);

        list.sort(new MyComprator());

        System.out.println(list);

        System.out.println("------------------");

        List<String> words = Arrays.asList("banana", "apple", "date");

        words.sort(new StringLengthComparator());

        System.out.println(words);
    }

}
