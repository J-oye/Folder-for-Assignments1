package ClassTask;

import java.util.ArrayList;
import java.util.List;

public class PhoneBooks {
    List<PhoneBook>myPhoneBook = new ArrayList<>();
    public void createNewPhoneBook(String userName,String password) {
        PhoneBook phoneBook = new PhoneBook();
        myPhoneBook.add(phoneBook);
    }
    public int phoneBooksSize(){
        return myPhoneBook.size();
    }


}
