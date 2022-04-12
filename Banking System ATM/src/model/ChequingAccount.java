package model;

public class ChequingAccount extends Account implements Withdraw {
    private  AccountType accType = AccountType.CHEQUE;

    public ChequingAccount(AccountType accType) {
        this.accType = accType;
    }

    public ChequingAccount(String fName, String lName, String address, double balance, int accNum, int omangNum, model.Gender gender, AccountType accType) {
        super(fName, lName, address, balance, accNum, omangNum, gender);
        this.accType = accType;
    }

    public void withdraw(double amount){
        double newBalance;

        if (super.getBalance() > amount){
            newBalance = (super.getBalance() - amount);
            super.setBalance(newBalance);
        }
    }
}