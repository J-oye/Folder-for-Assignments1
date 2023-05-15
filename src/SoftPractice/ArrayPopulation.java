package SoftPractice;

import java.util.Arrays;

public class ArrayPopulation {
    public static void main(String[] args) {
        int[]array = new int[5];
        for (int index = 0; index < array.length; index++) {
            array[index] = index+1;
        }
        System.out.println(Arrays.toString(array));
    }
}
