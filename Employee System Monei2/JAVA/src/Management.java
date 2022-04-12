public class Management extends Employees {
    private static final String department = "Management";
    private static final double carAllowance = 0.30;

    public Management(String employeeID) {this.employeeID = employeeID;}

    //Getters
    @Override
    public String getDEPARTMENT() {
        return department;
    }

    @Override
    public double getCarAllowanceRate() {
        return carAllowance;
    }

    @Override
    public double calculateCarAllowance()
    {
        this.carAllowance = this.monthlySalary * Management.carAllowance;
        return this.carAllowance;
    }

    @Override
    public double calculateMonthlyGratuity()
    {
        double monthlyGratuity = this.carAllowance + this.monthlySalary + this.monthlyGratuity;
        return monthlyGratuity;
    }

}
}
