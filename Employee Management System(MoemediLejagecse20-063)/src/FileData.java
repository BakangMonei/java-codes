public class FileData
{
    //Variables not editable
    final static int DATA_LINES_LIMIT = 51;

    public String [][] callFileData(){
        String[][] fileData = new String[DATA_LINES_LIMIT][];

        for (int i = 1; i < DATA_LINES_LIMIT; i++)
        {
            fileData[i] = setArrayDataIndividually()[i];
        }

        return fileData;
    }

    public String[][] setArrayDataIndividually()
    {
        String[][] dataArrays = new String[DATA_LINES_LIMIT][];
        EditEmployees editEmployees = new EditEmployees();
        editEmployees.method();

        dataArrays[1] = editEmployees.emp1();
        dataArrays[2] = editEmployees.emp2();
        dataArrays[3] = editEmployees.emp3();
        dataArrays[4] = editEmployees.emp4();
        dataArrays[5] = editEmployees.emp5();
        dataArrays[6] = editEmployees.emp6();
        dataArrays[7] = editEmployees.emp7();
        dataArrays[8] = editEmployees.emp8();
        dataArrays[9] = editEmployees.emp9();
        dataArrays[10] = editEmployees.emp10();
        dataArrays[11] = editEmployees.emp11();
        dataArrays[12] = editEmployees.emp12();
        dataArrays[13] = editEmployees.emp13();
        dataArrays[14] = editEmployees.emp14();
        dataArrays[15] = editEmployees.emp15();
        dataArrays[16] = editEmployees.emp16();
        dataArrays[17] = editEmployees.emp17();
        dataArrays[18] = editEmployees.emp18();
        dataArrays[19] = editEmployees.emp19();
        dataArrays[20] = editEmployees.emp20();
        dataArrays[21] = editEmployees.emp21();
        dataArrays[22] = editEmployees.emp22();
        dataArrays[23] = editEmployees.emp23();
        dataArrays[24] = editEmployees.emp24();
        dataArrays[25] = editEmployees.emp25();
        dataArrays[26] = editEmployees.emp26();
        dataArrays[27] = editEmployees.emp27();
        dataArrays[28] = editEmployees.emp28();
        dataArrays[29] = editEmployees.emp29();
        dataArrays[30] = editEmployees.emp30();
        dataArrays[31] = editEmployees.emp31();
        dataArrays[32] = editEmployees.emp32();
        dataArrays[33] = editEmployees.emp33();
        dataArrays[34] = editEmployees.emp34();
        dataArrays[35] = editEmployees.emp35();
        dataArrays[36] = editEmployees.emp36();
        dataArrays[37] = editEmployees.emp37();
        dataArrays[38] = editEmployees.emp38();
        dataArrays[39] = editEmployees.emp39();
        dataArrays[40] = editEmployees.emp40();
        dataArrays[41] = editEmployees.emp41();
        dataArrays[42] = editEmployees.emp42();
        dataArrays[43] = editEmployees.emp43();
        dataArrays[44] = editEmployees.emp44();
        dataArrays[45] = editEmployees.emp45();
        dataArrays[46] = editEmployees.emp46();
        dataArrays[47] = editEmployees.emp47();
        dataArrays[48] = editEmployees.emp48();
        dataArrays[49] = editEmployees.emp49();
        dataArrays[50] = editEmployees.emp50();

        return dataArrays;
    }

    //Table Header

    public String[] employeeTableHeader(){
        String[] tableHeaders = { "ID", "Name", "Surname", "D.O.B", "Gender", "Address", "Job_Title", "Hours_Worked", "Department", "Rate_Of_Pay",
                "Car_Allowance", "Monthly_Gratuity", "Tax_Rate" }
                ;
        return tableHeaders;
    }

    public String[] salaryTableHeader(){
        String[] tableHeaders = { "ID", "Name", "Surname", "Salary" }
                ;
        return tableHeaders;
    }

    public String[] grossTableHeader(){
        String[] tableHeaders = { "ID", "Name", "Surname", "Gross" }
                ;
        return tableHeaders;
    }

    public String[] femEmpTableHeader(){
        String[] tableHeaders = { "ID", "Name", "Surname", "Gender" }
                ;
        return tableHeaders;
    }

    public String[] censusTableHeader(){
        String[] tableHeaders = { "ID", "Name", "Surname", "Gender" }
                ;
        return tableHeaders;
    }

    //Table Columns

    public String[][] employeeTableColumns()
    {
        DataManager dataManager = new DataManager();
        int add = 0;

        String[][] tableData = {
                {dataManager.tokenManager()[0], dataManager.tokenManager()[add+=1], dataManager.tokenManager()[add+=1], dataManager.tokenManager()[add+=1], dataManager.tokenManager()[add+=1], DataManager.tokenManager()[add+=1], dataManager.tokenManager()[add+=1], dataManager.tokenManager()[add+=1]
                        , dataManager.tokenManager()[add+=1], dataManager.tokenManager()[add+=1], dataManager.tokenManager()[add+=1], dataManager.tokenManager()[add+=1], dataManager.tokenManager()[add+=1]},
                {dataManager.tokenManager()[add+=1], dataManager.tokenManager()[add+=1], dataManager.tokenManager()[add+=1], dataManager.tokenManager()[add+=1], dataManager.tokenManager()[add+=1], dataManager.tokenManager()[add+=1], dataManager.tokenManager()[add+=1], dataManager.tokenManager()[add+=1]
                        , dataManager.tokenManager()[add+=1], dataManager.tokenManager()[add+=1], dataManager.tokenManager()[add+=1], dataManager.tokenManager()[add+=1], dataManager.tokenManager()[add+=1]},
                {dataManager.tokenManager()[add+=1], dataManager.tokenManager()[add+=1], dataManager.tokenManager()[add+=1], dataManager.tokenManager()[add+=1], dataManager.tokenManager()[add+=1], dataManager.tokenManager()[add+=1], dataManager.tokenManager()[add+=1], dataManager.tokenManager()[add+=1]
                        , dataManager.tokenManager()[add+=1], dataManager.tokenManager()[add+=1], dataManager.tokenManager()[add+=1], dataManager.tokenManager()[add+=1], dataManager.tokenManager()[add+=1]},
                {dataManager.tokenManager()[add+=1], dataManager.tokenManager()[add+=1], dataManager.tokenManager()[add+=1], dataManager.tokenManager()[add+=1], dataManager.tokenManager()[add+=1], dataManager.tokenManager()[add+=1], dataManager.tokenManager()[add+=1], dataManager.tokenManager()[add+=1]
                        , dataManager.tokenManager()[add+=1], dataManager.tokenManager()[add+=1], dataManager.tokenManager()[add+=1], dataManager.tokenManager()[add+=1], dataManager.tokenManager()[add+=1]},
                {dataManager.tokenManager()[add+=1], dataManager.tokenManager()[add+=1], dataManager.tokenManager()[add+=1], dataManager.tokenManager()[add+=1], dataManager.tokenManager()[add+=1], dataManager.tokenManager()[add+=1], dataManager.tokenManager()[add+=1], dataManager.tokenManager()[add+=1]
                        , dataManager.tokenManager()[add+=1], dataManager.tokenManager()[add+=1], dataManager.tokenManager()[add+=1], dataManager.tokenManager()[add+=1], dataManager.tokenManager()[add+=1]},
                {dataManager.tokenManager()[add+=1], dataManager.tokenManager()[add+=1], dataManager.tokenManager()[add+=1], dataManager.tokenManager()[add+=1], dataManager.tokenManager()[add+=1], dataManager.tokenManager()[add+=1], dataManager.tokenManager()[add+=1], dataManager.tokenManager()[add+=1]
                        , dataManager.tokenManager()[add+=1], dataManager.tokenManager()[add+=1], dataManager.tokenManager()[add+=1], dataManager.tokenManager()[add+=1], dataManager.tokenManager()[add+=1]},
                {dataManager.tokenManager()[add+=1], dataManager.tokenManager()[add+=1], dataManager.tokenManager()[add+=1], dataManager.tokenManager()[add+=1], dataManager.tokenManager()[add+=1], dataManager.tokenManager()[add+=1], dataManager.tokenManager()[add+=1], dataManager.tokenManager()[add+=1]
                        , dataManager.tokenManager()[add+=1], dataManager.tokenManager()[add+=1], dataManager.tokenManager()[add+=1], dataManager.tokenManager()[add+=1], dataManager.tokenManager()[add+=1]},
                {dataManager.tokenManager()[add+=1], dataManager.tokenManager()[add+=1], dataManager.tokenManager()[add+=1], dataManager.tokenManager()[add+=1], dataManager.tokenManager()[add+=1], dataManager.tokenManager()[add+=1], dataManager.tokenManager()[add+=1], dataManager.tokenManager()[add+=1]
                        , dataManager.tokenManager()[add+=1], dataManager.tokenManager()[add+=1], dataManager.tokenManager()[add+=1], dataManager.tokenManager()[add+=1], dataManager.tokenManager()[add+=1]},
                {dataManager.tokenManager()[add+=1], dataManager.tokenManager()[add+=1], dataManager.tokenManager()[add+=1], dataManager.tokenManager()[add+=1], dataManager.tokenManager()[add+=1], dataManager.tokenManager()[add+=1], dataManager.tokenManager()[add+=1], dataManager.tokenManager()[add+=1]
                        , dataManager.tokenManager()[add+=1], dataManager.tokenManager()[add+=1], dataManager.tokenManager()[add+=1], dataManager.tokenManager()[add+=1], dataManager.tokenManager()[add+=1]},
                {dataManager.tokenManager()[add+=1], dataManager.tokenManager()[add+=1], dataManager.tokenManager()[add+=1], dataManager.tokenManager()[add+=1], dataManager.tokenManager()[add+=1], dataManager.tokenManager()[add+=1], dataManager.tokenManager()[add+=1], dataManager.tokenManager()[add+=1]
                        , dataManager.tokenManager()[add+=1], dataManager.tokenManager()[add+=1], dataManager.tokenManager()[add+=1], dataManager.tokenManager()[add+=1], dataManager.tokenManager()[add+=1]},
                {dataManager.tokenManager()[add+=1], dataManager.tokenManager()[add+=1], dataManager.tokenManager()[add+=1], dataManager.tokenManager()[add+=1], dataManager.tokenManager()[add+=1], dataManager.tokenManager()[add+=1], dataManager.tokenManager()[add+=1], dataManager.tokenManager()[add+=1]
                        , dataManager.tokenManager()[add+=1], dataManager.tokenManager()[add+=1], dataManager.tokenManager()[add+=1], dataManager.tokenManager()[add+=1], dataManager.tokenManager()[add+=1]},
                {dataManager.tokenManager()[add+=1], dataManager.tokenManager()[add+=1], dataManager.tokenManager()[add+=1], dataManager.tokenManager()[add+=1], dataManager.tokenManager()[add+=1], dataManager.tokenManager()[add+=1], dataManager.tokenManager()[add+=1], dataManager.tokenManager()[add+=1]
                        , dataManager.tokenManager()[add+=1], dataManager.tokenManager()[add+=1], dataManager.tokenManager()[add+=1], dataManager.tokenManager()[add+=1], dataManager.tokenManager()[add+=1]},
                {dataManager.tokenManager()[add+=1], dataManager.tokenManager()[add+=1], dataManager.tokenManager()[add+=1], dataManager.tokenManager()[add+=1], dataManager.tokenManager()[add+=1], dataManager.tokenManager()[add+=1], dataManager.tokenManager()[add+=1], dataManager.tokenManager()[add+=1]
                        , dataManager.tokenManager()[add+=1], dataManager.tokenManager()[add+=1], dataManager.tokenManager()[add+=1], dataManager.tokenManager()[add+=1], dataManager.tokenManager()[add+=1]},
                {dataManager.tokenManager()[add+=1], dataManager.tokenManager()[add+=1], dataManager.tokenManager()[add+=1], dataManager.tokenManager()[add+=1], dataManager.tokenManager()[add+=1], dataManager.tokenManager()[add+=1], dataManager.tokenManager()[add+=1], dataManager.tokenManager()[add+=1]
                        , dataManager.tokenManager()[add+=1], dataManager.tokenManager()[add+=1], dataManager.tokenManager()[add+=1], dataManager.tokenManager()[add+=1], dataManager.tokenManager()[add+=1]},
                {dataManager.tokenManager()[add+=1], dataManager.tokenManager()[add+=1], dataManager.tokenManager()[add+=1], dataManager.tokenManager()[add+=1], dataManager.tokenManager()[add+=1], dataManager.tokenManager()[add+=1], dataManager.tokenManager()[add+=1], dataManager.tokenManager()[add+=1]
                        , dataManager.tokenManager()[add+=1], dataManager.tokenManager()[add+=1], dataManager.tokenManager()[add+=1], dataManager.tokenManager()[add+=1], dataManager.tokenManager()[add+=1]},
                {dataManager.tokenManager()[add+=1], dataManager.tokenManager()[add+=1], dataManager.tokenManager()[add+=1], dataManager.tokenManager()[add+=1], dataManager.tokenManager()[add+=1], dataManager.tokenManager()[add+=1], dataManager.tokenManager()[add+=1], dataManager.tokenManager()[add+=1]
                        , dataManager.tokenManager()[add+=1], dataManager.tokenManager()[add+=1], dataManager.tokenManager()[add+=1], dataManager.tokenManager()[add+=1], dataManager.tokenManager()[add+=1]},
                {dataManager.tokenManager()[add+=1], dataManager.tokenManager()[add+=1], dataManager.tokenManager()[add+=1], dataManager.tokenManager()[add+=1], dataManager.tokenManager()[add+=1], dataManager.tokenManager()[add+=1], dataManager.tokenManager()[add+=1], dataManager.tokenManager()[add+=1]
                        , dataManager.tokenManager()[add+=1], dataManager.tokenManager()[add+=1], dataManager.tokenManager()[add+=1], dataManager.tokenManager()[add+=1], dataManager.tokenManager()[add+=1]},
                {dataManager.tokenManager()[add+=1], dataManager.tokenManager()[add+=1], dataManager.tokenManager()[add+=1], dataManager.tokenManager()[add+=1], dataManager.tokenManager()[add+=1], dataManager.tokenManager()[add+=1], dataManager.tokenManager()[add+=1], dataManager.tokenManager()[add+=1]
                        , dataManager.tokenManager()[add+=1], dataManager.tokenManager()[add+=1], dataManager.tokenManager()[add+=1], dataManager.tokenManager()[add+=1], dataManager.tokenManager()[add+=1]},
                {dataManager.tokenManager()[add+=1], dataManager.tokenManager()[add+=1], dataManager.tokenManager()[add+=1], dataManager.tokenManager()[add+=1], dataManager.tokenManager()[add+=1], dataManager.tokenManager()[add+=1], dataManager.tokenManager()[add+=1], dataManager.tokenManager()[add+=1]
                        , dataManager.tokenManager()[add+=1], dataManager.tokenManager()[add+=1], dataManager.tokenManager()[add+=1], dataManager.tokenManager()[add+=1], dataManager.tokenManager()[add+=1]},
                {dataManager.tokenManager()[add+=1], dataManager.tokenManager()[add+=1], dataManager.tokenManager()[add+=1], dataManager.tokenManager()[add+=1], dataManager.tokenManager()[add+=1], dataManager.tokenManager()[add+=1], dataManager.tokenManager()[add+=1], dataManager.tokenManager()[add+=1]
                        , dataManager.tokenManager()[add+=1], dataManager.tokenManager()[add+=1], dataManager.tokenManager()[add+=1], dataManager.tokenManager()[add+=1], dataManager.tokenManager()[add+=1]},
                {dataManager.tokenManager()[add+=1], dataManager.tokenManager()[add+=1], dataManager.tokenManager()[add+=1], dataManager.tokenManager()[add+=1], dataManager.tokenManager()[add+=1], dataManager.tokenManager()[add+=1], dataManager.tokenManager()[add+=1], dataManager.tokenManager()[add+=1]
                        , dataManager.tokenManager()[add+=1], dataManager.tokenManager()[add+=1], dataManager.tokenManager()[add+=1], dataManager.tokenManager()[add+=1], dataManager.tokenManager()[add+=1]},
                {dataManager.tokenManager()[add+=1], dataManager.tokenManager()[add+=1], dataManager.tokenManager()[add+=1], dataManager.tokenManager()[add+=1], dataManager.tokenManager()[add+=1], dataManager.tokenManager()[add+=1], dataManager.tokenManager()[add+=1], dataManager.tokenManager()[add+=1]
                        , dataManager.tokenManager()[add+=1], dataManager.tokenManager()[add+=1], dataManager.tokenManager()[add+=1], dataManager.tokenManager()[add+=1], dataManager.tokenManager()[add+=1]},
                {dataManager.tokenManager()[add+=1], dataManager.tokenManager()[add+=1], dataManager.tokenManager()[add+=1], dataManager.tokenManager()[add+=1], dataManager.tokenManager()[add+=1], dataManager.tokenManager()[add+=1], dataManager.tokenManager()[add+=1], dataManager.tokenManager()[add+=1]
                        , dataManager.tokenManager()[add+=1], dataManager.tokenManager()[add+=1], dataManager.tokenManager()[add+=1], dataManager.tokenManager()[add+=1], dataManager.tokenManager()[add+=1]},
                {dataManager.tokenManager()[add+=1], dataManager.tokenManager()[add+=1], dataManager.tokenManager()[add+=1], dataManager.tokenManager()[add+=1], dataManager.tokenManager()[add+=1], dataManager.tokenManager()[add+=1], dataManager.tokenManager()[add+=1], dataManager.tokenManager()[add+=1]
                        , dataManager.tokenManager()[add+=1], dataManager.tokenManager()[add+=1], dataManager.tokenManager()[add+=1], dataManager.tokenManager()[add+=1], dataManager.tokenManager()[add+=1]},
                {dataManager.tokenManager()[add+=1], dataManager.tokenManager()[add+=1], dataManager.tokenManager()[add+=1], dataManager.tokenManager()[add+=1], dataManager.tokenManager()[add+=1], dataManager.tokenManager()[add+=1], dataManager.tokenManager()[add+=1], dataManager.tokenManager()[add+=1]
                        , dataManager.tokenManager()[add+=1], dataManager.tokenManager()[add+=1], dataManager.tokenManager()[add+=1], dataManager.tokenManager()[add+=1], dataManager.tokenManager()[add+=1]},
                {dataManager.tokenManager()[add+=1], dataManager.tokenManager()[add+=1], dataManager.tokenManager()[add+=1], dataManager.tokenManager()[add+=1], dataManager.tokenManager()[add+=1], dataManager.tokenManager()[add+=1], dataManager.tokenManager()[add+=1], dataManager.tokenManager()[add+=1]
                        , dataManager.tokenManager()[add+=1], dataManager.tokenManager()[add+=1], dataManager.tokenManager()[add+=1], dataManager.tokenManager()[add+=1], dataManager.tokenManager()[add+=1]},
                {dataManager.tokenManager()[add+=1], dataManager.tokenManager()[add+=1], dataManager.tokenManager()[add+=1], dataManager.tokenManager()[add+=1], dataManager.tokenManager()[add+=1], dataManager.tokenManager()[add+=1], dataManager.tokenManager()[add+=1], dataManager.tokenManager()[add+=1]
                        , dataManager.tokenManager()[add+=1], dataManager.tokenManager()[add+=1], dataManager.tokenManager()[add+=1], dataManager.tokenManager()[add+=1], dataManager.tokenManager()[add+=1]},
                {dataManager.tokenManager()[add+=1], dataManager.tokenManager()[add+=1], dataManager.tokenManager()[add+=1], dataManager.tokenManager()[add+=1], dataManager.tokenManager()[add+=1], dataManager.tokenManager()[add+=1], dataManager.tokenManager()[add+=1], dataManager.tokenManager()[add+=1]
                        , dataManager.tokenManager()[add+=1], dataManager.tokenManager()[add+=1], dataManager.tokenManager()[add+=1], dataManager.tokenManager()[add+=1], dataManager.tokenManager()[add+=1]},
                {dataManager.tokenManager()[add+=1], dataManager.tokenManager()[add+=1], dataManager.tokenManager()[add+=1], dataManager.tokenManager()[add+=1], dataManager.tokenManager()[add+=1], dataManager.tokenManager()[add+=1], dataManager.tokenManager()[add+=1], dataManager.tokenManager()[add+=1]
                        , dataManager.tokenManager()[add+=1], dataManager.tokenManager()[add+=1], dataManager.tokenManager()[add+=1], dataManager.tokenManager()[add+=1], dataManager.tokenManager()[add+=1]},
                {dataManager.tokenManager()[add+=1], dataManager.tokenManager()[add+=1], dataManager.tokenManager()[add+=1], dataManager.tokenManager()[add+=1], dataManager.tokenManager()[add+=1], dataManager.tokenManager()[add+=1], dataManager.tokenManager()[add+=1], dataManager.tokenManager()[add+=1]
                        , dataManager.tokenManager()[add+=1], dataManager.tokenManager()[add+=1], dataManager.tokenManager()[add+=1], dataManager.tokenManager()[add+=1], dataManager.tokenManager()[add+=1]},
                {dataManager.tokenManager()[add+=1], dataManager.tokenManager()[add+=1], dataManager.tokenManager()[add+=1], dataManager.tokenManager()[add+=1], dataManager.tokenManager()[add+=1], dataManager.tokenManager()[add+=1], dataManager.tokenManager()[add+=1], dataManager.tokenManager()[add+=1]
                        , dataManager.tokenManager()[add+=1], dataManager.tokenManager()[add+=1], dataManager.tokenManager()[add+=1], dataManager.tokenManager()[add+=1], dataManager.tokenManager()[add+=1]},
                {dataManager.tokenManager()[add+=1], dataManager.tokenManager()[add+=1], dataManager.tokenManager()[add+=1], dataManager.tokenManager()[add+=1], dataManager.tokenManager()[add+=1], dataManager.tokenManager()[add+=1], dataManager.tokenManager()[add+=1], dataManager.tokenManager()[add+=1]
                        , dataManager.tokenManager()[add+=1], dataManager.tokenManager()[add+=1], dataManager.tokenManager()[add+=1], dataManager.tokenManager()[add+=1], dataManager.tokenManager()[add+=1]},
                {dataManager.tokenManager()[add+=1], dataManager.tokenManager()[add+=1], dataManager.tokenManager()[add+=1], dataManager.tokenManager()[add+=1], dataManager.tokenManager()[add+=1], dataManager.tokenManager()[add+=1], dataManager.tokenManager()[add+=1], dataManager.tokenManager()[add+=1]
                        , dataManager.tokenManager()[add+=1], dataManager.tokenManager()[add+=1], dataManager.tokenManager()[add+=1], dataManager.tokenManager()[add+=1], dataManager.tokenManager()[add+=1]},
                {dataManager.tokenManager()[add+=1], dataManager.tokenManager()[add+=1], dataManager.tokenManager()[add+=1], dataManager.tokenManager()[add+=1], dataManager.tokenManager()[add+=1], dataManager.tokenManager()[add+=1], dataManager.tokenManager()[add+=1], dataManager.tokenManager()[add+=1]
                        , dataManager.tokenManager()[add+=1], dataManager.tokenManager()[add+=1], dataManager.tokenManager()[add+=1], dataManager.tokenManager()[add+=1], dataManager.tokenManager()[add+=1]},
                {dataManager.tokenManager()[add+=1], dataManager.tokenManager()[add+=1], dataManager.tokenManager()[add+=1], dataManager.tokenManager()[add+=1], dataManager.tokenManager()[add+=1], dataManager.tokenManager()[add+=1], dataManager.tokenManager()[add+=1], dataManager.tokenManager()[add+=1]
                        , dataManager.tokenManager()[add+=1], dataManager.tokenManager()[add+=1], dataManager.tokenManager()[add+=1], dataManager.tokenManager()[add+=1], dataManager.tokenManager()[add+=1]},
                {dataManager.tokenManager()[add+=1], dataManager.tokenManager()[add+=1], dataManager.tokenManager()[add+=1], dataManager.tokenManager()[add+=1], dataManager.tokenManager()[add+=1], dataManager.tokenManager()[add+=1], dataManager.tokenManager()[add+=1], dataManager.tokenManager()[add+=1]
                        , dataManager.tokenManager()[add+=1], dataManager.tokenManager()[add+=1], dataManager.tokenManager()[add+=1], dataManager.tokenManager()[add+=1], dataManager.tokenManager()[add+=1]},
                {dataManager.tokenManager()[add+=1], dataManager.tokenManager()[add+=1], dataManager.tokenManager()[add+=1], dataManager.tokenManager()[add+=1], dataManager.tokenManager()[add+=1], dataManager.tokenManager()[add+=1], dataManager.tokenManager()[add+=1], dataManager.tokenManager()[add+=1]
                        , dataManager.tokenManager()[add+=1], dataManager.tokenManager()[add+=1], dataManager.tokenManager()[add+=1], dataManager.tokenManager()[add+=1], dataManager.tokenManager()[add+=1]},
                {dataManager.tokenManager()[add+=1], dataManager.tokenManager()[add+=1], dataManager.tokenManager()[add+=1], dataManager.tokenManager()[add+=1], dataManager.tokenManager()[add+=1], dataManager.tokenManager()[add+=1], dataManager.tokenManager()[add+=1], dataManager.tokenManager()[add+=1]
                        , dataManager.tokenManager()[add+=1], dataManager.tokenManager()[add+=1], dataManager.tokenManager()[add+=1], dataManager.tokenManager()[add+=1], dataManager.tokenManager()[add+=1]},
                {dataManager.tokenManager()[add+=1], dataManager.tokenManager()[add+=1], dataManager.tokenManager()[add+=1], dataManager.tokenManager()[add+=1], dataManager.tokenManager()[add+=1], dataManager.tokenManager()[add+=1], dataManager.tokenManager()[add+=1], dataManager.tokenManager()[add+=1]
                        , dataManager.tokenManager()[add+=1], dataManager.tokenManager()[add+=1], dataManager.tokenManager()[add+=1], dataManager.tokenManager()[add+=1], dataManager.tokenManager()[add+=1]},
                {dataManager.tokenManager()[add+=1], dataManager.tokenManager()[add+=1], dataManager.tokenManager()[add+=1], dataManager.tokenManager()[add+=1], dataManager.tokenManager()[add+=1], dataManager.tokenManager()[add+=1], dataManager.tokenManager()[add+=1], dataManager.tokenManager()[add+=1]
                        , dataManager.tokenManager()[add+=1], dataManager.tokenManager()[add+=1], dataManager.tokenManager()[add+=1], dataManager.tokenManager()[add+=1], dataManager.tokenManager()[add+=1]},
                {dataManager.tokenManager()[add+=1], dataManager.tokenManager()[add+=1], dataManager.tokenManager()[add+=1], dataManager.tokenManager()[add+=1], dataManager.tokenManager()[add+=1], dataManager.tokenManager()[add+=1], dataManager.tokenManager()[add+=1], dataManager.tokenManager()[add+=1]
                        , dataManager.tokenManager()[add+=1], dataManager.tokenManager()[add+=1], dataManager.tokenManager()[add+=1], dataManager.tokenManager()[add+=1], dataManager.tokenManager()[add+=1]},
                {dataManager.tokenManager()[add+=1], dataManager.tokenManager()[add+=1], dataManager.tokenManager()[add+=1], dataManager.tokenManager()[add+=1], dataManager.tokenManager()[add+=1], dataManager.tokenManager()[add+=1], dataManager.tokenManager()[add+=1], dataManager.tokenManager()[add+=1]
                        , dataManager.tokenManager()[add+=1], dataManager.tokenManager()[add+=1], dataManager.tokenManager()[add+=1], dataManager.tokenManager()[add+=1], dataManager.tokenManager()[add+=1]},
                {dataManager.tokenManager()[add+=1], dataManager.tokenManager()[add+=1], dataManager.tokenManager()[add+=1], dataManager.tokenManager()[add+=1], dataManager.tokenManager()[add+=1], dataManager.tokenManager()[add+=1], dataManager.tokenManager()[add+=1], dataManager.tokenManager()[add+=1]
                        , dataManager.tokenManager()[add+=1], dataManager.tokenManager()[add+=1], dataManager.tokenManager()[add+=1], dataManager.tokenManager()[add+=1], dataManager.tokenManager()[add+=1]},
                {dataManager.tokenManager()[add+=1], dataManager.tokenManager()[add+=1], dataManager.tokenManager()[add+=1], dataManager.tokenManager()[add+=1], dataManager.tokenManager()[add+=1], dataManager.tokenManager()[add+=1], dataManager.tokenManager()[add+=1], dataManager.tokenManager()[add+=1]
                        , dataManager.tokenManager()[add+=1], dataManager.tokenManager()[add+=1], dataManager.tokenManager()[add+=1], dataManager.tokenManager()[add+=1], dataManager.tokenManager()[add+=1]},
                {dataManager.tokenManager()[add+=1], dataManager.tokenManager()[add+=1], dataManager.tokenManager()[add+=1], dataManager.tokenManager()[add+=1], dataManager.tokenManager()[add+=1], dataManager.tokenManager()[add+=1], dataManager.tokenManager()[add+=1], dataManager.tokenManager()[add+=1]
                        , dataManager.tokenManager()[add+=1], dataManager.tokenManager()[add+=1], dataManager.tokenManager()[add+=1], dataManager.tokenManager()[add+=1], dataManager.tokenManager()[add+=1]},
                {dataManager.tokenManager()[add+=1], dataManager.tokenManager()[add+=1], dataManager.tokenManager()[add+=1], dataManager.tokenManager()[add+=1], dataManager.tokenManager()[add+=1], dataManager.tokenManager()[add+=1], dataManager.tokenManager()[add+=1], dataManager.tokenManager()[add+=1]
                        , dataManager.tokenManager()[add+=1], dataManager.tokenManager()[add+=1], dataManager.tokenManager()[add+=1], dataManager.tokenManager()[add+=1], dataManager.tokenManager()[add+=1]},
                {dataManager.tokenManager()[add+=1], dataManager.tokenManager()[add+=1], dataManager.tokenManager()[add+=1], dataManager.tokenManager()[add+=1], dataManager.tokenManager()[add+=1], dataManager.tokenManager()[add+=1], dataManager.tokenManager()[add+=1], dataManager.tokenManager()[add+=1]
                        , dataManager.tokenManager()[add+=1], dataManager.tokenManager()[add+=1], dataManager.tokenManager()[add+=1], dataManager.tokenManager()[add+=1], dataManager.tokenManager()[add+=1]},
                {dataManager.tokenManager()[add+=1], dataManager.tokenManager()[add+=1], dataManager.tokenManager()[add+=1], dataManager.tokenManager()[add+=1], dataManager.tokenManager()[add+=1], dataManager.tokenManager()[add+=1], dataManager.tokenManager()[add+=1], dataManager.tokenManager()[add+=1]
                        , dataManager.tokenManager()[add+=1], dataManager.tokenManager()[add+=1], dataManager.tokenManager()[add+=1], dataManager.tokenManager()[add+=1], dataManager.tokenManager()[add+=1]},
                {dataManager.tokenManager()[add+=1], dataManager.tokenManager()[add+=1], dataManager.tokenManager()[add+=1], dataManager.tokenManager()[add+=1], dataManager.tokenManager()[add+=1], dataManager.tokenManager()[add+=1], dataManager.tokenManager()[add+=1], dataManager.tokenManager()[add+=1]
                        , dataManager.tokenManager()[add+=1], dataManager.tokenManager()[add+=1], dataManager.tokenManager()[add+=1], dataManager.tokenManager()[add+=1], dataManager.tokenManager()[add+=1]},
                {dataManager.tokenManager()[add+=1], dataManager.tokenManager()[add+=1], dataManager.tokenManager()[add+=1], dataManager.tokenManager()[add+=1], dataManager.tokenManager()[add+=1], dataManager.tokenManager()[add+=1], dataManager.tokenManager()[add+=1], dataManager.tokenManager()[add+=1]
                        , dataManager.tokenManager()[add+=1], dataManager.tokenManager()[add+=1], dataManager.tokenManager()[add+=1], dataManager.tokenManager()[add+=1], dataManager.tokenManager()[add+1]},
        };

        return tableData;
    }

    public String[][] salaryTableColumns()
    {
        DataManager dataManager = new DataManager();
        int addOne = 0;
        int addTwo = 1;
        int addThree = 2;
        int addSal = 1;

        String[][] tableData = {
                {dataManager.tokenManager()[addOne], dataManager.tokenManager()[addTwo], dataManager.tokenManager()[addThree], String.valueOf(dataManager.callSalaryCalculator()[addSal])},
                {dataManager.tokenManager()[addOne+=13], dataManager.tokenManager()[addTwo+=13], dataManager.tokenManager()[addThree+=13], String.valueOf(dataManager.callSalaryCalculator()[addSal+=1])},
                {dataManager.tokenManager()[addOne+=13], dataManager.tokenManager()[addTwo+=13], dataManager.tokenManager()[addThree+=13], String.valueOf(dataManager.callSalaryCalculator()[addSal+=1])},
                {dataManager.tokenManager()[addOne+=13], dataManager.tokenManager()[addTwo+=13], dataManager.tokenManager()[addThree+=13], String.valueOf(dataManager.callSalaryCalculator()[addSal+=1])},
                {dataManager.tokenManager()[addOne+=13], dataManager.tokenManager()[addTwo+=13], dataManager.tokenManager()[addThree+=13], String.valueOf(dataManager.callSalaryCalculator()[addSal+=1])},
                {dataManager.tokenManager()[addOne+=13], dataManager.tokenManager()[addTwo+=13], dataManager.tokenManager()[addThree+=13], String.valueOf(dataManager.callSalaryCalculator()[addSal+=1])},
                {dataManager.tokenManager()[addOne+=13], dataManager.tokenManager()[addTwo+=13], dataManager.tokenManager()[addThree+=13], String.valueOf(dataManager.callSalaryCalculator()[addSal+=1])},
                {dataManager.tokenManager()[addOne+=13], dataManager.tokenManager()[addTwo+=13], dataManager.tokenManager()[addThree+=13], String.valueOf(dataManager.callSalaryCalculator()[addSal+=1])},
                {dataManager.tokenManager()[addOne+=13], dataManager.tokenManager()[addTwo+=13], dataManager.tokenManager()[addThree+=13], String.valueOf(dataManager.callSalaryCalculator()[addSal+=1])},
                {dataManager.tokenManager()[addOne+=13], dataManager.tokenManager()[addTwo+=13], dataManager.tokenManager()[addThree+=13], String.valueOf(dataManager.callSalaryCalculator()[addSal+=1])},
                {dataManager.tokenManager()[addOne+=13], dataManager.tokenManager()[addTwo+=13], dataManager.tokenManager()[addThree+=13], String.valueOf(dataManager.callSalaryCalculator()[addSal+=1])},
                {dataManager.tokenManager()[addOne+=13], dataManager.tokenManager()[addTwo+=13], dataManager.tokenManager()[addThree+=13], String.valueOf(dataManager.callSalaryCalculator()[addSal+=1])},
                {dataManager.tokenManager()[addOne+=13], dataManager.tokenManager()[addTwo+=13], dataManager.tokenManager()[addThree+=13], String.valueOf(dataManager.callSalaryCalculator()[addSal+=1])},
                {dataManager.tokenManager()[addOne+=13], dataManager.tokenManager()[addTwo+=13], dataManager.tokenManager()[addThree+=13], String.valueOf(dataManager.callSalaryCalculator()[addSal+=1])},
                {dataManager.tokenManager()[addOne+=13], dataManager.tokenManager()[addTwo+=13], dataManager.tokenManager()[addThree+=13], String.valueOf(dataManager.callSalaryCalculator()[addSal+=1])},
                {dataManager.tokenManager()[addOne+=13], dataManager.tokenManager()[addTwo+=13], dataManager.tokenManager()[addThree+=13], String.valueOf(dataManager.callSalaryCalculator()[addSal+=1])},
                {dataManager.tokenManager()[addOne+=13], dataManager.tokenManager()[addTwo+=13], dataManager.tokenManager()[addThree+=13], String.valueOf(dataManager.callSalaryCalculator()[addSal+=1])},
                {dataManager.tokenManager()[addOne+=13], dataManager.tokenManager()[addTwo+=13], dataManager.tokenManager()[addThree+=13], String.valueOf(dataManager.callSalaryCalculator()[addSal+=1])},
                {dataManager.tokenManager()[addOne+=13], dataManager.tokenManager()[addTwo+=13], dataManager.tokenManager()[addThree+=13], String.valueOf(dataManager.callSalaryCalculator()[addSal+=1])},
                {dataManager.tokenManager()[addOne+=13], dataManager.tokenManager()[addTwo+=13], dataManager.tokenManager()[addThree+=13], String.valueOf(dataManager.callSalaryCalculator()[addSal+=1])},
                {dataManager.tokenManager()[addOne+=13], dataManager.tokenManager()[addTwo+=13], dataManager.tokenManager()[addThree+=13], String.valueOf(dataManager.callSalaryCalculator()[addSal+=1])},
                {dataManager.tokenManager()[addOne+=13], dataManager.tokenManager()[addTwo+=13], dataManager.tokenManager()[addThree+=13], String.valueOf(dataManager.callSalaryCalculator()[addSal+=1])},
                {dataManager.tokenManager()[addOne+=13], dataManager.tokenManager()[addTwo+=13], dataManager.tokenManager()[addThree+=13], String.valueOf(dataManager.callSalaryCalculator()[addSal+=1])},
                {dataManager.tokenManager()[addOne+=13], dataManager.tokenManager()[addTwo+=13], dataManager.tokenManager()[addThree+=13], String.valueOf(dataManager.callSalaryCalculator()[addSal+=1])},
                {dataManager.tokenManager()[addOne+=13], dataManager.tokenManager()[addTwo+=13], dataManager.tokenManager()[addThree+=13], String.valueOf(dataManager.callSalaryCalculator()[addSal+=1])},
                {dataManager.tokenManager()[addOne+=13], dataManager.tokenManager()[addTwo+=13], dataManager.tokenManager()[addThree+=13], String.valueOf(dataManager.callSalaryCalculator()[addSal+=1])},
                {dataManager.tokenManager()[addOne+=13], dataManager.tokenManager()[addTwo+=13], dataManager.tokenManager()[addThree+=13], String.valueOf(dataManager.callSalaryCalculator()[addSal+=1])},
                {dataManager.tokenManager()[addOne+=13], dataManager.tokenManager()[addTwo+=13], dataManager.tokenManager()[addThree+=13], String.valueOf(dataManager.callSalaryCalculator()[addSal+=1])},
                {dataManager.tokenManager()[addOne+=13], dataManager.tokenManager()[addTwo+=13], dataManager.tokenManager()[addThree+=13], String.valueOf(dataManager.callSalaryCalculator()[addSal+=1])},
                {dataManager.tokenManager()[addOne+=13], dataManager.tokenManager()[addTwo+=13], dataManager.tokenManager()[addThree+=13], String.valueOf(dataManager.callSalaryCalculator()[addSal+=1])},
                {dataManager.tokenManager()[addOne+=13], dataManager.tokenManager()[addTwo+=13], dataManager.tokenManager()[addThree+=13], String.valueOf(dataManager.callSalaryCalculator()[addSal+=1])},
                {dataManager.tokenManager()[addOne+=13], dataManager.tokenManager()[addTwo+=13], dataManager.tokenManager()[addThree+=13], String.valueOf(dataManager.callSalaryCalculator()[addSal+=1])},
                {dataManager.tokenManager()[addOne+=13], dataManager.tokenManager()[addTwo+=13], dataManager.tokenManager()[addThree+=13], String.valueOf(dataManager.callSalaryCalculator()[addSal+=1])},
                {dataManager.tokenManager()[addOne+=13], dataManager.tokenManager()[addTwo+=13], dataManager.tokenManager()[addThree+=13], String.valueOf(dataManager.callSalaryCalculator()[addSal+=1])},
                {dataManager.tokenManager()[addOne+=13], dataManager.tokenManager()[addTwo+=13], dataManager.tokenManager()[addThree+=13], String.valueOf(dataManager.callSalaryCalculator()[addSal+=1])},
                {dataManager.tokenManager()[addOne+=13], dataManager.tokenManager()[addTwo+=13], dataManager.tokenManager()[addThree+=13], String.valueOf(dataManager.callSalaryCalculator()[addSal+=1])},
                {dataManager.tokenManager()[addOne+=13], dataManager.tokenManager()[addTwo+=13], dataManager.tokenManager()[addThree+=13], String.valueOf(dataManager.callSalaryCalculator()[addSal+=1])},
                {dataManager.tokenManager()[addOne+=13], dataManager.tokenManager()[addTwo+=13], dataManager.tokenManager()[addThree+=13], String.valueOf(dataManager.callSalaryCalculator()[addSal+=1])},
                {dataManager.tokenManager()[addOne+=13], dataManager.tokenManager()[addTwo+=13], dataManager.tokenManager()[addThree+=13], String.valueOf(dataManager.callSalaryCalculator()[addSal+=1])},
                {dataManager.tokenManager()[addOne+=13], dataManager.tokenManager()[addTwo+=13], dataManager.tokenManager()[addThree+=13], String.valueOf(dataManager.callSalaryCalculator()[addSal+=1])},
                {dataManager.tokenManager()[addOne+=13], dataManager.tokenManager()[addTwo+=13], dataManager.tokenManager()[addThree+=13], String.valueOf(dataManager.callSalaryCalculator()[addSal+=1])},
                {dataManager.tokenManager()[addOne+=13], dataManager.tokenManager()[addTwo+=13], dataManager.tokenManager()[addThree+=13], String.valueOf(dataManager.callSalaryCalculator()[addSal+=1])},
                {dataManager.tokenManager()[addOne+=13], dataManager.tokenManager()[addTwo+=13], dataManager.tokenManager()[addThree+=13], String.valueOf(dataManager.callSalaryCalculator()[addSal+=1])},
                {dataManager.tokenManager()[addOne+=13], dataManager.tokenManager()[addTwo+=13], dataManager.tokenManager()[addThree+=13], String.valueOf(dataManager.callSalaryCalculator()[addSal+=1])},
                {dataManager.tokenManager()[addOne+=13], dataManager.tokenManager()[addTwo+=13], dataManager.tokenManager()[addThree+=13], String.valueOf(dataManager.callSalaryCalculator()[addSal+=1])},
                {dataManager.tokenManager()[addOne+=13], dataManager.tokenManager()[addTwo+=13], dataManager.tokenManager()[addThree+=13], String.valueOf(dataManager.callSalaryCalculator()[addSal+=1])},
                {dataManager.tokenManager()[addOne+=13], dataManager.tokenManager()[addTwo+=13], dataManager.tokenManager()[addThree+=13], String.valueOf(dataManager.callSalaryCalculator()[addSal+=1])},
                {dataManager.tokenManager()[addOne+=13], dataManager.tokenManager()[addTwo+=13], dataManager.tokenManager()[addThree+=13], String.valueOf(dataManager.callSalaryCalculator()[addSal+=1])},
                {dataManager.tokenManager()[addOne+=13], dataManager.tokenManager()[addTwo+=13], dataManager.tokenManager()[addThree+=13], String.valueOf(dataManager.callSalaryCalculator()[addSal+=1])},
                {dataManager.tokenManager()[addOne+13], dataManager.tokenManager()[addTwo+13], dataManager.tokenManager()[addThree+13], String.valueOf(dataManager.callSalaryCalculator()[addSal+1])},
        };

        return tableData;
    }

    public String[][] grossTableColumns()
    {
        DataManager dataManager = new DataManager();
        int addOne = 0;
        int addTwo = 1;
        int addThree = 2;
        int addSal = 1;

        String[][] tableData = {
                {dataManager.tokenManager()[addOne], dataManager.tokenManager()[addTwo], dataManager.tokenManager()[addThree], String.valueOf(dataManager.callGrossCalculator()[addSal])},
                {dataManager.tokenManager()[addOne+=13], dataManager.tokenManager()[addTwo+=13], dataManager.tokenManager()[addThree+=13], String.valueOf(dataManager.callGrossCalculator()[addSal+=1])},
                {dataManager.tokenManager()[addOne+=13], dataManager.tokenManager()[addTwo+=13], dataManager.tokenManager()[addThree+=13], String.valueOf(dataManager.callGrossCalculator()[addSal+=1])},
                {dataManager.tokenManager()[addOne+=13], dataManager.tokenManager()[addTwo+=13], dataManager.tokenManager()[addThree+=13], String.valueOf(dataManager.callGrossCalculator()[addSal+=1])},
                {dataManager.tokenManager()[addOne+=13], dataManager.tokenManager()[addTwo+=13], dataManager.tokenManager()[addThree+=13], String.valueOf(dataManager.callGrossCalculator()[addSal+=1])},
                {dataManager.tokenManager()[addOne+=13], dataManager.tokenManager()[addTwo+=13], dataManager.tokenManager()[addThree+=13], String.valueOf(dataManager.callGrossCalculator()[addSal+=1])},
                {dataManager.tokenManager()[addOne+=13], dataManager.tokenManager()[addTwo+=13], dataManager.tokenManager()[addThree+=13], String.valueOf(dataManager.callGrossCalculator()[addSal+=1])},
                {dataManager.tokenManager()[addOne+=13], dataManager.tokenManager()[addTwo+=13], dataManager.tokenManager()[addThree+=13], String.valueOf(dataManager.callGrossCalculator()[addSal+=1])},
                {dataManager.tokenManager()[addOne+=13], dataManager.tokenManager()[addTwo+=13], dataManager.tokenManager()[addThree+=13], String.valueOf(dataManager.callGrossCalculator()[addSal+=1])},
                {dataManager.tokenManager()[addOne+=13], dataManager.tokenManager()[addTwo+=13], dataManager.tokenManager()[addThree+=13], String.valueOf(dataManager.callGrossCalculator()[addSal+=1])},
                {dataManager.tokenManager()[addOne+=13], dataManager.tokenManager()[addTwo+=13], dataManager.tokenManager()[addThree+=13], String.valueOf(dataManager.callGrossCalculator()[addSal+=1])},
                {dataManager.tokenManager()[addOne+=13], dataManager.tokenManager()[addTwo+=13], dataManager.tokenManager()[addThree+=13], String.valueOf(dataManager.callGrossCalculator()[addSal+=1])},
                {dataManager.tokenManager()[addOne+=13], dataManager.tokenManager()[addTwo+=13], dataManager.tokenManager()[addThree+=13], String.valueOf(dataManager.callGrossCalculator()[addSal+=1])},
                {dataManager.tokenManager()[addOne+=13], dataManager.tokenManager()[addTwo+=13], dataManager.tokenManager()[addThree+=13], String.valueOf(dataManager.callGrossCalculator()[addSal+=1])},
                {dataManager.tokenManager()[addOne+=13], dataManager.tokenManager()[addTwo+=13], dataManager.tokenManager()[addThree+=13], String.valueOf(dataManager.callGrossCalculator()[addSal+=1])},
                {dataManager.tokenManager()[addOne+=13], dataManager.tokenManager()[addTwo+=13], dataManager.tokenManager()[addThree+=13], String.valueOf(dataManager.callGrossCalculator()[addSal+=1])},
                {dataManager.tokenManager()[addOne+=13], dataManager.tokenManager()[addTwo+=13], dataManager.tokenManager()[addThree+=13], String.valueOf(dataManager.callGrossCalculator()[addSal+=1])},
                {dataManager.tokenManager()[addOne+=13], dataManager.tokenManager()[addTwo+=13], dataManager.tokenManager()[addThree+=13], String.valueOf(dataManager.callGrossCalculator()[addSal+=1])},
                {dataManager.tokenManager()[addOne+=13], dataManager.tokenManager()[addTwo+=13], dataManager.tokenManager()[addThree+=13], String.valueOf(dataManager.callGrossCalculator()[addSal+=1])},
                {dataManager.tokenManager()[addOne+=13], dataManager.tokenManager()[addTwo+=13], dataManager.tokenManager()[addThree+=13], String.valueOf(dataManager.callGrossCalculator()[addSal+=1])},
                {dataManager.tokenManager()[addOne+=13], dataManager.tokenManager()[addTwo+=13], dataManager.tokenManager()[addThree+=13], String.valueOf(dataManager.callGrossCalculator()[addSal+=1])},                {dataManager.tokenManager()[addOne+=13], dataManager.tokenManager()[addTwo+=13], dataManager.tokenManager()[addThree+=13], String.valueOf(dataManager.callGrossCalculator()[addSal+=1])},
                {dataManager.tokenManager()[addOne+=13], dataManager.tokenManager()[addTwo+=13], dataManager.tokenManager()[addThree+=13], String.valueOf(dataManager.callGrossCalculator()[addSal+=1])},
                {dataManager.tokenManager()[addOne+=13], dataManager.tokenManager()[addTwo+=13], dataManager.tokenManager()[addThree+=13], String.valueOf(dataManager.callGrossCalculator()[addSal+=1])},
                {dataManager.tokenManager()[addOne+=13], dataManager.tokenManager()[addTwo+=13], dataManager.tokenManager()[addThree+=13], String.valueOf(dataManager.callGrossCalculator()[addSal+=1])},
                {dataManager.tokenManager()[addOne+=13], dataManager.tokenManager()[addTwo+=13], dataManager.tokenManager()[addThree+=13], String.valueOf(dataManager.callGrossCalculator()[addSal+=1])},
                {dataManager.tokenManager()[addOne+=13], dataManager.tokenManager()[addTwo+=13], dataManager.tokenManager()[addThree+=13], String.valueOf(dataManager.callGrossCalculator()[addSal+=1])},
                {dataManager.tokenManager()[addOne+=13], dataManager.tokenManager()[addTwo+=13], dataManager.tokenManager()[addThree+=13], String.valueOf(dataManager.callGrossCalculator()[addSal+=1])},
                {dataManager.tokenManager()[addOne+=13], dataManager.tokenManager()[addTwo+=13], dataManager.tokenManager()[addThree+=13], String.valueOf(dataManager.callGrossCalculator()[addSal+=1])},
                {dataManager.tokenManager()[addOne+=13], dataManager.tokenManager()[addTwo+=13], dataManager.tokenManager()[addThree+=13], String.valueOf(dataManager.callGrossCalculator()[addSal+=1])},
                {dataManager.tokenManager()[addOne+=13], dataManager.tokenManager()[addTwo+=13], dataManager.tokenManager()[addThree+=13], String.valueOf(dataManager.callGrossCalculator()[addSal+=1])},                {dataManager.tokenManager()[addOne+=13], dataManager.tokenManager()[addTwo+=13], dataManager.tokenManager()[addThree+=13], String.valueOf(dataManager.callGrossCalculator()[addSal+=1])},
                {dataManager.tokenManager()[addOne+=13], dataManager.tokenManager()[addTwo+=13], dataManager.tokenManager()[addThree+=13], String.valueOf(dataManager.callGrossCalculator()[addSal+=1])},
                {dataManager.tokenManager()[addOne+=13], dataManager.tokenManager()[addTwo+=13], dataManager.tokenManager()[addThree+=13], String.valueOf(dataManager.callGrossCalculator()[addSal+=1])},
                {dataManager.tokenManager()[addOne+=13], dataManager.tokenManager()[addTwo+=13], dataManager.tokenManager()[addThree+=13], String.valueOf(dataManager.callGrossCalculator()[addSal+=1])},
                {dataManager.tokenManager()[addOne+=13], dataManager.tokenManager()[addTwo+=13], dataManager.tokenManager()[addThree+=13], String.valueOf(dataManager.callGrossCalculator()[addSal+=1])},
                {dataManager.tokenManager()[addOne+=13], dataManager.tokenManager()[addTwo+=13], dataManager.tokenManager()[addThree+=13], String.valueOf(dataManager.callGrossCalculator()[addSal+=1])},
                {dataManager.tokenManager()[addOne+=13], dataManager.tokenManager()[addTwo+=13], dataManager.tokenManager()[addThree+=13], String.valueOf(dataManager.callGrossCalculator()[addSal+=1])},
                {dataManager.tokenManager()[addOne+=13], dataManager.tokenManager()[addTwo+=13], dataManager.tokenManager()[addThree+=13], String.valueOf(dataManager.callGrossCalculator()[addSal+=1])},
                {dataManager.tokenManager()[addOne+=13], dataManager.tokenManager()[addTwo+=13], dataManager.tokenManager()[addThree+=13], String.valueOf(dataManager.callGrossCalculator()[addSal+=1])},
                {dataManager.tokenManager()[addOne+=13], dataManager.tokenManager()[addTwo+=13], dataManager.tokenManager()[addThree+=13], String.valueOf(dataManager.callGrossCalculator()[addSal+=1])},                {dataManager.tokenManager()[addOne+=13], dataManager.tokenManager()[addTwo+=13], dataManager.tokenManager()[addThree+=13], String.valueOf(dataManager.callGrossCalculator()[addSal+=1])},
                {dataManager.tokenManager()[addOne+=13], dataManager.tokenManager()[addTwo+=13], dataManager.tokenManager()[addThree+=13], String.valueOf(dataManager.callGrossCalculator()[addSal+=1])},
                {dataManager.tokenManager()[addOne+=13], dataManager.tokenManager()[addTwo+=13], dataManager.tokenManager()[addThree+=13], String.valueOf(dataManager.callGrossCalculator()[addSal+=1])},
                {dataManager.tokenManager()[addOne+=13], dataManager.tokenManager()[addTwo+=13], dataManager.tokenManager()[addThree+=13], String.valueOf(dataManager.callGrossCalculator()[addSal+=1])},
                {dataManager.tokenManager()[addOne+=13], dataManager.tokenManager()[addTwo+=13], dataManager.tokenManager()[addThree+=13], String.valueOf(dataManager.callGrossCalculator()[addSal+=1])},
                {dataManager.tokenManager()[addOne+=13], dataManager.tokenManager()[addTwo+=13], dataManager.tokenManager()[addThree+=13], String.valueOf(dataManager.callGrossCalculator()[addSal+=1])},
                {dataManager.tokenManager()[addOne+=13], dataManager.tokenManager()[addTwo+=13], dataManager.tokenManager()[addThree+=13], String.valueOf(dataManager.callGrossCalculator()[addSal+=1])},
                {dataManager.tokenManager()[addOne+=13], dataManager.tokenManager()[addTwo+=13], dataManager.tokenManager()[addThree+=13], String.valueOf(dataManager.callGrossCalculator()[addSal+=1])},
                {dataManager.tokenManager()[addOne+13], dataManager.tokenManager()[addTwo+13], dataManager.tokenManager()[addThree+13], String.valueOf(dataManager.callGrossCalculator()[addSal+1])},
        };

        return tableData;
    }

    public String[][] femEmpTableColumns()
    {
        DataManager dataManager = new DataManager();
        int addOne = 0;
        int addTwo = 1;
        int addThree = 2;
        int addFour = 4;

        String[][] tableData = {
                {dataManager.tokenManager()[addOne], dataManager.tokenManager()[addTwo], dataManager.tokenManager()[addThree], dataManager.tokenManager()[addFour]},
                {dataManager.tokenManager()[addOne+=13], dataManager.tokenManager()[addTwo+=13], dataManager.tokenManager()[addThree+=13], dataManager.tokenManager()[addFour+=13]},
        };

        return tableData;
    }

    public String[][] censusTableColumns()
    {
        DataManager dataManager = new DataManager();
        int addOne = 0;
        int addTwo = 1;
        int addThree = 2;
        int addFour = 4;

        String[][] tableData = {
                {dataManager.tokenManager()[addOne], dataManager.tokenManager()[addTwo], dataManager.tokenManager()[addThree], dataManager.tokenManager()[addFour]},
                {dataManager.tokenManager()[addOne+=13], dataManager.tokenManager()[addTwo+=13], dataManager.tokenManager()[addThree+=13], dataManager.tokenManager()[addFour+=13]},
        };

        return tableData;
    }
}
