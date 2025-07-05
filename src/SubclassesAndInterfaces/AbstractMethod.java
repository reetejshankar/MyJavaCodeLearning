package SubclassesAndInterfaces;

abstract class Shape {
    private final float PI = 3.14f;

    public float getPI() {
        return PI;
    }

    public abstract void calculateArea();
}

class Rectangle extends Shape {
    private final float length;
    private final float width;

    public Rectangle(float length, float width) {
        this.length = length;
        this.width = width;
    }

    @Override
    public void calculateArea() {
        System.out.println("Length: " + length);
        System.out.println("Width: " + width);
        System.out.println("Area of rectangle: " + (length * width));
    }
}

public class AbstractMethod {
    public static void main(String[] args) {

        Rectangle obj = new Rectangle(2.3f, 4.0f);
        obj.calculateArea();

    }
}
