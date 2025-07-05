package SubclassesAndInterfaces;

public class AnonymousClasses {
    public static void main(String[] args) {

        Thread t = new Thread() {
            @Override
            public void run() {
                System.out.println("Anonymous thread");
            }
        };
        t.start();
        System.out.println("Executive main Thread");
    }
}
