package BankingApplication;

import java.util.Objects;

// methods() created: showCustomer

public abstract class Customer extends LogIn {
    // Attributes
    private String customerName;
    public String customerSurname;
    private char OmangNumber;
    private String dateOfBirth;
    private String Gender;
    private int phoneNumber;
    private String Address;

    // Constructors
    public Customer(String customerName, String customerSurname, char omangNumber, String dateOfBirth, String gender, int phoneNumber, String address) {
        this.customerName = customerName;
        this.customerSurname = customerSurname;
        OmangNumber = omangNumber;
        this.dateOfBirth = dateOfBirth;
        Gender = gender;
        this.phoneNumber = phoneNumber;
        Address = address;
    }

    // Setters
    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }
    public void setCustomerSurname(String customerSurname) {
        this.customerSurname = customerSurname;
    }
    public void setOmangNumber(char omangNumber) {
        OmangNumber = omangNumber;
    }
    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }
    public void setGender(String gender) {
        Gender = gender;
    }
    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
    public void setAddress(String address) {
        Address = address;
    }

    // Getters
    public String getCustomerName() {
        return customerName;
    }
    public String getCustomerSurname() {
        return customerSurname;
    }
    public char getOmangNumber() {
        return OmangNumber;
    }
    public String getDateOfBirth() {
        return dateOfBirth;
    }
    public String getGender() {
        return Gender;
    }
    public int getPhoneNumber() {
        return phoneNumber;
    }
    public String getAddress() {
        return Address;
    }

    // Other methods()
    public String ShowCustomer(){
        return OmangNumber + "\n" + customerSurname + "\n" + phoneNumber;
    }

    // equals() and hashCodes()
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Customer customer = (Customer) o;
        return OmangNumber == customer.OmangNumber && phoneNumber == customer.phoneNumber && customerName.equals(customer.customerName) && customerSurname.equals(customer.customerSurname) && dateOfBirth.equals(customer.dateOfBirth) && Gender.equals(customer.Gender) && Address.equals(customer.Address);
    }
    @Override
    public int hashCode() {
        return Objects.hash(customerName, customerSurname, OmangNumber, dateOfBirth, Gender, phoneNumber, Address);
    }

    // toString()
    @Override
    public String toString() {
        return "Customer[ " +
                "[customerName: " + customerName + "] " +
                "[customerSurname: " + customerSurname + "] " +
                "[OmangNumber: " + OmangNumber + "] " +
                "[dateOfBirth='" + dateOfBirth + "] " +
                "[Gender='" + Gender + "] " +
                "[phoneNumber: " + phoneNumber + "] " +
                "[Address='" + Address + "] " +
                "]";
    }
}
