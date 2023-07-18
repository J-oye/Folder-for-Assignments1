package deitel.Chapter6;

public class CalculatingTheSumOfDigits {
    public int sumOfDiGits(int number){
        int digit  = number%10;
        int digit2 = number /10;
        int d3 = digit2 %10;
        int real = number / 100;
        int d4 = real % 10;
        int goAgain =  number / 1000;
        int d5 = goAgain % 10;




//        System.out.println(d5);
//        System.out.println(d4);
//        System.out.println(d3);
//        System.out.println(digit);

        int sum =   d5 + d4 + d3 + digit;
        System.out.println(sum);

        return  sum;

    }
}
