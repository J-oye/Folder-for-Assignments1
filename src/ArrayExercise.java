import java.util.Arrays;

public class ArrayExercise {
    public static void main(String[] args) {
        int[]numbers ={1,2,3,4,5};
        ArrayExercise.arrayPrint(numbers);
//        int[] myArray =new int[10];
//        for (int index =0; index <myArray.length; index++) {
//
//           myArray [index] = index + 1;
//
//        }
//        System.out.println(Arrays.toString(myArray));
    }

    public static int[] arrayPrint( int[] array){
        int[] myArray = new int[array.length];
        for (int index = 0; index < myArray.length; index++) {
            myArray[index] = index + 1;
        }
        System.out.println(Arrays.toString(myArray));
        return myArray;
    }
}
