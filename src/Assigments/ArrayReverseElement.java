package Assigments;

import java.util.Arrays;

public class ArrayReverseElement {
    public static void main(String[] args) {
        int[] largest = new int[5];

        for (int index = 0; index < largest.length; index++) {
            largest[index] = (index+1) * 5;
        }
        System.out.println(Arrays.toString(largest));

        for (int i = largest.length-1; i >= 0; i--) {
            System.out.println(largest[i]);
        }




    }
}
