package my_phone;

import java.util.ArrayList;
import java.util.List;

public class PhoneBook {

    private List<Contacts> contact = new ArrayList<>();


    public void createNewContact(String name, String phoneNumber, String email) {
        Contacts contactJosh = new Contacts(name, phoneNumber, email);
        contact.add(contactJosh);
    }

    public int contactSize() {
        return contact.size();
    }

    public void deleteContact(String name) {
        for (Contacts myContact : contact) {
            if (myContact.getName().equals(name)){
                contact.remove(myContact);
                System.out.println("successful");
                break;
            }
            //contact.remove(myContact);
        }
    }


//    public  Object searchContact() {
//        for (Contacts myContact : contact) {
//            System.out.println(myContact);
//            break;
//        //for (Contacts name : contact):
//        //Contacts contacts = contact.get(contact)
//        }
//
//        //return searchContact();
//         return contact;
//    }

        public void searchContactByName(String name){
           String input = null;
            for (Contacts myContact : contact) {
                if (myContact.getName().equals(name)){ input = myContact.toString();
//                System.out.println(input);
                }
                System.out.println(input);
            }
//            return input;
        }
    }
