package deitel.chapter2;

public class StatisticsForTheGreatPyramidGiza {
    public static void main(String[] args) {
        double weight = 2.5;
        int year = 365;
        int hour = 60;
        int minute = 60;

        double estimateOfHowMuchWasBuilt = weight * year;
        System.out.println("the estimated number of how much was built in a year is " + estimateOfHowMuchWasBuilt);

        double estimateOfHour = weight * hour * year;
        System.out.println("the amount  of hour  used to build was "+ estimateOfHour);

        double estimateOfMinute = weight * minute * year;
        System.out.println("the amount  of minutes  used to build was "+ estimateOfMinute);
    }
}
