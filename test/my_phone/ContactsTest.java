package my_phone;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ContactsTest {
    @Test
    public void checkThatI_can_Set_Contact_Name(){
        Contacts myContacts = new Contacts("josh","09087634512","Jayz@gmail.com");
        myContacts.setName("josh");
        assertEquals("josh",myContacts.getName());
    }
    @Test public void checkThatICanSetPhoneNumber(){
        Contacts myContacts = new Contacts("josh","09087634512","Jayz@gmail.com");
        myContacts.setPhoneNumber("09087634512");
        assertEquals("09087634512",myContacts.getPhoneNumber());
    }
    @Test public void checkThatICanSetEmail(){
        Contacts myContacts = new Contacts("josh","09087634512","Jayz@gmail.com");
        myContacts.setEmail("Jayz@gmail.com");
        assertEquals("Jayz@gmail.com",myContacts.getEmail());
    }


}