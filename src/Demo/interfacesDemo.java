package Demo;

// class - class -> extends
// class - interface -> implements
// interface - interface -> extends

interface Jeeya {

    // int age = 22; // final and static
    // String area = "Mumbai";

    void show();

    void config();
}

interface San {

    void run();
}

interface Baby extends San {

}

class Reetej implements Jeeya, Baby {

    @Override
    public void show() {
        System.out.println("in show");
    }

    @Override
    public void config() {
        System.out.println("in config");
    }

    @Override
    public void run() {
        System.out.println("run...");
    }

}

public class interfacesDemo {
    public static void main(String[] args) {

        Jeeya obj = new Reetej();
        obj.show();
        obj.config();

        San obj1 = new Reetej();
        obj1.run();

        // System.out.println(Jeeya.area);
    }

}
