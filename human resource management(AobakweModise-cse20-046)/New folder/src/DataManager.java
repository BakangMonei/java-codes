import java.io.File;  // Import the File class
import java.io.FileWriter;
import java.io.IOException;// Import this class to handle Exception errors
import java.io.FileNotFoundException;  // Import this class to handle errors
import java.util.Scanner; // Import the Scanner class to read text files

public class DataManager
{
    final static int DATA_LINES_LIMIT = 51;

    FileData fileData = new FileData();
    static Employees employees = new Employees();

    /**
     * Method to create a file into the program directory and
     * write data from writeToFile into the text file
     * */
    public static void createFile()
    {
        File dataFile = new File("employee.txt");
        try
        {
            /**
             * Check if the text file exists
             * If it does not then create it and write data to it
             * Else printout FILE EXISTS
             * */
            if(dataFile.createNewFile())
            {
                writeToFile();
                //System.out.println("File Created");
            }
            else
            {
                //File already exists
                //System.out.println("File Already Exists");
            }

        }
        catch (IOException e)
        {
            System.out.println("An Error Occurred");
            e.printStackTrace();
        }
    }
    /**
     * Constructor that holds a string to all the data in the text file
     * The constructor is used by the existingFileContents and overwriteFileContents methods
     * by getting the String str that contentsOfFile returns then writing the string to the text file
     **/
    public static String contentsOfFile()
    {
        String strLine = "";

        FileData fileDataObj = new FileData();
        String[][] importedData;
        String[] importedDataLines = new String[DATA_LINES_LIMIT];

        //vars to located each word in file
        int dataLinesArrayNumber = 1;

        importedData = fileDataObj.callFileData();

        //Set importedDataLines var to an empty string so it does not return null
        for(int i = 1; i < DATA_LINES_LIMIT; i++)
        {
            importedDataLines[dataLinesArrayNumber] = "";
            dataLinesArrayNumber++;
        }

        //Assign importedDataLines to the data from FileData
        for(int i = 1; i < DATA_LINES_LIMIT; ++i)
        {
            importedDataLines[i] = importedData[i][0] + " " + importedData[i][1] + " " + importedData[i][2] + " " + importedData[i][3] + " " + importedData[i][4] + " " + importedData[i][5] + " " +
                    importedData[i][6] + " " + importedData[i][7] + " " + importedData[i][8] + " " + importedData[i][9] + " " + importedData[i][10] + " " + importedData[i][11] + " " + importedData[i][12];
        }

        //Assign strLine to all the data from FileData
        for (int i = 1; i < DATA_LINES_LIMIT; i++)
        {
            strLine += importedDataLines[i] + ";" + "\n";
        }

        return strLine;
    }

    /**
     * File writer that gets contents from the contentsOfFile in string form and writes
     * the information into the text file employee.txt
     * */

    public static void writeToFile()
    {
        try {
            FileWriter myWriter = new FileWriter("employee.txt");
            myWriter.write(contentsOfFile());
            myWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * File reader that uses a Scanner to read all the data in the text file and returns a
     * String collectedDataFromReader that has no line spacings
     **/
    public static String readFile()
    {
        String collectedDataFromReader = "";
        try
        {
            File dataFile = new File("employee.txt");
            Scanner fileScanner = new Scanner(dataFile);

            //Read file line by line and assign the data to collectedData String
            while (fileScanner.hasNextLine())
            {
                collectedDataFromReader += fileScanner.nextLine();
            }
        }

        catch (FileNotFoundException e)
        {
            e.printStackTrace();
        }
        return collectedDataFromReader;
    }

    /**
     * Method that has a string which is assigned to the contents of the text file
     * The method scans the string and replaces all spaces with a a semi colon
     * The data from this method is then exported to the tokens manager to assign all the
     * words into an array of tokens
    **/
    public static String readFileWithDelimiter()
    {
        String strWithDelimiter = readFile();
        strWithDelimiter = strWithDelimiter.replaceAll(" ", ";" );

        return strWithDelimiter;
    }

    /**
     * Method imports data from the readFileWithDelimiter constructor and assigns all the tokens to an array
     * The constructor identifies where a word begins and ends through the use of the split method
     * The method splits the data into an array at every semi-colon and returns the String array tokenElements
     **/
    public static String[] tokenManager()
    {
        //String for the words that have been split with a semi-colon
        String delimitedFileContent = readFileWithDelimiter();

        //String of the tokens individually
        String[] tokenElements = delimitedFileContent.split(";");

        return tokenElements;
    }

    //Table Header
    public String[] callEmployeeTableHeader()
    {

        String[] tableHeaders = fileData.employeeTableHeader();

        return tableHeaders;
    }
    public String[] callSalaryTableHeader()
    {

        String[] tableHeaders = fileData.salaryTableHeader();

        return tableHeaders;
    }
    public String[] callGrossTableHeader()
    {

        String[] tableHeaders = fileData.grossTableHeader();

        return tableHeaders;
    }
    public String[] callFemTableHeader()
    {

        String[] tableHeaders = fileData.femEmpTableHeader();

        return tableHeaders;
    }
    public String[] callCensusTableHeader()
    {

        String[] tableHeaders = fileData.censusTableHeader();

        return tableHeaders;
    }

    //Table Data
    public String[][] callEmployeeTableData()
    {
        String[][] tableData = fileData.employeeTableColumns();

        return tableData;
    }
    public String[][] callSalaryTableData()
    {
        String[][] tableData = fileData.salaryTableColumns();

        return tableData;
    }
    public String[][] callGrossTableData()
    {
        String[][] tableData = fileData.grossTableColumns();

        return tableData;
    }
    public String[][] callFemTableData()
    {
        String[][] tableData = fileData.femEmpTableColumns();

        return tableData;
    }
    public String[][] callCensusTableData()
    {
        String[][] tableData = fileData.censusTableColumns();

        return tableData;
    }

    public static void callFileManagerMethods()
    {
        createFile();
        readFile();
        tokenManager();
        callSalaryCalculator();
        callGrossCalculator();
    }

    public static double[] callSalaryCalculator()
    {
        double[] salary = new double[51];

        salary[1] = employees.calcSalary()[1];
        salary[2] = employees.calcSalary()[2];
        salary[3] = employees.calcSalary()[3];
        salary[4] = employees.calcSalary()[4];
        salary[5] = employees.calcSalary()[5];
        salary[6] = employees.calcSalary()[6];
        salary[7] = employees.calcSalary()[7];
        salary[8] = employees.calcSalary()[8];
        salary[9] = employees.calcSalary()[9];
        salary[10] = employees.calcSalary()[10];
        salary[11] = employees.calcSalary()[11];
        salary[12] = employees.calcSalary()[12];
        salary[13] = employees.calcSalary()[13];
        salary[14] = employees.calcSalary()[14];
        salary[15] = employees.calcSalary()[15];
        salary[16] = employees.calcSalary()[16];
        salary[17] = employees.calcSalary()[17];
        salary[18] = employees.calcSalary()[18];
        salary[19] = employees.calcSalary()[19];
        salary[20] = employees.calcSalary()[20];
        salary[21] = employees.calcSalary()[21];
        salary[22] = employees.calcSalary()[22];
        salary[23] = employees.calcSalary()[23];
        salary[24] = employees.calcSalary()[24];
        salary[25] = employees.calcSalary()[25];
        salary[26] = employees.calcSalary()[26];
        salary[27] = employees.calcSalary()[27];
        salary[28] = employees.calcSalary()[28];
        salary[29] = employees.calcSalary()[29];
        salary[30] = employees.calcSalary()[30];
        salary[31] = employees.calcSalary()[31];
        salary[32] = employees.calcSalary()[32];
        salary[33] = employees.calcSalary()[33];
        salary[34] = employees.calcSalary()[34];
        salary[35] = employees.calcSalary()[35];
        salary[36] = employees.calcSalary()[36];
        salary[37] = employees.calcSalary()[37];
        salary[38] = employees.calcSalary()[38];
        salary[39] = employees.calcSalary()[39];
        salary[40] = employees.calcSalary()[40];
        salary[41] = employees.calcSalary()[41];
        salary[42] = employees.calcSalary()[42];
        salary[43] = employees.calcSalary()[43];
        salary[44] = employees.calcSalary()[44];
        salary[45] = employees.calcSalary()[45];
        salary[46] = employees.calcSalary()[46];
        salary[47] = employees.calcSalary()[47];
        salary[48] = employees.calcSalary()[48];
        salary[49] = employees.calcSalary()[49];
        salary[50] = employees.calcSalary()[50];



        return salary;
    }
    public static double[] callGrossCalculator()
    {
        double[] gross = new double[51];

        gross[1] = employees.calcGross()[1];
        gross[2] = employees.calcGross()[2];
        gross[3] = employees.calcGross()[3];
        gross[4] = employees.calcGross()[4];
        gross[5] = employees.calcGross()[5];
        gross[6] = employees.calcGross()[6];
        gross[7] = employees.calcGross()[7];
        gross[8] = employees.calcGross()[8];
        gross[9] = employees.calcGross()[9];
        gross[10] = employees.calcGross()[10];
        gross[11] = employees.calcGross()[11];
        gross[12] = employees.calcGross()[12];
        gross[13] = employees.calcGross()[13];
        gross[14] = employees.calcGross()[14];
        gross[15] = employees.calcGross()[15];
        gross[16] = employees.calcGross()[16];
        gross[17] = employees.calcGross()[17];
        gross[18] = employees.calcGross()[18];
        gross[19] = employees.calcGross()[19];
        gross[20] = employees.calcGross()[20];
        gross[21] = employees.calcGross()[21];
        gross[22] = employees.calcGross()[22];
        gross[23] = employees.calcGross()[23];
        gross[24] = employees.calcGross()[24];
        gross[25] = employees.calcGross()[25];
        gross[26] = employees.calcGross()[26];
        gross[27] = employees.calcGross()[27];
        gross[28] = employees.calcGross()[28];
        gross[29] = employees.calcGross()[29];
        gross[30] = employees.calcGross()[30];
        gross[31] = employees.calcGross()[31];
        gross[32] = employees.calcGross()[32];
        gross[33] = employees.calcGross()[33];
        gross[34] = employees.calcGross()[34];
        gross[35] = employees.calcGross()[35];
        gross[36] = employees.calcGross()[36];
        gross[37] = employees.calcGross()[37];
        gross[38] = employees.calcGross()[38];
        gross[39] = employees.calcGross()[39];
        gross[40] = employees.calcGross()[40];
        gross[41] = employees.calcGross()[41];
        gross[42] = employees.calcGross()[42];
        gross[43] = employees.calcGross()[43];
        gross[44] = employees.calcGross()[44];
        gross[45] = employees.calcGross()[45];
        gross[46] = employees.calcGross()[46];
        gross[47] = employees.calcGross()[47];
        gross[48] = employees.calcGross()[48];
        gross[49] = employees.calcGross()[49];
        gross[50] = employees.calcGross()[50];

        return gross;
    }

    /**public static void main(String[] args)
    {
        callFileManagerMethods();

        String str;
        str = readFile();
        System.out.println(str);
    }*/
}
