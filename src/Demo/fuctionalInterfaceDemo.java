package Demo;

@FunctionalInterface
interface X {

    void show(int i);

}

public class fuctionalInterfaceDemo {
    public static void main(String[] args) {

        X obj = i -> System.out.println("in show " + i);

        obj.show(4);
    }

}
