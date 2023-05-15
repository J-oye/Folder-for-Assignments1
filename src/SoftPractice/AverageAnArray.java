package SoftPractice;

import java.util.Arrays;

public class AverageAnArray {
    public static void main(String[] args) {
      //  System.out.println(Arrays.toString(average([50])));
    }
    public static int average(int[]array){
return 0;
    }

    public static double average(double[]array){
        double average = 0;
        for (int index = 0; index < array.length; index++) {
          average=  array[index] % index;
        }
        return average;

    }

}
