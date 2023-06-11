package deitel.Chapter7;

import java.security.SecureRandom;

public class DiceRolling {
    public static void main(String[] args) {
        SecureRandom randomNumbers = new SecureRandom();
        int[]frequency = new int[7];

        for (int row = 0; row <= 36_000_000; row++) {
            ++frequency[1 + randomNumbers.nextInt(6)];

        }
        System.out.printf("%s%10s%n", "Face", "Frequency");

    }




}
