package deitel.Chapter7;

import java.util.Arrays;

public class exercise7_11 {
    public static void main(String[] args) {
        int[]array = new int[20];
        for (int index = 0; index < array.length; index++) {
            array[index] = (index + 1) * 2;

        }
        System.out.println(Arrays.toString(array));

    }
}
