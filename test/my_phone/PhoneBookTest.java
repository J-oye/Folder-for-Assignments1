package my_phone;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

class PhoneBookTest {
    @Test
    public void checkThatI_can_Create_New_Contact(){
        PhoneBook infinix= new PhoneBook();
        infinix.createNewContact();
        Contacts contactJosh = new Contacts("josh","09087634512","Jayz@gmail.com");
        assertTrue(true);
    }
    @Test
    public void checkThatICanAddManyContacts(){
        PhoneBook infinix= new PhoneBook();
        infinix.createNewContact();
        Contacts contactJosh = new Contacts("josh","09087634512","Jayz@gmail.com");
        Contacts contactJoe = new Contacts("josh","09087634512","Jayz@gmail.com");
        Contacts contactJay = new Contacts("josh","09087634512","Jayz@gmail.com");
        assertEquals(3,infinix.contact.size());
    }

    @Test
    public void checkThatICanDeleteContact(){
        PhoneBook infinix= new PhoneBook();
        Contacts contactJosh = new Contacts("josh","09087634512","Jayz@gmail.com");
        Contacts contactJoe = new Contacts("josh","09087634512","Jayz@gmail.com");
        infinix.deleteContact();
        assertEquals(1,infinix.contact.size());
    }

    @Test public void checkThatICanSearchForContacts(){
        PhoneBook infinix= new PhoneBook();
        Contacts contactJosh = new Contacts("josh","09087634512","Jayz@gmail.com");
        Contacts contactJoe = new Contacts("josh","09087634512","Jayz@gmail.com");
        Contacts contactJay = new Contacts("josh","09087634512","Jayz@gmail.com");
        infinix.searchContact();
        assertEquals(3,infinix.searchContact());

    }

}