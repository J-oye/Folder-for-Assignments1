package ClassTask;

public class PhoneBook {
    private boolean isLocked = true;

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
   }

    private  String password;
    public boolean isLocked() {
        return isLocked;
    }

    public String unlockedWith(String password) {
        if(password ==password)isLocked = true;
        return password;
    }
}
