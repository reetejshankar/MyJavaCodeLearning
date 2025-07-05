package CollectionAndStreamAPI;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class PGStudent {
    int id;
    String name;
    int age;

    public PGStudent(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }
}

class AgeComparator implements Comparator<PGStudent> {

    @Override
    public int compare(PGStudent obj1, PGStudent obj2) {
        PGStudent s1 = (PGStudent) obj1;
        PGStudent s2 = (PGStudent) obj2;

        if (s1.age == s2.age) {
            return 0;
        } else if (s1.age > s2.age) {
            return 1;
        } else {
            return -1;
        }
    }
}

class NameCoparator implements Comparator<PGStudent> {

    @Override
    public int compare(PGStudent obj1, PGStudent obj2) {
        PGStudent s1 = (PGStudent) obj1;
        PGStudent s2 = (PGStudent) obj2;
        return s1.name.compareTo(s2.name);
    }
}

public class ComparatorClass {
    public static void main(String[] args) {

        ArrayList<PGStudent> st = new ArrayList<>();
        st.add(new PGStudent(1, "San", 23));
        st.add(new PGStudent(8, "Roger", 27));
        st.add(new PGStudent(3, "Marry", 21));

        Collections.sort(st, new AgeComparator());

        for (PGStudent s : st) {
            System.out.println(s.id + " " + s.name + " " + s.age);
        }
        System.out.println("Sorted by name");
        Collections.sort(st, new NameCoparator());

        for (PGStudent s : st) {
            System.out.println(s.id + " " + s.name + " " + s.age);
        }
    }
}
