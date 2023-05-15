package Assigments;

import java.util.Arrays;

public class ArrayElementsOfEvenPositions {
    public static void main(String[] args) {
        int[]even = new int[10];
        for (int index = 0; index < even.length; index++) {
            even[index] = index + 1;
        }
        System.out.println(Arrays.toString(even));

        for (int i = 1; i < even.length;i=i+2) {
            System.out.println(even[i]);
        }

    }
}
