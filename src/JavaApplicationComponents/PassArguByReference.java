package JavaApplicationComponents;

public class PassArguByReference {

    public static class PassByRef {
        float areaCircle(CommonVals objPi, float r) {
            float area = objPi.getPI() * r * r;
            objPi.pi = 3.15f; // modify the value of pi

            return area;
        }
    }

    public static void main(String[] args) {

        PassByRef p1 = new PassByRef();
        CommonVals c1 = new CommonVals();
        System.out.printf("Area of circle is %03.2f", p1.areaCircle(c1, 3));
        System.out.printf("\nModified Value of PI is %01.2f %n", c1.getPI());

    }
}

class CommonVals {
    float pi = 3.14f;

    public float getPI() {
        return pi;
    }
}
