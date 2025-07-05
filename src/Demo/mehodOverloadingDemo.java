package Demo;

class Calculator1 {

    public int add(int n1, int n2, int n3) {
        return n1 + n2 + n3;
    }

    public int add(int n1, int n2) {
        return n1 + n2;
    }
}

public class mehodOverloadingDemo {
    public static void main(String[] args) {
        Calculator1 c1 = new Calculator1();
        int r = c1.add(1, 2);
        System.out.println(r);
    }
}
