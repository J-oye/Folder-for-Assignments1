package deitel.Chapter7;

import java.util.Arrays;

public class Exercise7_8 {
    public static void main(String[] args) {
        int[] array ={1,2,3,4,5,67,78,8,9,10};
        System.out.println(array[9]);
        array[0]=0;
        array[1]=0;
        array[2]=0;
        array[3]=0;
        array[4]=0;
        array[5]=0;
        System.out.println(Arrays.toString(array));
    }
}
