package Assigments;

import java.util.Arrays;

public class ComputingSunOfListWithLoops {
    public static void main(String[] args) {
        int[]arr ={10,20,50,40,100,200,500};
        int total = 0;
        System.out.print("The sum of the element is:");
        System.out.println(computeSumWithForLoop(arr,total));
        System.out.print("The sum of the element is:");
        System.out.println(computeSumWithWhileLoop(arr,total));
    }
    public static int computeSumWithForLoop(int[] arr,int total){

        for (int index = 0; index < arr.length; index++) {
            total +=arr[index];
        }
        return total;
    }
    public static int computeSumWithWhileLoop(int[]arr,int total){
        int index = 0;
        while (index <arr.length ){
            total += arr[index];
            index++;
        }
            return total;


    }
}
