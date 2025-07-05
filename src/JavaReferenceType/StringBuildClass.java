package JavaReferenceType;

public class StringBuildClass {

    StringBuilder msg = new StringBuilder("JPMS was intodused in Java ");

    public void display() {
        System.out.println("String length:" + msg.length());
        System.out.println("String after appending: " + msg.append("9"));
        System.out.println("String after insertion: " + msg.insert(28, "SE "));
        System.out.println("String after deletion: " + msg.delete(28, 31));
        System.out.println("Reversed string: " + msg.reverse());
    }

    public static void main(String[] args) {

        StringBuildClass obj = new StringBuildClass();
        obj.display();
    }
}
