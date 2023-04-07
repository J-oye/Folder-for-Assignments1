import java.util.Scanner;

public class NokiaMenu {

    public static void main(String[] args) {
        int userInput;
        Scanner input = new Scanner(System.in);
            System.out.println("press 1.Phonebook");
            System.out.println(" press 2.Messages.");
            System.out.println("press 3. Chat");
            System.out.println(" press 4.Call register");
            System.out.println("press 5.Tones");
            System.out.println("press 6.Settings");
            System.out.println("press 7.Call divert");
            System.out.println("press 8.Games");
            System.out.print("press 9.Calculator");
            System.out.print("press 10.Reminders");
            System.out.println("press11.Clock");
            System.out.println("press12.Profiles");
            System.out.println("press13.Sim services");
             System.out.println("Enter a number");
             userInput = input.nextInt();
             switch (userInput) {
                 case 1 -> {
                     System.out.println("Phone book");
                     switch (userInput) {
                         case 1 -> {
                             System.out.println(" 1. Search");
                         }
                         case 2 -> {
                             System.out.println("press 2.Service Nos");
                         }
                         case 3 -> {
                             System.out.println("press 3.Add name");
                         }
                         case 4 -> {
                             System.out.println("press4.Erase");
                         }
                         case 5 -> {
                             System.out.println("press5.Edit");
                         }
                         case 6 -> {
                             System.out.println("press6.Assign tone");
                         }
                         case 7 -> {
                             System.out.println("press7.send b'card");
                         }
                         case 8 -> {
                             System.out.println("press 8.Options");
                             System.out.println("1. Type of view" +
                                     "2. Memory Status");
                             System.out.println("pick an option to proceed");
                             userInput = input.nextInt();
                             switch (userInput) {
                                 case 1 -> System.out.println("1. Type of view");
                                 case 2 -> System.out.println("2, Memory status");
                             }
                         }
                         case 9 -> System.out.println("9.Speed dial");
                         case 10 -> System.out.println("10. voice tags");
                     }
                     switch (userInput) {
                         case 2 -> {
                             System.out.println("Message");
                             switch (userInput) {
                                 case 1 -> {System.out.println("1. Write a message");}
                                 case 2 ->{ System.out.println("2.Inbox");}
                                 case 3 -> {System.out.println("3.Outbox");}
                                 case 4 -> {System.out.println("4.Picture messages");}
                                 case 5 -> {System.out.println("5.Templates");}
                                 case 6 -> {System.out.println("6.Smileys");}

                                 case 7 -> {
                                     System.out.println("7.Message settings");
                                     System.out.println("1.Set1" +
                                             "2.Common");
                                     switch (userInput) {
                                         case 1 -> {
                                             System.out.println("1. set1");
                                             switch (userInput) {
                                                 case 1 -> {
                                                     System.out.println("1.Message centre number");
                                                 }
                                                 case 2 -> {
                                                     System.out.println("2.Messages sent as");
                                                 }
                                                 case 3 -> {
                                                     System.out.println("3.Message validity");
                                                 }
                                             }
                                         }
                                     }
                                     switch (userInput) {
                                         case 2 -> {
                                             System.out.println("2.Common");
                                             switch (userInput) {
                                                 case 1 -> {
                                                     System.out.println("1.Delivery reports");
                                                 }
                                                 case 2 -> {
                                                     System.out.println("2.Reply via same centre");
                                                 }
                                                 case 3 -> {
                                                     System.out.println("3.Character support");
                                                 }
                                             }
                                         }
                                     }
                                 }




                                 case 8-> {System.out.println("8.Info service");}
                                 case 9-> {System.out.println("9.Voice mailbox number");}
                                 case 10-> {System.out.println("10.Service command editor");}
                                     }
                         }
                         case 3->
                         {System.out.println(" Chat");}

                         case 4-> {System.out.println("Call register");
                             switch (userInput){
                                 case 1-> {System.out.println("1.Missed calls");}
                                 case 2-> {System.out.println("2.Received calls");}
                                 case 3-> {System.out.println("3.Dialled numbers");}
                                 case 4-> {System.out.println("4.Erase recent call list");}

                                 case 5 -> {
                                     System.out.println("5.Show call duration");
                                     switch (userInput){
                                         case 1-> {System.out.println("1.Last call duration");}
                                         case 2-> {System.out.println("2.All call's duration");}
                                         case 3-> {System.out.println("3.Received call's duration");}
                                         case 4 -> {System.out.println("4.Dialled call's duration");}
                                         case 5 -> {System.out.println("5.Clear timers");}
                                     }
                                 }
                                 case 6-> {
                                     System.out.println("6.Show call cost");
                                     switch (userInput){
                                         case 1-> {System.out.println("1.Last call cost");}
                                         case 2-> {System.out.println("2.All call's cost");}
                                         case 3-> {System.out.println("3.Clear counters");}
                                     }
                                 }
                                 case 7-> {
                                     System.out.println("7.Call cost settings");
                                     switch (userInput){
                                         case 1-> {System.out.println("1.Call cost limit");}
                                         case 2->{ System.out.println("2.Show cost in");}
                                     }
                                 }
                                 case 8->{System.out.println("8.Prepaid credit");}
                             }
                     }
                     case 5-> {
                             System.out.println("Tones");
                             switch (userInput){
                                 case 1-> {System.out.println("1.Ringing tone");}
                                 case 2-> {System.out.println("2.Ringing volume");}
                                 case 3-> {System.out.println("3.Incoming call");}
                                 case 4-> {System.out.println("4.Composer");}
                                 case 5-> {System.out.println("5.Message alert tone");}
                                 case 6-> {System.out.println("6.Keypad tone");}
                                 case 7-> {System.out.println("7.Warning and games tone");}
                                 case 8-> {System.out.println("8.Vibrating alert");}
                                 case 9-> {System.out.println("9.Screen saver");}
                             }
                         }
                         case 6-> {
                             System.out.println("Settings");
                             switch (userInput){
                                 case 1-> {
                                     System.out.println("1.Call settings");
                                     switch (userInput){
                                         case 1-> {System.out.println("1.Automatic redial");}
                                         case 2-> {System.out.println("2.Speed dialling");}
                                         case 3-> {System.out.println("3.Call waiting option");}
                                         case 4-> {System.out.println("4.Own number sending");}
                                         case 5-> {System.out.println("5.Phone line in use");}
                                         case 6->{System.out.println("6.Automatic answer");}
                                     }
                                 }
                                 case 2-> {
                                     System.out.println("2.Phone setting");
                                     switch (userInput){
                                         case 1-> {System.out.println("1.Language");}
                                         case 2-> {System.out.println("2.Cell info");}
                                         case 3-> {System.out.println("3.Welcome note");}
                                         case 4-> {System.out.println("4.Network selection");}
                                         case 5-> {System.out.println("5.Lights");}
                                         case 6-> {System.out.println("6.Confirm SIM ser ice action");}
                                     }
                                 }
                                 case 3-> {
                                     System.out.println("3.Security settings");
                                     switch (userInput){
                                         case 1-> {System.out.println("1.Pin code request");}
                                         case 2-> {System.out.println("2.Call barring service");}
                                         case 3-> {System.out.println("3.Fixed dialling");}
                                         case 4-> {System.out.println("4.Closed user group");}
                                         case 5-> {System.out.println("5.Phone security");}
                                         case 6-> {System.out.println("6.Change access codes");}
                                     }
                                 }
                                 case 4-> {System.out.println("4.Restore factory settings");}
                             }
                         }
                         case 7-> {System.out.println("Call divert");}
                         case 8-> {System.out.println("Games");}
                         case 9-> {System.out.println("Calculator");}
                         case 10-> {System.out.println("Reminders");}

                         case 11-> {
                             System.out.println("Clock");
                             switch (userInput){
                                 case 1-> {System.out.println("1.Alarm clock");}
                                 case 2-> {System.out.println("2.Clock setting");}
                                 case 3-> {System.out.println("3.Date setting");}
                                 case 4-> {System.out.println("4.Stop watch");}
                                 case 5-> {System.out.println("5.Countdown timer");}
                                 case 6-> {System.out.println("6.Auto update of time and date");}
                             }
                         }
                         case 12-> {System.out.println("Profile");}
                         case 13-> {System.out.println("SIM service");}
                                 }

                                     }
                                 }
                             }


                         }



