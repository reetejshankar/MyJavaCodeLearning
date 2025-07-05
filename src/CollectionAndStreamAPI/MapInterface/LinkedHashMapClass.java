package CollectionAndStreamAPI.MapInterface;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class LinkedHashMapClass {
    public static void main(String[] args) {

        // Create hashMap
        LinkedHashMap<String, Double> lhm1 = new LinkedHashMap<>();

        // put elements to the map
        lhm1.put("Barbie Doll", 43.34);
        lhm1.put("Teddy Bear", 23.2);
        lhm1.put("Aeroplane", 58.00);

        // Get a set of the entries
        Set set1 = lhm1.entrySet();

        // Get an entire
        Iterator i = set1.iterator();

        // Display elements
        while (i.hasNext()) {
            Map.Entry me = (Map.Entry) i.next();
            System.out.println(me.getKey() + ": " + me.getValue());
        }

        // Change price of Airplane
        double price = lhm1.get("Aeroplane");
        lhm1.put("Aeroplane", (price + 5.6));

        System.out.println("New price of Aeroplane: " + lhm1.get("Aeroplane"));
        System.out.println("Modified Map: " + lhm1);

    }
}
