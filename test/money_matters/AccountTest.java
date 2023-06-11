package money_matters;

import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.*;

class AccountTest {
    @Test
    public void depositMoneyTest(){
        Account joshAccount = new Account("5664");
        joshAccount.deposit(2_000);
        int balance = joshAccount.checkBalance("5664");
        assertEquals(2_000, balance);

    }

    @Test
    public void depositTwiceTest(){
        Account davidAccount = new Account("9876");
        davidAccount.deposit(2_000);
        davidAccount.deposit(2_000);
        int balance = davidAccount.checkBalance("9876");
        assertEquals(4_000,balance);

    }

    @Test
    public void depositNegativeValueTest(){
        Account davidAccount = new Account("6787");
        davidAccount.deposit(-2_000);
        int balance = davidAccount.checkBalance("6787");
        assertEquals(0, balance);

    }

    @Test
    public void depositNegativeValueTest2(){
        Account davidAccount = new Account("5555");
        davidAccount.deposit(-4_000);
        int balance = davidAccount.checkBalance("5555");
        assertEquals(0,balance);

    }

    @Test
    public void withdrawMoneyTest(){
        Account davidAccount = new Account("1234");
        davidAccount.deposit(5_000);
        davidAccount.withdraw(3_000);
        assertEquals(2_000, davidAccount.checkBalance("1234"));

    }

    @Test
    public void withdrawMoneyTest2(){
        Account davidAccount =  new Account("2223");
        davidAccount.deposit(5000);
        davidAccount.withdraw(6000);
        assertEquals(5000, davidAccount.checkBalance("2223"));
    }

    @Test
    public void withdrawMoneyTest3(){
        Account davidAccount = new Account("7690");
        davidAccount.deposit(5000);
        davidAccount.withdraw(-3000);
        assertEquals(5000, davidAccount.checkBalance("7690"));
    }

}