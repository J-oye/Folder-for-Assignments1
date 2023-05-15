import java.util.Arrays;

public class ArraySample4 {
    public static void main(String[] args) {
        int[][] arr = new int[5][];
        arr[0] = new int[5];
        arr[1] = new int[3];
        arr[2] = new int[10];
        arr[3] = new int[]{400,500};
        arr[4] = new int[5];

        for (int index = 0; index < arr[0].length;index++){
            arr[0][index] = index;
           for (int num =1; num < arr[4].length;num++){
                arr[4][index] = (index+ 1) * 100;

            }

        }
        //System.out.println(Arrays.deepToString(arr));

        System.out.println(Arrays.deepToString(arr));


    }

}
