package deitel.chapter3;



public class HeartRates {
    private String firstName;
    private  String lastname;
     private  int day;
     private String month;
     private int yearOfBirth;



    public String getFirstName() {
        return firstName;
    }

    public HeartRates(String firstName, String lastname, int day, String month, int yearOfBirth) {
        this.firstName = firstName;
        this.lastname = lastname;
        this.day = day;
        this.month = month;
        this.yearOfBirth = yearOfBirth;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public String getMonth() {
        return month;
    }

    public void setMonth(String month) {
        this.month = month;
    }

    public int getYear() {
        return yearOfBirth;
    }

    public void setYear(int year) {
        this.yearOfBirth = year;
    }

    public int calculateAge(int year){
        int currentYear = 2023;
        int personAge = currentYear - year;
        return  personAge;
    }

    public int maximumHeartRateCalculation(int personAge){
       int heartRateInBeats = 220;
        int maximumHeartRate = heartRateInBeats - personAge;
        return  maximumHeartRate;
    }

    public int targetHeartRate(int maximumHeartRate){
        int heartRatesInRange = 50;
        int targetHeartRate = (maximumHeartRate * heartRatesInRange)/100;
        return targetHeartRate;
    }

}
