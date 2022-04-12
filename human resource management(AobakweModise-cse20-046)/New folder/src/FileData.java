public class FileData
{
    //Variables not editable
    final static int DATA_LINES_LIMIT = 51;

    public String [][] callFileData(){
        String[][] fileData = new String[DATA_LINES_LIMIT][];
        EditEmployees.method();

        fileData[1] = EditEmployees.emp1();
        fileData[2] = EditEmployees.emp2();
        fileData[3] = EditEmployees.emp3();
        fileData[4] = EditEmployees.emp4();
        fileData[5] = EditEmployees.emp5();
        fileData[6] = EditEmployees.emp6();
        fileData[7] = EditEmployees.emp7();
        fileData[8] = EditEmployees.emp8();
        fileData[9] = EditEmployees.emp9();
        fileData[10] = EditEmployees.emp10();
        fileData[11] = EditEmployees.emp11();
        fileData[12] = EditEmployees.emp12();
        fileData[13] = EditEmployees.emp13();
        fileData[14] = EditEmployees.emp14();
        fileData[15] = EditEmployees.emp15();
        fileData[16] = EditEmployees.emp16();
        fileData[17] = EditEmployees.emp17();
        fileData[18] = EditEmployees.emp18();
        fileData[19] = EditEmployees.emp19();
        fileData[20] = EditEmployees.emp20();
        fileData[21] = EditEmployees.emp21();
        fileData[22] = EditEmployees.emp22();
        fileData[23] = EditEmployees.emp23();
        fileData[24] = EditEmployees.emp24();
        fileData[25] = EditEmployees.emp25();
        fileData[26] = EditEmployees.emp26();
        fileData[27] = EditEmployees.emp27();
        fileData[28] = EditEmployees.emp28();
        fileData[29] = EditEmployees.emp29();
        fileData[30] = EditEmployees.emp30();
        fileData[31] = EditEmployees.emp31();
        fileData[32] = EditEmployees.emp32();
        fileData[33] = EditEmployees.emp33();
        fileData[34] = EditEmployees.emp34();
        fileData[35] = EditEmployees.emp35();
        fileData[36] = EditEmployees.emp36();
        fileData[37] = EditEmployees.emp37();
        fileData[38] = EditEmployees.emp38();
        fileData[39] = EditEmployees.emp39();
        fileData[40] = EditEmployees.emp40();
        fileData[41] = EditEmployees.emp41();
        fileData[42] = EditEmployees.emp42();
        fileData[43] = EditEmployees.emp43();
        fileData[44] = EditEmployees.emp44();
        fileData[45] = EditEmployees.emp45();
        fileData[46] = EditEmployees.emp46();
        fileData[47] = EditEmployees.emp47();
        fileData[48] = EditEmployees.emp48();
        fileData[49] = EditEmployees.emp49();
        fileData[50] = EditEmployees.emp50();

        return fileData;
    }

    //Table Headers

    public String[] employeeTableHeader(){
        return new String[]{ "ID", "Name", "Surname", "D.O.B", "Gender", "Address", "Job Title", "Hours Worked", "Department", "Rate Of Pay",
                "Car Allowance", "Monthly Gratuity", "Tax Rate" };
    }

    public String[] salaryTableHeader(){
        return new String[]{ "ID", "Name", "Surname", "Salary" };
    }

    public String[] grossTableHeader(){
        return new String[]{ "ID", "Name", "Surname", "Gross" };
    }

    public String[] femEmpTableHeader(){
        return new String[]{ "ID", "Name", "Surname", "Gender" };
    }

    public String[] censusTableHeader(){
        return new String[]{ "Gaborone","Francistown" , "Molepolole", "Serowe", "Lobatse" };
    }

    //Table Columns

    public String[][] employeeTableColumns()
    {
        int add = 0;

        return new String[][]{
                {DataManager.tokenManager()[0], DataManager.tokenManager()[add+=1], DataManager.tokenManager()[add+=1], DataManager.tokenManager()[add+=1], DataManager.tokenManager()[add+=1], DataManager.tokenManager()[add+=1], DataManager.tokenManager()[add+=1], DataManager.tokenManager()[add+=1]
                        , DataManager.tokenManager()[add+=1], DataManager.tokenManager()[add+=1], DataManager.tokenManager()[add+=1], DataManager.tokenManager()[add+=1], DataManager.tokenManager()[add+=1]},
                {DataManager.tokenManager()[add+=1], DataManager.tokenManager()[add+=1], DataManager.tokenManager()[add+=1], DataManager.tokenManager()[add+=1], DataManager.tokenManager()[add+=1], DataManager.tokenManager()[add+=1], DataManager.tokenManager()[add+=1], DataManager.tokenManager()[add+=1]
                        , DataManager.tokenManager()[add+=1], DataManager.tokenManager()[add+=1], DataManager.tokenManager()[add+=1], DataManager.tokenManager()[add+=1], DataManager.tokenManager()[add+=1]},
                {DataManager.tokenManager()[add+=1], DataManager.tokenManager()[add+=1], DataManager.tokenManager()[add+=1], DataManager.tokenManager()[add+=1], DataManager.tokenManager()[add+=1], DataManager.tokenManager()[add+=1], DataManager.tokenManager()[add+=1], DataManager.tokenManager()[add+=1]
                        , DataManager.tokenManager()[add+=1], DataManager.tokenManager()[add+=1], DataManager.tokenManager()[add+=1], DataManager.tokenManager()[add+=1], DataManager.tokenManager()[add+=1]},
                {DataManager.tokenManager()[add+=1], DataManager.tokenManager()[add+=1], DataManager.tokenManager()[add+=1], DataManager.tokenManager()[add+=1], DataManager.tokenManager()[add+=1], DataManager.tokenManager()[add+=1], DataManager.tokenManager()[add+=1], DataManager.tokenManager()[add+=1]
                        , DataManager.tokenManager()[add+=1], DataManager.tokenManager()[add+=1], DataManager.tokenManager()[add+=1], DataManager.tokenManager()[add+=1], DataManager.tokenManager()[add+=1]},
                {DataManager.tokenManager()[add+=1], DataManager.tokenManager()[add+=1], DataManager.tokenManager()[add+=1], DataManager.tokenManager()[add+=1], DataManager.tokenManager()[add+=1], DataManager.tokenManager()[add+=1], DataManager.tokenManager()[add+=1], DataManager.tokenManager()[add+=1]
                        , DataManager.tokenManager()[add+=1], DataManager.tokenManager()[add+=1], DataManager.tokenManager()[add+=1], DataManager.tokenManager()[add+=1], DataManager.tokenManager()[add+=1]},
                {DataManager.tokenManager()[add+=1], DataManager.tokenManager()[add+=1], DataManager.tokenManager()[add+=1], DataManager.tokenManager()[add+=1], DataManager.tokenManager()[add+=1], DataManager.tokenManager()[add+=1], DataManager.tokenManager()[add+=1], DataManager.tokenManager()[add+=1]
                        , DataManager.tokenManager()[add+=1], DataManager.tokenManager()[add+=1], DataManager.tokenManager()[add+=1], DataManager.tokenManager()[add+=1], DataManager.tokenManager()[add+=1]},
                {DataManager.tokenManager()[add+=1], DataManager.tokenManager()[add+=1], DataManager.tokenManager()[add+=1], DataManager.tokenManager()[add+=1], DataManager.tokenManager()[add+=1], DataManager.tokenManager()[add+=1], DataManager.tokenManager()[add+=1], DataManager.tokenManager()[add+=1]
                        , DataManager.tokenManager()[add+=1], DataManager.tokenManager()[add+=1], DataManager.tokenManager()[add+=1], DataManager.tokenManager()[add+=1], DataManager.tokenManager()[add+=1]},
                {DataManager.tokenManager()[add+=1], DataManager.tokenManager()[add+=1], DataManager.tokenManager()[add+=1], DataManager.tokenManager()[add+=1], DataManager.tokenManager()[add+=1], DataManager.tokenManager()[add+=1], DataManager.tokenManager()[add+=1], DataManager.tokenManager()[add+=1]
                        , DataManager.tokenManager()[add+=1], DataManager.tokenManager()[add+=1], DataManager.tokenManager()[add+=1], DataManager.tokenManager()[add+=1], DataManager.tokenManager()[add+=1]},
                {DataManager.tokenManager()[add+=1], DataManager.tokenManager()[add+=1], DataManager.tokenManager()[add+=1], DataManager.tokenManager()[add+=1], DataManager.tokenManager()[add+=1], DataManager.tokenManager()[add+=1], DataManager.tokenManager()[add+=1], DataManager.tokenManager()[add+=1]
                        , DataManager.tokenManager()[add+=1], DataManager.tokenManager()[add+=1], DataManager.tokenManager()[add+=1], DataManager.tokenManager()[add+=1], DataManager.tokenManager()[add+=1]},
                {DataManager.tokenManager()[add+=1], DataManager.tokenManager()[add+=1], DataManager.tokenManager()[add+=1], DataManager.tokenManager()[add+=1], DataManager.tokenManager()[add+=1], DataManager.tokenManager()[add+=1], DataManager.tokenManager()[add+=1], DataManager.tokenManager()[add+=1]
                        , DataManager.tokenManager()[add+=1], DataManager.tokenManager()[add+=1], DataManager.tokenManager()[add+=1], DataManager.tokenManager()[add+=1], DataManager.tokenManager()[add+=1]},
                {DataManager.tokenManager()[add+=1], DataManager.tokenManager()[add+=1], DataManager.tokenManager()[add+=1], DataManager.tokenManager()[add+=1], DataManager.tokenManager()[add+=1], DataManager.tokenManager()[add+=1], DataManager.tokenManager()[add+=1], DataManager.tokenManager()[add+=1]
                        , DataManager.tokenManager()[add+=1], DataManager.tokenManager()[add+=1], DataManager.tokenManager()[add+=1], DataManager.tokenManager()[add+=1], DataManager.tokenManager()[add+=1]},
                {DataManager.tokenManager()[add+=1], DataManager.tokenManager()[add+=1], DataManager.tokenManager()[add+=1], DataManager.tokenManager()[add+=1], DataManager.tokenManager()[add+=1], DataManager.tokenManager()[add+=1], DataManager.tokenManager()[add+=1], DataManager.tokenManager()[add+=1]
                        , DataManager.tokenManager()[add+=1], DataManager.tokenManager()[add+=1], DataManager.tokenManager()[add+=1], DataManager.tokenManager()[add+=1], DataManager.tokenManager()[add+=1]},
                {DataManager.tokenManager()[add+=1], DataManager.tokenManager()[add+=1], DataManager.tokenManager()[add+=1], DataManager.tokenManager()[add+=1], DataManager.tokenManager()[add+=1], DataManager.tokenManager()[add+=1], DataManager.tokenManager()[add+=1], DataManager.tokenManager()[add+=1]
                        , DataManager.tokenManager()[add+=1], DataManager.tokenManager()[add+=1], DataManager.tokenManager()[add+=1], DataManager.tokenManager()[add+=1], DataManager.tokenManager()[add+=1]},
                {DataManager.tokenManager()[add+=1], DataManager.tokenManager()[add+=1], DataManager.tokenManager()[add+=1], DataManager.tokenManager()[add+=1], DataManager.tokenManager()[add+=1], DataManager.tokenManager()[add+=1], DataManager.tokenManager()[add+=1], DataManager.tokenManager()[add+=1]
                        , DataManager.tokenManager()[add+=1], DataManager.tokenManager()[add+=1], DataManager.tokenManager()[add+=1], DataManager.tokenManager()[add+=1], DataManager.tokenManager()[add+=1]},
                {DataManager.tokenManager()[add+=1], DataManager.tokenManager()[add+=1], DataManager.tokenManager()[add+=1], DataManager.tokenManager()[add+=1], DataManager.tokenManager()[add+=1], DataManager.tokenManager()[add+=1], DataManager.tokenManager()[add+=1], DataManager.tokenManager()[add+=1]
                        , DataManager.tokenManager()[add+=1], DataManager.tokenManager()[add+=1], DataManager.tokenManager()[add+=1], DataManager.tokenManager()[add+=1], DataManager.tokenManager()[add+=1]},
                {DataManager.tokenManager()[add+=1], DataManager.tokenManager()[add+=1], DataManager.tokenManager()[add+=1], DataManager.tokenManager()[add+=1], DataManager.tokenManager()[add+=1], DataManager.tokenManager()[add+=1], DataManager.tokenManager()[add+=1], DataManager.tokenManager()[add+=1]
                        , DataManager.tokenManager()[add+=1], DataManager.tokenManager()[add+=1], DataManager.tokenManager()[add+=1], DataManager.tokenManager()[add+=1], DataManager.tokenManager()[add+=1]},
                {DataManager.tokenManager()[add+=1], DataManager.tokenManager()[add+=1], DataManager.tokenManager()[add+=1], DataManager.tokenManager()[add+=1], DataManager.tokenManager()[add+=1], DataManager.tokenManager()[add+=1], DataManager.tokenManager()[add+=1], DataManager.tokenManager()[add+=1]
                        , DataManager.tokenManager()[add+=1], DataManager.tokenManager()[add+=1], DataManager.tokenManager()[add+=1], DataManager.tokenManager()[add+=1], DataManager.tokenManager()[add+=1]},
                {DataManager.tokenManager()[add+=1], DataManager.tokenManager()[add+=1], DataManager.tokenManager()[add+=1], DataManager.tokenManager()[add+=1], DataManager.tokenManager()[add+=1], DataManager.tokenManager()[add+=1], DataManager.tokenManager()[add+=1], DataManager.tokenManager()[add+=1]
                        , DataManager.tokenManager()[add+=1], DataManager.tokenManager()[add+=1], DataManager.tokenManager()[add+=1], DataManager.tokenManager()[add+=1], DataManager.tokenManager()[add+=1]},
                {DataManager.tokenManager()[add+=1], DataManager.tokenManager()[add+=1], DataManager.tokenManager()[add+=1], DataManager.tokenManager()[add+=1], DataManager.tokenManager()[add+=1], DataManager.tokenManager()[add+=1], DataManager.tokenManager()[add+=1], DataManager.tokenManager()[add+=1]
                        , DataManager.tokenManager()[add+=1], DataManager.tokenManager()[add+=1], DataManager.tokenManager()[add+=1], DataManager.tokenManager()[add+=1], DataManager.tokenManager()[add+=1]},
                {DataManager.tokenManager()[add+=1], DataManager.tokenManager()[add+=1], DataManager.tokenManager()[add+=1], DataManager.tokenManager()[add+=1], DataManager.tokenManager()[add+=1], DataManager.tokenManager()[add+=1], DataManager.tokenManager()[add+=1], DataManager.tokenManager()[add+=1]
                        , DataManager.tokenManager()[add+=1], DataManager.tokenManager()[add+=1], DataManager.tokenManager()[add+=1], DataManager.tokenManager()[add+=1], DataManager.tokenManager()[add+=1]},
                {DataManager.tokenManager()[add+=1], DataManager.tokenManager()[add+=1], DataManager.tokenManager()[add+=1], DataManager.tokenManager()[add+=1], DataManager.tokenManager()[add+=1], DataManager.tokenManager()[add+=1], DataManager.tokenManager()[add+=1], DataManager.tokenManager()[add+=1]
                        , DataManager.tokenManager()[add+=1], DataManager.tokenManager()[add+=1], DataManager.tokenManager()[add+=1], DataManager.tokenManager()[add+=1], DataManager.tokenManager()[add+=1]},
                {DataManager.tokenManager()[add+=1], DataManager.tokenManager()[add+=1], DataManager.tokenManager()[add+=1], DataManager.tokenManager()[add+=1], DataManager.tokenManager()[add+=1], DataManager.tokenManager()[add+=1], DataManager.tokenManager()[add+=1], DataManager.tokenManager()[add+=1]
                        , DataManager.tokenManager()[add+=1], DataManager.tokenManager()[add+=1], DataManager.tokenManager()[add+=1], DataManager.tokenManager()[add+=1], DataManager.tokenManager()[add+=1]},
                {DataManager.tokenManager()[add+=1], DataManager.tokenManager()[add+=1], DataManager.tokenManager()[add+=1], DataManager.tokenManager()[add+=1], DataManager.tokenManager()[add+=1], DataManager.tokenManager()[add+=1], DataManager.tokenManager()[add+=1], DataManager.tokenManager()[add+=1]
                        , DataManager.tokenManager()[add+=1], DataManager.tokenManager()[add+=1], DataManager.tokenManager()[add+=1], DataManager.tokenManager()[add+=1], DataManager.tokenManager()[add+=1]},
                {DataManager.tokenManager()[add+=1], DataManager.tokenManager()[add+=1], DataManager.tokenManager()[add+=1], DataManager.tokenManager()[add+=1], DataManager.tokenManager()[add+=1], DataManager.tokenManager()[add+=1], DataManager.tokenManager()[add+=1], DataManager.tokenManager()[add+=1]
                        , DataManager.tokenManager()[add+=1], DataManager.tokenManager()[add+=1], DataManager.tokenManager()[add+=1], DataManager.tokenManager()[add+=1], DataManager.tokenManager()[add+=1]},
                {DataManager.tokenManager()[add+=1], DataManager.tokenManager()[add+=1], DataManager.tokenManager()[add+=1], DataManager.tokenManager()[add+=1], DataManager.tokenManager()[add+=1], DataManager.tokenManager()[add+=1], DataManager.tokenManager()[add+=1], DataManager.tokenManager()[add+=1]
                        , DataManager.tokenManager()[add+=1], DataManager.tokenManager()[add+=1], DataManager.tokenManager()[add+=1], DataManager.tokenManager()[add+=1], DataManager.tokenManager()[add+=1]},
                {DataManager.tokenManager()[add+=1], DataManager.tokenManager()[add+=1], DataManager.tokenManager()[add+=1], DataManager.tokenManager()[add+=1], DataManager.tokenManager()[add+=1], DataManager.tokenManager()[add+=1], DataManager.tokenManager()[add+=1], DataManager.tokenManager()[add+=1]
                        , DataManager.tokenManager()[add+=1], DataManager.tokenManager()[add+=1], DataManager.tokenManager()[add+=1], DataManager.tokenManager()[add+=1], DataManager.tokenManager()[add+=1]},
                {DataManager.tokenManager()[add+=1], DataManager.tokenManager()[add+=1], DataManager.tokenManager()[add+=1], DataManager.tokenManager()[add+=1], DataManager.tokenManager()[add+=1], DataManager.tokenManager()[add+=1], DataManager.tokenManager()[add+=1], DataManager.tokenManager()[add+=1]
                        , DataManager.tokenManager()[add+=1], DataManager.tokenManager()[add+=1], DataManager.tokenManager()[add+=1], DataManager.tokenManager()[add+=1], DataManager.tokenManager()[add+=1]},
                {DataManager.tokenManager()[add+=1], DataManager.tokenManager()[add+=1], DataManager.tokenManager()[add+=1], DataManager.tokenManager()[add+=1], DataManager.tokenManager()[add+=1], DataManager.tokenManager()[add+=1], DataManager.tokenManager()[add+=1], DataManager.tokenManager()[add+=1]
                        , DataManager.tokenManager()[add+=1], DataManager.tokenManager()[add+=1], DataManager.tokenManager()[add+=1], DataManager.tokenManager()[add+=1], DataManager.tokenManager()[add+=1]},
                {DataManager.tokenManager()[add+=1], DataManager.tokenManager()[add+=1], DataManager.tokenManager()[add+=1], DataManager.tokenManager()[add+=1], DataManager.tokenManager()[add+=1], DataManager.tokenManager()[add+=1], DataManager.tokenManager()[add+=1], DataManager.tokenManager()[add+=1]
                        , DataManager.tokenManager()[add+=1], DataManager.tokenManager()[add+=1], DataManager.tokenManager()[add+=1], DataManager.tokenManager()[add+=1], DataManager.tokenManager()[add+=1]},
                {DataManager.tokenManager()[add+=1], DataManager.tokenManager()[add+=1], DataManager.tokenManager()[add+=1], DataManager.tokenManager()[add+=1], DataManager.tokenManager()[add+=1], DataManager.tokenManager()[add+=1], DataManager.tokenManager()[add+=1], DataManager.tokenManager()[add+=1]
                        , DataManager.tokenManager()[add+=1], DataManager.tokenManager()[add+=1], DataManager.tokenManager()[add+=1], DataManager.tokenManager()[add+=1], DataManager.tokenManager()[add+=1]},
                {DataManager.tokenManager()[add+=1], DataManager.tokenManager()[add+=1], DataManager.tokenManager()[add+=1], DataManager.tokenManager()[add+=1], DataManager.tokenManager()[add+=1], DataManager.tokenManager()[add+=1], DataManager.tokenManager()[add+=1], DataManager.tokenManager()[add+=1]
                        , DataManager.tokenManager()[add+=1], DataManager.tokenManager()[add+=1], DataManager.tokenManager()[add+=1], DataManager.tokenManager()[add+=1], DataManager.tokenManager()[add+=1]},
                {DataManager.tokenManager()[add+=1], DataManager.tokenManager()[add+=1], DataManager.tokenManager()[add+=1], DataManager.tokenManager()[add+=1], DataManager.tokenManager()[add+=1], DataManager.tokenManager()[add+=1], DataManager.tokenManager()[add+=1], DataManager.tokenManager()[add+=1]
                        , DataManager.tokenManager()[add+=1], DataManager.tokenManager()[add+=1], DataManager.tokenManager()[add+=1], DataManager.tokenManager()[add+=1], DataManager.tokenManager()[add+=1]},
                {DataManager.tokenManager()[add+=1], DataManager.tokenManager()[add+=1], DataManager.tokenManager()[add+=1], DataManager.tokenManager()[add+=1], DataManager.tokenManager()[add+=1], DataManager.tokenManager()[add+=1], DataManager.tokenManager()[add+=1], DataManager.tokenManager()[add+=1]
                        , DataManager.tokenManager()[add+=1], DataManager.tokenManager()[add+=1], DataManager.tokenManager()[add+=1], DataManager.tokenManager()[add+=1], DataManager.tokenManager()[add+=1]},
                {DataManager.tokenManager()[add+=1], DataManager.tokenManager()[add+=1], DataManager.tokenManager()[add+=1], DataManager.tokenManager()[add+=1], DataManager.tokenManager()[add+=1], DataManager.tokenManager()[add+=1], DataManager.tokenManager()[add+=1], DataManager.tokenManager()[add+=1]
                        , DataManager.tokenManager()[add+=1], DataManager.tokenManager()[add+=1], DataManager.tokenManager()[add+=1], DataManager.tokenManager()[add+=1], DataManager.tokenManager()[add+=1]},
                {DataManager.tokenManager()[add+=1], DataManager.tokenManager()[add+=1], DataManager.tokenManager()[add+=1], DataManager.tokenManager()[add+=1], DataManager.tokenManager()[add+=1], DataManager.tokenManager()[add+=1], DataManager.tokenManager()[add+=1], DataManager.tokenManager()[add+=1]
                        , DataManager.tokenManager()[add+=1], DataManager.tokenManager()[add+=1], DataManager.tokenManager()[add+=1], DataManager.tokenManager()[add+=1], DataManager.tokenManager()[add+=1]},
                {DataManager.tokenManager()[add+=1], DataManager.tokenManager()[add+=1], DataManager.tokenManager()[add+=1], DataManager.tokenManager()[add+=1], DataManager.tokenManager()[add+=1], DataManager.tokenManager()[add+=1], DataManager.tokenManager()[add+=1], DataManager.tokenManager()[add+=1]
                        , DataManager.tokenManager()[add+=1], DataManager.tokenManager()[add+=1], DataManager.tokenManager()[add+=1], DataManager.tokenManager()[add+=1], DataManager.tokenManager()[add+=1]},
                {DataManager.tokenManager()[add+=1], DataManager.tokenManager()[add+=1], DataManager.tokenManager()[add+=1], DataManager.tokenManager()[add+=1], DataManager.tokenManager()[add+=1], DataManager.tokenManager()[add+=1], DataManager.tokenManager()[add+=1], DataManager.tokenManager()[add+=1]
                        , DataManager.tokenManager()[add+=1], DataManager.tokenManager()[add+=1], DataManager.tokenManager()[add+=1], DataManager.tokenManager()[add+=1], DataManager.tokenManager()[add+=1]},
                {DataManager.tokenManager()[add+=1], DataManager.tokenManager()[add+=1], DataManager.tokenManager()[add+=1], DataManager.tokenManager()[add+=1], DataManager.tokenManager()[add+=1], DataManager.tokenManager()[add+=1], DataManager.tokenManager()[add+=1], DataManager.tokenManager()[add+=1]
                        , DataManager.tokenManager()[add+=1], DataManager.tokenManager()[add+=1], DataManager.tokenManager()[add+=1], DataManager.tokenManager()[add+=1], DataManager.tokenManager()[add+=1]},
                {DataManager.tokenManager()[add+=1], DataManager.tokenManager()[add+=1], DataManager.tokenManager()[add+=1], DataManager.tokenManager()[add+=1], DataManager.tokenManager()[add+=1], DataManager.tokenManager()[add+=1], DataManager.tokenManager()[add+=1], DataManager.tokenManager()[add+=1]
                        , DataManager.tokenManager()[add+=1], DataManager.tokenManager()[add+=1], DataManager.tokenManager()[add+=1], DataManager.tokenManager()[add+=1], DataManager.tokenManager()[add+=1]},
                {DataManager.tokenManager()[add+=1], DataManager.tokenManager()[add+=1], DataManager.tokenManager()[add+=1], DataManager.tokenManager()[add+=1], DataManager.tokenManager()[add+=1], DataManager.tokenManager()[add+=1], DataManager.tokenManager()[add+=1], DataManager.tokenManager()[add+=1]
                        , DataManager.tokenManager()[add+=1], DataManager.tokenManager()[add+=1], DataManager.tokenManager()[add+=1], DataManager.tokenManager()[add+=1], DataManager.tokenManager()[add+=1]},
                {DataManager.tokenManager()[add+=1], DataManager.tokenManager()[add+=1], DataManager.tokenManager()[add+=1], DataManager.tokenManager()[add+=1], DataManager.tokenManager()[add+=1], DataManager.tokenManager()[add+=1], DataManager.tokenManager()[add+=1], DataManager.tokenManager()[add+=1]
                        , DataManager.tokenManager()[add+=1], DataManager.tokenManager()[add+=1], DataManager.tokenManager()[add+=1], DataManager.tokenManager()[add+=1], DataManager.tokenManager()[add+=1]},
                {DataManager.tokenManager()[add+=1], DataManager.tokenManager()[add+=1], DataManager.tokenManager()[add+=1], DataManager.tokenManager()[add+=1], DataManager.tokenManager()[add+=1], DataManager.tokenManager()[add+=1], DataManager.tokenManager()[add+=1], DataManager.tokenManager()[add+=1]
                        , DataManager.tokenManager()[add+=1], DataManager.tokenManager()[add+=1], DataManager.tokenManager()[add+=1], DataManager.tokenManager()[add+=1], DataManager.tokenManager()[add+=1]},
                {DataManager.tokenManager()[add+=1], DataManager.tokenManager()[add+=1], DataManager.tokenManager()[add+=1], DataManager.tokenManager()[add+=1], DataManager.tokenManager()[add+=1], DataManager.tokenManager()[add+=1], DataManager.tokenManager()[add+=1], DataManager.tokenManager()[add+=1]
                        , DataManager.tokenManager()[add+=1], DataManager.tokenManager()[add+=1], DataManager.tokenManager()[add+=1], DataManager.tokenManager()[add+=1], DataManager.tokenManager()[add+=1]},
                {DataManager.tokenManager()[add+=1], DataManager.tokenManager()[add+=1], DataManager.tokenManager()[add+=1], DataManager.tokenManager()[add+=1], DataManager.tokenManager()[add+=1], DataManager.tokenManager()[add+=1], DataManager.tokenManager()[add+=1], DataManager.tokenManager()[add+=1]
                        , DataManager.tokenManager()[add+=1], DataManager.tokenManager()[add+=1], DataManager.tokenManager()[add+=1], DataManager.tokenManager()[add+=1], DataManager.tokenManager()[add+=1]},
                {DataManager.tokenManager()[add+=1], DataManager.tokenManager()[add+=1], DataManager.tokenManager()[add+=1], DataManager.tokenManager()[add+=1], DataManager.tokenManager()[add+=1], DataManager.tokenManager()[add+=1], DataManager.tokenManager()[add+=1], DataManager.tokenManager()[add+=1]
                        , DataManager.tokenManager()[add+=1], DataManager.tokenManager()[add+=1], DataManager.tokenManager()[add+=1], DataManager.tokenManager()[add+=1], DataManager.tokenManager()[add+=1]},
                {DataManager.tokenManager()[add+=1], DataManager.tokenManager()[add+=1], DataManager.tokenManager()[add+=1], DataManager.tokenManager()[add+=1], DataManager.tokenManager()[add+=1], DataManager.tokenManager()[add+=1], DataManager.tokenManager()[add+=1], DataManager.tokenManager()[add+=1]
                        , DataManager.tokenManager()[add+=1], DataManager.tokenManager()[add+=1], DataManager.tokenManager()[add+=1], DataManager.tokenManager()[add+=1], DataManager.tokenManager()[add+=1]},
                {DataManager.tokenManager()[add+=1], DataManager.tokenManager()[add+=1], DataManager.tokenManager()[add+=1], DataManager.tokenManager()[add+=1], DataManager.tokenManager()[add+=1], DataManager.tokenManager()[add+=1], DataManager.tokenManager()[add+=1], DataManager.tokenManager()[add+=1]
                        , DataManager.tokenManager()[add+=1], DataManager.tokenManager()[add+=1], DataManager.tokenManager()[add+=1], DataManager.tokenManager()[add+=1], DataManager.tokenManager()[add+=1]},
                {DataManager.tokenManager()[add+=1], DataManager.tokenManager()[add+=1], DataManager.tokenManager()[add+=1], DataManager.tokenManager()[add+=1], DataManager.tokenManager()[add+=1], DataManager.tokenManager()[add+=1], DataManager.tokenManager()[add+=1], DataManager.tokenManager()[add+=1]
                        , DataManager.tokenManager()[add+=1], DataManager.tokenManager()[add+=1], DataManager.tokenManager()[add+=1], DataManager.tokenManager()[add+=1], DataManager.tokenManager()[add+=1]},
                {DataManager.tokenManager()[add+=1], DataManager.tokenManager()[add+=1], DataManager.tokenManager()[add+=1], DataManager.tokenManager()[add+=1], DataManager.tokenManager()[add+=1], DataManager.tokenManager()[add+=1], DataManager.tokenManager()[add+=1], DataManager.tokenManager()[add+=1]
                        , DataManager.tokenManager()[add+=1], DataManager.tokenManager()[add+=1], DataManager.tokenManager()[add+=1], DataManager.tokenManager()[add+=1], DataManager.tokenManager()[add+=1]},
                {DataManager.tokenManager()[add+=1], DataManager.tokenManager()[add+=1], DataManager.tokenManager()[add+=1], DataManager.tokenManager()[add+=1], DataManager.tokenManager()[add+=1], DataManager.tokenManager()[add+=1], DataManager.tokenManager()[add+=1], DataManager.tokenManager()[add+=1]
                        , DataManager.tokenManager()[add+=1], DataManager.tokenManager()[add+=1], DataManager.tokenManager()[add+=1], DataManager.tokenManager()[add+=1], DataManager.tokenManager()[add+1]},
        };
    }

    public String[][] salaryTableColumns()
    {
        int addOne = 0;
        int addTwo = 1;
        int addThree = 2;
        int addSal = 1;

        return new String[][]{
                {DataManager.tokenManager()[addOne], DataManager.tokenManager()[addTwo], DataManager.tokenManager()[addThree], String.valueOf(DataManager.callSalaryCalculator()[addSal])},
                {DataManager.tokenManager()[addOne+=13], DataManager.tokenManager()[addTwo+=13], DataManager.tokenManager()[addThree+=13], String.valueOf(DataManager.callSalaryCalculator()[addSal+=1])},
                {DataManager.tokenManager()[addOne+=13], DataManager.tokenManager()[addTwo+=13], DataManager.tokenManager()[addThree+=13], String.valueOf(DataManager.callSalaryCalculator()[addSal+=1])},
                {DataManager.tokenManager()[addOne+=13], DataManager.tokenManager()[addTwo+=13], DataManager.tokenManager()[addThree+=13], String.valueOf(DataManager.callSalaryCalculator()[addSal+=1])},
                {DataManager.tokenManager()[addOne+=13], DataManager.tokenManager()[addTwo+=13], DataManager.tokenManager()[addThree+=13], String.valueOf(DataManager.callSalaryCalculator()[addSal+=1])},
                {DataManager.tokenManager()[addOne+=13], DataManager.tokenManager()[addTwo+=13], DataManager.tokenManager()[addThree+=13], String.valueOf(DataManager.callSalaryCalculator()[addSal+=1])},
                {DataManager.tokenManager()[addOne+=13], DataManager.tokenManager()[addTwo+=13], DataManager.tokenManager()[addThree+=13], String.valueOf(DataManager.callSalaryCalculator()[addSal+=1])},
                {DataManager.tokenManager()[addOne+=13], DataManager.tokenManager()[addTwo+=13], DataManager.tokenManager()[addThree+=13], String.valueOf(DataManager.callSalaryCalculator()[addSal+=1])},
                {DataManager.tokenManager()[addOne+=13], DataManager.tokenManager()[addTwo+=13], DataManager.tokenManager()[addThree+=13], String.valueOf(DataManager.callSalaryCalculator()[addSal+=1])},
                {DataManager.tokenManager()[addOne+=13], DataManager.tokenManager()[addTwo+=13], DataManager.tokenManager()[addThree+=13], String.valueOf(DataManager.callSalaryCalculator()[addSal+=1])},
                {DataManager.tokenManager()[addOne+=13], DataManager.tokenManager()[addTwo+=13], DataManager.tokenManager()[addThree+=13], String.valueOf(DataManager.callSalaryCalculator()[addSal+=1])},
                {DataManager.tokenManager()[addOne+=13], DataManager.tokenManager()[addTwo+=13], DataManager.tokenManager()[addThree+=13], String.valueOf(DataManager.callSalaryCalculator()[addSal+=1])},
                {DataManager.tokenManager()[addOne+=13], DataManager.tokenManager()[addTwo+=13], DataManager.tokenManager()[addThree+=13], String.valueOf(DataManager.callSalaryCalculator()[addSal+=1])},
                {DataManager.tokenManager()[addOne+=13], DataManager.tokenManager()[addTwo+=13], DataManager.tokenManager()[addThree+=13], String.valueOf(DataManager.callSalaryCalculator()[addSal+=1])},
                {DataManager.tokenManager()[addOne+=13], DataManager.tokenManager()[addTwo+=13], DataManager.tokenManager()[addThree+=13], String.valueOf(DataManager.callSalaryCalculator()[addSal+=1])},
                {DataManager.tokenManager()[addOne+=13], DataManager.tokenManager()[addTwo+=13], DataManager.tokenManager()[addThree+=13], String.valueOf(DataManager.callSalaryCalculator()[addSal+=1])},
                {DataManager.tokenManager()[addOne+=13], DataManager.tokenManager()[addTwo+=13], DataManager.tokenManager()[addThree+=13], String.valueOf(DataManager.callSalaryCalculator()[addSal+=1])},
                {DataManager.tokenManager()[addOne+=13], DataManager.tokenManager()[addTwo+=13], DataManager.tokenManager()[addThree+=13], String.valueOf(DataManager.callSalaryCalculator()[addSal+=1])},
                {DataManager.tokenManager()[addOne+=13], DataManager.tokenManager()[addTwo+=13], DataManager.tokenManager()[addThree+=13], String.valueOf(DataManager.callSalaryCalculator()[addSal+=1])},
                {DataManager.tokenManager()[addOne+=13], DataManager.tokenManager()[addTwo+=13], DataManager.tokenManager()[addThree+=13], String.valueOf(DataManager.callSalaryCalculator()[addSal+=1])},
                {DataManager.tokenManager()[addOne+=13], DataManager.tokenManager()[addTwo+=13], DataManager.tokenManager()[addThree+=13], String.valueOf(DataManager.callSalaryCalculator()[addSal+=1])},
                {DataManager.tokenManager()[addOne+=13], DataManager.tokenManager()[addTwo+=13], DataManager.tokenManager()[addThree+=13], String.valueOf(DataManager.callSalaryCalculator()[addSal+=1])},
                {DataManager.tokenManager()[addOne+=13], DataManager.tokenManager()[addTwo+=13], DataManager.tokenManager()[addThree+=13], String.valueOf(DataManager.callSalaryCalculator()[addSal+=1])},
                {DataManager.tokenManager()[addOne+=13], DataManager.tokenManager()[addTwo+=13], DataManager.tokenManager()[addThree+=13], String.valueOf(DataManager.callSalaryCalculator()[addSal+=1])},
                {DataManager.tokenManager()[addOne+=13], DataManager.tokenManager()[addTwo+=13], DataManager.tokenManager()[addThree+=13], String.valueOf(DataManager.callSalaryCalculator()[addSal+=1])},
                {DataManager.tokenManager()[addOne+=13], DataManager.tokenManager()[addTwo+=13], DataManager.tokenManager()[addThree+=13], String.valueOf(DataManager.callSalaryCalculator()[addSal+=1])},
                {DataManager.tokenManager()[addOne+=13], DataManager.tokenManager()[addTwo+=13], DataManager.tokenManager()[addThree+=13], String.valueOf(DataManager.callSalaryCalculator()[addSal+=1])},
                {DataManager.tokenManager()[addOne+=13], DataManager.tokenManager()[addTwo+=13], DataManager.tokenManager()[addThree+=13], String.valueOf(DataManager.callSalaryCalculator()[addSal+=1])},
                {DataManager.tokenManager()[addOne+=13], DataManager.tokenManager()[addTwo+=13], DataManager.tokenManager()[addThree+=13], String.valueOf(DataManager.callSalaryCalculator()[addSal+=1])},
                {DataManager.tokenManager()[addOne+=13], DataManager.tokenManager()[addTwo+=13], DataManager.tokenManager()[addThree+=13], String.valueOf(DataManager.callSalaryCalculator()[addSal+=1])},
                {DataManager.tokenManager()[addOne+=13], DataManager.tokenManager()[addTwo+=13], DataManager.tokenManager()[addThree+=13], String.valueOf(DataManager.callSalaryCalculator()[addSal+=1])},
                {DataManager.tokenManager()[addOne+=13], DataManager.tokenManager()[addTwo+=13], DataManager.tokenManager()[addThree+=13], String.valueOf(DataManager.callSalaryCalculator()[addSal+=1])},
                {DataManager.tokenManager()[addOne+=13], DataManager.tokenManager()[addTwo+=13], DataManager.tokenManager()[addThree+=13], String.valueOf(DataManager.callSalaryCalculator()[addSal+=1])},
                {DataManager.tokenManager()[addOne+=13], DataManager.tokenManager()[addTwo+=13], DataManager.tokenManager()[addThree+=13], String.valueOf(DataManager.callSalaryCalculator()[addSal+=1])},
                {DataManager.tokenManager()[addOne+=13], DataManager.tokenManager()[addTwo+=13], DataManager.tokenManager()[addThree+=13], String.valueOf(DataManager.callSalaryCalculator()[addSal+=1])},
                {DataManager.tokenManager()[addOne+=13], DataManager.tokenManager()[addTwo+=13], DataManager.tokenManager()[addThree+=13], String.valueOf(DataManager.callSalaryCalculator()[addSal+=1])},
                {DataManager.tokenManager()[addOne+=13], DataManager.tokenManager()[addTwo+=13], DataManager.tokenManager()[addThree+=13], String.valueOf(DataManager.callSalaryCalculator()[addSal+=1])},
                {DataManager.tokenManager()[addOne+=13], DataManager.tokenManager()[addTwo+=13], DataManager.tokenManager()[addThree+=13], String.valueOf(DataManager.callSalaryCalculator()[addSal+=1])},
                {DataManager.tokenManager()[addOne+=13], DataManager.tokenManager()[addTwo+=13], DataManager.tokenManager()[addThree+=13], String.valueOf(DataManager.callSalaryCalculator()[addSal+=1])},
                {DataManager.tokenManager()[addOne+=13], DataManager.tokenManager()[addTwo+=13], DataManager.tokenManager()[addThree+=13], String.valueOf(DataManager.callSalaryCalculator()[addSal+=1])},
                {DataManager.tokenManager()[addOne+=13], DataManager.tokenManager()[addTwo+=13], DataManager.tokenManager()[addThree+=13], String.valueOf(DataManager.callSalaryCalculator()[addSal+=1])},
                {DataManager.tokenManager()[addOne+=13], DataManager.tokenManager()[addTwo+=13], DataManager.tokenManager()[addThree+=13], String.valueOf(DataManager.callSalaryCalculator()[addSal+=1])},
                {DataManager.tokenManager()[addOne+=13], DataManager.tokenManager()[addTwo+=13], DataManager.tokenManager()[addThree+=13], String.valueOf(DataManager.callSalaryCalculator()[addSal+=1])},
                {DataManager.tokenManager()[addOne+=13], DataManager.tokenManager()[addTwo+=13], DataManager.tokenManager()[addThree+=13], String.valueOf(DataManager.callSalaryCalculator()[addSal+=1])},
                {DataManager.tokenManager()[addOne+=13], DataManager.tokenManager()[addTwo+=13], DataManager.tokenManager()[addThree+=13], String.valueOf(DataManager.callSalaryCalculator()[addSal+=1])},
                {DataManager.tokenManager()[addOne+=13], DataManager.tokenManager()[addTwo+=13], DataManager.tokenManager()[addThree+=13], String.valueOf(DataManager.callSalaryCalculator()[addSal+=1])},
                {DataManager.tokenManager()[addOne+=13], DataManager.tokenManager()[addTwo+=13], DataManager.tokenManager()[addThree+=13], String.valueOf(DataManager.callSalaryCalculator()[addSal+=1])},
                {DataManager.tokenManager()[addOne+=13], DataManager.tokenManager()[addTwo+=13], DataManager.tokenManager()[addThree+=13], String.valueOf(DataManager.callSalaryCalculator()[addSal+=1])},
                {DataManager.tokenManager()[addOne+=13], DataManager.tokenManager()[addTwo+=13], DataManager.tokenManager()[addThree+=13], String.valueOf(DataManager.callSalaryCalculator()[addSal+=1])},
                {DataManager.tokenManager()[addOne+13], DataManager.tokenManager()[addTwo+13], DataManager.tokenManager()[addThree+13], String.valueOf(DataManager.callSalaryCalculator()[addSal+1])},
        };
    }

    public String[][] grossTableColumns()
    {
        int addOne = 0;
        int addTwo = 1;
        int addThree = 2;
        int addSal = 1;

        return new String[][]{
                {DataManager.tokenManager()[addOne], DataManager.tokenManager()[addTwo], DataManager.tokenManager()[addThree], String.valueOf(DataManager.callGrossCalculator()[addSal])},
                {DataManager.tokenManager()[addOne+=13], DataManager.tokenManager()[addTwo+=13], DataManager.tokenManager()[addThree+=13], String.valueOf(DataManager.callGrossCalculator()[addSal+=1])},
                {DataManager.tokenManager()[addOne+=13], DataManager.tokenManager()[addTwo+=13], DataManager.tokenManager()[addThree+=13], String.valueOf(DataManager.callGrossCalculator()[addSal+=1])},
                {DataManager.tokenManager()[addOne+=13], DataManager.tokenManager()[addTwo+=13], DataManager.tokenManager()[addThree+=13], String.valueOf(DataManager.callGrossCalculator()[addSal+=1])},
                {DataManager.tokenManager()[addOne+=13], DataManager.tokenManager()[addTwo+=13], DataManager.tokenManager()[addThree+=13], String.valueOf(DataManager.callGrossCalculator()[addSal+=1])},
                {DataManager.tokenManager()[addOne+=13], DataManager.tokenManager()[addTwo+=13], DataManager.tokenManager()[addThree+=13], String.valueOf(DataManager.callGrossCalculator()[addSal+=1])},
                {DataManager.tokenManager()[addOne+=13], DataManager.tokenManager()[addTwo+=13], DataManager.tokenManager()[addThree+=13], String.valueOf(DataManager.callGrossCalculator()[addSal+=1])},
                {DataManager.tokenManager()[addOne+=13], DataManager.tokenManager()[addTwo+=13], DataManager.tokenManager()[addThree+=13], String.valueOf(DataManager.callGrossCalculator()[addSal+=1])},
                {DataManager.tokenManager()[addOne+=13], DataManager.tokenManager()[addTwo+=13], DataManager.tokenManager()[addThree+=13], String.valueOf(DataManager.callGrossCalculator()[addSal+=1])},
                {DataManager.tokenManager()[addOne+=13], DataManager.tokenManager()[addTwo+=13], DataManager.tokenManager()[addThree+=13], String.valueOf(DataManager.callGrossCalculator()[addSal+=1])},
                {DataManager.tokenManager()[addOne+=13], DataManager.tokenManager()[addTwo+=13], DataManager.tokenManager()[addThree+=13], String.valueOf(DataManager.callGrossCalculator()[addSal+=1])},
                {DataManager.tokenManager()[addOne+=13], DataManager.tokenManager()[addTwo+=13], DataManager.tokenManager()[addThree+=13], String.valueOf(DataManager.callGrossCalculator()[addSal+=1])},
                {DataManager.tokenManager()[addOne+=13], DataManager.tokenManager()[addTwo+=13], DataManager.tokenManager()[addThree+=13], String.valueOf(DataManager.callGrossCalculator()[addSal+=1])},
                {DataManager.tokenManager()[addOne+=13], DataManager.tokenManager()[addTwo+=13], DataManager.tokenManager()[addThree+=13], String.valueOf(DataManager.callGrossCalculator()[addSal+=1])},
                {DataManager.tokenManager()[addOne+=13], DataManager.tokenManager()[addTwo+=13], DataManager.tokenManager()[addThree+=13], String.valueOf(DataManager.callGrossCalculator()[addSal+=1])},
                {DataManager.tokenManager()[addOne+=13], DataManager.tokenManager()[addTwo+=13], DataManager.tokenManager()[addThree+=13], String.valueOf(DataManager.callGrossCalculator()[addSal+=1])},
                {DataManager.tokenManager()[addOne+=13], DataManager.tokenManager()[addTwo+=13], DataManager.tokenManager()[addThree+=13], String.valueOf(DataManager.callGrossCalculator()[addSal+=1])},
                {DataManager.tokenManager()[addOne+=13], DataManager.tokenManager()[addTwo+=13], DataManager.tokenManager()[addThree+=13], String.valueOf(DataManager.callGrossCalculator()[addSal+=1])},
                {DataManager.tokenManager()[addOne+=13], DataManager.tokenManager()[addTwo+=13], DataManager.tokenManager()[addThree+=13], String.valueOf(DataManager.callGrossCalculator()[addSal+=1])},
                {DataManager.tokenManager()[addOne+=13], DataManager.tokenManager()[addTwo+=13], DataManager.tokenManager()[addThree+=13], String.valueOf(DataManager.callGrossCalculator()[addSal+=1])},
                {DataManager.tokenManager()[addOne+=13], DataManager.tokenManager()[addTwo+=13], DataManager.tokenManager()[addThree+=13], String.valueOf(DataManager.callGrossCalculator()[addSal+=1])},                {DataManager.tokenManager()[addOne+=13], DataManager.tokenManager()[addTwo+=13], DataManager.tokenManager()[addThree+=13], String.valueOf(DataManager.callGrossCalculator()[addSal+=1])},
                {DataManager.tokenManager()[addOne+=13], DataManager.tokenManager()[addTwo+=13], DataManager.tokenManager()[addThree+=13], String.valueOf(DataManager.callGrossCalculator()[addSal+=1])},
                {DataManager.tokenManager()[addOne+=13], DataManager.tokenManager()[addTwo+=13], DataManager.tokenManager()[addThree+=13], String.valueOf(DataManager.callGrossCalculator()[addSal+=1])},
                {DataManager.tokenManager()[addOne+=13], DataManager.tokenManager()[addTwo+=13], DataManager.tokenManager()[addThree+=13], String.valueOf(DataManager.callGrossCalculator()[addSal+=1])},
                {DataManager.tokenManager()[addOne+=13], DataManager.tokenManager()[addTwo+=13], DataManager.tokenManager()[addThree+=13], String.valueOf(DataManager.callGrossCalculator()[addSal+=1])},
                {DataManager.tokenManager()[addOne+=13], DataManager.tokenManager()[addTwo+=13], DataManager.tokenManager()[addThree+=13], String.valueOf(DataManager.callGrossCalculator()[addSal+=1])},
                {DataManager.tokenManager()[addOne+=13], DataManager.tokenManager()[addTwo+=13], DataManager.tokenManager()[addThree+=13], String.valueOf(DataManager.callGrossCalculator()[addSal+=1])},
                {DataManager.tokenManager()[addOne+=13], DataManager.tokenManager()[addTwo+=13], DataManager.tokenManager()[addThree+=13], String.valueOf(DataManager.callGrossCalculator()[addSal+=1])},
                {DataManager.tokenManager()[addOne+=13], DataManager.tokenManager()[addTwo+=13], DataManager.tokenManager()[addThree+=13], String.valueOf(DataManager.callGrossCalculator()[addSal+=1])},
                {DataManager.tokenManager()[addOne+=13], DataManager.tokenManager()[addTwo+=13], DataManager.tokenManager()[addThree+=13], String.valueOf(DataManager.callGrossCalculator()[addSal+=1])},                {DataManager.tokenManager()[addOne+=13], DataManager.tokenManager()[addTwo+=13], DataManager.tokenManager()[addThree+=13], String.valueOf(DataManager.callGrossCalculator()[addSal+=1])},
                {DataManager.tokenManager()[addOne+=13], DataManager.tokenManager()[addTwo+=13], DataManager.tokenManager()[addThree+=13], String.valueOf(DataManager.callGrossCalculator()[addSal+=1])},
                {DataManager.tokenManager()[addOne+=13], DataManager.tokenManager()[addTwo+=13], DataManager.tokenManager()[addThree+=13], String.valueOf(DataManager.callGrossCalculator()[addSal+=1])},
                {DataManager.tokenManager()[addOne+=13], DataManager.tokenManager()[addTwo+=13], DataManager.tokenManager()[addThree+=13], String.valueOf(DataManager.callGrossCalculator()[addSal+=1])},
                {DataManager.tokenManager()[addOne+=13], DataManager.tokenManager()[addTwo+=13], DataManager.tokenManager()[addThree+=13], String.valueOf(DataManager.callGrossCalculator()[addSal+=1])},
                {DataManager.tokenManager()[addOne+=13], DataManager.tokenManager()[addTwo+=13], DataManager.tokenManager()[addThree+=13], String.valueOf(DataManager.callGrossCalculator()[addSal+=1])},
                {DataManager.tokenManager()[addOne+=13], DataManager.tokenManager()[addTwo+=13], DataManager.tokenManager()[addThree+=13], String.valueOf(DataManager.callGrossCalculator()[addSal+=1])},
                {DataManager.tokenManager()[addOne+=13], DataManager.tokenManager()[addTwo+=13], DataManager.tokenManager()[addThree+=13], String.valueOf(DataManager.callGrossCalculator()[addSal+=1])},
                {DataManager.tokenManager()[addOne+=13], DataManager.tokenManager()[addTwo+=13], DataManager.tokenManager()[addThree+=13], String.valueOf(DataManager.callGrossCalculator()[addSal+=1])},
                {DataManager.tokenManager()[addOne+=13], DataManager.tokenManager()[addTwo+=13], DataManager.tokenManager()[addThree+=13], String.valueOf(DataManager.callGrossCalculator()[addSal+=1])},                {DataManager.tokenManager()[addOne+=13], DataManager.tokenManager()[addTwo+=13], DataManager.tokenManager()[addThree+=13], String.valueOf(DataManager.callGrossCalculator()[addSal+=1])},
                {DataManager.tokenManager()[addOne+=13], DataManager.tokenManager()[addTwo+=13], DataManager.tokenManager()[addThree+=13], String.valueOf(DataManager.callGrossCalculator()[addSal+=1])},
                {DataManager.tokenManager()[addOne+=13], DataManager.tokenManager()[addTwo+=13], DataManager.tokenManager()[addThree+=13], String.valueOf(DataManager.callGrossCalculator()[addSal+=1])},
                {DataManager.tokenManager()[addOne+=13], DataManager.tokenManager()[addTwo+=13], DataManager.tokenManager()[addThree+=13], String.valueOf(DataManager.callGrossCalculator()[addSal+=1])},
                {DataManager.tokenManager()[addOne+=13], DataManager.tokenManager()[addTwo+=13], DataManager.tokenManager()[addThree+=13], String.valueOf(DataManager.callGrossCalculator()[addSal+=1])},
                {DataManager.tokenManager()[addOne+=13], DataManager.tokenManager()[addTwo+=13], DataManager.tokenManager()[addThree+=13], String.valueOf(DataManager.callGrossCalculator()[addSal+=1])},
                {DataManager.tokenManager()[addOne+=13], DataManager.tokenManager()[addTwo+=13], DataManager.tokenManager()[addThree+=13], String.valueOf(DataManager.callGrossCalculator()[addSal+=1])},
                {DataManager.tokenManager()[addOne+=13], DataManager.tokenManager()[addTwo+=13], DataManager.tokenManager()[addThree+=13], String.valueOf(DataManager.callGrossCalculator()[addSal+=1])},
                {DataManager.tokenManager()[addOne+13], DataManager.tokenManager()[addTwo+13], DataManager.tokenManager()[addThree+13], String.valueOf(DataManager.callGrossCalculator()[addSal+1])},
        };
    }

    public String[][] femEmpTableColumns()
    {

        return new String[][]{
                {DataManager.tokenManager()[26], DataManager.tokenManager()[27], DataManager.tokenManager()[28], DataManager.tokenManager()[30]},
                {DataManager.tokenManager()[39], DataManager.tokenManager()[40], DataManager.tokenManager()[41], DataManager.tokenManager()[43]},
                {DataManager.tokenManager()[78], DataManager.tokenManager()[79], DataManager.tokenManager()[80], DataManager.tokenManager()[82]},
                {DataManager.tokenManager()[117], DataManager.tokenManager()[118], DataManager.tokenManager()[119], DataManager.tokenManager()[121]},
                {DataManager.tokenManager()[143], DataManager.tokenManager()[144], DataManager.tokenManager()[145], DataManager.tokenManager()[147]},
                {DataManager.tokenManager()[156], DataManager.tokenManager()[157], DataManager.tokenManager()[158], DataManager.tokenManager()[160]},
                {DataManager.tokenManager()[182], DataManager.tokenManager()[183], DataManager.tokenManager()[184], DataManager.tokenManager()[186]},
                {DataManager.tokenManager()[221], DataManager.tokenManager()[222], DataManager.tokenManager()[223], DataManager.tokenManager()[225]},
                {DataManager.tokenManager()[247], DataManager.tokenManager()[248], DataManager.tokenManager()[249], DataManager.tokenManager()[251]},
                {DataManager.tokenManager()[260], DataManager.tokenManager()[261], DataManager.tokenManager()[262], DataManager.tokenManager()[264]},
                {DataManager.tokenManager()[312], DataManager.tokenManager()[313], DataManager.tokenManager()[314], DataManager.tokenManager()[316]},
                {DataManager.tokenManager()[390], DataManager.tokenManager()[391], DataManager.tokenManager()[392], DataManager.tokenManager()[394]},
                {DataManager.tokenManager()[403], DataManager.tokenManager()[404], DataManager.tokenManager()[405], DataManager.tokenManager()[407]},
                {DataManager.tokenManager()[416], DataManager.tokenManager()[417], DataManager.tokenManager()[418], DataManager.tokenManager()[420]},
                {DataManager.tokenManager()[455], DataManager.tokenManager()[456], DataManager.tokenManager()[457], DataManager.tokenManager()[459]},
                {DataManager.tokenManager()[468], DataManager.tokenManager()[469], DataManager.tokenManager()[470], DataManager.tokenManager()[472]},
                {DataManager.tokenManager()[507], DataManager.tokenManager()[508], DataManager.tokenManager()[509], DataManager.tokenManager()[511]},
                {DataManager.tokenManager()[546], DataManager.tokenManager()[547], DataManager.tokenManager()[548], DataManager.tokenManager()[550]},
                {DataManager.tokenManager()[598], DataManager.tokenManager()[599], DataManager.tokenManager()[600], DataManager.tokenManager()[602]},
                {DataManager.tokenManager()[624], DataManager.tokenManager()[625], DataManager.tokenManager()[626], DataManager.tokenManager()[628]},
                {DataManager.tokenManager()[637], DataManager.tokenManager()[638], DataManager.tokenManager()[639], DataManager.tokenManager()[641]},
        };
    }

    public String[][] censusTableColumns()
    {
        return new String[][]{
                {"21", "13", "9", "1", "6"},
        };
    }
}
