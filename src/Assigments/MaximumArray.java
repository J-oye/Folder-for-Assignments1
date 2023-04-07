package Assigments;

public class MaximumArray {
    public static void main(String[] args) {
        int[]array ={37,40,50,100,200};

        int max = array[0];

        for (int counter = 0; counter < array.length; counter++) {
            if (array[counter]>max)
                max = array[counter];
        }
        System.out.println(max);

    }
}
