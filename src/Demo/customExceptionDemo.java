package Demo;

class Singh {

    public void show() throws ClassNotFoundException {

        Class.forName("Calc1");
    }
}

public class customExceptionDemo {

    static {
        System.out.println("Class Loaded");
    }

    public static void main(String[] args) {

        Singh obj = new Singh();

        try {
            obj.show();
        } catch (ClassNotFoundException e) {
        }
    }
}
