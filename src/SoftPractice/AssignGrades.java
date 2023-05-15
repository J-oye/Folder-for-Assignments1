package SoftPractice;

import java.util.Scanner;

public class AssignGrades {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("please enter the number of Students:");
        int numberOfStudents;
        for ( numberOfStudents=1;numberOfStudents < 5;numberOfStudents++){
             numberOfStudents = input.nextInt();
        }

        int bestScore = 100;

        int count = 1;
        while (count<5){
            System.out.println("enter student scores:");
            int studentScore = input.nextInt();
            count++;
            if (studentScore >= bestScore-10){
                System.out.printf("%s%d%s%n","student", numberOfStudents ,"your grade is A");
            }else
            if (studentScore >= bestScore - 20){
                System.out.printf("%s%d%s%n","student", numberOfStudents ,"your grade is B:");
            }else
            if (studentScore >= bestScore - 30){
                System.out.printf("%s%d%s%n","student", numberOfStudents ,"your grade is C");
            }else
            if (studentScore >= bestScore - 40){
                System.out.printf("%s%d%s%n","student", numberOfStudents ,"your grade is D");
            }
            else
                System.out.printf("%s%d%s%n","student", numberOfStudents ,"your grade is F");
        }



    }
}
