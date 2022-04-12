package Code;

import java.util.Objects;

public abstract class User {
    // Attributes
    private String userName;
    private String Password;
    //Constructors
    public User(String userName, String password) {
        this.userName = userName;
        Password = password;
    }
    //Getters
    public String getUserName() {
        return userName;
    }
    public String getPassword() {
        return Password;
    }
    // Setters
    public void setUserName(String userName) {
        this.userName = userName;
    }
    public void setPassword(String password) {
        Password = password;
    }
    // toString() Methods
    @Override
    public String toString() {
        return "User==> " +
                "userName='" + userName + "*" +
                ", Password='" + Password + "*" ;
    }
    // hashCodes() and equals()\
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof User)) return false;
        User user = (User) o;
        return getUserName().equals(user.getUserName()) && getPassword().equals(user.getPassword());
    }
    @Override
    public int hashCode() {
        return Objects.hash(getUserName(), getPassword());
    }
}
