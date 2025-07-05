package Demo;

interface comp {

    void code();
}

class laptop implements comp {

    @Override
    public void code() {

        System.out.println("code, complile, run");
    }
}

class Desktop implements comp {

    @Override
    public void code() {

        System.out.println("code, complile, run : Faster");
    }
}

class Devloper {

    public void devApp(comp lap) {

        // System.out.println("coding....");
        lap.code();
    }
}

public class needOfInterfaceDemo {
    public static void main(String[] args) {

        comp lap = new laptop();
        comp desk = new Desktop();
        desk.code();

        Devloper reetej = new Devloper();
        reetej.devApp(lap);
    }

}
