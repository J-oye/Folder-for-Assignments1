package SoftPractice;

public class IntArray2 {
    public static void main(String[] args) {
        //this initializer specify the initial value of each element.
        int array2[] = {32,27,64,18,95,14,90,70,60,37};

        System.out.printf("%s%8s%n","Index","Value");//coilumn heading

        //output each array element's value
        for (int counter = 0; counter < array2.length; counter++) {
            System.out.printf("%5d%8d%n",counter,array2[counter]);

        }

    }
}
