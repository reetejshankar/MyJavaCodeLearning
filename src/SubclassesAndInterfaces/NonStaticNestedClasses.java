package SubclassesAndInterfaces;

class OuterClass {
    String outerVariable;

    public void outerMethod(String message) {
        System.out.println("Message received: " + message);
    }

    class InnerClass {
        public String sayHello() {
            // Invoke outer class method
            outerMethod("Good Morning");

            // Initialize outer class variable
            outerVariable = "Hello";
            return outerVariable;
        }
    }
}

public class NonStaticNestedClasses {
    public static void main(String[] args) {

        OuterClass objOuter = new OuterClass(); // Create outer class object
        OuterClass.InnerClass objInner = objOuter.new InnerClass(); // Create inner class object
        System.out.println(objInner.sayHello());

    }
}
