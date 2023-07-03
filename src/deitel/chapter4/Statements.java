package deitel.chapter4;

public class Statements {
    public static void main(String[] args) {
        int count =1;
        if (count>=10){
            System.out.println(true);
        }
        int y =2;
        int total = 0;
        total = y-1;
        System.out.println(total);

        int sum = 0;
        int x = 1;
        sum = x+sum;
        System.out.println("sum is "+ sum);

        while (x<=10){
            sum +=x;
            ++x;
            System.out.println(x+" = "+sum);
        }

    }
}
