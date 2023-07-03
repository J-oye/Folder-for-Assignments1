package my_phone;

import org.junit.jupiter.api.Test;

import java.util.List;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

class PhoneBookTest {
    @Test
    public void checkThatI_can_Create_New_Contact(){
        PhoneBook infinix= new PhoneBook();
        infinix.createNewContact("josh","09087634512","Jayz@gmail.com");

        assertEquals(1,infinix.contactSize());
    }
    @Test
  public void checkThatICanAddManyContacts(){
      PhoneBook infinix= new PhoneBook();
      infinix.createNewContact("josh","09087634512","Jayz@gmail.com");
      infinix.createNewContact("jos","09087634512","Jayz@gmail.com");
      infinix.createNewContact("joh","09087634512","Jayz@gmail.com");

      assertEquals(3,infinix.contactSize());
   }

  @Test
   public void checkThatICanDeleteContact(){
      PhoneBook infinix= new PhoneBook();
      infinix.createNewContact("josh","09087634512","Jayz@gmail.com");
      infinix.createNewContact("jos","09087634512","Jayz@gmail.com");
      infinix.createNewContact("joh","09087634512","Jayz@gmail.com");
      infinix.deleteContact("joh");
        assertEquals(2,infinix.contactSize());
    }

    @Test public void checkThatICanSearchForContacts(){
       PhoneBook infinix= new PhoneBook();
        infinix.createNewContact("josh","09087634512","Jayz@gmail.com");
        infinix.createNewContact("jos","09087634512","Jayz@gmail.com");
        infinix.createNewContact("joshi","09087634512","Jayz@gmail.com");
        infinix.searchContactByName("josh");
//        assertEquals("josh 09087634512  Jayz@gmail.com",infinix.searchContactByName("josh"));

    }

}