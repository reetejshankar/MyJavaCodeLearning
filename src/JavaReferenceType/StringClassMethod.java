package JavaReferenceType;

public class StringClassMethod {

    public static class StringDemo {
        String msg = "Hello";
        Integer num = 6;

        public void display() {
            System.out.println("Length of string is " + msg.length());
            System.out.println("New String after concatenation is " + msg.concat("World"));
            System.out.println("Extracted substring is " + msg.substring(2, 5));
            System.out.println("String format of Integer is " + num.toString());
            System.out.println("Difference after comparison is " + msg.compareTo("World"));
            System.out.println("Character at index 1 is:" + msg.charAt(2));
            System.out.println("First index of character 1 is: " + msg.indexOf("l"));
            System.out.println("Last index of character 1 is: " + msg.lastIndexOf("l"));
            System.out.println("New string after replacement is " + msg.replace('o', 'a'));
            System.out.println("Uppercase String is:" + msg.toUpperCase());
            System.out.println("Lowercase String is:" + msg.toLowerCase());

            String msg1 = "  Hello  ";
            System.out.println("String before trimming: " + msg1);
            System.out.println("String after trimming: " + msg1.trim());
        }
    }

    public static void main(String[] args) {

        StringDemo obj = new StringDemo();
        obj.display();
    }
}
