package SoftPractice;

import java.util.Arrays;
import java.util.Scanner;

public class CreditCard {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter your creditCard number::");
        String cardNumber = input.nextLine();

        int[] intCardNUmber = new int[cardNumber.length()];
        for (int index = 0; index < cardNumber.length(); index++) {
            char ch = cardNumber.charAt(index);
            int eachNumber = Character.getNumericValue(ch);
            intCardNUmber[index] = eachNumber;
        }
        System.out.println(Arrays.toString(intCardNUmber));



//        String[]cardDigits = new String[cardNumber.length()];
//
//        for (char i = 0; i < cardNumber.length(); i++) {
//            cardNumber.charAt(cardNumber.length());
//        }
//
//        for (int i = 0; i < cardNumber.length(); i++) {
//            cardNumber.length() .
//        }
    }

}
