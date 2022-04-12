import java.util.Objects;

public class Employees
{

    //Attributes
    protected String employeeID;
    protected String firstName;
    protected String lastName;
    protected String  dateOfBirth;
    protected char gender;
    protected String address;
    protected String titleOfEmployment;
    protected String dateHired;
    protected String department;
    protected int hoursWorked;
    protected double rateOfPay;
    protected int leaveDays;
    protected double carAllowance;
    protected double monthlyGratuity;
    protected double taxRate;
    protected double monthlySalary;
    protected String city;

    // Constructors

    public Employees(String employeeID, String firstName, String lastName, String dateOfBirth, char gender, String address, String titleOfEmployment, String dateHired, String department, int hoursWorked, double rateOfPay, int leaveDays, double carAllowance, double monthlyGratuity, double taxRate, double monthlySalary, String city) {
        this.employeeID = employeeID;
        this.firstName = firstName;
        this.lastName = lastName;
        this.dateOfBirth = dateOfBirth;
        this.gender = gender;
        this.address = address;
        this.titleOfEmployment = titleOfEmployment;
        this.dateHired = dateHired;
        this.department = department;
        this.hoursWorked = hoursWorked;
        this.rateOfPay = rateOfPay;
        this.leaveDays = leaveDays;
        this.carAllowance = carAllowance;
        this.monthlyGratuity = monthlyGratuity;
        this.taxRate = taxRate;
        this.monthlySalary = monthlySalary;
        this.city = city;
    }

    // Getters

    public String getEmployeeID() {
        return employeeID;
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

    public char getGender() {
        return gender;
    }

    public String getAddress() {
        return address;
    }

    public String getTitleOfEmployment() {
        return titleOfEmployment;
    }

    public String getDateHired() {
        return dateHired;
    }

    public String getDepartment() {
        return department;
    }

    public int getHoursWorked() {
        return hoursWorked;
    }

    public double getRateOfPay() {
        return rateOfPay;
    }

    public int getLeaveDays() {
        return leaveDays;
    }

    public double getCarAllowance() {
        return carAllowance;
    }

    public double getMonthlyGratuity() {
        return monthlyGratuity;
    }

    public double getTaxRate() {
        return taxRate;
    }

    public double getMonthlySalary() {
        return monthlySalary;
    }

    public String getCity() {
        return city;
    }

    // Setters


    public void setEmployeeID(String employeeID) {
        this.employeeID = employeeID;
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

    public void setGender(char gender) {
        this.gender = gender;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setTitleOfEmployment(String titleOfEmployment) {
        this.titleOfEmployment = titleOfEmployment;
    }

    public void setDateHired(String dateHired) {
        this.dateHired = dateHired;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public void setHoursWorked(int hoursWorked) {
        this.hoursWorked = hoursWorked;
    }

    public void setRateOfPay(double rateOfPay) {
        this.rateOfPay = rateOfPay;
    }

    public void setLeaveDays(int leaveDays) {
        this.leaveDays = leaveDays;
    }

    public void setCarAllowance(double carAllowance) {
        this.carAllowance = carAllowance;
    }

    public void setMonthlyGratuity(double monthlyGratuity) {
        this.monthlyGratuity = monthlyGratuity;
    }

    public void setTaxRate(double taxRate) {
        this.taxRate = taxRate;
    }

    public void setMonthlySalary(double monthlySalary) {
        this.monthlySalary = monthlySalary;
    }

    public void setCity(String city) {
        this.city = city;
    }

    // Equals() and hashCodes()

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Employees)) return false;
        Employees employees = (Employees) o;
        return getGender() == employees.getGender() && getHoursWorked() == employees.getHoursWorked() && Double.compare(employees.getRateOfPay(), getRateOfPay()) == 0 && getLeaveDays() == employees.getLeaveDays() && Double.compare(employees.getCarAllowance(), getCarAllowance()) == 0 && Double.compare(employees.getMonthlyGratuity(), getMonthlyGratuity()) == 0 && Double.compare(employees.getTaxRate(), getTaxRate()) == 0 && Double.compare(employees.getMonthlySalary(), getMonthlySalary()) == 0 && getEmployeeID().equals(employees.getEmployeeID()) && getFirstName().equals(employees.getFirstName()) && getLastName().equals(employees.getLastName()) && getDateOfBirth().equals(employees.getDateOfBirth()) && getAddress().equals(employees.getAddress()) && getTitleOfEmployment().equals(employees.getTitleOfEmployment()) && getDateHired().equals(employees.getDateHired()) && getDepartment().equals(employees.getDepartment()) && getCity().equals(employees.getCity());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getEmployeeID(), getFirstName(), getLastName(), getDateOfBirth(), getGender(), getAddress(), getTitleOfEmployment(), getDateHired(), getDepartment(), getHoursWorked(), getRateOfPay(), getLeaveDays(), getCarAllowance(), getMonthlyGratuity(), getTaxRate(), getMonthlySalary(), getCity());
    }


    // toString()

    @Override
    public String toString() {
        return "Employees{" +
                "employeeID='" + employeeID + '\'' +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", dateOfBirth='" + dateOfBirth + '\'' +
                ", gender=" + gender +
                ", address='" + address + '\'' +
                ", titleOfEmployment='" + titleOfEmployment + '\'' +
                ", dateHired='" + dateHired + '\'' +
                ", department='" + department + '\'' +
                ", hoursWorked=" + hoursWorked +
                ", rateOfPay=" + rateOfPay +
                ", leaveDays=" + leaveDays +
                ", carAllowance=" + carAllowance +
                ", monthlyGratuity=" + monthlyGratuity +
                ", taxRate=" + taxRate +
                ", monthlySalary=" + monthlySalary +
                ", city='" + city + '\'' +
                '}';
    }
}