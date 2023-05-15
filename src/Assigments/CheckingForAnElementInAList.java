package Assigments;

import java.util.Arrays;

public class CheckingForAnElementInAList {
    public static void main(String[] args) {
        int[]arr =new int[3];

        for (int index = 0; index < arr.length; index++) {
            arr[index] = (index + 1) * 1000;
        }
        System.out.println(Arrays.toString(arr));

        //TODO//
    }
}
