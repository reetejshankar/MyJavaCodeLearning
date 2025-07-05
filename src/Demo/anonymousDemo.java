package Demo;

class C {

    public C() {
        System.out.println("object created");
    }

    public void show() {
        System.out.println("in Show");
    }
}

public class anonymousDemo {
    public static void main(String[] args) {

        new C().show(); // Anonymous object
    }

}
