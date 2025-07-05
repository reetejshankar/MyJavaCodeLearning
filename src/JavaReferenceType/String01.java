package JavaReferenceType;

public class String01 {
    public static void main(String[] args) {

        String msg1 = "  Hello  ";
        String msg2 = "World";
        // System.out.println(msg1 + msg2);

        // char[] msg = { 'H', 'e', 'l', 'l', 'o' };
        // String message = new String(msg);
        // System.out.println(message);

        System.out.println(msg1.length()); // will return 5
        System.out.println(msg1.concat(msg2)); // will return 'HelloWorl'
        System.out.println(msg1.substring(2, 5)); // will return llo
        // System.out.println(msg1.toString()); // will return hello
        System.out.println(msg1.compareTo("World")); // will return -15
        System.out.println(msg1.charAt(1)); // will return e
        System.out.println(msg1.indexOf("l")); // will return 2
        System.out.println(msg1.lastIndexOf("l")); // will return 3
        System.out.println(msg1.replace("Hello", "BabyDon"));
        System.out.println(msg1.toUpperCase()); // will return HELLO
        System.out.println(msg1.toLowerCase()); // will return hello
        System.out.println(msg1.trim()); // will return "Hello" with the spaces removed
        System.out.println(msg1.equals("Hello")); // will return false
    }
}
