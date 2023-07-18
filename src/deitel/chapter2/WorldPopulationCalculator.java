package deitel.chapter2;

import java.util.Scanner;

public class WorldPopulationCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("please enter the current world population: ");
        int currentPopulation = input.nextInt();
        System.out.println("please enter annual world population growth rate:");
        double annualGrowthRate = input.nextInt();
        for (int year=1;year<=5;year++) {
            double estimatedPopulation = currentPopulation * (annualGrowthRate * year) * 2 / 100;
            System.out.println(estimatedPopulation);
        }

    }
}
