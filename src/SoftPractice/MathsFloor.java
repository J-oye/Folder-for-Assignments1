package SoftPractice;

public class MathsFloor {
    public static void main(String[] args) {
        System.out.println(round(10.9));
    }

    public  static double round(double x) {
        int nearestIntegerValue =1;
        for (int i = 0; i < x; i++) {
            nearestIntegerValue = i % 10 ;
        }
        return nearestIntegerValue;

    }
}
