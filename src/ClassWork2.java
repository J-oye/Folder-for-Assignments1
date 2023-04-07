import java.util.Scanner;

public class ClassWork2 {
    public static void main(String[] args){
        int counter =0;
        int number=0;
        int sum=0;
        Scanner input =new Scanner(System.in);
        for(;counter<5;counter++){
            System.out.println("please Enter a number");
            number= input.nextInt();
            if(number>=0&&number<=100){
                sum=sum+number;
            }

            }
        System.out.print(sum);

        }
        }




