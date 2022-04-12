package BankingApplication;

import java.util.Objects;
import BankingApplication.Customer;

// methods() created: viewAccInfo

public abstract class Account extends Customer{
    // Attributes
    private char accountNumber;
    private double amount;
    private String Branch;
    private String Owner;

    // Constructors
    public Account(String customerName, String customerSurname, char omangNumber, String dateOfBirth, String gender, int phoneNumber, String address, char accountNumber, double amount, String branch, String owner) {
        super(customerName, customerSurname, omangNumber, dateOfBirth, gender, phoneNumber, address);
        this.accountNumber = accountNumber;
        this.amount = amount;
        Branch = branch;
        Owner = owner;
    }

    // Setters
    public void setAccountNumber(char accountNumber) {
        this.accountNumber = accountNumber;
    }
    public void setAmount(double amount) {
        this.amount = amount;
    }
    public void setBranch(String branch) {
        Branch = branch;
    }
    public void setOwner(String owner) {
        Owner = owner;
    }

    // Getters
    public char getAccountNumber() {
        return accountNumber;
    }
    public double getAmount() {
        return amount;
    }
    public String getBranch() {
        return Branch;
    }
    public String getOwner() {
        return Owner;
    }

    // other methods()
    public String viewAccInfo( char omangNumber){
        return omangNumber + "\n" +accountNumber + "\n" + customerSurname;
    }

    // hashCodes() and equals()
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Account account = (Account) o;
        return accountNumber == account.accountNumber && Double.compare(account.amount, amount) == 0 && Branch.equals(account.Branch) && Owner.equals(account.Owner);
    }
    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), accountNumber, amount, Branch, Owner);
    }

    // toString()
    @Override
    public String toString() {
        return "Account[ " +
                "[accountNumber=" + accountNumber + "] " +
                "[amount: " + amount + "] " +
                "[Branch: " + Branch + "] " +
                "[Owner='" + Owner + "] " +
                "[customerSurname: " + customerSurname + "] " +
                "]";
    }
}