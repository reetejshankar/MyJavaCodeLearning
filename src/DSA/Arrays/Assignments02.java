package DSA.Arrays;

import java.util.Scanner;

public class Assignments02 {
    public static void main(String[] args) {

        // 2. Find the element 'x' in the array. take array input as a 'x'.

        int[] arr = {4,6,8,8,10};

        int target = 8;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                System.out.println(i);
            }
        }
    }
}
