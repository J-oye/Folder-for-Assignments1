package my_phone;

import java.util.ArrayList;
import java.util.List;

public class PhoneBook {
    List<Contacts> contact = new ArrayList<>();




    public void createNewContact() {
        Contacts contactJosh = new Contacts("josh","09087634512","Jayz@gmail.com");
        contact.add(contactJosh);
        Contacts contactJoe = new Contacts("josh","09087634512","Jayz@gmail.com");
        contact.add(contactJoe);
        Contacts contactJay = new Contacts("josh","09087634512","Jayz@gmail.com");
        contact.add(contactJay);

    }

    public void deleteContact() {
        Contacts contactJosh = new Contacts("josh","09087634512","Jayz@gmail.com");
        contact.add(contactJosh);
        Contacts contactJoe = new Contacts("josh","09087634512","Jayz@gmail.com");
        contact.add(contactJoe);
        contact.remove(contactJoe);
    }

    public Contacts  searchContact() {
        Contacts contactJosh = new Contacts("josh","09087634512","Jayz@gmail.com");
        contact.add(contactJosh);
        Contacts contactJoe = new Contacts("josh","09087634512","Jayz@gmail.com");
        contact.add(contactJoe);
        Contacts contactJay = new Contacts("josh","09087634512","Jayz@gmail.com");
        contact.add(contactJay);
        for (Contacts mycontact : contact) {
            System.out.println(mycontact);
        }
        return searchContact() ;
    }
}
