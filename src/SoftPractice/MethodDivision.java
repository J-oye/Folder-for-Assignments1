package SoftPractice;

public class MethodDivision {
    public static void main(String[] args) {

    }

    public int division(int num, int dig ){
        int divisionResult = 0;
        if (num > dig){
            divisionResult = num / dig;
        }else
         if (dig > num){
             divisionResult = dig / num ;
         }
        return divisionResult;

    }
}
