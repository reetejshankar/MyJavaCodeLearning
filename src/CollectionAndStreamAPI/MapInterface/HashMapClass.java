package CollectionAndStreamAPI.MapInterface;

import java.util.HashMap;
import java.util.Map;
public class HashMapClass {
    public static void main(String[] args) {
        HashMap<Integer, String> map = new HashMap<>(17, 0.5f);
        map.put(31, "Reetej");
        map.put(11, "Jeeya");
        map.put(2, "Shankar");
        map.put(2, "Ram");
        map.put(null, "San");

        System.out.println(map);

        String student = map.get(31);
        System.out.println(student);

        String s = map.get(69);
        System.out.println(s); // null

        System.out.println(map.containsKey(2));
        System.out.println(map.containsValue("Reetej"));

        for (int i : map.keySet()) {
            System.out.println(map.get(i));
        }

        // Set<Map.Entry<Integer,String>> entries = map.entrySet();

        for (Map.Entry<Integer, String> e : map.entrySet()) {
            // System.out.println(e.getKey() + " : " + e.getValue());
            e.setValue(e.getValue().toUpperCase());
        }
        System.out.println(map);

        // map.remove(31);
        boolean result = map.remove(31, "Nitin");
        System.out.println(result);
        System.out.println(map);
    }
}
