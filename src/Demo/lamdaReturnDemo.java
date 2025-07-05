package Demo;

@FunctionalInterface
interface XX {

    int add(int i, int j);
}

public class lamdaReturnDemo {
    public static void main(String[] args) {
        XX obj = (i, j) -> i + j;
        int r1 = obj.add(4, 5);
        System.out.println(r1);
    }

}
