package CollectionAndStreamAPI.ListInterface;


import java.util.EmptyStackException;
import java.util.Stack;

public class StackClassDemo {

    public static void pushValue(Stack st, int val) {
        st.push(val);
        System.out.println("Pushed(" + val + ")");
        System.out.println("Stack: " + st);
    }

    public static void popValue(Stack st) {
        System.out.println("Popped -> ");
        Integer val = (Integer) st.pop();
        System.out.println(val);
        System.out.println("Stack: " + st);
    }
    public static void main(String[] args) {

        Stack st1 = new Stack<>();
        System.out.println("Stack: " + st1);
        pushValue(st1, 24);
        pushValue(st1, 33);
        pushValue(st1, 35);
        popValue(st1);
        popValue(st1);
        popValue(st1);

        try {
            popValue(st1);
        } catch (EmptyStackException e) {
            System.out.println("Error: Stack is empty");
        }

    }
}
