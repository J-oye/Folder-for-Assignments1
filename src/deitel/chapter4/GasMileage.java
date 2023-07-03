package deitel.chapter4;

import java.util.Scanner;

public class GasMileage {
    public static void main(String[] args) {
        int milesDriven;
        int gallonsUsed;
        double milesPerGallon = 0;
        int sentinel = -1;
        double combinedMilesPerGallon = 0;

        Scanner input = new Scanner(System.in);
        System.out.println("Enter miles driven or -1 to stop");
        milesDriven = input.nextInt();

        while (milesDriven != sentinel) {
            System.out.println("Enter gallons used or -1 to exit: ");
            if(milesDriven == sentinel){
                break;
            }
            gallonsUsed = input.nextInt();
            milesPerGallon = (double) milesDriven / gallonsUsed;
            System.out.println("miles driven: "+ milesPerGallon);
            combinedMilesPerGallon += milesPerGallon;
            System.out.println("Enter miles driven or -1 to stop: ");
            milesDriven = input.nextInt();
        }
        System.out.println(combinedMilesPerGallon);

    }

}
