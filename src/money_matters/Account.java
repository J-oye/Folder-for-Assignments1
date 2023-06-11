package money_matters;

public class Account {

    private int balance;

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    private String phoneNumber;

    public Account(String name, String email, String phoneNumber) {


    }


    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    private String accountNumber;

    private String pin;

    public Account(String pin) {
        this.pin = pin;
      //  this.accountNumber = accountNumber;
    }


    public void deposit(int amount) {
        if (amount < 0);
        else balance = balance + amount;
    }

    public int checkBalance(String pin) {
        if (this.pin!= pin){
            System.out.println("invalid pin");
        } else if (this.pin == pin) {return balance;}
       return balance;
    }

    public void withdraw(int amount) {

        if (amount <= 0 ) balance = balance;
        else if (amount > balance) balance = balance;
        else balance =  balance - amount;





        }
    }
