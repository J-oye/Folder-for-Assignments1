//package money_matters;
//
//import java.util.ArrayList;
//import java.util.List;
//import java.util.Objects;
//
//public class Bank {
//
//    List<Account> account = new ArrayList<>();
//
//    public void registerNewUser(String name, String email, String phoneNumber) {
//        Account account1 = new Account(name, email, phoneNumber);
//        account1.setAccountNumber(phoneNumber);
//        account.add(account1);
//    }
//     public String accountNumber(String phoneNumber) {
//         if (phoneNumber.startsWith("0")) {
//             return phoneNumber.substring(1);
//
//         } else {
//             return phoneNumber;
//         }
//     }
//
//    public void deposit(String accountNumber, int amount) {
//       for (Account ac :account)
//           if(accountNumber==accountNumber){
//               ac.deposit(amount);
//           }
//
//       // Account account1 = new Account("134");
//        //account1.deposit(5000);
//        //if(amount < 0){amount=0;}
//        //balance = balance + amount;
//
//
//        //return balance;
//    }
//
//    public int getSizeOfAccount() {
//        return account.size();
//    }
//
//    public int checkBalance(String accountNumber,String pin) {
//        for (Account acc: account){
//            if (acc.checkBalance()==accountNumber){
//                return acc.checkBalance(pin);
//            }
//        }
//        return checkBalance();
//
//    }
//
//    private int checkBalance() {
//        return checkBalance();
//    }
//
//    //
////    public int withdraw(String accountNumber, int amount, int pin) {
////        Account account1 = new Account("134");
////        account1.withdraw(3000);
////        // if (Objects.equals(this.accountNumber, accountNumber));
////        // if(amount>0)  balance -= amount;
//////        return balance;
//////    }
//
//
//
//}
