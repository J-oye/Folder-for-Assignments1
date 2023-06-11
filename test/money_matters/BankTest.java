package money_matters;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BankTest {
    Bank gtBank = new Bank();
@Test
    public void testForBank(){

    assertNotNull(gtBank);
}
@Test
    public void checkThatICanRegisterANewUser(){
    Bank gtBank = new Bank();
    gtBank.registerNewUser("john","jonny@gmail.com","08087469087");
    Account account1 = new Account("john","jas@gmail.com","08145114");
    assertTrue(true);
}

@Test
    public void testThatICanRegisterCustomer(){
    gtBank.registerNewUser("john","jonny@gmail.com","08087469087");
    gtBank.registerNewUser("john","jonny@gmail.com","08087469087");
    assertEquals(2, gtBank.getSizeOfAccount());
}
@Test
    public void checkIfUserCanDeposit(){
    gtBank.registerNewUser("john","jonny@gmail.com","08087469087");
    gtBank.accountNumber("81865644780");
    gtBank.deposit("accountNumber",  3000);
     assertEquals(5000,gtBank.checkBalance("134"));
}
@Test
    public void checkIfUserCanWithDraw(){
    Bank gtBank = new Bank();
    Account account1 = new Account("134");
    account1.deposit(6000);
    account1.withdraw(3000);
    //gtBank.deposit("09782367",5000);
    //gtBank.withdraw("accountNumber",2000,2222);
    assertEquals(3000,account1.checkBalance("134"));
}
}