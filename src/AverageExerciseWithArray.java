import java.util.Scanner;

public class AverageExerciseWithArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[]aver = new int[5];
        int average;
        int num;
        int total = 0;
        for (int index = 0;index < aver.length;index++){
            System.out.println("please enter a number :");
            num  =input.nextInt();
            total += num;
            average = total /aver[index];
            System.out.println(average);

        }
    }
}
