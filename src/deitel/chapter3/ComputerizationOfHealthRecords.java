package deitel.chapter3;

public class ComputerizationOfHealthRecords {
    private  String firstName;
    private String lastName;
    private String gender;
    private int day;
    private String month;
    private int yearOfBirth;
    private int height;
    private int weight;

    public ComputerizationOfHealthRecords(String firstName, String lastName, String gender, int day, String month, int yearOfBirth, int height, int weight) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.gender = gender;
        this.day = day;
        this.month = month;
        this.yearOfBirth = yearOfBirth;
        this.height = height;
        this.weight = weight;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
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

    public int getYearOfBirth() {
        return yearOfBirth;
    }

    public void setYearOfBirth(int yearOfBirth) {
        this.yearOfBirth = yearOfBirth;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }
    public int calculateAgeInYears(int year){
        int currentYear = 2023;
        return currentYear - year;
    }

    public int bmi(int height,int weight){
        int bmi = (weight  * 703)/ (height * height);
        return bmi;
    }
    public int maximumHeartRateCalculation(int personAge){
        int heartRateInBeats = 220;
        return heartRateInBeats - personAge;
    }

    public int targetHeartRate(int maximumHeartRate){
        int heartRatesInRange = 50;
        return (maximumHeartRate * heartRatesInRange)/100;
    }


}
