package SubclassesAndInterfaces;

public class AnonymousInnerClasses {
    public static void main(String[] args) {

        Runnable r = () -> {
            System.out.println("Anonymous Thread");
        };
        Thread t = new Thread(r);
        t.start();
        System.out.println("Executing Main Thread");
    }
}
