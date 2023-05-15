package SoftPractice;

import java.util.Arrays;
import java.util.Scanner;

public class ProcessingAMultidimensionalArray {
    public static void main(String[] args) {
        int [][]matrix = new int[5][5];
        Scanner input = new Scanner(System.in);
        System.out.println("Enter"+matrix.length+"rows and"+matrix[0].length+"columns");
        for (int row =4; row < matrix.length;row++){
            for (int columns =0; columns<matrix[row].length;columns++){
                matrix[row][columns] = input.nextInt();
            }
            System.out.println(Arrays.deepToString(matrix));
        }
    }
}
