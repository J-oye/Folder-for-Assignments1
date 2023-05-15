package Assigments;

import java.util.Arrays;

public class FunctionThatComputesRunningTotalOfAList {
    public static void main(String[] args) {
        int[] arr = {10, 20, 50, 40, 100, 200, 500};
        int total = 0;
        System.out.println(computeTotalOfAList(arr,total));
    }

    public static int computeTotalOfAList(int[] arr, int total) {
        for (int index = 0; index < arr.length; index++) {
            total += arr[index];
        }
        return total;
    }
}
