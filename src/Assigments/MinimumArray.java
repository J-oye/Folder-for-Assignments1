package Assigments;

public class MinimumArray {
    public static void main(String[] args) {
        int[] array = {37,40,50,100,200};
        int min = array[0];
        for (int counter = 0; counter < array.length; counter++) {
            if (array[counter]<=min)
                min = array[counter];
        }
        System.out.println(min);
    }
}
