package ATM_Machine;

public class Account
{
    private int accountNumber;
    private int pin;
    private double availableBalance;
    private double totalBalance;
    private int admin;
    private String username;

    // Account constructor initializes attributes
    public Account(String Username, int theAccountNumber, int thePIN,
                   double theAvailableBalance, double theTotalBalance, int isadmin)
    {
        setUsername(Username);
        setAccountNumber(theAccountNumber);
        setPin(thePIN);
        setAvailableBalance(theAvailableBalance);
        setTotalBalance(theTotalBalance);
        setAdmin(isadmin);
    }
    // determines whether a user-specified PIN matches PIN in Account
    public boolean validatePIN(int userPIN)
    {
        if (userPIN == getPin())
            return true;
        else
            return false;
    }

    // returns available balance
    public double getAvailableBalance()
    {
        return availableBalance;
    }
    // returns the total balance
    public double getTotalBalance()
    {
        return totalBalance;
    }
    // credits an amount to the account
    public void credit(double amount)
    {
        setTotalBalance(getTotalBalance() + amount);
    }
    // debits an amount from the account
    public void debit(double amount)
    {
        setAvailableBalance(getAvailableBalance() - amount);
        setTotalBalance(getTotalBalance() - amount);
    }

    // returns account number
    public int getAccountNumber()
    {
        return accountNumber;
    }
    public int getISadmin()
    {
        return getAdmin();
    }
    public int GetPin(){
        return getPin();
    }
    public String getUsername() {
        return username;
    }
    public void setUsername(String username) {
        this.username = username;
    }
    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }
    public int getPin() {
        return pin;
    }
    public void setPin(int pin) {
        this.pin = pin;
    }
    public void setAvailableBalance(double availableBalance) {
        this.availableBalance = availableBalance;
    }
    public void setTotalBalance(double totalBalance) {
        this.totalBalance = totalBalance;
    }
    public int getAdmin() {
        return admin;
    }
    public void setAdmin(int admin) {
        this.admin = admin;
    }
}

class AccountFactory extends Account {

    public AccountFactory(String Username, int theAccountNumber, int thePIN, double theAvailableBalance,
                          double theTotalBalance, int isadmin) {
        super(Username, theAccountNumber, thePIN, theAvailableBalance, theTotalBalance, isadmin);
        setUsername(Username);
        setAccountNumber(theAccountNumber);
        setPin(thePIN);
        setAvailableBalance(theAvailableBalance);
        setTotalBalance(theTotalBalance);
        setAdmin(isadmin);
    }
}
