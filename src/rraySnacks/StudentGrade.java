package rraySnacks;

import java.util.Scanner;

public class StudentGrade {
    private  int numberOfStudents;
    private int numberOfSubjects;
    private int [][]gradesOfStudents = new int[numberOfStudents][numberOfSubjects];
    private Scanner input = new Scanner(System.in);


    public void userInput(){
        System.out.println("Enter number of student");
        numberOfStudents = input.nextInt();
        System.out.println("Enter number of subject");
        numberOfSubjects = input.nextInt();
    }
    public  int[][]computeStudentGrades(){
        int grade;
        for (int index = 0; index < numberOfStudents; index++) {
            System.out.println("filling grades "+ index+1);
            for (int row = 0; index < numberOfStudents; ) {
                System.out.println("Enter subject grade" + row+1);
                grade = input.nextInt();
                if (grade > 0 && grade < 100){
                    gradesOfStudents[index][row]= grade;
                    System.out.println("Saving>>>>>>>>>>>>>>>>>" +
                            "Saved Successfully" );
                    index++;

                }

            }

        }
        return gradesOfStudents;

    }

}
