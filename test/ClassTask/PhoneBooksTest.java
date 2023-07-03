package ClassTask;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PhoneBooksTest {
    @Test public  void  checkIfICanCreateNewPhoneBook(){
        PhoneBooks phoneBook = new PhoneBooks();
        phoneBook.createNewPhoneBook("josh","14552");
        assertEquals(1,phoneBook.phoneBooksSize());
    }

}