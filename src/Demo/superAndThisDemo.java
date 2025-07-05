package Demo;

class A extends Object { // super class

    public A() {

        super();
        System.out.println("in A");
    }

    public A(int n) {

        super();
        System.out.println("in A int");
    }

}

class B extends A { // subclass

    public B() {

        super();
        System.out.println("in B");
    }

    public B(int n) {

        this();
        System.out.println("in B int");
    }

}

public class superAndThisDemo {
    public static void main(String[] args) {
        B obj = new B(5);
        obj.getClass();
    }

}
