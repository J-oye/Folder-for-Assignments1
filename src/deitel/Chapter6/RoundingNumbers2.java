package deitel.Chapter6;

public class RoundingNumbers2 {
    public static void main(String[] args) {
        System.out.println(RoundingNumbers2.roundToInteger(8.7638945));
        System.out.println(RoundingNumbers2.roundToTenths(489.00345));
        System.out.println(RoundingNumbers2.roundToHundreds(600000000));
        System.out.println(RoundingNumbers2.roundToThousands(3.836));

    }

    public  static double roundToInteger(double x){
        double num= Math.floor(x-0.5);
        return num;

    }
    public static double roundToTenths(double x){
        double z = Math.floor(x * 10 + 0.5)/10;
        return z;

    }

    public static double roundToHundreds(double x){
        double dig = Math.floor(x * 100 + 0.5)/100;
        return dig;

    }

    public static double roundToThousands(double x){
        double score = Math.floor(x * 10000 + 0.5)/1000;
        return score;

    }
}
