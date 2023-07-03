package money_matters;

public class Account {

    private int balance;
    private String name;
    private String email;
    private String accountNumber;
    private String phoneNumber;
    private String pin;
    private String senderAccountNumber;
    private String receiverAccountNumber;

    public Account(String name, String email, String phoneNumber) {
        this.name = name;
        this.email = email;
        this.phoneNumber = phoneNumber;


    }


    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }



    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getPin() {
        return pin;
    }

    public void setPin(String pin) {
        this.pin = pin;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getBalance() {
        return balance;
    }

    private void setBalance(int balance) {
        this.balance = balance;
    }


    public String getSenderAccountNumber() {
        return senderAccountNumber;
    }

    public void setSenderAccountNumber(String senderAccountNumber) {
        this.senderAccountNumber = senderAccountNumber;
    }

    public String getReceiverAccountNumber() {
        return receiverAccountNumber;
    }

    public void setReceiverAccountNumber(String receiverAccountNumber) {
        this.receiverAccountNumber = receiverAccountNumber;
    }

    public double deposit(int amount) {
        if (amount > 0){
            balance +=amount;
        }
        else System.out.println("invalid amount");
        return balance;
    }

    public int checkBalance(String pin) {
        if (this.pin.equals(pin)){return balance;
        } else System.out.println("invalid pin");
       return balance;
    }

    public double withdraw(int amount, String pin) {
        if (amount > 0 && amount < balance  && this.pin.equals(pin)){
            balance -= amount;
        }
        return balance;
        }


}
