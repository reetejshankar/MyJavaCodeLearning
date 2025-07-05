package CollectionAndStreamAPI.ListInterface;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Stack;
public class StackClass {
    public static void main(String[] args) {

        Stack<Integer> stack = new Stack<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);
        System.out.println(stack);

        Integer removedElement = stack.pop();
        System.out.println(removedElement);
        System.out.println(stack);

        Integer get = stack.get(2);
        System.out.println(get);

        Integer peek = stack.peek();
        System.out.println(peek);

        System.out.println(stack.isEmpty());
        System.out.println(stack.size());

        System.out.println(stack.search(3));

        System.out.println("-------------------");

        // as stack use
        LinkedList<Integer> linkedList = new LinkedList<>();
        linkedList.addLast(1);
        linkedList.addLast(2);
        linkedList.addLast(3);
        linkedList.getLast(); // peek
        linkedList.removeLast(); // pop
        System.out.println(linkedList);

        System.out.println("--------------");

        // arrayList as stack
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(3);
        arrayList.get(arrayList.size() - 1); // peek
        arrayList.remove(arrayList.size() - 1); // pop

    }
}
