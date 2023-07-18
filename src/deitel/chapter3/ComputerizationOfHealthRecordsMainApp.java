package deitel.chapter3;

import java.util.Scanner;

public class ComputerizationOfHealthRecordsMainApp {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your firstName :");
        String firstName = input.nextLine();
        System.out.println("Enter your lastName :");
        String lastName = input.nextLine();
        System.out.println("Enter your gender :");
        String gender = input.nextLine();
        input.nextLine();
        System.out.println("Enter the day you were born like a number:");
         int day = input.nextInt();
        System.out.println("Enter The month you were born:");
        String month = input.nextLine();
        input.nextLine();
        System.out.println("Enter the year of birth:");
        int year = input.nextInt();
        System.out.println("Enter your height:");
        int height = input.nextInt();
        System.out.println("Enter your weight:");
        int weight = input.nextInt();
        ComputerizationOfHealthRecords computerizationOfHealthRecords = new ComputerizationOfHealthRecords(firstName,lastName, gender,day,month,year,height,weight);
        System.out.println("name : "+computerizationOfHealthRecords.getFirstName());
        System.out.println("lastName: "+computerizationOfHealthRecords.getLastName());
        System.out.println("gender : "+computerizationOfHealthRecords.getGender());
        System.out.println(" Born day : "+computerizationOfHealthRecords.getDay());
        System.out.println("birth month : "+computerizationOfHealthRecords.getMonth());
        System.out.println("year of Birth :"+computerizationOfHealthRecords.getYearOfBirth());
        System.out.println("your height is :"+computerizationOfHealthRecords.getHeight());
        System.out.println("your weight is : "+ computerizationOfHealthRecords.getWeight());
        System.out.println("your age is :"+computerizationOfHealthRecords.calculateAgeInYears(year));
        System.out.println("your bmi is :"+computerizationOfHealthRecords.bmi(height,weight));
        System.out.println(computerizationOfHealthRecords.maximumHeartRateCalculation(33));
        System.out.println(computerizationOfHealthRecords.targetHeartRate(160));
    }
}
