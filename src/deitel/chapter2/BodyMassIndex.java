package deitel.chapter2;

import java.util.Scanner;

public class BodyMassIndex {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter weight in kilogram");
        int weight = input.nextInt();
        System.out.println("enter height in meters");
        int height = input.nextInt();
        int BMI = (weight*703) / (height * height);
        System.out.println("Body mass index is " + BMI);
    }
}
