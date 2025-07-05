package Demo;

class Mobile {

    String brand;
    int price;
    static String name; // static can change all the obj

    public void show() {
        System.out.println(brand + " : " + price + " : " + name);
    }
}

public class staticVarClassDemo {
    public static void main(String[] args) {

        Mobile m1 = new Mobile();
        m1.brand = "Apple";
        m1.price = 50000;
        Mobile.name = "SmartPhone";

        Mobile m2 = new Mobile();
        m2.brand = "Nokia";
        m2.price = 1700;
        Mobile.name = "SmartPhone";

        Mobile.name = "Phone";

        m1.show();
        m2.show();
    }
}