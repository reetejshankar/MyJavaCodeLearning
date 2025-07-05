package CollectionAndStreamAPI.MapInterface;

import java.util.HashMap;
import java.util.Objects;

class Person {

    private final String name;
    private final int id;

    public Person(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return "id " + id + ", name: " + name;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        } else if (obj == null) {
            return false;
        } else if (getClass() != obj.getClass()) {
            return false;
        }
        Person other = (Person) obj;
        return id == other.getId() && Objects.equals(name, other.getName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, id);
    }

}
public class HashCodeEqualsMethod {
    public static void main(String[] args) {
        HashMap<Person, String> map = new HashMap<>();
        Person p1 = new Person("Alice", 1);
        Person p2 = new Person("Bob", 2);
        Person p3 = new Person("Alice", 1);

        map.put(p1, "Engineer"); // hashcode ---> index
        map.put(p2, "Designer"); // hashcode ---> index
        map.put(p3, "Manager"); // hashcode ---> index

        System.out.println("HashMap size: " + map.size());
        System.out.println("Value for p1: " + map.get(p1));
        System.out.println("Value for p3: " + map.get(p3));

        // Map<String, Integer> map1 = new HashMap<>();
        // map1.put("Shubham", 90);
        // map1.put("Neha", 92);
        // map1.put("Shubham", 90);
    }
}
