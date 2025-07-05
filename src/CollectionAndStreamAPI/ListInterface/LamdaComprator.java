package CollectionAndStreamAPI.ListInterface;

import java.util.Arrays;
import java.util.List;

public class LamdaComprator {

    public static void main(String[] args) {

        List<String> words = Arrays.asList("banana", "apple", "date");
        words.sort((a, b) -> b.length() - a.length());
        System.out.println(words);
    }
}
