package deitel.Chapter5;

public class SumOfSeries {
    public static void main(String[] args){
        long  n =100;
        int sum=0;
        for (int i =0;i<=n;i++){
            sum =sum + i ;

            System.out.println(i + "     "+sum);
        }
    }
}
