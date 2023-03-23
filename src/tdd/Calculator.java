package tdd;

 public class Calculator{
  public Object add(int firstNUmber, int secNumber) {
   return firstNUmber + secNumber;
  }

  public int substract(int firstNumber, int secondNumber) {
   return firstNumber - secondNumber;
  }

  public int absoluteSubtraction(int firstNumber, int secondNumber) {
   if(firstNumber > secondNumber) return firstNumber - secondNumber;
   if(secondNumber > firstNumber) return secondNumber - firstNumber;
   return firstNumber - secondNumber;
  }

  public int multipy(int firstNumber, int secondNumber) {
   return firstNumber * secondNumber;
  }

  public int divide(int firstNumber, int secondNumber) {
   return firstNumber / secondNumber;
  }
 }
