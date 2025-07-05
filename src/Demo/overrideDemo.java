package Demo;

class calculatorC {

    public int add(int n1, int n2) {

        return n1 + n2;
    }

}

class advCalc1 extends calculatorC {

    @Override
    public int add(int n1, int n2) {

        return n1 + n2 + 1;
    }
}

public class overrideDemo {
    public static void main(String[] args) {
        advCalc1 obj = new advCalc1();
        int r1 = obj.add(3, 4);

        System.out.println(r1);
    }
}