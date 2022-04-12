package model;

public class InterestBearingAccount extends Account implements Withdraw, PayInterest{
    private AccountType accType = AccountType.INTRESTBEARING;

    public InterestBearingAccount(AccountType accType) {
        super();
        this.accType = accType;
    }

    public InterestBearingAccount(String fName, String lName, String address, double balance, int accNum, int omangNum, model.Gender gender, AccountType accType) {
        super(fName, lName, address, balance, accNum, omangNum, gender);
        this.accType = accType;
    }

    public void withdraw(double amount){
        double newBalance;

        if(super.getBalance() > amount){
            newBalance = (super.getBalance() - amount);
            super.setBalance(newBalance);
        }
    }

    public void payInterest(double rate){
        double interest;
        interest = ((super.getBalance()/100) * rate);
        super.deposit(interest);
    }
}
