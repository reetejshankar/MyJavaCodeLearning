package JavaApplicationComponents;

public class VariableArgMethod {

    public static class variableArgsMethod {
        public void multipleVals(int... val) {
            int result = 1;
            for (int x : val) {
                result = result * x;
            }
            System.out.println("Multiplication of numbers is " + result);
        }
    }

    public static void main(String[] args) {

        variableArgsMethod obj = new variableArgsMethod();
        obj.multipleVals(1,3,5,7);
    }
}
