package CollectionAndStreamAPI.ListInterface;

import java.util.Vector;

public class VectorClassDemo {
    public static void main(String[] args) {

        Vector<Object> vector1 = new Vector<>();
        vector1.addElement(3);
        vector1.addElement(8);
        vector1.addElement(4);
        vector1.addElement(5.95);
        vector1.addElement(9.055);
        System.out.println("Vector elements: " + vector1);
        System.out.println("Value of position 3: " + (Object) vector1.elementAt(2));
        vector1.removeElementAt(0);
        System.out.println("Revised vector: " + vector1);
    }
}
