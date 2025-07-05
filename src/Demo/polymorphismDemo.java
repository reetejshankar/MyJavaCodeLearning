package Demo;

class a1 {

    public void show() {
        System.out.println("in a1 show");
    }
}

class b1 extends a1 {

    @Override
    public void show() {

        System.out.println("in b1 show");
    }

}

class c1 extends a1 {

    @Override
    public void show() {

        System.out.println("in c1 show");
    }
}

public class polymorphismDemo {
    public static void main(String[] args) {
        a1 obj = new a1();
        obj.show();

        obj = new b1();
        obj.show();

        obj = new c1();
        obj.show();
    }

}
