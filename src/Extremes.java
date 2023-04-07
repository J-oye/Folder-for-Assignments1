import java.util.Scanner;

public class Extremes {
    public static void main(String[] args){
        Scanner input =new Scanner(System.in);
        System.out.println("Enter a Number");
        int number=0;
        int sum;
        while (number<50){
            System.out.println("Please Enter numbers in tens");
            number = input.nextInt();
            number =number+5;


            System.out.println("sum of  number is %d");

        }



    }
}
