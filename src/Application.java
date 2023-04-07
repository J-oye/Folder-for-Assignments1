import java.util.Scanner;

public class Application {
    public static void main(String[] args){
        int language;
        Scanner input=new Scanner(System.in);

        System.out.println("Press 1 for English");
        System.out.println("Press 2 for Yoruba");
        System.out.println("Press 3 for Igbo");
        System.out.println("Press 4 for Hausa");
        language=input.nextInt();
        switch (language){
            case 1 -> System.out.println("English");
            case 2 -> System.out.println("Yoruba");
            case 3 -> System.out.println("Ibgo");
            case 4 -> System.out.println("Hausa");

            }

        }




    }
//}
