package atmapplication;

import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;

public class Customer {
    /*int customerId;
    String firstName;
    String lastName;
    String dateOfBirth;
    String gender;
    String occupation;
    String companyName;
    String companyAddress;
    int accountNumber;
    int accountPin;
    int numberOfAccounts;*/

    public SimpleIntegerProperty customerId = new SimpleIntegerProperty();
    public SimpleStringProperty firstName = new SimpleStringProperty();
    public  SimpleStringProperty lastName = new SimpleStringProperty();
    public  SimpleStringProperty dateOfBirth = new SimpleStringProperty();
    public  SimpleStringProperty gender = new SimpleStringProperty();
    public  SimpleStringProperty occupation = new SimpleStringProperty();
    public  SimpleStringProperty companyName = new SimpleStringProperty();
    public  SimpleStringProperty companyAddress = new SimpleStringProperty();
    public SimpleIntegerProperty accountNumber = new SimpleIntegerProperty();
    public SimpleIntegerProperty accountPin = new SimpleIntegerProperty();
    public SimpleIntegerProperty numberOfAccounts = new SimpleIntegerProperty();

    public SimpleIntegerProperty customerIdProperty() {
        return customerId;
    }
    public void setCustomerId(int id) {
        this.customerId.set(id);
    }

    public SimpleStringProperty firstNameProperty() {
        return firstName;
    }
    public void setFirstName(String firstName) {
        this.firstName.set(firstName);
    }

    public SimpleStringProperty lastNameProperty() {
        return lastName;
    }
    public void setLastName(String lastName) {
        this.lastName.set(lastName);
    }

    public SimpleStringProperty dateOfBirthProperty() {
        return dateOfBirth;
    }
    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth.set(dateOfBirth);
    }

    public SimpleStringProperty genderProperty() {
        return gender;
    }
    public void setGender(String gender) {
        this.gender.set(gender);
    }

    public SimpleStringProperty occupationProperty() {
        return occupation;
    }
    public void setOccupation(String occupation) {
        this.occupation.set(occupation);
    }

    public SimpleStringProperty companyNameProperty() {
        return companyName;
    }
    public void setCompanyName(String companyName) {
        this.companyName.set(companyName);
    }

    public SimpleStringProperty companyAddressProperty() {
        return companyAddress;
    }
    public void setCompanyAddress(String companyAddress) {
        this.companyAddress.set(companyAddress);
    }

    public SimpleIntegerProperty accountNumberProperty() {
        return accountNumber;
    }
    public void setAccountNumber(int accountNumber) {
        this.accountNumber.set(accountNumber);
    }

    public SimpleIntegerProperty accountPinProperty() {
        return accountPin;
    }
    public void setAccountPin(int accountPin) {
        this.accountPin.set(accountPin);
    }

    public SimpleIntegerProperty numberOfAccountsProperty() {
        return numberOfAccounts;
    }
    public void setNumberOfAccounts(int numberOfAccounts) {
        this.numberOfAccounts.set(numberOfAccounts);
    }

    //Setters


    /*public Customer(int customerId, String firstName, String lastName, String dateOfBirth, String gender, String occupation, String companyName, String companyAddress, int accountNumber, int accountPin, int numberOfAccounts) {
        this.customerId = customerId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.dateOfBirth = dateOfBirth;
        this.gender = gender;
        this.occupation = occupation;
        this.companyName = companyName;
        this.companyAddress = companyAddress;
        this.accountNumber = accountNumber;
        this.accountPin = accountPin;
        this.numberOfAccounts = numberOfAccounts;
    }

    //Setters
    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }
    public void setGender(String gender) {
        this.gender = gender;
    }
    public void setOccupation(String occupation) {
        this.occupation = occupation;
    }
    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }
    public void setCompanyAddress(String companyAddress) {
        this.companyAddress = companyAddress;
    }
    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }
    public void setAccountPin(int accountPin) {
        this.accountPin = accountPin;
    }
    public void setNumberOfAccounts(int numberOfAccounts) {
        this.numberOfAccounts = numberOfAccounts;
    }

    //Getters
    public int getCustomerId() {
        return customerId;
    }
    public String getFirstName() {
        return firstName;
    }
    public String getLastName() {
        return lastName;
    }
    public String getDateOfBirth() {
        return dateOfBirth;
    }
    public String getGender() {
        return gender;
    }
    public String getOccupation() {
        return occupation;
    }
    public String getCompanyName() {
        return companyName;
    }
    public String getCompanyAddress() {
        return companyAddress;
    }
    public int getAccountNumber() {
        return accountNumber;
    }
    public int getAccountPin() {
        return accountPin;
    }
    public int getNumberOfAccounts() {
        return numberOfAccounts;
    }*/

    @Override
    public String toString() {
        return "Customer{" +
                "customerId=" + customerId +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", dateOfBirth='" + dateOfBirth + '\'' +
                ", gender='" + gender + '\'' +
                ", accountNumber=" + accountNumber +
                ", accountPin=" + accountPin +
                ", numberOfAccounts=" + numberOfAccounts +
                '}';
    }

    Customer(){
        Customer customerOne = new Customer();
        //customerOne.customerId =
    }
}
