package SoftPractice;

public class IntArray3 {
    public static void main(String[] args) {
        final int ARRAY_LEGNTH = 10; //declares array
        int[]array3 = new int[ARRAY_LEGNTH];

        // calculates each array elements
        for (int counter = 0; counter < array3.length; counter++) {
            array3[counter] = 2 + 2 * counter;
        }

        System.out.printf("%s%8s%n","Index","Value");

        //output each array elements
        for (int counter = 0; counter < array3.length; counter++) {
            System.out.printf("%5d%8d%n",counter,array3[counter]);
      }
    }
}
