package deitel.Chapter5;

public class IntegerDivisibleBy3 {
    public static void main(String[] args) {
        int sum = 0;
        for (int number = 0; number <= 30; number++) {
            if (number %3 == 0){
                sum  +=number;
            }
        }
        System.out.println(sum);

    }
}
