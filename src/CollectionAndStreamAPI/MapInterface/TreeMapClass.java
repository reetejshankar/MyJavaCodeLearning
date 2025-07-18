package CollectionAndStreamAPI.MapInterface;

import java.util.TreeMap;

public class TreeMapClass {
    public static void main(String[] args) {
        TreeMap<String, Toy> toys = new TreeMap<>();
        toys.put("3", new Toy(1003, "Aeroplane", "Blue", 50.6f));
        toys.put("1", new Toy(1001, "Barbie Doll", "Pink", 50.5f));
        toys.put("2", new Toy(1002, "Teddy Bear", "White", 40.3f));
        toys.put("5", new Toy(1005, "Bus", "Red", 30.6f));

        System.out.println(toys);
        toys.remove("3");

        toys.put("4", new Toy(1004, "Rattles", "Muti-color", 10.5f));

        System.out.println("Toy at Key 4: " + toys.get("4"));

        Object firstKey = toys.firstKey();

        System.out.println("First key: " + firstKey.toString());
        System.out.println("Last key: " + (String) (toys.lastKey()));
        System.out.println("Modified Tree Map: \n" + toys);
    }
}
