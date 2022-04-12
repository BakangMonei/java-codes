package atmapplication;

public class Account<ResultSet> {
    private ResultSet resultSet;
    static String toString = null;
    Controller controller = new Controller();

    private int accountNumber;
    private String accountType;
    private double accountBalance;
    private String[] transactionList;



    public Account(int accountNumber, String accountType, double accountBalance, String[] transactionList) {
        this.accountNumber = accountNumber;
        this.accountType = accountType;
        this.accountBalance = accountBalance;
        this.transactionList = transactionList;
    }

    public Account(int accountBalance) {
    }

    public Account() {

    }

    //Setters
    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }
    public void setAccountType(String accountType) {
        this.accountType = accountType;
    }
    public void setAccountBalance(double accountBalance) {
        this.accountBalance = accountBalance;
    }
    public void setTransactionList(String[] transactionList) {
        this.transactionList = transactionList;
    }

    /*Account() throws SQLException {
        Account accountOne = new Account();
        accountOne.accountNumber = 1111112;
        accountOne.accountType = "Cheque";
        resultSet = controller.SQLCommand("select * from account");
        while (resultSet.next()) {
            accountOne.accountBalance = resultSet.getDouble("accountbalance");
            System.out.println(resultSet.getString("accountbalance"));
        }
        String str = "Account Number: " + accountOne.accountNumber + "\nAccount Type: " + accountOne.accountType +
                "\nAccount Balance: " + accountOne.accountBalance;
    }*/


    public static void main(String[] args) {

    }
    //Getters

    public int getAccountNumber() {
        return accountNumber;
    }
    public String getAccountType() {
        return accountType;
    }
    public double getAccountBalance() {
        return accountBalance;
    }
    public String[] getTransactionList() {
        return transactionList;
    }
}
