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
    gtBank.createNewUser("john","jonny@gmail.com","08087469087");
    Account account1 = new Account("john","jas@gmail.com","08145114");
    assertTrue(true);
}

@Test
    public void testThatICanRegisterCustomer(){
    gtBank.createNewUser("john","jonny@gmail.com","08087469087");
    gtBank.createNewUser("john","jonny@gmail.com","08087469087");
    assertEquals(2, gtBank.getSizeOfAccount());
}
@Test
    public void checkIfUserCanDeposit(){
    gtBank.createNewUser("john","jonny@gmail.com","08087469087");
    gtBank.accountNumber("08087469087");
    gtBank.deposit("8087469087",  5000);
    gtBank.setPin("8087469087","1234");
    gtBank.withdraw("8087469087",2000,"2222");
     assertEquals(3000,gtBank.checkBalance("8087469087","1234"));
}
@Test
  public void checkIfUserCanWithDraw(){
    gtBank.createNewUser("john","jonny@gmail.com","08087469087");
    gtBank.deposit("8087469087",5000);
    gtBank.setPin("8087469087","2222");
    gtBank.withdraw("8087469087",2000,"2222");
    assertEquals(3000,gtBank.checkBalance("8087469087","2222"));
}
//@Test
//    public void checkThatUserCanTransferToAnotherAccount(){
//    gtBank.registerNewUser("john","jonny@gmail.com","08087469087");
//    gtBank.deposit("8087469087",5000);
//    gtBank.setPin("8087469087","2222");
//    gtBank.setSenderAccountNumber("8087469087","8087469087");
//    gtBank.transfer("8087469087","9087469080",2000,"2222");
//    assertEquals(3000,gtBank.checkBalance("7087469087","2222"));
//
//}
}