package deitel.Chapter7;

import java.util.Arrays;

public class Exercise7_9 {
    public static void main(String[] args) {
        int[][]tee = new int[2][3];

        for (int row=1;row < tee.length;row++){
            for (int column=2;column<tee[row].length;column++){
                tee[row][column]=row+1;

            }
            System.out.println(Arrays.deepToString(tee));
        }

    }

}
