package Assigments;

import java.util.Arrays;

public class LargestElementOfAList {
    public static void main(String[] args) {
        int[]largest =new int[5];

        int max = largest[0];

        for (int index = 0; index < largest.length; index++) {
            largest[index] = (index +1) * 10;
            if (largest[index]>max){
                max = largest[index];
            }

        }
        System.out.println(Arrays.toString(largest));
        System.out.println("the largest element of the array is: "+max);

    }
}
