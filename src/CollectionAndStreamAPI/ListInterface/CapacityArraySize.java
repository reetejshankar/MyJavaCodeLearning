package CollectionAndStreamAPI.ListInterface;

import java.lang.reflect.Field;
import java.util.ArrayList;

public class CapacityArraySize {
    public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException {

        ArrayList<Integer> List = new ArrayList<>(11);

        List.add(1);
        List.add(1);
        List.add(1);
        List.add(1);
        List.add(1);
        List.add(1);
        List.add(1);
        List.add(1);
        List.add(1);
        List.add(1);
        List.add(1);

        Field field = ArrayList.class.getDeclaredField("elementData");
        field.setAccessible(true);
        Object[] elementData = (Object[]) field.get(List);
        System.out.println("ArrayList capasity: " + elementData.length);

        List.add(1);

        elementData = (Object[]) field.get(List);
        System.out.println("ArrayList capasity: " + elementData.length);

        List.remove(2);
        List.remove(2);
        List.remove(2);
        List.remove(2);
        List.remove(2);

        List.trimToSize();

        elementData = (Object[]) field.get(List);
        System.out.println("ArrayList capasity: " + elementData.length);
    }
}
