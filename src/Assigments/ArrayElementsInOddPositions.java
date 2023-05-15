package Assigments;

import java.util.Arrays;

public class ArrayElementsInOddPositions {
    public static void main(String[] args) {
        int[]odd = new int[10];
        System.out.println(oddPositions([i]));
    }
    public static int oddPositions(int[]odd){
        for (int index = 0; index < odd.length; index++) {
            odd[index] = index + 1;
        }
        System.out.println(Arrays.toString(odd));

        for (int i = 0; i < odd.length;i=i+2) {
            System.out.println(odd[i]);
        }
        ;
    }
}
