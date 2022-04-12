package BankingSystemOriginal;

import BankingSystemOriginal.Account;
import BankingSystemOriginal.PayInterest;

public class Savings extends Account implements PayInterest {

    public Savings(int accNumber, String accHolder, double balance, String branch) {
        super(accNumber, accHolder, balance, branch);
    }

    @Override
    public void payInterest(double rate){
        this.balance+=balance*rate;
    }

}