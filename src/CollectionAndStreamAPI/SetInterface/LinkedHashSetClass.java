package CollectionAndStreamAPI.SetInterface;

import java.util.LinkedHashSet;

class Toy1 {
    int id;
    String name, color;
    float price;

    public Toy1(int id, String name, String color, float price) {
        this.id = id;
        this.name = name;
        this.color = color;
        this.price = price;
    }
}
public class LinkedHashSetClass {
    public static void main(String[] args) {
        LinkedHashSet<Toy1> hs = new LinkedHashSet<>();

        // Creating toy
        Toy1 t1 = new Toy1(1001, "Barbie", "Pink", 40.0f);
        Toy1 t2 = new Toy1(1002, "Teddy Bear", "White", 20.5f);
        Toy1 t3 = new Toy1(1003, "Aeroplane", "Blue", 50.5f);

        // Adding toys to hash set
        hs.add(t1);
        hs.add(t2);
        hs.add(t3);

        // Traversing hash set

        for (Toy1 t : hs) {
            System.out.println(t.id + " " + t.name + " " + t.color + " " + t.price);
        }
    }
}
