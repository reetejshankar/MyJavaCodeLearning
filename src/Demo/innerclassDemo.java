package Demo;

class I {

    // int age;

    public void show() {

        System.out.println("in show");
    }

    static class In {

        public void config() {

            System.out.println("in config");
        }
    }
}

public class innerclassDemo {
    public static void main(String[] args) {
        I obj = new I();
        obj.show();

        I.In obj1 = new I.In();
        obj1.config();
    }

}
