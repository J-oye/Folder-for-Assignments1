package tdd;

/**public class Numbers{
    public static void main(String[] args) {
      /**  Scanner input= new Scanner(System.in);
     //   System.out.println("Enter a number");
        int num = 10;
      int counter=1;
      while(counter<=num){
          if(counter%2!=num)
          System.out.println(counter);
          counter +=2;
    }*/
     /** Scanner input = new Scanner(System.in);
      int sales;
      int totalSales = 0;
      int counter =0;
      while(counter<5) {
          System.out.println("Enter sale for product" + (counter));
          sales = input.nextInt();
          totalSales += sales;
          counter = counter + 1;
          System.out.println("Total sale is now " + totalSales);
      }
}
}*/

    /** public  class SentinelLoop{
         public static void main(String[] args){
             Scanner input = new Scanner(System.in);
             System.out.println("Enter sale price for your product or-1 to stop");
             int userInput = input.nextInt();
             int totalSales=0;
             while(userInput != -1){
                 totalSales += userInput;
                 System.out.println("Enter sale price for your product or -1 to stop");
                 userInput = input.nextInt();
             }
             System.out.println("Total sales is" +totalSales);
         }
     }*/

  /**  public class ForLoop{
        public static void main(String[] args){
            for(int i =7;i<=77;i+=7)
                System.out.println(i);

        }
    }*/

  public class Pyramid {
      public static void main(String[] args){
          int j = 0;
          while(j<7){
              int i = 0;
                      while(i<=j){
                          System.out.print("*");
                          i++;
                      }
              System.out.println();
                      j++;
          }


          }
      }
  //}