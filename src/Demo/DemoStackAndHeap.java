package Demo;

class Calculator2 {

    int num = 5;

    public int add(int n1, int n2) {
        // System.out.println(num);
        return n1 + n2;
    }
}

public class DemoStackAndHeap {
    public static void main(String[] args) {
        // int data = 10;

        Calculator2 c1 = new Calculator2();
        int r = c1.add(1, 2);
        System.out.println(r);
        Calculator2 c2 = new Calculator2();

        c1.num = 8;

        System.out.println(c1.num);
        System.out.println(c2.num);

    }

}
