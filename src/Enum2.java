import java.security.SecureRandom;
import java.util.Scanner;

public class Enum2 {
    private enum value{
        WON,LOST,DRAW
    }

    public static void main(String[] args) {
        System.out.println("Enter a number betwee 1 - 9");
        Scanner scanner = new Scanner(System.in);
        int userNumber = scanner.nextInt();
        SecureRandom random = new SecureRandom();
        int computerNumber = random.nextInt(9);


    }
}
