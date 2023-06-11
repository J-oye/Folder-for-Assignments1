package deitel.chapter1;

import java.util.Locale;

public class Exercise {
    public  static int addNumber(int number1,int number2){
       int result= number1 + number2 ;
       return  result;

    }
    public static int subtract(){
        int number1=5 ;
        int number2=2;
        int sum = number1 - number2;
        return sum;
    }

    public  static String check(String name){
         String myName = name.toUpperCase();
         return  myName;

    }

    public static void main(String[]args){
        System.out.println(addNumber(2,6));
        System.out.println(subtract());
        System.out.println(check("joshua"));
    }
}
