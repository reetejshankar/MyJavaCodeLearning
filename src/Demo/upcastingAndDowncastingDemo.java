package Demo;

class Aa {

    public void show1() {

        System.out.println("in Aa show");
    }
}

class Bb extends Aa {

    public void show2() {

        System.out.println("in Bb show");
    }
}

public class upcastingAndDowncastingDemo {
    public static void main(String[] args) {

        Aa obj = (Aa) new Bb(); // upcasting
        obj.show1();

        Bb obj1 = (Bb) obj; // downcasting
        obj1.show2();
    }
}
