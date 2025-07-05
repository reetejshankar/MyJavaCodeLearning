package CollectionAndStreamAPI;

import java.util.Arrays;
import java.util.List;

public class ArraysClass {
    public static void main(String[] args) {

        int[] sandy = { 5, 7, 2, 9, 4, 8, 6, 5, 1 };
        int[] sandy1 = { 5, 7, 2, 9, 4, 8, 6, 5, 1 };

        // check for equality
        System.out.println("Array are equal? " + Arrays.equals(sandy, sandy1));

        // sort a specipic range of array in
        // ascending order
        Arrays.sort(sandy, 0, 3);
        System.out.println("Sorted array in range" + " of 0.3: " + Arrays.toString(sandy));

        // Sort the complete array
        // in ascending order
        Arrays.sort(sandy);
        System.out.println("Completely sorted array: " + Arrays.toString(sandy));

        // copy the whole array
        int[] copysandy = Arrays.copyOf(sandy, sandy.length);
        System.out.println("Coppied Array: " + Arrays.toString(copysandy));

        // Copy a specified range of an array.
        int[] rCopysandy = Arrays.copyOfRange(sandy, 1, 4);
        System.out.println("Copied subarray: " + Arrays.toString(rCopysandy));

        // Fill a rage with a particular value
        Arrays.fill(sandy, 0, 4, 0);
        System.out.println("Array filled with 0 " + "from 0 to 4: " + Arrays.toString(sandy));

        // Fill complete array with a specific value
        Arrays.fill(sandy, 31);
        System.out.println("Array completely filled" + " with 31: " + Arrays.toString(sandy));

        // to print the array in string form
        System.out.println("String form of array: " + Arrays.toString(sandy));

        Integer[] sandy2 = { 5, 7, 2, 9, 4, 8, 6, 5, 1 };

        // create a wrapper list over sandy2[]
        List<Integer> l1 = Arrays.asList(sandy2);
        System.out.println("Array as List: " + l1);

    }
}
