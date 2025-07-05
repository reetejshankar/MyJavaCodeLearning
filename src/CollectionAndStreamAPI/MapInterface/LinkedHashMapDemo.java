package CollectionAndStreamAPI.MapInterface;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapDemo {

    public static void main(String[] args) {

        LinkedHashMap<String, Integer> LinkedHashMap = new LinkedHashMap<>(11, 0.08f, true); // double limited list

        HashMap<String, Integer> hashMap = new HashMap<>();
        LinkedHashMap.put("Orange", 10);
        LinkedHashMap.put("Apple", 20);
        LinkedHashMap.put("Guava", 13);

        LinkedHashMap.get("Apple");
        LinkedHashMap.get("Orange");

        for (Map.Entry<String, Integer> entry : LinkedHashMap.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }

        System.out.println("----------------");

        hashMap.put("Orange", 10);
        hashMap.put("Apple", 20);
        hashMap.put("Guava", 13);

        for (Map.Entry<String, Integer> entry : hashMap.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
    }
}
