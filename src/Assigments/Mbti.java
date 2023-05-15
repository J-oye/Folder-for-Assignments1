//package Assigments;
//
//import java.rmi.UnexpectedException;
//import java.util.Scanner;
//
//public class Mbti {
//    public static void main(String[] args) {
//        question();
//
//    }
//    public static void question(){
//         String userInput;
//        int number = 1;
//        while (number < 20){
//            Scanner input = new Scanner(System.in);
//            System.out.println("please answer questions 1 - 20 accordingly:");
//            number= input.nextInt();
//
//            switch (number){
//
//                case 1 -> {
//                    //try {
//                        System.out.println("1. a. expend energy, enjoy groups or b. conserve energy, enjoy one-on-one");
//                        userResponse();
//                        break;
//                    //}catch
//                }
//                case 2 ->{
//                    System.out.println("2. a. interpret literally or b. look for meaning and possibilities");
//                    userResponse();
//                    break;
//                }
//                case 3 ->{
//                    System.out.println("3. a. logical, thinking, questioning or b. empathetic, feeling, accommodating");
//                    userResponse();
//                    break;
//                }
//                case 4 ->{
//                    System.out.println("4. a. organized, orderly or b. flexible, adaptable");
//                    userResponse();
//                    break;
//                }
//                case 5 ->{
//                    System.out.println("5. a. more outgoing, think out loud or b. more reserved, think to yourself");
//                    userResponse();
//                    break;
//                }
//                case 6 ->{
//                    System.out.println("6. a. practical, realistic, experiential or b. imaginative, innovative, theoretical");
//                    userResponse();
//                    break;
//                }
//                case 7 ->{
//                    System.out.println("7. a. candid, straight forward, frank or b. tactful, kind, encouraging");
//                    userResponse();
//                    break;
//                }
//                case 8 ->{
//                    System.out.println("8. a. plan, schedule or b. unplanned, spontaneous");
//                    userResponse();
//                    break;
//                }
//                case 9 ->{
//                    System.out.println("9. a. seek many tasks, public activities, interaction with others\n" +
//                            "b. seek private, solitary activities with quiet to concentrate");
//                    userResponse();
//                    break;
//                }
//                case 10 ->{
//                    System.out.println("10. a. standard, usual, conventional or b. different, novel, unique");
//                    userResponse();
//                    break;
//                }
//                case 11 ->{
//                    System.out.println("11. a. firm, tend to criticize, hold the line or b. gentle, tend to appreciate, conciliate");
//                    userResponse();
//                    break;
//                }
//                case 12 ->{
//                    System.out.println("12. a. regulated, structured or b. easygoing, “live” and “let live”");
//                    userResponse();
//                    break;
//                }
//                case 13 ->{
//                    System.out.println("13. a. external, communicative, express yourself or b. internal, reticent, keep to yourself");
//                    userResponse();
//                    break;
//                }
//                case 14 ->{
//                    System.out.println("14. a. focus on here-and-now or b. look to the future, global perspective, “big picture”");
//                    userResponse();
//                    break;
//                }
//                case 15 ->{
//                    System.out.println("15. a. tough-minded, just or b. tender-hearted, merciful");
//                    userResponse();
//                    break;
//                }
//                case 16 ->{
//                    System.out.println("16. a. preparation, plan ahead or b. go with the flow, adapt as you go");
//                    userResponse();
//                    break;
//                }
//                case 17 ->{
//                    System.out.println("17. a. active, initiate or b. reflective, deliberate");
//                    userResponse();
//                    break;
//                }
//                case 18 ->{
//                    System.out.println("18. a. facts, things, “what is”  OR  b. ideas, dreams, “what could be,” philosophical");
//                    userResponse();
//                    break;
//                }
//                case 19 ->{
//                    System.out.println("19. a. matter of fact, issue-oriented  OR   b. sensitive, people-oriented, compassionate");
//                    userResponse();
//                    break;
//                }
//                case 20 ->{
//                    System.out.println("20. a. control, govern  OR b. latitude, freedom");
//                    userResponse();
//                    break;
//                }
//
//
//            }
//        }
//    }
//    public static String userResponse(String a){
//
//        Scanner input = new Scanner(System.in);
//        System.out.println("please choose option a or b as answers");
//        String userInput = input.nextLine();
//        String answer = "";
//        if(answer== a){
//            System.out.println(answer);
//        }else
//        if (userInput != "a" & userInput !="b"){
//            throw new IllegalArgumentException("Expected A or B as response. I know this is an error, please try again");
//        }
//        return  answer;
//    }
//
//    public String personalityType(){
//
//    }
//
//
//}
