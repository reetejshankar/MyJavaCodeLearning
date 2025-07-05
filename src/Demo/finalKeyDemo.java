package Demo;
// final -> variables, method, class

class sex {

    public void show() {

        System.out.println("in sex show");
    }

    public void add(int x, int y) {

        System.out.println(x + y);
    }
}

class AdvSex extends sex {

    @Override
    public void show() {

        System.out.println("by john");
    }

}

public class finalKeyDemo {
    public static void main(String[] args) {
        AdvSex obj = new AdvSex();
        obj.show();
        obj.add(4, 5);

        final int num = 8;
        System.out.println(num);
    }

}
