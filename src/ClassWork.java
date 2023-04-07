import java.util.Scanner;

public class ClassWork {
    public static void main(String[] args){
      /**  Scanner input = new Scanner(System.in);
        System.out.println("Enter firstNumber");
       int firstNumber =input.nextInt();
        System.out.println("Enter secondNumber");
        int secondNumber= input.nextInt();
        System.out.println("Enter thirdNumber");
        int thirdNumber = input.nextInt();
        System.out.println("Enter fourthNumber");
        int fourthNumber = input.nextInt();
        System.out.println("Enter fifthNumber");
        int fifthNumber = input.nextInt();
        int sum= firstNumber+secondNumber+thirdNumber+fourthNumber+fifthNumber;
        int total =sum;
        System.out.print(total);*/

      int counter =0;
      int number=0;
      int sum=0;
      Scanner input =new Scanner(System.in);
      for(;counter<5;counter++){
          System.out.println("please Enter a number");
          number= input.nextInt();
          sum=number +sum;
      }
        System.out.println(sum);
    }
}
