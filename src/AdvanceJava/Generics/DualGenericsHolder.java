package AdvanceJava.Generics;

public class DualGenericsHolder<T, U> {
    T obj1;
    U obj2;

    DualGenericsHolder(T obj1, U obj2) {
        this.obj1 = obj1;
        this.obj2 = obj2;
    }

    public void display() {
        System.out.println(obj1);
        System.out.println(obj2);
    }

    public static void main(String[] args) {

        DualGenericsHolder<String, Integer> obj = new DualGenericsHolder<>("Simplicode",10);
        obj.display();
    }

}
