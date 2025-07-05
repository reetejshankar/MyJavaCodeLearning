package ExceptionsAndRegularExceptions;

public class ObjectClass {

    Integer val;

    public ObjectClass(Integer val) {
        this.val = val;
    }

    public static void main(String[] args) {

        // creating objects of objectClass class
        ObjectClass obj1 = new ObjectClass(4577);
        ObjectClass obj2 = new ObjectClass(4577);
        System.out.println("String form of obj1 is " + obj1.val.toString());

        // check for equality of objects
        if (obj1.equals(obj2)) {
            System.out.println("Objects are equals");
        } else {
            System.out.println("Objects are not equals");
        }

        obj2 = obj1; // assigning reference of obj1 to obj2

        // again, check for equality of objects
        if (obj1.equals(obj2)) {
            System.out.println("Objects are equals");
        } else {
            System.out.println("Objects are not equals");
        }
    }
}
