package money_matters;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.*;

class AccountTest {
    Account joshAccount;
    @BeforeEach public  void confirmAccount(){
        joshAccount = new Account("josh","jay@gmail.com","0908754335");
    }
    @Test
    public void depositMoneyTest(){
        joshAccount.deposit(2_000);
        joshAccount.setPin("5664");
        int balance = joshAccount.checkBalance("5664");
        assertEquals(2_000, balance);

    }

    @Test
    public void depositTwiceTest(){
       // Account joshAccount = new Account("9876");
        joshAccount.deposit(2_000);
        joshAccount.deposit(2_000);
        joshAccount.setPin("9876");
        int balance = joshAccount.checkBalance("9876");
        assertEquals(4_000,balance);

    }

    @Test
    public void depositNegativeValueTest(){
        //Account joshAccount = new Account("6787");
        joshAccount.deposit(-2_000);
        joshAccount.setPin("6787");
        int balance = joshAccount.checkBalance("6787");
        assertEquals(0, balance);

    }

    @Test
    public void depositNegativeValueTest2(){
        //Account joshAccount = new Account("5555");
        joshAccount.deposit(-4_000);
        joshAccount.setPin("5555");
        int balance = joshAccount.checkBalance("5555");
        assertEquals(0,balance);

    }

    @Test
    public void withdrawMoneyTest(){
        //Account joshAccount = new Account("1234");
        joshAccount.deposit(5_000);
        joshAccount.setPin("1234");
        joshAccount.withdraw(3000,"1234");
        assertEquals(2_000, joshAccount.checkBalance("1234"));

    }

    @Test
    public void withdrawMoneyTest2(){
        //Account joshAccount =  new Account("2223");
        joshAccount.deposit(5000);
        joshAccount.setPin("2223");
        joshAccount.withdraw(6000,"2223");
        assertEquals(5000, joshAccount.checkBalance("2223"));
    }

    @Test
    public void withdrawMoneyTest3(){
        //Account joshAccount = new Account("7690");
        joshAccount.deposit(5000);
        joshAccount.setPin("7690");
        joshAccount.withdraw(-3000,"7690");
        assertEquals(5000, joshAccount.checkBalance("7690"));
    }

}