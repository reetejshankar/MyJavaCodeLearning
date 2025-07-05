package Demo;

@Deprecated
class N {

    public void showTheDataWhichBeLongToThisClass() {

        System.out.println("in N show");
    }

}

class M extends N {

    @Override
    public void showTheDataWhichBeLongToThisClass() {

        System.out.println("In M show");
    }

}

public class annotationDemo {
    public static void main(String[] args) {
        M obj = new M();
        obj.showTheDataWhichBeLongToThisClass();
    }

}
