package Assigments;

import java.util.Arrays;

public class ArrayElementsInOddPositions {
    public static void main(String[] args) {
        int[] odd = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        oddPositions(odd);



    }
    public static void  oddPositions(int[]odd){
        for (int index = 0; index < odd.length; index++) {
            odd[index] = index + 1;
        }
        System.out.println(Arrays.toString(odd));

        for (int i = 0; i < odd.length;i=i+2) {
            System.out.println(odd[i]);
        }
    }


}
