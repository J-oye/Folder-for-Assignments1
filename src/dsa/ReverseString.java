package dsa;

public class ReverseString {
//    public static void main(String[] args) {
//        reverse("I love java");
//
//    }

    public  String  reverse(String word){
        String[] reversed = word.split(" ");
        StringBuilder newWord = new StringBuilder();
             //newWord.reverse();
        for (int index = reversed.length-1; index >= 0; index--) {
            newWord.append(reversed[index]).append(" ");
        }
           // String result = newWord.toString();
            //System.out.println(result);
        //System.out.println(newWord);


            return newWord.toString();

    }
}
