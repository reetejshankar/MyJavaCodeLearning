package JavaApplicationComponents;

public class PassingArgumments {

    public static class PassByVal {
        public int val;

        public void modifyVal(int val) {
            val = val + 10;
        }
    }

    public static void main(String[] args) {

        int val = 10;
        PassByVal obj1 = new PassByVal();
        obj1.modifyVal(val);
        System.out.println("Value of val after method invocation is " + val);

    }
}
