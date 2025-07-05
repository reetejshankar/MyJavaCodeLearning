package JavaApplicationComponents;

public class Overloading {

    public static class Calculator {

        // overloaded method 1
        public void add(int a, int b) {
            System.out.println("Sum is " + (a + b));
        }

        // overloaded method 2
        public void add(int a, float b) {
            System.out.println("Sum is " + (a + b));
        }

        // overloaded method 3
        public void add(int a, int b, float c) {
            System.out.println("Sum is " + (a + b + c));
        }

        // overloaded method 4
        public void add(float a, int b) {
            System.out.println("Sum is " + (a + b));
        }
    }

    public static void main(String[] args) {

        Calculator c1 = new Calculator();
        c1.add(2.5f, 3);
        c1.add(3, 4, 5.6f);
        c1.add(4, 5);
        c1.add(3, 6, 2.4f);

    }
}
