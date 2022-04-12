package atmapplication;

public class Cheque extends Account{
    private double interestRate;
    private boolean allowWithdrawals;

    public Cheque(int accountNumber, String accountType, double accountBalance, String[] transactionList){
        super(accountNumber, accountType, accountBalance, transactionList);
    }

    public Cheque(int accountNumber, String accountType, double accountBalance, String[] transactionList, double interestRate, boolean allowWithdrawals) {
        super(accountNumber, accountType, accountBalance, transactionList);
        this.interestRate = interestRate;
        this.allowWithdrawals = allowWithdrawals;
    }

    public double getInterestRate() {
        return interestRate;
    }

    public boolean isAllowWithdrawals() {
        return allowWithdrawals;
    }

    public void setInterestRate(double interestRate) {
        this.interestRate = interestRate;
    }

    public void setAllowWithdrawals(boolean allowWithdrawals) {
        this.allowWithdrawals = allowWithdrawals;
    }
}
