package Demo;

class Calc {

    public int add(int n1, int n2) {

        return n1 + n2;
    }

    public int sub(int n1, int n2) {

        return n1 - n2;
    }
}

class AdvCalc extends Calc {

    public int multi(int n1, int n2) {

        return n1 * n2;
    }

    public int div(int n1, int n2) {

        return n1 / n2;
    }
}

class VeryAdvCalc extends AdvCalc {

    public double power(int n1, int n2) {

        return Math.pow(n1, n2);
    }
}

public class inheritanceDemo {
    public static void main(String[] args) {

        VeryAdvCalc obj = new VeryAdvCalc();
        int r1 = obj.add(2, 3);
        int r2 = obj.sub(2, 3);
        int r3 = obj.multi(2, 3);
        int r4 = obj.div(2, 3);
        double r5 = obj.power(4, 2);

        System.out.println(r1);
        System.out.println(r2);
        System.out.println(r3);
        System.out.println(r4);
        System.out.println(r5);

    }

}
