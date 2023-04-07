import java.util.Scanner;

public class ModifiedNokia {

    public static void main(String[] args) {
        menu();
    }


    public static void menu() {
        int userInput;
        Scanner input = new Scanner(System.in);
        System.out.printf("%s%n%s%n%s%n%s%n%s%n%s%n%s%n%s%n%s%n%s%n%s%n%s%n%s%n%s%n%s%n", "Menu List", "1.Phonebook", "2.Message", "3.Chat", "4.Call register", "5.Tones", "6.Settings", "7.Call divert,",
                "8.Games", "9.Calculator", "10.Reminders", "11.Clock", "12.Profiles", "13.SIM service", "14. Exit");
        System.out.println("Enter a number");
        userInput = input.nextInt();
        switch (userInput) {
            case 1 -> {
                System.out.println("Phone book");
                System.out.printf("%s%n%s%n%s%n%s%n%s%n%s%n%s%n%s%n%s%n%s%n%s%n", "1.Search", "2.Service Nos", "3.Add name", "4.Erase", "5.Edit", "6.Assign tone", "7.Send b,card",
                        "8.Options", "9.Speed dial", "10.Voice tags", "11. Back");
                System.out.println("press a number");
                userInput = input.nextInt();
                switch (userInput) {
                    case 1 -> {
                        System.out.println(" 1. Search");
                    }
                    case 2 -> {
                        System.out.println("2.Service Nos");
                    }
                    case 3 -> {
                        System.out.println("3.Add name");
                    }
                    case 4 -> {
                        System.out.println("4.Erase");
                    }
                    case 5 -> {
                        System.out.println("5.Edit");
                    }
                    case 6 -> {
                        System.out.println("6.Assign tone");
                    }
                    case 7 -> {
                        System.out.println("7.send b'card");
                    }
                    case 8 -> {
                        System.out.println(" 8.Options");
                        System.out.println("1. Type of view" +
                                " 2. Memory Status \n 3. Back");
                        System.out.println("pick an option to proceed");
                        System.out.println("choose an option");
                        userInput = input.nextInt();
                        switch (userInput) {
                            case 1 -> System.out.println("1. Type of view");
                            case 2 -> System.out.println("2, Memory status");
                            case 3 -> phoneBook();
                        }
                        break;
                    }
                    case 9 -> System.out.println("9.Speed dial");
                    case 10 -> System.out.println("10. voice tags");
                    case 11 -> menu();

                }
                break;
            }
            // }
            case 2 -> {
                System.out.println("Message");
                System.out.printf("%s%n%s%n%s%n%s%n%s%n%s%n%s%n%s%n%s%n%s%n%s%n", "1.Write a message", "2.Inbox", "3.Outbox", "4.Picture messages",
                        "5.Template", "6.Smiley", "7.Message settings", "8.Info service", "9.Voice mailbox number"
                        , "10.Service command editor", "11.Back");
                System.out.println("choose an option");
                userInput = input.nextInt();
                switch (userInput) {
                    case 1 -> {
                        System.out.println("1. Write a message");
                    }
                    case 2 -> {
                        System.out.println("2.Inbox");
                    }
                    case 3 -> {
                        System.out.println("3.Outbox");
                    }
                    case 4 -> {
                        System.out.println("4.Picture messages");
                    }
                    case 5 -> {
                        System.out.println("5.Templates");
                    }
                    case 6 -> {
                        System.out.println("6.Smileys");
                    }

                    case 7 -> {
                        System.out.println("7.Message settings");
                        System.out.println("1.Set1 " +
                                " 2.Common \n 3.Back");
                        System.out.println("choose an option to continue");
                        userInput = input.nextInt();
                        switch (userInput) {
                            case 1 -> {
                                System.out.println("1. set 1");
                                System.out.printf("%s%n%s%n%s%n%s%n","1 Message centre","2 Messages sent as","3 Message validity","4 Back");
                                userInput = input.nextInt();
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
                                case 4 -> set();
                            }
                            }
                        }
                        switch (userInput) {
                            case 2 -> {
                                System.out.println("2.Common");
                                System.out.printf("%s%n%s%n%s%n%s%n","1.Delivery report","2.Reply via same centre","3.Character support","4 Back");
                                userInput = input.nextInt();
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
                                    case 4 -> set();
                                }
                            }
                            case 3 -> Messages();
                        }
                    }


                    case 8 -> {
                        System.out.println("8.Info service");
                    }
                    case 9 -> {
                        System.out.println("9.Voice mailbox number");
                    }
                    case 10 -> {
                        System.out.println("10.Service command editor");
                    }
                    case 11 -> menu();
                }
            }
            case 3 -> {
                System.out.println(" Chat");
            }

            case 4 -> {
                System.out.println("Call register");
                System.out.printf("%s%n%s%n%s%n%s%n%s%n%s%n%s%n%s%n%s%n", "1.Missed calls.", "2.Received call", "3.Dialled numbers", "4.Erase recent call list", "5.Show call duration",
                        "6.Show call cost", "7.Call cost setting", "8.Prepared credit", "9.Back");
                System.out.println("choose an option to continue");
                userInput = input.nextInt();
                switch (userInput) {
                    case 1 -> {
                        System.out.println("1.Missed calls");
                    }
                    case 2 -> {
                        System.out.println("2.Received calls");
                    }
                    case 3 -> {
                        System.out.println("3.Dialled numbers");
                    }
                    case 4 -> {
                        System.out.println("4.Erase recent call list");
                    }

                    case 5 -> {
                        System.out.println("5.Show call duration");
                        System.out.printf("%s%n%s%n%s%n%s%n%s%n%s%n","1.Last call duration","2.All call's duration","3.Reieved call's duration",
                                "4.Dialled call's duration","5.Clear timers","6.Back");
                        userInput = input.nextInt();
                        switch (userInput) {
                            case 1 -> {
                                System.out.println("1.Last call duration");
                            }
                            case 2 -> {
                                System.out.println("2.All call's duration");
                            }
                            case 3 -> {
                                System.out.println("3.Received call's duration");
                            }
                            case 4 -> {
                                System.out.println("4.Dialled call's duration");
                            }
                            case 5 -> {
                                System.out.println("5.Clear timers");
                            }
                            case 6 ->Register();
                        }
                    }
                    case 6 -> {
                        System.out.println("6.Show call cost");
                        System.out.printf("%s%n%s%n%s%n%s%n","1.Last call cost","2.All call's cost","3.Clear counters","4.Back");
                        userInput = input.nextInt();
                        switch (userInput) {
                            case 1 -> {
                                System.out.println("Last call cost");
                            }
                            case 2 -> {
                                System.out.println("All call's cost");
                            }
                            case 3 -> {
                                System.out.println("Clear counters");
                            }
                            case 4 ->Register();
                        }
                    }
                    case 7 -> {
                        System.out.println("7.Call cost settings");
                        System.out.printf("%s%n%s%n%s%n","1.Call cost limit","2.Show cost in","3.Back");
                        userInput = input.nextInt();
                        switch (userInput) {
                            case 1 -> {
                                System.out.println("Call cost limit");
                            }
                            case 2 -> {
                                System.out.println("Show cost in");
                            }
                            case 3 ->Register();
                        }
                    }
                    case 8 -> {
                        System.out.println("8.Prepaid credit");
                    }
                    case 9 -> menu();
                }
            }
            case 5 -> {
                System.out.println("Tones");
                System.out.printf("%s%n%s%n%s%n%s%n%s%n%s%n%s%n%s%n%s%n%s%n", "1.Ringing tone", "2.Ringing volume,", "3.Incoming call", "4.Composer", "5.Message alert",
                        "6.Keypad tone", "7.Warning and game tone", "8Vibrating alert.", "9.Screen saver", "10.Back");
                System.out.println("choose an option to continue");
                userInput = input.nextInt();
                switch (userInput) {
                    case 1 -> {
                        System.out.println("1.Ringing tone");
                    }
                    case 2 -> {
                        System.out.println("2.Ringing volume");
                    }
                    case 3 -> {
                        System.out.println("3.Incoming call");
                    }
                    case 4 -> {
                        System.out.println("4.Composer");
                    }
                    case 5 -> {
                        System.out.println("5.Message alert tone");
                    }
                    case 6 -> {
                        System.out.println("6.Keypad tone");
                    }
                    case 7 -> {
                        System.out.println("7.Warning and games tone");
                    }
                    case 8 -> {
                        System.out.println("8.Vibrating alert");
                    }
                    case 9 -> {
                        System.out.println("9.Screen saver");
                    }
                    case 10 -> menu();
                }
            }
            case 6 -> {
                System.out.println("Settings");
                System.out.printf("%s%n%s%n%s%n%s%n%s%n", "1.Call settings", "2.Phone settings", "3.Security settings", "4.Restore factory settings", "5.Back");
                System.out.println("choose an option to continue");
                userInput = input.nextInt();
                switch (userInput) {
                    case 1 -> {
                        System.out.println("1.Call settings");
                        System.out.printf("%s%n%s%n%s%n%s%n%s%n%s%n%s%n","1.Automatic redial","2.Speed dialling","3.Call waiting option",
                                "4.Own number sending","5.Phone line in use","6.Automatic answer","7.Back");
                        userInput = input.nextInt();
                        switch (userInput) {
                            case 1 -> {
                                System.out.println("Automatic redial");
                            }
                            case 2 -> {
                                System.out.println("Speed dialling");
                            }
                            case 3 -> {
                                System.out.println("Call waiting option");
                            }
                            case 4 -> {
                                System.out.println("Own number sending");
                            }
                            case 5 -> {
                                System.out.println("Phone line in use");
                            }
                            case 6 -> {
                                System.out.println("Automatic answer");
                            }
                            case 7 ->Setting();
                        }
                    }
                    case 2 -> {
                        System.out.println("Phone setting");
                        System.out.printf("%s%n%s%n%s%n%s%n%s%n%s%n%s%n","1.Language","2.Cell info","3.Welcome note",
                                "4.Network selection","5.Lights","6.Confirm SIM service action","7,Back");
                        userInput = input.nextInt();
                        switch (userInput) {
                            case 1 -> {
                                System.out.println("Language");
                            }
                            case 2 -> {
                                System.out.println("Cell info");
                            }
                            case 3 -> {
                                System.out.println("Welcome note");
                            }
                            case 4 -> {
                                System.out.println("Network selection");
                            }
                            case 5 -> {
                                System.out.println("Lights");
                            }
                            case 6 -> {
                                System.out.println("Confirm SIM service action");
                            }
                            case 7 ->Setting();
                        }
                    }
                    case 3 -> {
                        System.out.println("3.Security settings");
                        System.out.printf("%s%n%s%n%s%n%s%n%s%n%s%n%s%n","1.Pin code request","2.Call barring service","3.Fixed dialling",
                                "4.Closed user group","5.Phone security","6.Change access codes","7.Back");
                        userInput = input.nextInt();
                        switch (userInput) {
                            case 1 -> {
                                System.out.println("Pin code request");
                            }
                            case 2 -> {
                                System.out.println("Call barring service");
                            }
                            case 3 -> {
                                System.out.println("Fixed dialling");
                            }
                            case 4 -> {
                                System.out.println("Closed user group");
                            }
                            case 5 -> {
                                System.out.println("Phone security");
                            }
                            case 6 -> {
                                System.out.println("Change access codes");
                            }
                            case 7 ->Setting();
                        }
                    }
                    case 4 -> {
                        System.out.println("4.Restore factory settings");
                    }
                    case 5 -> menu();
                }
            }
            case 7 -> {
                System.out.println("Call divert");
            }
            case 8 -> {
                System.out.println("Games");
            }
            case 9 -> {
                System.out.println("Calculator");
            }
            case 10 -> {
                System.out.println("Reminders");
            }

            case 11 -> {
                System.out.println("Clock");
                System.out.printf("%s%n%s%n%s%n%s%n%s%n%s%n%s%n", "1.Alarm clock", "2.Clock settings", "3.Date settings", "4.Stopwatch", "5.Countdown timer.", "6.Auto update date and time", "7.Back");
                System.out.println("choose an option to continue");
                userInput = input.nextInt();
                switch (userInput) {
                    case 1 -> {
                        System.out.println("1.Alarm clock");
                    }
                    case 2 -> {
                        System.out.println("2.Clock setting");
                    }
                    case 3 -> {
                        System.out.println("3.Date setting");
                    }
                    case 4 -> {
                        System.out.println("4.Stop watch");
                    }
                    case 5 -> {
                        System.out.println("5.Countdown timer");
                    }
                    case 6 -> {
                        System.out.println("6.Auto update of time and date");
                    }
                    case 7 -> menu();
                }
            }
            case 12 -> {
                System.out.println("Profile");
            }
            case 13 -> {
                System.out.println("SIM service");
            }
            case 14 -> System.out.println("Good Bye");
        }

        //}
        // }
    }

    public static void phoneBook() {
        Scanner input = new Scanner(System.in);
        int userInput;
        System.out.println("Phone book");
        System.out.printf("%s%n%s%n%s%n%s%n%s%n%s%n%s%n%s%n%s%n%s%n%s%n", "1.Search", "2.Service Nos", "3.Add name", "4.Erase", "5.Edit", "6.Assign tone", "7.Send b,card",
                "8.Options", "9.Speed dial", "10.Voice tags", "11. Back");
        System.out.println("press a number");
        userInput = input.nextInt();
        switch (userInput) {
            case 1 -> {
                System.out.println(" 1. Search");
            }
            case 2 -> {
                System.out.println("2.Service Nos");
            }
            case 3 -> {
                System.out.println("3.Add name");
            }
            case 4 -> {
                System.out.println("4.Erase");
            }
            case 5 -> {
                System.out.println("5.Edit");
            }
            case 6 -> {
                System.out.println("6.Assign tone");
            }
            case 7 -> {
                System.out.println("7.send b'card");
            }
            case 8 -> {
                System.out.println(" 8.Options");
                System.out.println("1. Type of view" +
                        " 2. Memory Status \n 3. Back");
                System.out.println("pick an option to proceed");
                System.out.println("choose an option");
                userInput = input.nextInt();
                switch (userInput) {
                    case 1 -> System.out.println("1. Type of view");
                    case 2 -> System.out.println("2, Memory status");
                    case 3 -> phoneBook();
                }
                break;
            }
            case 9 -> System.out.println("9.Speed dial");
            case 10 -> System.out.println("10. voice tags");
            case 11 -> menu();

        }
    }

    public static void Messages() {
        Scanner input = new Scanner(System.in);
        int userInput;
        System.out.println("Message");
        System.out.printf("%s%n%s%n%s%n%s%n%s%n%s%n%s%n%s%n%s%n%s%n%s%n", "1.Write a message", "2.Inbox", "3.Outbox", "4.Picture messages",
                "5.Template", "6.Smiley", "7.Message settings", "8.Info service", "9.Voice mailbox number"
                , "10.Service command editor", "11.Back");
        System.out.println("choose an option");
        userInput = input.nextInt();
        switch (userInput) {
            case 1 -> {
                System.out.println("1. Write a message");
            }
            case 2 -> {
                System.out.println("2.Inbox");
            }
            case 3 -> {
                System.out.println("3.Outbox");
            }
            case 4 -> {
                System.out.println("4.Picture messages");
            }
            case 5 -> {
                System.out.println("5.Templates");
            }
            case 6 -> {
                System.out.println("6.Smileys");
            }

            case 7 -> {
                System.out.println("7.Message settings");
                System.out.println("1.Set1 " +
                        " 2.Common \n 3.Back");
                System.out.println("choose an option to continue");
                userInput = input.nextInt();
                switch (userInput) {
                    case 1 -> {
                        System.out.println("1. set 1");
                        System.out.println("choose an option to continue");
                        userInput = input.nextInt();
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

                userInput = input.nextInt();
                switch (userInput) {
                    case 2 -> {
                        System.out.println("2.Common");
                        System.out.println("choose an option to continue");
                        userInput = input.nextInt();
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


                    case 3 -> Messages();
                }
            }
        }
    }

public static void set () {
        Scanner input = new Scanner(System.in);
        int userInput;
    System.out.println("7.Message settings");
    System.out.println("1.Set1 " +
            " 2.Common \n 3.Back");
    System.out.println("choose an option to continue");
    userInput = input.nextInt();
    switch (userInput) {
        case 1 -> {
            System.out.println("1. set 1");
            System.out.printf("%s%n%s%n%s%n%s%n","1 Message centre","2 Messages sent as","3 Message validity","4 Back");
            userInput = input.nextInt();
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
                case 4 -> set();
            }
        }
    }
    switch (userInput) {
        case 2 -> {
            System.out.println("2.Common");
            System.out.printf("%s%n%s%n%s%n%s%n","1.Delivery report","2.Reply via same centre","3.Character support","4 Back");
            userInput = input.nextInt();
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
                case 4 -> set();
            }
        }
        case 3 -> Messages();
    }
}
public  static void Register(){
        Scanner input =new Scanner(System.in);
      int  userInput ;
    System.out.println("Call register");
    System.out.printf("%s%n%s%n%s%n%s%n%s%n%s%n%s%n%s%n%s%n", "1.Missed calls.", "2.Received call", "3.Dialled numbers", "4.Erase recent call list", "5.Show call duration",
            "6.Show call cost", "7.Call cost setting", "8.Prepared credit", "9.Back");
    System.out.println("choose an option to continue");
    userInput = input.nextInt();
    switch (userInput) {
        case 1 -> {
            System.out.println("1.Missed calls");
        }
        case 2 -> {
            System.out.println("2.Received calls");
        }
        case 3 -> {
            System.out.println("3.Dialled numbers");
        }
        case 4 -> {
            System.out.println("4.Erase recent call list");
        }

        case 5 -> {
            System.out.println("5.Show call duration");
            System.out.printf("%s%n%s%n%s%n%s%n%s%n%s%n","1.Last call duration","2.All call's duration","3.Reieved call's duration",
                    "4.Dialled call's duration","5.Clear timers","6.Back");
            userInput = input.nextInt();
            switch (userInput) {
                case 1 -> {
                    System.out.println("1.Last call duration");
                }
                case 2 -> {
                    System.out.println("2.All call's duration");
                }
                case 3 -> {
                    System.out.println("3.Received call's duration");
                }
                case 4 -> {
                    System.out.println("4.Dialled call's duration");
                }
                case 5 -> {
                    System.out.println("5.Clear timers");
                }
                case 6 ->Register();
            }
        }
        case 6 -> {
            System.out.println("6.Show call cost");
            System.out.printf("%s%n%s%n%s%n%s%n","1.Last call cost","2.All call's cost","3.Clear counters","4.Back");
            userInput = input.nextInt();
            switch (userInput) {
                case 1 -> {
                    System.out.println("Last call cost");
                }
                case 2 -> {
                    System.out.println("All call's cost");
                }
                case 3 -> {
                    System.out.println("Clear counters");
                }
                case 4 ->Register();
            }
        }
        case 7 -> {
            System.out.println("7.Call cost settings");
            System.out.printf("%s%n%s%n%s%n","1.Call cost limit","2.Show cost in","3.Back");
            userInput = input.nextInt();
            switch (userInput) {
                case 1 -> {
                    System.out.println("Call cost limit");
                }
                case 2 -> {
                    System.out.println("Show cost in");
                }
                case 3 ->Register();
            }
        }
        case 8 -> {
            System.out.println("8.Prepaid credit");
        }
        case 9 -> menu();
    }
}
public static void Setting(){
        Scanner input = new Scanner(System.in);
        int userInput;
    System.out.println("Settings");
    System.out.printf("%s%n%s%n%s%n%s%n%s%n", "1.Call settings", "2.Phone settings", "3.Security settings", "4.Restore factory settings", "5.Back");
    System.out.println("choose an option to continue");
    userInput = input.nextInt();
    switch (userInput) {
        case 1 -> {
            System.out.println("1.Call settings");
            System.out.printf("%s%n%s%n%s%n%s%n%s%n%s%n%s%n","1.Automatic redial","2.Speed dialling","3.Call waiting option",
                    "4.Own number sending","5.Phone line in use","6.Automatic answer","7.Back");
            userInput = input.nextInt();
            switch (userInput) {
                case 1 -> {
                    System.out.println("Automatic redial");
                }
                case 2 -> {
                    System.out.println("Speed dialling");
                }
                case 3 -> {
                    System.out.println("Call waiting option");
                }
                case 4 -> {
                    System.out.println("Own number sending");
                }
                case 5 -> {
                    System.out.println("Phone line in use");
                }
                case 6 -> {
                    System.out.println("Automatic answer");
                }
                case 7 ->Setting();
            }
        }
        case 2 -> {
            System.out.println("Phone setting");
            System.out.printf("%s%n%s%n%s%n%s%n%s%n%s%n%s%n","1.Language","2.Cell info","3.Welcome note",
                    "4.Network selection","5.Lights","6.Confirm SIM service action","7,Back");
            userInput = input.nextInt();
            switch (userInput) {
                case 1 -> {
                    System.out.println("Language");
                }
                case 2 -> {
                    System.out.println("Cell info");
                }
                case 3 -> {
                    System.out.println("Welcome note");
                }
                case 4 -> {
                    System.out.println("Network selection");
                }
                case 5 -> {
                    System.out.println("Lights");
                }
                case 6 -> {
                    System.out.println("Confirm SIM service action");
                }
                case 7 ->Setting();
            }
        }
        case 3 -> {
            System.out.println("3.Security settings");
            System.out.printf("%s%n%s%n%s%n%s%n%s%n%s%n%s%n","1.Pin code request","2.Call barring service","3.Fixed dialling",
                    "4.Closed user group","5.Phone security","6.Change access codes","7.Back");
            userInput = input.nextInt();
            switch (userInput) {
                case 1 -> {
                    System.out.println("Pin code request");
                }
                case 2 -> {
                    System.out.println("Call barring service");
                }
                case 3 -> {
                    System.out.println("Fixed dialling");
                }
                case 4 -> {
                    System.out.println("Closed user group");
                }
                case 5 -> {
                    System.out.println("Phone security");
                }
                case 6 -> {
                    System.out.println("Change access codes");
                }
                case 7 ->Setting();
            }
        }
        case 4 -> {
            System.out.println("4.Restore factory settings");
        }
        case 5 -> menu();
    }
}
}

//}


//}

