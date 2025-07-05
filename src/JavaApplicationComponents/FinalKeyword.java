package JavaApplicationComponents;

public class FinalKeyword {

    public static class Circle {
        final float pi = 3.14f;

        public void calArea(int rad) {
            System.out.println("Area of circle is " + (pi * rad * rad));
            // pi = 3.15f; // gives error
        }
    }

    public static void main(String[] args) {

        Circle c1 = new Circle();
        c1.calArea(2);

    }
}
