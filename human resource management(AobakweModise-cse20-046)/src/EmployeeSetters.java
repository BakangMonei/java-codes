public class EmployeeSetters {

    static String[][] workerDetails;

    public static void employeeMethods()
    {
        workerDetails = new String[50][];
        callMethods();
    }

    public static String [] employee1()
    {
        Employee employee1 = new Employee("MM001",
                "Davince",
                "Modise",
                "10/03/2001",
                "M",
                "P_O_Box_123_Maitengwe",
                "Maitengwe",
                "CEO",
                "10/02/2020",
                "Management",
                80,
                500,
                50,
                0.30 * (80 * 500),
                0.218 * (80 * 500),
                0.14 * (80 * 500),
                ((80 * 500) + 0.30 * (80 * 500)) - (0.218 * (80 * 500) - 0.14 * (80 * 500)));

                workerDetails[0] = new String[]{
                        employee1.getEmployeeId() + " ",
                        employee1.getFirstName() + " ",
                        employee1.getLastName() + " ",
                        employee1.getDateOfBirth() + " ",
                        employee1.getGender() + " ",
                        employee1.getAddress() + " ",
                        employee1.getCityOrTown() + " ",
                        employee1.getTitleOfEmployee() + " ",
                        employee1.getDateHired() + " ",
                        employee1.getDepartment() + " ",
                        employee1.getHourWorked() + " ",
                        employee1.getRateOfPay() + " ",
                        employee1.getLeaveDays() + " ",
                        employee1.getCarAllowance() + " ",
                        employee1.getTaxRate()+ " ",
                        employee1.getMonthlyGratuity() + " ",
                        String.valueOf(employee1.getMonthlySalary())};

        return workerDetails[0];
    }

    public static String [] employee2() {
        Employee employee2 = new Employee("MM002", "Jozi", "Wesly", "19/05/2000", "M", "P_O_Box_817_Mochudi", "Mochudi", "HR", "12/09/2020", "Management", 80, 470, 42, 0.30 * (80 * 470), 0.218 * (80 * 470), 0.14 * (80 * 470), ((80 * 470) + 0.30 * (80 * 470)) - (0.218 * (80 * 470) - 0.14 * (80 * 470)));

        workerDetails[1] = new String[]{employee2.getEmployeeId() + " ", employee2.getFirstName() + " ",
                employee2.getLastName() + " ", employee2.getDateOfBirth() + " ", employee2.getGender() + " ", employee2.getAddress() + " ",
                employee2.getCityOrTown() + " ", employee2.getTitleOfEmployee() + " ", employee2.getDateHired() + " ", employee2.getDepartment() + " ", employee2.getHourWorked() + " ",
                employee2.getRateOfPay() + " ", employee2.getLeaveDays() + " ", employee2.getCarAllowance() + " ", employee2.getMonthlyGratuity() + " ",employee2.getTaxRate()+ " ", String.valueOf(employee2.getMonthlySalary())};

        return workerDetails[1];
    }

    public static String [] employee3() {
        Employee employee3 = new Employee("MM003", "Monei", "Motshegwe", "13/02/1999", "M", "P_O_Box_253", "palapye", "marketing_and_finance_manager", "11/03/2020", "management", 80, 450, 42, 0.30 * (80 * 450), 0.218 * (80 * 450), 0.14 * (80 * 450), ((80 * 4500) + 0.30 * (80 * 450)) - (0.218 * (80 * 450) - 0.14 * (80 * 450)));

        workerDetails[2] = new String[]{employee3.getEmployeeId() + " ", employee3.getFirstName() + " ",
                employee3.getLastName() + " ", employee3.getDateOfBirth() + " ", employee3.getGender() + " ", employee3.getAddress() + " ",
                employee3.getCityOrTown() + " ", employee3.getTitleOfEmployee() + " ", employee3.getDateHired() + " ", employee3.getDepartment() + " ", employee3.getHourWorked() + " ",
                employee3.getRateOfPay() + " ", employee3.getLeaveDays() + " ", employee3.getCarAllowance() + " ", employee3.getMonthlyGratuity() + " ", employee3.getTaxRate()+ " ", String.valueOf(employee3.getMonthlySalary())};

        return workerDetails[2];
    }


    public static String [] employee4() {
        Employee employee4 = new Employee("LJ004", "Lebogang", "Johnson", "03/05/2001", "M", "P_O_Box_945", "francistown", "finance_manager", "12/10/2020", "management", 76, 600, 40, 0.30 * (76 * 600), 0.218 * (76 * 600), 0.14 * (76 * 600), ((76 * 600) + 0.30 * (76 * 600)) - (0.218 * (76 * 600) - 0.14 * (76 * 600)));

        workerDetails[3] = new String[]{employee4.getEmployeeId() + " ", employee4.getFirstName() + " ",
                employee4.getLastName() + " ", employee4.getDateOfBirth() + " ", employee4.getGender() + " ",
                employee4.getCityOrTown() + " ", employee4.getTitleOfEmployee() + " ", employee4.getDateHired() + " ", employee4.getDepartment() + " ", employee4.getHourWorked() + " ",
                employee4.getRateOfPay() + " ", employee4.getLeaveDays() + " ", employee4.getCarAllowance() + " ", employee4.getMonthlyGratuity() + " ",employee4.getTaxRate()+ " ", String.valueOf(employee4.getMonthlySalary())};

        return workerDetails[3];
    }

    public static String [] employee5() {
        Employee employee5 = new Employee("KM005", "Kamogelo", "Modisa", "12/07/1998", "F", "P_O_Box_149", "tonota", "marketing_management", "24/10/2020", "management", 82, 500, 40, 0.30 * (82 * 500), 0.218 * (82 * 500), 0.14 * (82 * 500), ((82 * 500) + 0.30 * (82 * 500)) - (0.218 * (82 * 500) - 0.14 * (82 * 500)));

        workerDetails[4] = new String[]{employee5.getEmployeeId() + " ", employee5.getFirstName() + " ",
                employee5.getLastName() + " ", employee5.getDateOfBirth() + " ", employee5.getGender() + " ", employee5.getAddress() + " ",
                employee5.getCityOrTown() + " ", employee5.getTitleOfEmployee() + " ", employee5.getDateHired() + " ", employee5.getDepartment() + " ", employee5.getHourWorked() + " ",
                employee5.getRateOfPay() + " ", employee5.getLeaveDays() + " ", employee5.getCarAllowance() + " ", employee5.getMonthlyGratuity() + " ", employee5.getTaxRate()+ " ", String.valueOf(employee5.getMonthlySalary())};

        return workerDetails[4];
    }

    public static String [] employee6() {
        Employee employee6 = new Employee("KS006", "Karabo", "Sebaga", "11/07/1999", "M", "P_O_Box_674", "lobatse", "ICT", "02/10/2020", "support", 80, 550, 40, 0.15 * (80 * 550), 0.218 * (80 * 550), 0.14 * (80 * 550), ((80 * 550) + 0.15 * (80 * 550)) - (0.218 * (80 * 550) - 0.14 * (80 * 550)));

        workerDetails[5] = new String[]{employee6.getEmployeeId() + " ", employee6.getFirstName() + " ",
                employee6.getLastName() + " ", employee6.getDateOfBirth() + " ", employee6.getGender() + " ", employee6.getAddress() + " ",
                employee6.getCityOrTown() + " ", employee6.getTitleOfEmployee() + " ", employee6.getDateHired() + " ", employee6.getDepartment() + " ", employee6.getHourWorked() + " ",
                employee6.getRateOfPay() + " ", employee6.getLeaveDays() + " ", employee6.getCarAllowance() + " ", employee6.getMonthlyGratuity() + " ",employee6.getTaxRate()+ " ", String.valueOf(employee6.getMonthlySalary())};

        return workerDetails[5];
    }

    public static String [] employee7() {
        Employee employee7 = new Employee("TM007", "Thato", "Modisa", "15/07/1998", "F", "P_O_Box_452", "gaborone", "drivers", "12/11/2020", "support", 72, 500, 42, 0.15 * (72 * 500), 0.218 * (72 * 500), 0.14 * (72 * 500), ((72 * 500) + 0.15 * (72 * 500)) - (0.218 * (72 * 500) - 0.14 * (72 * 500)));

        workerDetails[6] = new String[]{employee7.getEmployeeId() + " ", employee7.getFirstName() + " ",
                employee7.getLastName() + " ", employee7.getDateOfBirth() + " ", employee7.getGender() + " ", employee7.getAddress() + " ",
                employee7.getCityOrTown() + " ", employee7.getTitleOfEmployee() + " ", employee7.getDateHired() + " ", employee7.getDepartment() + " ", employee7.getHourWorked() + " ",
                employee7.getRateOfPay() + " ", employee7.getLeaveDays() + " ", employee7.getCarAllowance() + " ", employee7.getMonthlyGratuity() + " ", employee7.getMonthlySalary() + ""};

        return workerDetails[6];
    }

    public static String [] employee8() {
        Employee employee8 = new Employee("SR008", "Seo", "Rathipa", "12/08/1998", "M", "P_O_Box_888", "mahalapye", "drivers", "19/10/2020", "support", 82, 500, 40, 0.15 * (82 * 500), 0.218 * (82 * 500), 0.14 * (82 * 500), ((82 * 500) + 0.15 * (82 * 500)) - (0.218 * (82 * 500) - 0.14 * (82 * 500)));

        workerDetails[7] = new String[]{employee8.getEmployeeId() + " ", employee8.getFirstName() + " ",
                employee8.getLastName() + " ", employee8.getDateOfBirth() + " ", employee8.getGender() + " ", employee8.getAddress() + " ",
                employee8.getCityOrTown() + " ", employee8.getTitleOfEmployee() + " ", employee8.getDateHired() + " ", employee8.getDepartment() + " ", employee8.getHourWorked() + " ",
                employee8.getRateOfPay() + " ", employee8.getLeaveDays() + " ", employee8.getCarAllowance() + " ", employee8.getMonthlyGratuity() + " ", employee8.getTaxRate()+ " ", String.valueOf(employee8.getMonthlySalary())};

        return workerDetails[7];
    }

    public static String [] employee9() {
        Employee employee9 = new Employee("AT009", "Atang", "Tapiwa", "10/05/1998", "F", "P_O_Box_355", "gaborone", "tour_operator", "14/08/2020", "support", 80, 400, 40, 0.15 * (80 * 400), 0.218 * (80 * 400), 0.14 * (80 * 400), ((80 * 400) + 0.15 * (80 * 400)) - (0.218 * (80 * 400) - 0.14 * (80 * 400)));

        workerDetails[8] = new String[]{employee9.getEmployeeId() + " ", employee9.getFirstName() + " ",
                employee9.getLastName() + " ", employee9.getDateOfBirth() + " ", employee9.getGender() + " ", employee9.getAddress() + " ",
                employee9.getCityOrTown() + " ", employee9.getTitleOfEmployee() + " ", employee9.getDateHired() + " ", employee9.getDepartment() + " ", employee9.getHourWorked() + " ",
                employee9.getRateOfPay() + " ", employee9.getLeaveDays() + " ", employee9.getCarAllowance() + " ", employee9.getMonthlyGratuity() + " ", employee9.getTaxRate()+ " ", String.valueOf(employee9.getMonthlySalary())};

        return workerDetails[8];
    }

    public static String [] employee10() {
        Employee employee10 = new Employee("WB010", "Wame", "Basebi", "12/08/1999", "F", "P_O_Box_311", "serowe", "tour_operator", "24/10/2020", "support", 80, 500, 40, 0.15 * (80 * 500), 0.218 * (80 * 500), 0.14 * (80 * 500), ((80 * 500) + 0.15 * (80 * 500)) - (0.218 * (80 * 500) - 0.14 * (80 * 500)));

        workerDetails[9] = new String[]{employee10.getEmployeeId() + " ", employee10.getFirstName() + " ",
                employee10.getLastName() + " ", employee10.getDateOfBirth() + " ", employee10.getGender() + " ", employee10.getAddress() + " ",
                employee10.getCityOrTown() + " ", employee10.getTitleOfEmployee() + " ", employee10.getDateHired() + " ", employee10.getDepartment() + " ", employee10.getHourWorked() + " ",
                employee10.getRateOfPay() + " ", employee10.getLeaveDays() + " ", employee10.getCarAllowance() + " ", employee10.getMonthlyGratuity() + " ",employee10.getTaxRate()+ " ", String.valueOf(employee10.getMonthlySalary())};

        return workerDetails[9];
    }

    public static String [] employee11() {
        Employee employee11 = new Employee("MB011", "Mami", "Baswa", "08/07/2000", "F", "P_O_Box_829", "ramotswa", "sales", "01/11/2020", "support", 78, 500, 40, 0.15 * (78 * 500), 0.218 * (78 * 500), 0.14 * (78 * 500), ((78 * 500) + 0.15 * (78 * 500)) - (0.218 * (78 * 500) - 0.14 * (78 * 500)));


        workerDetails[10] = new String[]{employee11.getEmployeeId() + " ", employee11.getFirstName() + " ",
                employee11.getLastName() + " ", employee11.getDateOfBirth() + " ", employee11.getGender() + " ", employee11.getAddress() + " ",
                employee11.getCityOrTown() + " ", employee11.getTitleOfEmployee() + " ", employee11.getDateHired() + " ", employee11.getDepartment() + " ", employee11.getHourWorked() + " ",
                employee11.getRateOfPay() + " ", employee11.getLeaveDays() + " ", employee11.getCarAllowance() + " ", employee11.getMonthlyGratuity() + " ", employee11.getMonthlySalary() + ""};

        return workerDetails[10];
    }

    public static String [] employee12() {
        Employee employee12 = new Employee("TT012", "Thabiso", "Thipi", "02/08/1998", "M", "P_O_Box_045", "tonota", "sales", "24/11/2020", "support", 80, 500, 40, 0.15 * (80 * 500), 0.218 * (80 * 500), 0.14 * (80 * 500), ((80 * 500) + 0.15 * (80 * 500)) - (0.218 * (80 * 500) - 0.14 * (80 * 500)));

        workerDetails[11] = new String[]{employee12.getEmployeeId() + " ", employee12.getFirstName() + " ",
                employee12.getLastName() + " ", employee12.getDateOfBirth() + " ", employee12.getGender() + " ", employee12.getAddress() + " ",
                employee12.getCityOrTown() + " ", employee12.getTitleOfEmployee() + " ", employee12.getDateHired() + " ", employee12.getDepartment() + " ", employee12.getHourWorked() + " ",
                employee12.getRateOfPay() + " ", employee12.getLeaveDays() + " ", employee12.getCarAllowance() + " ", employee12.getMonthlyGratuity() + " ", employee12.getTaxRate()+ " ", String.valueOf(employee12.getMonthlySalary())};

        return workerDetails[11];
    }

    public static String [] employee13() {
        Employee employee13 = new Employee("OS013", "Oratile", "Seima", "11/07/1999", "F", "P_O_Box_106", "otse", "sales", "20/10/2020", "support", 82, 500, 40, 0.15 * (82 * 500), 0.218 * (82 * 500), 0.14 * (82 * 500), ((82 * 500) + 0.15 * (82 * 500)) - (0.218 * (82 * 500) - 0.14 * (82 * 500)));

        workerDetails[12] = new String[]{employee13.getEmployeeId() + " ", employee13.getFirstName() + " ",
                employee13.getLastName() + " ", employee13.getDateOfBirth() + " ", employee13.getGender() + " ", employee13.getAddress() + " ",
                employee13.getCityOrTown() + " ", employee13.getTitleOfEmployee() + " ", employee13.getDateHired() + " ", employee13.getDepartment() + " ", employee13.getHourWorked() + " ",
                employee13.getRateOfPay() + " ", employee13.getLeaveDays() + " ", employee13.getCarAllowance() + " ", employee13.getMonthlyGratuity() + " ",employee13.getTaxRate()+ " ", String.valueOf(employee13.getMonthlySalary())};

        return workerDetails[12];
    }

    public static String [] employee14() {
        Employee employee14 = new Employee("PB014", "Phatsimo", "Baswabi", "10/06/1998", "F", "P_O_Box_407", "tati", "sales", "21/10/2020", "support", 82, 400, 40, 0.15 * (82 * 400), 0.218 * (82 * 400), 0.14 * (82 * 400), ((82 * 400) + 0.15 * (82 * 400)) - (0.218 * (82 * 400) - 0.14 * (82 * 400)));

        workerDetails[13] = new String[]{employee14.getEmployeeId() + " ", employee14.getFirstName() + " ",
                employee14.getLastName() + " ", employee14.getDateOfBirth() + " ", employee14.getGender() + " ", employee14.getAddress() + " ",
                employee14.getCityOrTown() + " ", employee14.getTitleOfEmployee() + " ", employee14.getDateHired() + " ", employee14.getDepartment() + " ", employee14.getHourWorked() + " ",
                employee14.getRateOfPay() + " ", employee14.getLeaveDays() + " ", employee14.getCarAllowance() + " ", employee14.getMonthlyGratuity() + " ", employee14.getTaxRate()+ " ", String.valueOf(employee14.getMonthlySalary())};

        return workerDetails[13];
    }

    public static String [] employee15() {
        Employee employee15 = new Employee("AM015", "Amantle", "Morwa", "12/07/1996", "F", "P_O_Box_363", "mochudi", "sales", "26/09/2020", "support", 80, 500, 40, 0.15 * (80 * 500), 0.218 * (80 * 500), 0.14 * (80 * 500), ((80 * 500) + 0.15 * (80 * 500)) - (0.218 * (80 * 500) - 0.14 * (80 * 500)));

        workerDetails[14] = new String[]{employee15.getEmployeeId() + " ", employee15.getFirstName() + " ",
                employee15.getLastName() + " ", employee15.getDateOfBirth() + " ", employee15.getGender() + " ", employee15.getAddress() + " ",
                employee15.getCityOrTown() + " ", employee15.getTitleOfEmployee() + " ", employee15.getDateHired() + " ", employee15.getDepartment() + " ", employee15.getHourWorked() + " ",
                employee15.getRateOfPay() + " ", employee15.getLeaveDays() + " ", employee15.getCarAllowance() + " ", employee15.getMonthlyGratuity() + " ", employee15.getTaxRate()+ " ", String.valueOf(employee15.getMonthlySalary())};

        return workerDetails[14];
    }

    public static String [] employee16() {
        Employee employee16 = new Employee("LM016", "Lame", "Rancholo", "17/07/1999", "M", "P_O_Box_100", "palapye", "account_officer", "24/10/2020", "account_and_HR_officers_department", 82, 500, 40, 0.15 * (82 * 500), 0.218 * (82 * 500), 0.14 * (82 * 500), ((82 * 500) + 0.15 * (82 * 500)) - (0.218 * (82 * 500) - 0.14 * (82 * 500)));

        workerDetails[15] = new String[]{employee16.getEmployeeId() + " ", employee16.getFirstName() + " ",
                employee16.getLastName() + " ", employee16.getDateOfBirth() + " ", employee16.getGender() + " ", employee16.getAddress() + " ",
                employee16.getCityOrTown() + " ", employee16.getTitleOfEmployee() + " ", employee16.getDateHired() + " ", employee16.getDepartment() + " ", employee16.getHourWorked() + " ",
                employee16.getRateOfPay() + " ", employee16.getLeaveDays() + " ", employee16.getCarAllowance() + " ", employee16.getMonthlyGratuity() + " ", employee16.getTaxRate()+ " ", String.valueOf(employee16.getMonthlySalary())};

        return workerDetails[15];
    }

    public static String [] employee17() {
        Employee employee17 = new Employee("ML017", "Melissa", "Lele", "12/10/1998", "F", "P_O_Box_392", "gaborone", "account_officer", "24/10/2020", "account_and_HR_officers_department", 82, 500, 40, 0.15 * (82 * 500), 0.218 * (82 * 500), 0.14 * (82 * 500), ((82 * 500) + 0.15 * (82 * 500)) - (0.218 * (82 * 500) - 0.14 * (82 * 500)));

        workerDetails[16] = new String[]{employee17.getEmployeeId() + " ", employee17.getFirstName() + " ",
                employee17.getLastName() + " ", employee17.getDateOfBirth() + " ", employee17.getGender() + " ", employee17.getAddress() + " ",
                employee17.getCityOrTown() + " ", employee17.getTitleOfEmployee() + " ", employee17.getDateHired() + " ", employee17.getDepartment() + " ", employee17.getHourWorked() + " ",
                employee17.getRateOfPay() + " ", employee17.getLeaveDays() + " ", employee17.getCarAllowance() + " ", employee17.getMonthlyGratuity() + " ",employee17.getTaxRate()+ " ", String.valueOf(employee17.getMonthlySalary())};

        return workerDetails[16];
    }

    public static String [] employee18() {
        Employee employee18 = new Employee("BM018", "balulame", "Malanga", "13/01/1998", "M", "P_O_Box_303", "lobatse", "account_officer", "24/10/2020", "account_and_HR_officers_department", 82, 500, 40, 0.15 * (82 * 500), 0.218 * (82 * 500), 0.14 * (82 * 500), ((82 * 500) + 0.15 * (82 * 500)) - (0.218 * (82 * 500) - 0.14 * (82 * 500)));

        workerDetails[17] = new String[]{employee18.getEmployeeId() + " ", employee18.getFirstName() + " ",
                employee18.getLastName() + " ", employee18.getDateOfBirth() + " ", employee18.getGender() + " ", employee18.getAddress() + " ",
                employee18.getCityOrTown() + " ", employee18.getTitleOfEmployee() + " ", employee18.getDateHired() + " ", employee18.getDepartment() + " ", employee18.getHourWorked() + " ",
                employee18.getRateOfPay() + " ", employee18.getLeaveDays() + " ", employee18.getCarAllowance() + " ", employee18.getMonthlyGratuity() + " ",employee18.getTaxRate()+ " ", String.valueOf(employee18.getMonthlySalary())};

        return workerDetails[17];
    }

    public static String [] employee19() {
        Employee employee19 = new Employee("TM019", "Thabo", "Modirwa", "12/05/1991", "M", "P_O_Box_326", "gaborone", "account_officer", "24/10/2020", "account and HR officers department", 82, 500, 40, 0.15 * (82 * 500), 0.218 * (82 * 500), 0.14 * (82 * 500), ((82 * 500) + 0.15 * (82 * 500)) - (0.218 * (82 * 500) - 0.14 * (82 * 500)));

        workerDetails[18] = new String[]{employee19.getEmployeeId() + " ", employee19.getFirstName() + " ",
                employee19.getLastName() + " ", employee19.getDateOfBirth() + " ", employee19.getGender() + " ", employee19.getAddress() + " ", employee19.getAddress() + " ",
                employee19.getCityOrTown() + " ", employee19.getTitleOfEmployee() + " ", employee19.getDateHired() + " ", employee19.getDepartment() + " ", employee19.getHourWorked() + " ",
                employee19.getRateOfPay() + " ", employee19.getLeaveDays() + " ", employee19.getCarAllowance() + " ", employee19.getMonthlyGratuity() + " ", employee19.getTaxRate()+ " ", String.valueOf(employee19.getMonthlySalary())};

        return workerDetails[18];
    }

    public static String [] employee20() {
        Employee employee20 = new Employee("ZK020", "Zanele", "Keemo", "22/07/1999", "F", "P_O_Box_765", "molepolole", "account_officer", "24/10/2020", "account_and_HR_officers_department", 82, 500, 40, 0.15 * (82 * 500), 0.218 * (82 * 500), 0.14 * (82 * 500), ((82 * 500) + 0.15 * (82 * 500)) - (0.218 * (82 * 500) - 0.14 * (82 * 500)));

        workerDetails[19] = new String[]{employee20.getEmployeeId() + " ", employee20.getFirstName() + " ",
                employee20.getLastName() + " ", employee20.getDateOfBirth() + " ", employee20.getGender() + " ", employee20.getAddress() + " ",
                employee20.getCityOrTown() + " ", employee20.getTitleOfEmployee() + " ", employee20.getDateHired() + " ", employee20.getDepartment() + " ", employee20.getHourWorked() + " ",
                employee20.getRateOfPay() + " ", employee20.getLeaveDays() + " ", employee20.getCarAllowance() + " ", employee20.getMonthlyGratuity() + " ",employee20.getTaxRate()+ " ", String.valueOf(employee20.getMonthlySalary())};

        return workerDetails[19];
    }

    public static String [] employee21() {
        Employee employee21 = new Employee("KS21", "Keletso", "Seje", "12/09/1998", "M", "P_O_Box_378", "thamaga", "HR_officer", "24/10/2020", "account_and_HR_officers_department", 82, 500, 40, 0.15 * (82 * 500), 0.218 * (82 * 500), 0.14 * (82 * 500), ((82 * 500) + 0.15 * (82 * 500)) - (0.218 * (82 * 500) - 0.14 * (82 * 500)));

        workerDetails[20] = new String[]{employee21.getEmployeeId() + " ", employee21.getFirstName() + " ",
                employee21.getLastName() + " ", employee21.getDateOfBirth() + " ", employee21.getGender() + " ", employee21.getAddress() + " ",
                employee21.getCityOrTown() + " ", employee21.getTitleOfEmployee() + " ", employee21.getDateHired() + " ", employee21.getDepartment() + " ", employee21.getHourWorked() + " ",
                employee21.getRateOfPay() + " ", employee21.getLeaveDays() + " ", employee21.getCarAllowance() + " ", employee21.getMonthlyGratuity() + " ",employee21.getTaxRate()+ " ", String.valueOf(employee21.getMonthlySalary())};

        return workerDetails[20];
    }

    public static String [] employee22() {
        Employee employee22 = new Employee("AL022", "Aone", "Leano", "15/04/1994", "F", "P_O_Box_456", "tonota", "HR_officer", "24/10/2020", "account_and_HR_officers_department", 82, 500, 40, 0.15 * (82 * 500), 0.218 * (82 * 500), 0.14 * (82 * 500), ((82 * 500) + 0.15 * (82 * 500)) - (0.218 * (82 * 500) - 0.14 * (82 * 500)));

        workerDetails[21] = new String[]{employee22.getEmployeeId() + " ", employee22.getFirstName() + " ",
                employee22.getLastName() + " ", employee22.getDateOfBirth() + " ", employee22.getGender() + " ", employee22.getAddress() + " ",
                employee22.getCityOrTown() + " ", employee22.getTitleOfEmployee() + " ", employee22.getDateHired() + " ", employee22.getDepartment() + " ", employee22.getHourWorked() + " ",
                employee22.getRateOfPay() + " ", employee22.getLeaveDays() + " ", employee22.getCarAllowance() + " ", employee22.getMonthlyGratuity() + " ", employee22.getTaxRate()+ " ", String.valueOf(employee22.getMonthlySalary())};

        return workerDetails[21];
    }

    public static String [] employee23() {
        Employee employee23 = new Employee("LK023", "Lebogang", "Kago", "23/07/2000", "M", "P_O_Box_145", "francistown", "HR_officer", "24/10/2020", "account_and_HR_officers_department", 82, 500, 40, 0.15 * (82 * 500), 0.218 * (82 * 500), 0.14 * (82 * 500), ((82 * 500) + 0.15 * (82 * 500)) - (0.218 * (82 * 500) - 0.14 * (82 * 500)));

        workerDetails[22] = new String[]{employee23.getEmployeeId() + " ", employee23.getFirstName() + " ",
                employee23.getLastName() + " ", employee23.getDateOfBirth() + " ", employee23.getGender() + " ", employee23.getAddress() + " ",
                employee23.getCityOrTown() + " ", employee23.getTitleOfEmployee() + " ", employee23.getDateHired() + " ", employee23.getDepartment() + " ", employee23.getHourWorked() + " ",
                employee23.getRateOfPay() + " ", employee23.getLeaveDays() + " ", employee23.getCarAllowance() + " ", employee23.getMonthlyGratuity() + " ", employee23.getTaxRate()+ " ", String.valueOf(employee23.getMonthlySalary())};

        return workerDetails[22];
    }

    public static String [] employee24() {
        Employee employee24 = new Employee("PK024", "Palesa", "Kgamanyane", "24/08/1998", "F", "P_O_Box_163", "palapye", "HR_officer", "24/10/2020", "account_and_HR_officers_department", 82, 500, 40, 0.15 * (82 * 500), 0.218 * (82 * 500), 0.14 * (82 * 500), ((82 * 500) + 0.15 * (82 * 500)) - (0.218 * (82 * 500) - 0.14 * (82 * 500)));

        workerDetails[23] = new String[]{employee24.getEmployeeId() + " ", employee24.getFirstName() + " ",
                employee24.getLastName() + " ", employee24.getDateOfBirth() + " ", employee24.getGender() + " ", employee24.getAddress() + " ",
                employee24.getCityOrTown() + " ", employee24.getTitleOfEmployee() + " ", employee24.getDateHired() + " ", employee24.getDepartment() + " ", employee24.getHourWorked() + " ",
                employee24.getRateOfPay() + " ", employee24.getLeaveDays() + " ", employee24.getCarAllowance() + " ", employee24.getMonthlyGratuity() + " ", employee24.getTaxRate()+ " ", String.valueOf(employee24.getMonthlySalary())};

        return workerDetails[23];
    }

    public static String [] employee25() {
        Employee employee25 = new Employee("AR025", "Atlang", "Ronald", "12/07/1998", "F", "P_O_Box_362", "gaborone", "HR_officer", "24/10/2020", "account_and_HR_officers_department", 82, 500, 40, 0.15 * (82 * 500), 0.218 * (82 * 500), 0.14 * (82 * 500), ((82 * 500) + 0.15 * (82 * 500)) - (0.218 * (82 * 500) - 0.14 * (82 * 500)));

        workerDetails[24] = new String[]{employee25.getEmployeeId() + " ", employee25.getFirstName() + " ",
                employee25.getLastName() + " ", employee25.getDateOfBirth() + " ", employee25.getGender() + " ", employee25.getAddress() + " ",
                employee25.getCityOrTown() + " ", employee25.getTitleOfEmployee() + " ", employee25.getDateHired() + " ", employee25.getDepartment() + " ", employee25.getHourWorked() + " ",
                employee25.getRateOfPay() + " ", employee25.getLeaveDays() + " ", employee25.getCarAllowance() + " ", employee25.getMonthlyGratuity() + " ", employee25.getMonthlySalary() + ""};

        return workerDetails[24];
    }

    public static String [] employee26() {
        Employee employee26 = new Employee("KL026", "Keletso", "Lesedi", "11/07/1996", "F", "P_O_Box_784", "tonota", "marketing_executive", "24/10/2020", "marketing_executive", 82, 500, 40, 0, 0.218 * (82 * 500), 0.14 * (82 * 500), (82 * 500) - (0.218 * (82 * 500) - 0.14 * (82 * 500)));

        workerDetails[25] = new String[]{employee26.getEmployeeId() + " ", employee26.getFirstName() + " ",
                employee26.getLastName() + " ", employee26.getDateOfBirth() + " ", employee26.getGender() + " ", employee26.getAddress() + " ",
                employee26.getCityOrTown() + " ", employee26.getTitleOfEmployee() + " ", employee26.getDateHired() + " ", employee26.getDepartment() + " ", employee26.getHourWorked() + " ",
                employee26.getRateOfPay() + " ", employee26.getLeaveDays() + " ", employee26.getCarAllowance() + " ", employee26.getMonthlyGratuity() + " ", employee26.getTaxRate()+ " ", String.valueOf(employee26.getMonthlySalary())};

        return workerDetails[25];
    }

    public static String [] employee27() {
        Employee employee27 = new Employee("BB027", "Babedi", "Basebi", "22/07/2000", "M", "P_O_Box_923", "tonota", "marketing_executive", "24/10/2020", "marketing_executive", 82, 500, 40, 0, 0.218 * (82 * 500), 0.14 * (82 * 500), (82 * 500) - (0.218 * (82 * 500) - 0.14 * (82 * 500)));

        workerDetails[26] = new String[]{employee27.getEmployeeId() + " ", employee27.getFirstName() + " ",
                employee27.getLastName() + " ", employee27.getDateOfBirth() + " ", employee27.getGender() + " ", employee27.getAddress() + " ",
                employee27.getCityOrTown() + " ", employee27.getTitleOfEmployee() + " ", employee27.getDateHired() + " ", employee27.getDepartment() + " ", employee27.getHourWorked() + " ",
                employee27.getRateOfPay() + " ", employee27.getLeaveDays() + " ", employee27.getCarAllowance() + " ", employee27.getMonthlyGratuity() + " ", employee27.getTaxRate()+ " ", String.valueOf(employee27.getMonthlySalary())};

        return workerDetails[26];
    }

    public static String [] employee28() {
        Employee employee28 = new Employee("RS028", "Resego", "Sesigo", "12/05/1998", "F", "P_O_Box_633", "tonota", "marketing_executive", "24/10/2020", "marketing_executive", 82, 500, 40, 0, 0.218 * (82 * 500), 0.14 * (82 * 500), (82 * 500) - (0.218 * (82 * 500) - 0.14 * (82 * 500)));

        workerDetails[27] = new String[]{employee28.getEmployeeId() + " ", employee28.getFirstName() + " ",
                employee28.getLastName() + " ", employee28.getDateOfBirth() + " ", employee28.getGender() + " ", employee28.getAddress() + " ",
                employee28.getCityOrTown() + " ", employee28.getTitleOfEmployee() + " ", employee28.getDateHired() + " ", employee28.getDepartment() + " ", employee28.getHourWorked() + " ",
                employee28.getRateOfPay() + " ", employee28.getLeaveDays() + " ", employee28.getCarAllowance() + " ", employee28.getMonthlyGratuity() + " ",employee28.getTaxRate()+ " ", String.valueOf(employee28.getMonthlySalary())};

        return workerDetails[27];
    }

    public static String[] employee29() {
        Employee employee29 = new Employee("JW029", "John", "Wick", "12/08/1998", "M", "P_O_Box_001", "tonota", "marketing_executive", "24/10/2020", "marketing_executive", 82, 500, 40, 0, 0.218 * (82 * 500), 0.14 * (82 * 500), (82 * 500) - (0.218 * (82 * 500) - 0.14 * (82 * 500)));

        workerDetails[28] = new String[]{employee29.getEmployeeId() + " ", employee29.getFirstName() + " ",
                employee29.getLastName() + " ", employee29.getDateOfBirth() + " ", employee29.getGender() + " ", employee29.getAddress() + " ",
                employee29.getCityOrTown() + " ", employee29.getTitleOfEmployee() + " ", employee29.getDateHired() + " ", employee29.getDepartment() + " ", employee29.getHourWorked() + " ",
                employee29.getRateOfPay() + " ", employee29.getLeaveDays() + " ", employee29.getCarAllowance() + " ", employee29.getMonthlyGratuity() + " ", employee29.getTaxRate()+ " ", String.valueOf(employee29.getMonthlySalary())};

        return workerDetails[28];
    }

    public static String [] employee30() {
        Employee employee30 = new Employee("AA030", "Aron", "Amantle", "25/07/1998", "M", "P_O_Box_403", "tonota", "marketing_executive", "24/10/2020", "marketing_executive", 82, 500, 40, 0, 0.218 * (82 * 500), 0.14 * (82 * 500), (82 * 500) - (0.218 * (82 * 500) - 0.14 * (82 * 500)));

        workerDetails[29] = new String[]{employee30.getEmployeeId() + " ", employee30.getFirstName() + " ",
                employee30.getLastName() + " ", employee30.getDateOfBirth() + " ", employee30.getGender() + " ", employee30.getAddress() + " ",
                employee30.getCityOrTown() + " ", employee30.getTitleOfEmployee() + " ", employee30.getDateHired() + " ", employee30.getDepartment() + " ", employee30.getHourWorked() + " ",
                employee30.getRateOfPay() + " ", employee30.getLeaveDays() + " ", employee30.getCarAllowance() + " ", employee30.getMonthlyGratuity() + " ", employee30.getTaxRate()+ " ", String.valueOf(employee30.getMonthlySalary())};

        return workerDetails[29];
    }

    public static String [] employee31() {
        Employee employee31 = new Employee("OW031", "Otsile", "Wantlha", "22/07/1998", "M", "P_O_Box_737", "tonota", "marketing_executive", "24/10/2020", "marketing_executive", 82, 500, 40, 0, 0.218 * (82 * 500), 0.14 * (82 * 500), (82 * 500) - (0.218 * (82 * 500) - 0.14 * (82 * 500)));

        workerDetails[30] = new String[]{employee31.getEmployeeId() + " ", employee31.getFirstName() + " ",
                employee31.getLastName() + " ", employee31.getDateOfBirth() + " ", employee31.getGender() + " ", employee31.getAddress() + " ",
                employee31.getCityOrTown() + " ", employee31.getTitleOfEmployee() + " ", employee31.getDateHired() + " ", employee31.getDepartment() + " ", employee31.getHourWorked() + " ",
                employee31.getRateOfPay() + " ", employee31.getLeaveDays() + " ", employee31.getCarAllowance() + " ", employee31.getMonthlyGratuity() + " ", employee31.getTaxRate()+ " ", String.valueOf(employee31.getMonthlySalary())};

        return workerDetails[30];
    }

    public static String [] employee32() {
        Employee employee32 = new Employee("KL032", "Kemo", "Lentswe", "12/11/1998", "F", "P_O_Box_356", "tonota", "marketing_executive", "24/10/2020", "marketing_executive", 82, 500, 40, 0, 0.218 * (82 * 500), 0.14 * (82 * 500), (82 * 500) - (0.218 * (82 * 500) - 0.14 * (82 * 500)));

        workerDetails[31] = new String[]{employee32.getEmployeeId() + " ", employee32.getFirstName() + " ",
                employee32.getLastName() + " ", employee32.getDateOfBirth() + " ", employee32.getGender() + " ", employee32.getAddress() + " ",
                employee32.getCityOrTown() + " ", employee32.getTitleOfEmployee() + " ", employee32.getDateHired() + " ", employee32.getDepartment() + " ", employee32.getHourWorked() + " ",
                employee32.getRateOfPay() + " ", employee32.getLeaveDays() + " ", employee32.getCarAllowance() + " ", employee32.getMonthlyGratuity() + " ", employee32.getTaxRate()+ " ", String.valueOf(employee32.getMonthlySalary())};

        return workerDetails[31];
    }

    public static String [] employee33() {
        Employee employee33 = new Employee("WW033", "Wame", "wesley", "12/07/1998", "F", "P_O_Box_364", "tonota", "marketing_executive", "24/10/2020", "marketing_executive", 82, 500, 40, 0, 0.218 * (82 * 500), 0.14 * (82 * 500), (82 * 500) - (0.218 * (82 * 500) - 0.14 * (82 * 500)));

        workerDetails[32] = new String[]{employee33.getEmployeeId() + " ", employee33.getFirstName() + " ",
                employee33.getLastName() + " ", employee33.getDateOfBirth() + " ", employee33.getGender() + " ", employee33.getAddress() + " ",
                employee33.getCityOrTown() + " ", employee33.getTitleOfEmployee() + " ", employee33.getDateHired() + " ", employee33.getDepartment() + " ", employee33.getHourWorked() + " ",
                employee33.getRateOfPay() + " ", employee33.getLeaveDays() + " ", employee33.getCarAllowance() + " ", employee33.getMonthlyGratuity() + " ", employee33.getTaxRate()+ " ", String.valueOf(employee33.getMonthlySalary())};

        return workerDetails[32];
    }

    public static String [] employee34() {
        Employee employee34 = new Employee("MM034", "Moso", "Masedi", "29/07/1998", "M", "P_O_Box_933", "tonota", "marketing_executive", "24/10/2020", "marketing_executive", 82, 500, 40, 0, 0.218 * (82 * 500), 0.14 * (82 * 500), (82 * 500) - (0.218 * (82 * 500) - 0.14 * (82 * 500)));

        workerDetails[33] = new String[]{employee34.getEmployeeId() + " ", employee34.getFirstName() + " ",
                employee34.getLastName() + " ", employee34.getDateOfBirth() + " ", employee34.getGender() + " ", employee34.getAddress() + " ",
                employee34.getCityOrTown() + " ", employee34.getTitleOfEmployee() + " ", employee34.getDateHired() + " ", employee34.getDepartment() + " ", employee34.getHourWorked() + " ",
                employee34.getRateOfPay() + " ", employee34.getLeaveDays() + " ", employee34.getCarAllowance() + " ", employee34.getMonthlyGratuity() + " ", employee34.getTaxRate()+ " ", String.valueOf(employee34.getMonthlySalary())};

        return workerDetails[33];
    }

    public static String [] employee35() {
        Employee employee35 = new Employee("AR035", "Ame", "Ramothibi", "12/07/2001", "F", "P_O_Box_369", "tonota", "marketing_executive", "24/10/2020", "marketing_executive", 82, 500, 40, 0, 0.218 * (82 * 500), 0.14 * (82 * 500), (82 * 500) - (0.218 * (82 * 500) - 0.14 * (82 * 500)));

        workerDetails[34] = new String[]{employee35.getEmployeeId() + " ", employee35.getFirstName() + " ",
                employee35.getLastName() + " ", employee35.getDateOfBirth() + " ", employee35.getGender() + " ", employee35.getAddress() + " ",
                employee35.getCityOrTown() + " ", employee35.getTitleOfEmployee() + " ", employee35.getDateHired() + " ", employee35.getDepartment() + " ", employee35.getHourWorked() + " ",
                employee35.getRateOfPay() + " ", employee35.getLeaveDays() + " ", employee35.getCarAllowance() + " ", employee35.getMonthlyGratuity() + " ", employee35.getTaxRate()+ " ", String.valueOf(employee35.getMonthlySalary())};

        return workerDetails[34];
    }

    public static String [] employee36() {
        Employee employee36 = new Employee("RM036", "Rengu", "Mosele", "12/07/1995", "M", "P_O_Box_310", "tonota", "marketing_executive", "24/10/2020", "marketing_executive", 82, 500, 40, 0, 0.218 * (82 * 500), 0.14 * (82 * 500), (82 * 500) - (0.218 * (82 * 500) - 0.14 * (82 * 500)));

        workerDetails[35] = new String[]{employee36.getEmployeeId() + " ", employee36.getFirstName() + " ",
                employee36.getLastName() + " ", employee36.getDateOfBirth() + " ", employee36.getGender() + " ", employee36.getAddress() + " ",
                employee36.getCityOrTown() + " ", employee36.getTitleOfEmployee() + " ", employee36.getDateHired() + " ", employee36.getDepartment() + " ", employee36.getHourWorked() + " ",
                employee36.getRateOfPay() + " ", employee36.getLeaveDays() + " ", employee36.getCarAllowance() + " ", employee36.getMonthlyGratuity() + " ", employee36.getTaxRate()+ " ", String.valueOf(employee36.getMonthlySalary())};

        return workerDetails[35];
    }

    public static String[] employee37() {
        Employee employee37 = new Employee("WB037", "Wangu", "Bantsi", "12/12/1999", "F", "P_O_Box_733", "tonota", "marketing_executive", "24/10/2020", "marketing_executive", 82, 500, 40, 0, 0.218 * (82 * 500), 0.14 * (82 * 500), (82 * 500) - (0.218 * (82 * 500) - 0.14 * (82 * 500)));

        workerDetails[36] = new String[]{employee37.getEmployeeId() + " ", employee37.getFirstName() + " ",
                employee37.getLastName() + " ", employee37.getDateOfBirth() + " ", employee37.getGender() + " ", employee37.getAddress() + " ",
                employee37.getCityOrTown() + " ", employee37.getTitleOfEmployee() + " ", employee37.getDateHired() + " ", employee37.getDepartment() + " ", employee37.getHourWorked() + " ",
                employee37.getRateOfPay() + " ", employee37.getLeaveDays() + " ", employee37.getCarAllowance() + " ", employee37.getMonthlyGratuity() + " ", employee37.getTaxRate()+ " ", String.valueOf(employee37.getMonthlySalary())};

        return workerDetails[36];
    }

    public static String [] employee38() {
        Employee employee38 = new Employee("TT038", "Tumo", "Tebo", "01/07/2000", "F", "P_O_Box_303", "tonota", "marketing_executive", "24/10/2020", "marketing_executive", 82, 500, 40, 0, 0.218 * (82 * 500), 0.14 * (82 * 500), (82 * 500) - (0.218 * (82 * 500) - 0.14 * (82 * 500)));

        workerDetails[37] = new String[]{employee38.getEmployeeId() + " ", employee38.getFirstName() + " ",
                employee38.getLastName() + " ", employee38.getDateOfBirth() + " ", employee38.getGender() + " ", employee38.getAddress() + " ",
                employee38.getCityOrTown() + " ", employee38.getTitleOfEmployee() + " ", employee38.getDateHired() + " ", employee38.getDepartment() + " ", employee38.getHourWorked() + " ",
                employee38.getRateOfPay() + " ", employee38.getLeaveDays() + " ", employee38.getCarAllowance() + " ", employee38.getMonthlyGratuity() + " ", employee38.getTaxRate()+ " ", String.valueOf(employee38.getMonthlySalary())};

        return workerDetails[37];
    }

    public static String [] employee39() {
        Employee employee39 = new Employee("PL039", "Poloko", "Leswe", "17/07/1998", "M", "P_O_Box_393", "tonota", "marketing_executive", "24/10/2020", "marketing_executive", 82, 500, 40, 0, 0.218 * (82 * 500), 0.14 * (82 * 500), (82 * 500) - (0.218 * (82 * 500) - 0.14 * (82 * 500)));

        workerDetails[38] = new String[]{employee39.getEmployeeId() + " ", employee39.getFirstName() + " ",
                employee39.getLastName() + " ", employee39.getDateOfBirth() + " ", employee39.getGender() + " ", employee39.getAddress() + " ",
                employee39.getCityOrTown() + " ", employee39.getTitleOfEmployee() + " ", employee39.getDateHired() + " ", employee39.getDepartment() + " ", employee39.getHourWorked() + " ",
                employee39.getRateOfPay() + " ", employee39.getLeaveDays() + " ", employee39.getCarAllowance() + " ", employee39.getMonthlyGratuity() + " ", employee39.getTaxRate()+ " ", String.valueOf(employee39.getMonthlySalary())};

        return workerDetails[38];
    }

    public static String [] employee40() {
        Employee employee40 = new Employee("AS040", "Aone", "Settler", "12/03/1999", "F", "P_O_Box_743", "tonota", "marketing_executive", "24/10/2020", "marketing_executive", 82, 500, 40, 0, 0.218 * (82 * 500), 0.14 * (82 * 500), (82 * 500) - (0.218 * (82 * 500) - 0.14 * (82 * 500)));

        workerDetails[39] = new String[]{employee40.getEmployeeId() + " ", employee40.getFirstName() + " ",
                employee40.getLastName() + " ", employee40.getDateOfBirth() + " ", employee40.getGender() + " ", employee40.getAddress() + " ",
                employee40.getCityOrTown() + " ", employee40.getTitleOfEmployee() + " ", employee40.getDateHired() + " ", employee40.getDepartment() + " ", employee40.getHourWorked() + " ",
                employee40.getRateOfPay() + " ", employee40.getLeaveDays() + " ", employee40.getCarAllowance() + " ", employee40.getMonthlyGratuity() + " ", employee40.getTaxRate()+ " ", String.valueOf(employee40.getMonthlySalary())};

        return workerDetails[39];
    }

    public static String [] employee41() {
        Employee employee41 = new Employee("TM041", "Tebogo", "Modirwa", "22/07/1993", "M", "P_O_Box_843", "tonota", "marketing_executive", "24/10/2020", "marketing_executive", 82, 500, 40, 0, 0.218 * (82 * 500), 0.14 * (82 * 500), (82 * 500) - (0.218 * (82 * 500) - 0.14 * (82 * 500)));

        workerDetails[40] = new String[]{employee41.getEmployeeId() + " ", employee41.getFirstName() + " ",
                employee41.getLastName() + " ", employee41.getDateOfBirth() + " ", employee41.getGender() + " ", employee41.getAddress() + " ",
                employee41.getCityOrTown() + " ", employee41.getTitleOfEmployee() + " ", employee41.getDateHired() + " ", employee41.getDepartment() + " ", employee41.getHourWorked() + " ",
                employee41.getRateOfPay() + " ", employee41.getLeaveDays() + " ", employee41.getCarAllowance() + " ", employee41.getMonthlyGratuity() + " ", employee41.getTaxRate()+ " ", String.valueOf(employee41.getMonthlySalary())};

        return workerDetails[40];
    }

    public static String [] employee42() {
        Employee employee42 = new Employee("SM042", "Saone", "Moso", "05/09/1998", "F", "P_O_Box_783", "tonota", "marketing_executive", "24/10/2020", "marketing_executive", 82, 500, 40, 0, 0.218 * (82 * 500), 0.14 * (82 * 500), (82 * 500) - (0.218 * (82 * 500) - 0.14 * (82 * 500)));

        workerDetails[41] = new String[]{employee42.getEmployeeId() + " ", employee42.getFirstName() + " ",
                employee42.getLastName() + " ", employee42.getDateOfBirth() + " ", employee42.getGender() + " ", employee42.getAddress() + " ",
                employee42.getCityOrTown() + " ", employee42.getTitleOfEmployee() + " ", employee42.getDateHired() + " ", employee42.getDepartment() + " ", employee42.getHourWorked() + " ",
                employee42.getRateOfPay() + " ", employee42.getLeaveDays() + " ", employee42.getCarAllowance() + " ", employee42.getMonthlyGratuity() + " ", employee42.getTaxRate()+ " ", String.valueOf(employee42.getMonthlySalary())};

        return workerDetails[41];
    }

    public static String [] employee43() {
        Employee employee43 = new Employee("FM043", "Fiona", "Mosa", "05/07/1998", "F", "P_O_Box_354", "tonota", "marketing_executive", "24/10/2020", "marketing_executive", 82, 500, 40, 0, 0.218 * (82 * 500), 0.14 * (82 * 500), (82 * 500) - (0.218 * (82 * 500) - 0.14 * (82 * 500)));

        workerDetails[42] = new String[]{employee43.getEmployeeId() + " ", employee43.getFirstName() + " ",
                employee43.getLastName() + " ", employee43.getDateOfBirth() + " ", employee43.getGender() + " ", employee43.getAddress() + " ",
                employee43.getCityOrTown() + " ", employee43.getTitleOfEmployee() + " ", employee43.getDateHired() + " ", employee43.getDepartment() + " ", employee43.getHourWorked() + " ",
                employee43.getRateOfPay() + " ", employee43.getLeaveDays() + " ", employee43.getCarAllowance() + " ", employee43.getMonthlyGratuity() + " ", employee43.getTaxRate()+ " ", String.valueOf(employee43.getMonthlySalary())};

        return workerDetails[42];
    }

    public static String [] employee44() {
        Employee employee44 = new Employee("AF044", "Aobakwe", "Fanani", "12/10/1995", "M", "P_O_Box_323", "tonota", "marketing_executive", "24/10/2020", "marketing_executive", 82, 500, 40, 0, 0.218 * (82 * 500), 0.14 * (82 * 500), (82 * 500) - (0.218 * (82 * 500) - 0.14 * (82 * 500)));

        workerDetails[43] = new String[]{employee44.getEmployeeId() + " ", employee44.getFirstName() + " ",
                employee44.getLastName() + " ", employee44.getDateOfBirth() + " ", employee44.getGender() + " ", employee44.getAddress() + " ",
                employee44.getCityOrTown() + " ", employee44.getTitleOfEmployee() + " ", employee44.getDateHired() + " ", employee44.getDepartment() + " ", employee44.getHourWorked() + " ",
                employee44.getRateOfPay() + " ", employee44.getLeaveDays() + " ", employee44.getCarAllowance() + " ", employee44.getMonthlyGratuity() + " ", employee44.getTaxRate()+ " ", String.valueOf(employee44.getMonthlySalary())};

        return workerDetails[43];
    }

    public static String [] employee45() {
        Employee employee45 = new Employee("FF045", "Fifi", "Fani", "12/08/1998", "F", "P_O_Box_133", "tonota", "marketing_executive", "24/10/2020", "marketing_executive", 82, 500, 40, 0, 0.218 * (82 * 500), 0.14 * (82 * 500), (82 * 500) - (0.218 * (82 * 500) - 0.14 * (82 * 500)));

        workerDetails[44] = new String[]{employee45.getEmployeeId() + " ", employee45.getFirstName() + " ",
                employee45.getLastName() + " ", employee45.getDateOfBirth() + " ", employee45.getGender() + " ", employee45.getAddress() + " ",
                employee45.getCityOrTown() + " ", employee45.getTitleOfEmployee() + " ", employee45.getDateHired() + " ", employee45.getDepartment() + " ", employee45.getHourWorked() + " ",
                employee45.getRateOfPay() + " ", employee45.getLeaveDays() + " ", employee45.getCarAllowance() + " ", employee45.getMonthlyGratuity() + " ", employee45.getTaxRate()+ " ",employee45.getTaxRate()+ " ", String.valueOf(employee45.getMonthlySalary())};

        return workerDetails[44];
    }

    public static String [] employee46() {
        Employee employee46 = new Employee("YN046", "Yaone", "Nomani", "12/02/1998", "F", "P_O_Box_353", "tonota", "marketing_executive", "24/10/2020", "marketing_executive", 82, 500, 40, 0, 0.218 * (82 * 500), 0.14 * (82 * 500), (82 * 500) - (0.218 * (82 * 500) - 0.14 * (82 * 500)));

        workerDetails[45] = new String[]{employee46.getEmployeeId() + " ", employee46.getFirstName() + " ",
                employee46.getLastName() + " ", employee46.getDateOfBirth() + " ", employee46.getGender() + " ", employee46.getAddress() + " ",
                employee46.getCityOrTown() + " ", employee46.getTitleOfEmployee() + " ", employee46.getDateHired() + " ", employee46.getDepartment() + " ", employee46.getHourWorked() + " ",
                employee46.getRateOfPay() + " ", employee46.getLeaveDays() + " ", employee46.getCarAllowance() + " ", employee46.getMonthlyGratuity() + " ", employee46.getTaxRate()+ " ", String.valueOf(employee46.getMonthlySalary())};

        return workerDetails[45];
    }

    public static String [] employee47() {
        Employee employee47 = new Employee("GG047", "Game", "Galaletsang", "11/07/1999", "M", "P_O_Box_334", "tonota", "marketing_executive", "24/10/2020", "marketing_executive", 82, 500, 40, 0, 0.218 * (82 * 500), 0.14 * (82 * 500), (82 * 500) - (0.218 * (82 * 500) - 0.14 * (82 * 500)));

        workerDetails[46] = new String[]{employee47.getEmployeeId() + " ", employee47.getFirstName() + " ",
                employee47.getLastName() + " ", employee47.getDateOfBirth() + " ", employee47.getGender() + " ", employee47.getAddress() + " ",
                employee47.getCityOrTown() + " ", employee47.getTitleOfEmployee() + " ", employee47.getDateHired() + " ", employee47.getDepartment() + " ", employee47.getHourWorked() + " ",
                employee47.getRateOfPay() + " ", employee47.getLeaveDays() + " ", employee47.getCarAllowance() + " ", employee47.getMonthlyGratuity() + " ",employee47.getTaxRate()+ " ", String.valueOf(employee47.getMonthlySalary())};

        return workerDetails[46];
    }

    public static String [] employee48() {
        Employee employee48 = new Employee("GK048", "Gaone", "Kealeboga", "15/06/1998", "F", "P_O_Box_332", "tonota", "marketing_executive", "24/10/2020", "marketing_executive", 82, 500, 40, 0, 0.218 * (82 * 500), 0.14 * (82 * 500), (82 * 500) - (0.218 * (82 * 500) - 0.14 * (82 * 500)));

        workerDetails[47] = new String[]{employee48.getEmployeeId() + " ", employee48.getFirstName() + " ",
                employee48.getLastName() + " ", employee48.getDateOfBirth() + " ", employee48.getGender() + " ", employee48.getAddress() + " ",
                employee48.getCityOrTown() + " ", employee48.getTitleOfEmployee() + " ", employee48.getDateHired() + " ", employee48.getDepartment() + " ", employee48.getHourWorked() + " ",
                employee48.getRateOfPay() + " ", employee48.getLeaveDays() + " ", employee48.getCarAllowance() + " ", employee48.getMonthlyGratuity() + " ", employee48.getTaxRate()+ " ", String.valueOf(employee48.getMonthlySalary())};

        return workerDetails[47];
    }

    public static String [] employee49() {
        Employee employee49 = new Employee("DM049", "Davince", "Moswa", "15/03/1998", "M", "P_O_Box_331", "tonota", "marketing_executive", "24/10/2020", "marketing_executive", 82, 500, 40, 0, 0.218 * (82 * 500), 0.14 * (82 * 500), (82 * 500) - (0.218 * (82 * 500) - 0.14 * (82 * 500)));

        workerDetails[48] = new String[]{employee49.getEmployeeId() + " ", employee49.getFirstName() + " ",
                employee49.getLastName() + " ", employee49.getDateOfBirth() + " ", employee49.getGender() + " ", employee49.getAddress() + " ",
                employee49.getCityOrTown() + " ", employee49.getTitleOfEmployee() + " ", employee49.getDateHired() + " ", employee49.getDepartment() + " ", employee49.getHourWorked() + " ",
                employee49.getRateOfPay() + " ", employee49.getLeaveDays() + " ", employee49.getCarAllowance() + " ", employee49.getMonthlyGratuity() + " ", employee49.getTaxRate()+ " ", String.valueOf(employee49.getMonthlySalary())};

        return workerDetails[48];
    }

    public static String [] employee50() {
        Employee employee50 = new Employee("WB050", "Wabo", "Babedi", "09/09/1998", "F", "P_O_Box_333", "tonota", "marketing_executive", "24/10/2020", "marketing_executive", 82, 500, 40, 0, 0.218 * (82 * 500), 0.14 * (82 * 500), (82 * 500) - (0.218 * (82 * 500) - 0.14 * (82 * 500)));

        workerDetails[49] = new String[]{employee50.getEmployeeId() + " ", employee50.getFirstName() + " ",
                employee50.getLastName() + " ", employee50.getDateOfBirth() + " ", employee50.getGender() + " ", employee50.getAddress() + " ",
                employee50.getCityOrTown() + " ", employee50.getTitleOfEmployee() + " ", employee50.getDateHired() + " ", employee50.getDepartment() + " ", employee50.getHourWorked() + " ",
                employee50.getRateOfPay() + " ", employee50.getLeaveDays() + " ", employee50.getCarAllowance() + " ", employee50.getMonthlyGratuity() + " ", employee50.getTaxRate()+ " ", String.valueOf(employee50.getMonthlySalary())};

        return workerDetails[49];
    }
    public static void callMethods()
    {
        employee1();
        employee2();
        employee3();
        employee4();
        employee5();
        employee6();
        employee7();
        employee8();
        employee9();
        employee10();
        employee11();
        employee12();
        employee13();
        employee14();
        employee15();
        employee16();
        employee17();
        employee18();
        employee19();
        employee20();
        employee21();
        employee22();
        employee23();
        employee24();
        employee25();
        employee26();
        employee27();
        employee28();
        employee29();
        employee30();
        employee31();
        employee32();
        employee33();
        employee34();
        employee35();
        employee36();
        employee37();
        employee38();
        employee39();
        employee40();
        employee41();
        employee42();
        employee43();
        employee44();
        employee45();
        employee46();
        employee47();
        employee48();
        employee49();
        employee50();
    }
}
