package deitel.chapter14.example1;

public class Example3 {
    public static void main(String[] args) {
        String str = "I have Java";

        int result = str.compareTo("");

        System.out.println(result);
        //returns 0 if both strings are equal, returns a negative number when the string you paa as argument to comparedTo() is greater
        //than the string that invokes comparedTo(),returns a positive number when the string invoking comparedTo() is greater than the string passed as argument
        //to comparedTo().
    }
}
