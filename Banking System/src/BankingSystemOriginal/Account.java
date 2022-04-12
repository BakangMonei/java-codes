package BankingSystemOriginal;

import java.util.Objects;

public class Account {
    // Attributes
    private int accNumber;
    private String accHolder;
    double balance;
    private String branch;

    // Constructors
    public Account(int accNumber, String accHolder, double balance, String branch) {
        this.accNumber = accNumber;
        this.accHolder = accHolder;
        this.balance = balance;
        this.branch = branch;
    }



    // Getters and Setters
    public int getAccNumber() {
        return accNumber;
    }

    public void setAccNumber(int accNumber) {
        this.accNumber = accNumber;
    }

    public String getAccHolder() {
        return accHolder;
    }

    public void setAccHolder(String accHolder) {
        this.accHolder = accHolder;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public String getBranch() {
        return branch;
    }

    public void setBranch(String branch) {
        this.branch = branch;
    }

    public void deposit(double amount){
        this.balance = amount + balance;
    }


    // toString()
    @Override
    public String toString() {
        return "BankingSystemOriginal.Account{" + "accNumber=" + accNumber + ", accHolder=" + accHolder + ", balance=" + balance + ", branch=" + branch + "]";
    }

    // equals() and hashCodes()
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Account account = (Account) o;
        return accNumber == account.accNumber && Double.compare(account.balance, balance) == 0 && accHolder.equals(account.accHolder) && branch.equals(account.branch);
    }
    @Override
    public int hashCode() {
        return Objects.hash(accNumber, accHolder, balance, branch);
    }
}
