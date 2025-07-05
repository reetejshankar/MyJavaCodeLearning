package CollectionAndStreamAPI.MapInterface;

import java.util.HashMap;
import java.util.Objects;

class Toy {

    int id;
    String name, color;
    float price;

    public Toy(int id, String name, String color, float price) {
        this.id = id;
        this.name = name;
        this.color = color;
        this.price = price;
    }

    @Override
    public String toString() {
        return "ID: " + id + ", Name:" + name + ", Color:" + color + ", Price:" + price + "\n";
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Toy toy = (Toy) obj;
        return id == toy.id && Float.compare(toy.price, price) == 0 && name.equals(toy.name) && color.equals(toy.color);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, color, price);
    }

}
public class ToyHashMap {
    public static void main(String[] args) {

        HashMap<Toy, String> t1 = new HashMap<>();
        Toy obj1 = new Toy(1001, "BMW", "Black", 200000.0f);
        Toy obj2 = new Toy(1002, "Audi", "Blue", 20000.0f);
        Toy obj3 = new Toy(1003, "RR", "Brown", 200.0f);

        t1.put(obj1, "Reetej");
        t1.put(obj2, "Jeeya");
        t1.put(obj3, "Son");

        System.out.println(t1.get(obj1));
        System.out.println(t1.get(obj2));
        System.out.println(t1.get(obj3));
    }
}
