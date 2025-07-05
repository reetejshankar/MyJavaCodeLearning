package AdvanceJava.Generics;

public class SingleGenericsHolder<T> {
    T obj;

    SingleGenericsHolder(T obj) {
        this.obj = obj;
    }

    public T getObj() {
        return this.obj;
    }

    public static void main(String[] args) {
        SingleGenericsHolder<Integer> iObj = new SingleGenericsHolder<>(10);
        System.out.println(iObj.getObj());

        SingleGenericsHolder<String> sObj = new SingleGenericsHolder<>("SimpliCode");
        System.out.println(sObj.getObj());
    }
}
