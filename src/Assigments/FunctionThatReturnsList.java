package Assigments;

import java.util.Arrays;
import java.util.Scanner;

public class FunctionThatReturnsList {
    public static void main(String[] args) {

        System.out.println(returnNumberAsAList(2342));


    }
    public static String returnNumberAsAList(int num){
        Scanner input = new Scanner(System.in);
       // int[] num ={input.nextInt()};
        int []list1 = new int[]{num};
        return Arrays.toString(list1);



    }
}
