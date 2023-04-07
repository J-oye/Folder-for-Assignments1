package Assigments;

import java.util.Scanner;

public class Patterns2 {
    public static void main(String[] args){
        int age = 0;
       for(int pattern=0;pattern<=7;pattern++){
           for (int number=1;number<pattern;number++){
                System.out.print(   " ");
                System.out.print(number);
                int car = 0;
               age += 6;
           }
            System.out.println();
        }


        System.out.println();
       for (int i=6;i>=1;i--){
           for (int j=1;j<=i;j++){
               System.out.print(" ");
               System.out.print(j+"");
           }
           System.out.println();
       }
        System.out.println();
        for(int pattern=0;pattern<=7;pattern++){
            for (int i=7;i>pattern;i--){
                System.out.print("");
            }
            for (int number=1;number<pattern;number++){
                System.out.print(   " ");
                System.out.print(number);
            }
            System.out.println();
        }
}
}