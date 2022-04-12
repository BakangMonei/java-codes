package hrmsystem;

public class HumanResouceOfficer extends Employee
{
    private static final String DEPARTMENT = "Human Resource";
    private static final double carAllowanceRate = 0.15;

    public HumanResouceOfficer(int employeeId) {
        this.employeeId = employeeId;
    }

    //Getters
    public String getDEPARTMENT() {
        return DEPARTMENT;
    }

    public double getCarAllowanceRate() {
        return carAllowanceRate;
    }

    @Override
    public double calculateCarAllowance()
    {
        this.carAllowance = this.salary * HumanResouceOfficer.carAllowanceRate;

        return this.carAllowance;
    }

    @Override
    public double calculateGrossSalary()
    {
        double grossSalary = this.carAllowance + this.salary + this.monthlyGratuity;

        return grossSalary;
    }

}