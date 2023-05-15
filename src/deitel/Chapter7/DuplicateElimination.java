package deitel.Chapter7;

import java.util.Arrays;
import java.util.Scanner;

public class DuplicateElimination {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.println("please enter a number between 10 to 100:");
        int number = input.nextInt();
        while (number<=11) {
            System.out.println("please enter a number between 10 to 100:");
            number++;

            int []array = new int[number];
            for (int index = 0; index < array.length; index++) {
                array[index] = index;

            }
            System.out.println(Arrays.toString(array));
        }










































//        int no;
//        Scanner input = new Scanner(System.in);
//        System.out.println("please enter the elements of this array from 10 to 100:");
//        no = input.nextInt();

//        int arr;
//        int count = 1;
//        while (count<11){
//            System.out.println("please enter a number from 10 to 100:");
//            count++;
//            arr = input.nextInt();
//        }



//        int[]num = new int[-1];
//        for (int index= 0; index < num.length; index++) {
//            num[index] =  +1;
//
//        }
//        System.out.println(Arrays.toString(num));

    }
}
