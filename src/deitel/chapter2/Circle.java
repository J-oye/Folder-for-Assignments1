package deitel.chapter2;

import java.util.Scanner;

public class Circle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter radius");
        int radius = input.nextInt();

        double diameter = 2 * radius;
        System.out.println("radius of circle " + diameter);
        double area = Math.PI *(radius * radius);
        System.out.println(" area of circle is " + area);

        double circumference = Math.PI*2*radius;
        System.out.println("circumference of circle is " + circumference);


    }
}
