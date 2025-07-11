package JavaReferenceType;

public class WrapperDemo {

    public void useWrapper() {
        byte byteVal = Byte.parseByte("45");
        System.out.println("Byte value is " + byteVal);

        if (Character.isDigit('4')) {
            System.out.println("Character value is a Digit");
        }
        if (Character.isLetter('L')) {
            System.out.println("Chracter value is a letter");
        }
    }

    public static void main(String[] args) {

        if (args.length == 2) {
            // parse String to primitive type int
            int a = Integer.parseInt(args[0]);
            int b = Integer.parseInt(args[1]);
            System.out.println("Sum of " + a + " and " + b + " is " + (a + b));
        } else {
            System.out.println("Not enough data to process");
        }
        WrapperDemo obj = new WrapperDemo();
        obj.useWrapper();

    }
}
