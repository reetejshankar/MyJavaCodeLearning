package CollectionAndStreamAPI;

import java.util.ArrayList;
import java.util.Collections;

class PodarStudent implements Comparable<PodarStudent> {

    int id;
    String name;
    int age;

    public PodarStudent(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    @Override
    public int compareTo(PodarStudent s) {
        if (age == s.age) {
            return 0;
        } else if (age > s.age) {
            return 1;
        } else {
            return -1;
        }
    }
}

public class SortingCollections {
    public static void main(String[] args) {

        ArrayList<PodarStudent> st = new ArrayList<>();
        st.add(new PodarStudent(1, "San", 22));
        st.add(new PodarStudent(8, "Reetej", 21));
        st.add(new PodarStudent(3, "Jeeya", 18));

        Collections.sort(st);
        for (PodarStudent s : st) {
            System.out.println(s.id + " " + s.name + " " + s.age);
        }

    }
}
