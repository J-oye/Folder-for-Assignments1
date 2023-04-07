package Assigments;

public class Array {
    int[]array = {30, 20 ,10, 60 ,80 ,1000};
    public static int getMinimum(int[] array) {
        int min = array[0];
        for (int counter = 0; counter < array.length; counter++) {
            if (array[counter]<=min)
                min = array[counter];
        }
        return min;
    }


    private int min;

    public static int getMaximum(int[] array) {
        int max = array[0];

        for (int counter = 0; counter < array.length; counter++) {
            if (array[counter]>max)
                max = array[counter];
        }
        return max;
    }


    private int max;

    public int getMaxAndMin(int[] array) {
        int max = array[0];
        int min = array[0];
        for (int counter = 0; counter < array.length; counter++) {
            if (array[counter]>max)
                max = array[counter];
            if (array[counter]<=min)
                min = array[counter];

        }
        return maxandmin;
    }



    private int maxandmin;

}
