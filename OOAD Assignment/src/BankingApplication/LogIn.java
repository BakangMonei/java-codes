package BankingApplication;


// Methods() created: viewPin
public abstract class LogIn {
    // Attributes
    protected static int Pin;

    // Constructors
    public LogIn() {
    }

    // Setters
    public static void setPin(int pin) {
        Pin = pin;
    }

    // Getters
    public static int getPin() {
        return Pin;
    }
    public static int viewPin(){
        return Pin;
    }

    // toString()
    @Override
    public String toString() {
        return "LogIn[  ]";
    }
}
