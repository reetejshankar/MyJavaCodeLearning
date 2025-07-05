package SubclassesAndInterfaces;

public class CreateSubClass {

    public static class Shape {
        private final float PI = 3.14f;
        protected float width;
        private final String shape;

        public Shape(String shape) {
            this.shape = shape;
        }

        public void area(float length) {
            switch (shape) {
                case "circle" -> System.out.println("Area of circle is " + (PI * length * length));
                case "square" -> System.out.println("Area of square is " + (length * length));
                case "rectangle" -> System.out.println("Area of rectangle is " + (2 * (length * width)));
                case "triangle" -> System.out.println("Area of a triangle is " + (1 / 2 * (length * width)));
            }
        }
    }

    public static class Rectangle extends Shape {
        public Rectangle() {
            super("rectangle");
            width = 20;
        }

        public void drawRect() {
            System.out.println("Drawing a Rectangle");
        }
    }
    public static void main(String[] args) {

        Rectangle obj = new Rectangle();
        obj.drawRect();
        obj.area(40);

    }
}
