package money_matters;

import java.util.ArrayList;
import java.util.List;

public class Bank {
    private int balance;


    List<Account> account = new ArrayList<>();

    public void createNewUser(String name, String email, String phoneNumber) {
        Account account1 = new Account(name, email, phoneNumber);
        account1.setAccountNumber(accountNumber(phoneNumber));
        System.out.println("your account number is " + accountNumber(phoneNumber));
        account.add(account1);
    }
     public String accountNumber(String phoneNumber) {
         if (phoneNumber.startsWith("0")) {
             return phoneNumber.substring(1);

         } else {
             return phoneNumber;
         }
     }

    public void deposit(String accountNumber, int amount) {
       for (Account ac :account)
           if(ac.getAccountNumber().equals(accountNumber)){
               ac.deposit(amount);
           }
    }

    public int getSizeOfAccount() {
        return account.size();
    }


    public int checkBalance(String accountNumber,String pin) {
        for (Account acc : account){
            if (acc.getAccountNumber().equals(accountNumber)&& acc.getPin().equals(pin)){
                 balance= acc.getBalance();}
            System.out.println(balance);
        }
        return balance;
    }

    public void setPin(String accountNumber, String pin){
        for (Account acc : account){
            if (acc.getAccountNumber().equals(accountNumber)){acc.setPin(pin);}
        }

    }

    public int withdraw(String accountNumber, int amount, String pin) {
       for (Account acc : account){
           if (acc.getAccountNumber().equals(accountNumber) && acc.getPin().equals(pin)){
               acc.withdraw(amount, pin);
           }
       }
        return balance;
   }

   public  void setSenderAccountNumber(String accountNumber ,String senderAccountNumber){
        for (Account acc : account){
            if (acc.getAccountNumber().equals(accountNumber)){acc.setSenderAccountNumber(senderAccountNumber);}
        }
   }


    public void transfer(String senderAccountNumber, String receiverAccountNumber, int amount,String pin) {
        for (Account acc: account){
            if (acc.getSenderAccountNumber().equals(senderAccountNumber)&& acc.getReceiverAccountNumber().equals(receiverAccountNumber)){

                acc.withdraw(amount,pin);
            }
        }
    }
}
