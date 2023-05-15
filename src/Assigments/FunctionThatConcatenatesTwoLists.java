package Assigments;

import java.lang.reflect.Array;
import java.util.Arrays;

public class FunctionThatConcatenatesTwoLists {
    public static void main(String[] args) {
        int[] arr ={10,12,20};
        int []array = {1,2,3};
        System.out.println(merge(arr,array));
    }


    public static String merge(int []arr, int[] array){
        int[] merge = new int[arr.length + array.length];

        for (int index = 0; index < arr.length; index++) {
            merge[index] =arr[index];
        }
        for (int i =0; i < array.length; i++) {
            merge[i] = array[i];
        }
        return Arrays.toString(merge);
    }

}
