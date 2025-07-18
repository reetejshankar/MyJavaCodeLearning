package JavaApplicationComponents;

public class ThisKeyword {

    public static class Area {
        int length;
        int width;

        public Area() {
            length = 4;
        }

        public Area(int width) {
            this(); // invoking default constructor
            this.width = width; // resolving name conflict
        }

        public void calcArea() {
            System.out.println("Area is " + (length * width));
        }
    }

    public static void main(String[] args) {

        Area objReact = new Area(3);
        objReact.calcArea();

    }
}
