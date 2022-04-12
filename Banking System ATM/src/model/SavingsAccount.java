package model;

public class SavingsAccount extends Account implements PayInterest{
    private AccountType accType = AccountType.SAVINGS;

    public SavingsAccount(AccountType accType) {
        this.accType = accType;
    }

    public SavingsAccount(String fName, String lName, String address, double balance, int accNum, int omangNum, model.Gender gender, AccountType accType) {
        super(fName, lName, address, balance, accNum, omangNum, gender);
        this.accType = accType;
    }

    public void payInterest(double rate){
        double interest;
        interest = ((super.getBalance()/100) * rate);
        super.deposit(interest);
    }

}