package CollectionAndStreamAPI.SetInterface;

import java.util.Set;

public class SetClass {
    public static void main(String[] args) {

        Set<String> set = Set.of("Java", "JavaEE", "Spring", "Hibernate", "Struts");

        System.out.println("Java Topics");

        for (String s : set) {
            System.out.println(s);
        }

    }
}
