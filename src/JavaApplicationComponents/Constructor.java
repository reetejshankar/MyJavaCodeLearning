package JavaApplicationComponents;

public class Constructor {

    public static class Calculator1 {
        public int sum;
        String name;

        public Calculator1(int a, int b) {
            sum = a + b;
            System.out.println("Total sum is " + sum);
        }

        public Calculator1(String username) {
            name = username;
        }
    }

    public static void main(String[] args) {

        Calculator1 objCal = new Calculator1(3, 4);
        System.out.println(objCal.sum); // 7
        Calculator1 objCalc1 = new Calculator1("Reetej");
        System.out.println("Your name is " + objCalc1.name);

    }
}
