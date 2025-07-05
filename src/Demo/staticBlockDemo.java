package Demo;

class Mobile1 {
    String brand;
    int price;
    static String name;

    static {
        name = "Phone";
        System.out.println("in static block");
    }

    public Mobile1() {
        brand = "";
        price = 200;
        // name = "Phone";
        System.out.println("in costructor");
    }

    public void show() {
        System.out.println(brand + " : " + price + " : " + name);
    }
}

public class staticBlockDemo {
    public static void main(String[] args) {

        // Class.forName("Mobile1");

        Mobile1 m1 = new Mobile1();
        m1.brand = "Apple";
        m1.price = 1700;
        Mobile1.name = "Phone";

        // Mobile1 m2 = new Mobile1();

    }

}
