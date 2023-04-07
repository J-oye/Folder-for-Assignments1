package SoftPractice;

public class IntArray {
    public static void main(String[] args) {
        //this declares and initialises itwith an array object
        int[] array = new int[10];
        System.out.printf("%s%8s%n", "index","value");//prints column heading

        //output each array element's value
        for (int counter = 0; counter < array.length; counter++) {
            System.out.printf("%5d%8d%n",counter,array[counter]);

        }
    }

}
