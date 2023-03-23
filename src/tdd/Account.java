package tdd;

public class Account {
    private int balance;
    private int collect;

    public void deposit(int amount) {
        if (amount == -2_000) {
            amount = 0;
        }

        if (amount < 0) {
            amount = 0;
        }
        balance = balance + amount;
    }

    public int getBalance() {
        return balance;
    }


    public void getWithdrawal(int amt) {
       collect = amt;
        }


    public int withdraw() {
        if(collect < 1){
            return balance;
        }
        else if(collect > balance){
            return  balance;
        }
        if (balance > collect){
            return balance - collect;
        }
        else{
            return 0;
        }
    }
}

