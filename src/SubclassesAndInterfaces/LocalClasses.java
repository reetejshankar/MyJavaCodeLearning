package SubclassesAndInterfaces;

class OuterClass1 {

    public void outerMethod(String message) {

        class localInner {
            public String getMessage() {
                return "Hello";
            }
        }
        localInner obj = new localInner();
        System.out.println(obj.getMessage() + "Message received: " + message);
    }

    public static void outerMethod() {
        System.out.println("Outer class static method");
    }
}

public class LocalClasses {
    public static void main(String[] args) {

        OuterClass1 objOuter = new OuterClass1();
        objOuter.outerMethod("Good Morning");

    }
}
