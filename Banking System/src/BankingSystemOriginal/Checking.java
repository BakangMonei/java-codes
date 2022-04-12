package BankingSystemOriginal;

import BankingSystemOriginal.Account;

public class Checking extends Account implements Withdraw {

    public Checking(int accNumber, String accHolder, double balance, String branch) {
        super(accNumber, accHolder, balance, branch);
    }

    @Override
    public void withdraw(double amount) {
        this.balance =balance - amount;
    }

}