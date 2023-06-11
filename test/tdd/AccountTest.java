package tdd;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class AccountTest {
    @Test
    public void depositMoneyTest(){

       //given
       Account davidAccount = new Account();

       //when
        davidAccount.deposit(2_000);

        //assert

        int balance = davidAccount.getBalance();
        assertEquals(2_000, balance);

    }

    @Test
    public void depositTwiceTest(){
        //given
    Account davidAccount = new Account();
       //when
    davidAccount.deposit(2_000);
    davidAccount.deposit(2_000);
       //assert
    int balance = davidAccount.getBalance();
    assertEquals(4_000, balance);

    }

   @Test
    public void depositNegativeValueTest(){
        //given
     Account davidAccount = new Account();
        //when
     davidAccount.deposit(-2_000);
        //assert
     int balance = davidAccount.getBalance();
     assertEquals(0, balance);

   }

    @Test
    public void depositNegativeValueTest2(){
            Account davidAccount = new Account();
            //when
            davidAccount.deposit(-4_000);
            //assert
            int balance = davidAccount.getBalance();
            assertEquals(0, balance);

        }

@Test
    public void withdrawMoneyTest(){
        Account davidAccount = new Account();
       davidAccount.deposit(5_000);
       davidAccount.getWithdrawal(3_000);
      assertEquals(2_000, davidAccount.withdraw());

    }

    @Test
    public void withdrawMoneyTest2(){
    Account davidAccount = new Account();
    davidAccount.deposit(5000);
    davidAccount.getWithdrawal(6000);
    assertEquals(5000, davidAccount.withdraw());
    }

@Test
  public void withdrawMoneyTest3(){
   Account davidAccount = new Account ();
   davidAccount.deposit(5000);
   davidAccount.getWithdrawal(-5000);
   davidAccount.withdraw();
  assertEquals(5000, davidAccount.withdraw());
}




}