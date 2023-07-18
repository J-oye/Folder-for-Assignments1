package deitel.chapter3;

import java.util.Scanner;

public class HeartRateMain {
    public static void main(String[] args) {
        HeartRates heartRates = new HeartRates("james","petre",4,"march",1990);
        System.out.println(heartRates.getFirstName());
        System.out.println(heartRates.getLastname());
        System.out.println(heartRates.calculateAge(1990));
        System.out.println(heartRates.maximumHeartRateCalculation(33));
        System.out.println(heartRates.targetHeartRate(187));

    }
}
