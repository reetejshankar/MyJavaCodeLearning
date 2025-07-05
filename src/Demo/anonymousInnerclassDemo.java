package Demo;

class AI {

    public void show() {

        System.out.println("in AI show");
    }
}

public class anonymousInnerclassDemo {
    public static void main(String[] args) {

        AI obj = new AI() {
            @Override
            public void show() {
                System.out.println("in new show");
            }
        };
        obj.show();
    }

}
