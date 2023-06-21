package my_phone;

import java.util.*;

public class Contacts {
    String name;

    public Contacts(String name, String phoneNumber, String email) {
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.email = email;
    }

    String phoneNumber;
    String email;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }



//    public Contacts(String name, String phoneNumber, String email) {
//        this.name = name;
//        this.phoneNumber = phoneNumber;
//        this.email = email;
//    }



}
