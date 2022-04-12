public class Employee {

    //Attribute
    private String employeeId;
    private String firstName;
    private String lastName;
    private String dateOfBirth;
    private String gender;
    private String address;
    private String CityOrTown;
    private String titleOfEmployee;
    private String dateHired;
    private String department;
    private int hourWorked;
    private double rateOfPay;
    private int leaveDays;
    private double carAllowance;
    private double monthlyGratuity;
    private double taxRate;
    private double monthlySalary;

    //Constructors

    public Employee(String employeeId, String firstName, String lastName, String dateOfBirth, String gender, String address, String cityOrTown, String titleOfEmployee, String dateHired, String department, int hourWorked, double rateOfPay, int leaveDays, double carAllowance, double monthlyGratuity, double taxRate, double monthlySalary) {
        this.employeeId = employeeId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.dateOfBirth = dateOfBirth;
        this.gender = gender;
        this.address = address;
        CityOrTown = cityOrTown;
        this.titleOfEmployee = titleOfEmployee;
        this.dateHired = dateHired;
        this.department = department;
        this.hourWorked = hourWorked;
        this.rateOfPay = rateOfPay;
        this.leaveDays = leaveDays;
        this.carAllowance = carAllowance;
        this.monthlyGratuity = monthlyGratuity;
        this.taxRate = taxRate;
        this.monthlySalary = monthlySalary;
    }

    //Getters

    public String getEmployeeId() {
        return employeeId;
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

    public String getAddress() {
        return address;
    }

    public String getCityOrTown() {
        return CityOrTown;
    }

    public String getTitleOfEmployee() {
        return titleOfEmployee;
    }

    public String getDateHired() {
        return dateHired;
    }

    public String getDepartment() {
        return department;
    }

    public int getHourWorked() {
        return hourWorked;
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

    //Setters

    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
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

    public void setAddress(String address) {
        this.address = address;
    }

    public void setCityOrTown(String cityOrTown) {
        CityOrTown = cityOrTown;
    }

    public void setTitleOfEmployee(String titleOfEmployee) {
        this.titleOfEmployee = titleOfEmployee;
    }

    public void setDateHired(String dateHired) {
        this.dateHired = dateHired;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public void setHourWorked(int hourWorked) {
        this.hourWorked = hourWorked;
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

    //Equal and HashCode

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Employee)) return false;

        Employee employee = (Employee) o;

        if (getHourWorked() != employee.getHourWorked()) return false;
        if (Double.compare(employee.getRateOfPay(), getRateOfPay()) != 0) return false;
        if (getLeaveDays() != employee.getLeaveDays()) return false;
        if (Double.compare(employee.getCarAllowance(), getCarAllowance()) != 0) return false;
        if (Double.compare(employee.getMonthlyGratuity(), getMonthlyGratuity()) != 0) return false;
        if (Double.compare(employee.getTaxRate(), getTaxRate()) != 0) return false;
        if (Double.compare(employee.getMonthlySalary(), getMonthlySalary()) != 0) return false;
        if (!getEmployeeId().equals(employee.getEmployeeId())) return false;
        if (!getFirstName().equals(employee.getFirstName())) return false;
        if (!getLastName().equals(employee.getLastName())) return false;
        if (!getDateOfBirth().equals(employee.getDateOfBirth())) return false;
        if (!getGender().equals(employee.getGender())) return false;
        if (!getAddress().equals(employee.getAddress())) return false;
        if (!getCityOrTown().equals(employee.getCityOrTown())) return false;
        if (!getTitleOfEmployee().equals(employee.getTitleOfEmployee())) return false;
        if (!getDateHired().equals(employee.getDateHired())) return false;
        return getDepartment().equals(employee.getDepartment());
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = getEmployeeId().hashCode();
        result = 31 * result + getFirstName().hashCode();
        result = 31 * result + getLastName().hashCode();
        result = 31 * result + getDateOfBirth().hashCode();
        result = 31 * result + getGender().hashCode();
        result = 31 * result + getAddress().hashCode();
        result = 31 * result + getCityOrTown().hashCode();
        result = 31 * result + getTitleOfEmployee().hashCode();
        result = 31 * result + getDateHired().hashCode();
        result = 31 * result + getDepartment().hashCode();
        result = 31 * result + getHourWorked();
        temp = Double.doubleToLongBits(getRateOfPay());
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        result = 31 * result + getLeaveDays();
        temp = Double.doubleToLongBits(getCarAllowance());
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(getMonthlyGratuity());
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(getTaxRate());
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(getMonthlySalary());
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }

    //to String

    @Override
    public String toString () {
        return   employeeId +  firstName +
                 lastName + dateOfBirth+
                 gender+ address+
                CityOrTown + titleOfEmployee +
                dateHired + department +
                 hourWorked + rateOfPay +
                leaveDays + carAllowance +
                 monthlyGratuity + taxRate+ monthlySalary;
    }

}

