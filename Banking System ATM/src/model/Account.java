package model;

import java.util.Objects;

public abstract class Account {
    // Attributes
    private String fName;
    private String lName;
    private String address;
    private double balance;
    private int accNum;
    private int omangNum;
    private Gender Gender;

    // Constructors
    public Account(String fName, String lName, String address, double balance, int accNum, int omangNum, Gender gender) {
        this.fName = fName;
        this.lName = lName;
        this.address = address;
        this.balance = balance;
        this.accNum = accNum;
        this.omangNum = omangNum;
        Gender = gender;
    }

    public Account() {

    }

    // Getters and Setters
    public String getfName() {
        return fName;
    }

    public void setfName(String fName) {
        this.fName = fName;
    }

    public String getlName() {
        return lName;
    }

    public void setlName(String lName) {
        this.lName = lName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public int getAccNum() {
        return accNum;
    }

    public void setAccNum(int accNum) {
        this.accNum = accNum;
    }

    public int getOmangNum() {
        return omangNum;
    }

    public void setOmangNum(int omangNum) {
        this.omangNum = omangNum;
    }

    public Gender getGender() {
        return Gender;
    }

    public void setGender(Gender gender) {
        Gender = gender;
    }
    public void deposit(double amount){
        balance += amount;
    }

    // toString()
    @Override
    public String toString() {
        return "Account:[ " +
                "fName===> " + fName + '\'' +
                ", lName===> " + lName + '\'' +
                ", address===> " + address + '\'' +
                ", balance===> " + balance +
                ", accNum===> " + accNum +
                ", omangNum===> " + omangNum +
                ", Gender===> " + Gender +
                ']';
    }

    // equals() and hashCodes()
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Account account = (Account) o;
        return Double.compare(account.balance, balance) == 0 && accNum == account.accNum && omangNum == account.omangNum && fName.equals(account.fName) && lName.equals(account.lName) && address.equals(account.address) && Gender == account.Gender;
    }
    @Override
    public int hashCode() {
        return Objects.hash(fName, lName, address, balance, accNum, omangNum, Gender);
    }
}
