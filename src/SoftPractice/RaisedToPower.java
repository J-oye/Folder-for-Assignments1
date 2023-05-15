package SoftPractice;

public class RaisedToPower {
    public static void main(String[] args) {

    }

    public int raiseNumber(int x,int y) {
        int squareOf = 1;
        for (int i =0;i < y;i++){
            if (x > 0 && y > 0 ){
                squareOf = squareOf * x;
            }
        }
        return squareOf;
        //x ** y;
        //return squareOf;
    }
}
