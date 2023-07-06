package deitel.Chapter5;

public class TrianglePrinting {
    public static void main(String[] args) {
        for (int index = 0; index < 10; index++) {
            for (int inner = 0; inner  <= index; inner++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.print(' ');

        //System.out.println();


        for (int j = 0; j < 10; j++) {
            for (int k = 10; k > j; k--) {
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.print(' ');



    }
}
