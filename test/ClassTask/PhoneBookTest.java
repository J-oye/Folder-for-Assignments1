package ClassTask;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PhoneBookTest {
    @Test public void checkIfPhoneBookIsLocked(){
        PhoneBook myPhoneBook = new PhoneBook();
       // myPhoneBook.isLocked();
        assertTrue(myPhoneBook.isLocked());
    }
    @Test public void  checkIfICanUnlockPhoneBook(){
        PhoneBook myPhoneBook = new PhoneBook();
        myPhoneBook.setPassword("1234");
        myPhoneBook.unlockedWith("1491");
        //assertEquals(,myPhoneBook.getPassword());


    }

}