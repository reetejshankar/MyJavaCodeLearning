package Demo;

abstract class AII {

    public abstract void show();

    public abstract void config1();
}

public class anonymInnerAbstractDemo {
    public static void main(String[] args) {
        AII obj = new AII() {
            @Override
            public void show() {
                System.out.println("in new show");
            }

            @Override
            public void config1() {
                System.out.println("in config1");
            }
        };
        obj.show();
        obj.config1();
    }

}
