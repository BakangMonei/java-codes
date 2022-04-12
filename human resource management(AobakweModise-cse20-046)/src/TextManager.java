import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class TextManager
{
    public static String textReader()
    {
        String textFile = "";
        File file = new File("employee.txt");

        try {
            Scanner scanner = new Scanner(file);

            while(scanner.hasNextLine())
            {
                textFile += scanner.nextLine();
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        return textFile;
    }

    public static void textFileCreateWriter()
    {
        File textFile = new File("employee.txt");
        try {
            if(textFile.createNewFile())
            {
                FileWriter writer = new FileWriter("employee.txt");
                writer.write(textLines());
                writer.close();
            }
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
    }

    public static String[][] textFileContents()
    {
        EmployeeSetters employeesSetters = new EmployeeSetters();

        String[][] contentArray = new String[50][];

        contentArray[0] = employeesSetters.employee1();
        contentArray[1] = employeesSetters.employee12();
        contentArray[2] = employeesSetters.employee13();
        contentArray[3] = employeesSetters.employee14();
        contentArray[4] = employeesSetters.employee15();
        contentArray[5] = employeesSetters.employee16();
        contentArray[6] = employeesSetters.employee17();
        contentArray[7] = employeesSetters.employee18();
        contentArray[8] = employeesSetters.employee19();
        contentArray[9] = employeesSetters.employee10();
        contentArray[10] = employeesSetters.employee11();
        contentArray[11] = employeesSetters.employee12();
        contentArray[12] = employeesSetters.employee13();
        contentArray[13] = employeesSetters.employee14();
        contentArray[14] = employeesSetters.employee15();
        contentArray[15] = employeesSetters.employee16();
        contentArray[16] = employeesSetters.employee17();
        contentArray[17] = employeesSetters.employee18();
        contentArray[18] = employeesSetters.employee19();
        contentArray[19] = employeesSetters.employee20();
        contentArray[20] = employeesSetters.employee21();
        contentArray[21] = employeesSetters.employee22();
        contentArray[22] = employeesSetters.employee23();
        contentArray[23] = employeesSetters.employee24();
        contentArray[24] = employeesSetters.employee25();
        contentArray[25] = employeesSetters.employee26();
        contentArray[26] = employeesSetters.employee27();
        contentArray[27] = employeesSetters.employee28();
        contentArray[28] = employeesSetters.employee29();
        contentArray[29] = employeesSetters.employee30();
        contentArray[30] = employeesSetters.employee31();
        contentArray[31] = employeesSetters.employee32();
        contentArray[32] = employeesSetters.employee33();
        contentArray[33] = employeesSetters.employee34();
        contentArray[34] = employeesSetters.employee35();
        contentArray[35] = employeesSetters.employee36();
        contentArray[36] = employeesSetters.employee37();
        contentArray[37] = employeesSetters.employee38();
        contentArray[38] = employeesSetters.employee39();
        contentArray[39] = employeesSetters.employee40();
        contentArray[40] = employeesSetters.employee41();
        contentArray[41] = employeesSetters.employee42();
        contentArray[42] = employeesSetters.employee43();
        contentArray[43] = employeesSetters.employee44();
        contentArray[44] = employeesSetters.employee45();
        contentArray[45] = employeesSetters.employee46();
        contentArray[46] = employeesSetters.employee47();
        contentArray[47] = employeesSetters.employee48();
        contentArray[48] = employeesSetters.employee49();
        contentArray[49] = employeesSetters.employee50();

        return contentArray;
    }

    public static String textLines()
    {
        String[] textLineData = new String[50];
        String[][] allTextData = textFileContents();
        String content = "";

        for (int i = 0; i < 50; i++)
        {
            textLineData[i] = "";
            textLineData[i] = allTextData[i][0] + allTextData[i][1] + allTextData[i][2] +
                    allTextData[i][3] + allTextData[i][4] + allTextData[i][5] + allTextData[i][6] +
                    allTextData[i][7] + allTextData[i][8] + allTextData[i][9] + allTextData[i][10] +
                    allTextData[i][11] + allTextData[i][12] + allTextData[i][13] + allTextData[i][14] +
                    allTextData[i][15] +  ";" + "\n";
            content += textLineData[i];
        }

        return content;
    }

    public static String[] wordArray()
    {
        String[] wordArray;
        String rawText = textReader().replaceAll(" ", ";");

        wordArray = rawText.split(";");

        return wordArray;
    }

    public static String[] employeeTableHeader()
    {
        String[] header = {"ID", "Name", "Surname", "Date Of Birth", "Gender", "Address", "Title Of Employment", "Date Hired",
            "Department", "Hours Worked", "Rate Of Pay", "Leave Days", "Car Allowance", "Monthly Gratuity", "Tax Rate",
                "Monthly Salary", "Location"};

        return header;
    }
    public static String[][] employeeTableColumns()
    {
        int count = 0;
        String[][] data = {
                {wordArray()[count++], wordArray()[count++], wordArray()[count++], wordArray()[count++], wordArray()[count++], wordArray()[count++], wordArray()[count++], wordArray()[count++], wordArray()[count++], wordArray()[count++], wordArray()[count++], wordArray()[count++], wordArray()[count++], wordArray()[count++], wordArray()[count++], wordArray()[count++], wordArray()[count++]},
                {wordArray()[count++], wordArray()[count++], wordArray()[count++], wordArray()[count++], wordArray()[count++], wordArray()[count++], wordArray()[count++], wordArray()[count++], wordArray()[count++], wordArray()[count++], wordArray()[count++], wordArray()[count++], wordArray()[count++], wordArray()[count++], wordArray()[count++], wordArray()[count++], wordArray()[count++]},
                {wordArray()[count++], wordArray()[count++], wordArray()[count++], wordArray()[count++], wordArray()[count++], wordArray()[count++], wordArray()[count++], wordArray()[count++], wordArray()[count++], wordArray()[count++], wordArray()[count++], wordArray()[count++], wordArray()[count++], wordArray()[count++], wordArray()[count++], wordArray()[count++], wordArray()[count++]},
                {wordArray()[count++], wordArray()[count++], wordArray()[count++], wordArray()[count++], wordArray()[count++], wordArray()[count++], wordArray()[count++], wordArray()[count++], wordArray()[count++], wordArray()[count++], wordArray()[count++], wordArray()[count++], wordArray()[count++], wordArray()[count++], wordArray()[count++], wordArray()[count++], wordArray()[count++]},
                {wordArray()[count++], wordArray()[count++], wordArray()[count++], wordArray()[count++], wordArray()[count++], wordArray()[count++], wordArray()[count++], wordArray()[count++], wordArray()[count++], wordArray()[count++], wordArray()[count++], wordArray()[count++], wordArray()[count++], wordArray()[count++], wordArray()[count++], wordArray()[count++], wordArray()[count++]},
                {wordArray()[count++], wordArray()[count++], wordArray()[count++], wordArray()[count++], wordArray()[count++], wordArray()[count++], wordArray()[count++], wordArray()[count++], wordArray()[count++], wordArray()[count++], wordArray()[count++], wordArray()[count++], wordArray()[count++], wordArray()[count++], wordArray()[count++], wordArray()[count++], wordArray()[count++]},
                {wordArray()[count++], wordArray()[count++], wordArray()[count++], wordArray()[count++], wordArray()[count++], wordArray()[count++], wordArray()[count++], wordArray()[count++], wordArray()[count++], wordArray()[count++], wordArray()[count++], wordArray()[count++], wordArray()[count++], wordArray()[count++], wordArray()[count++], wordArray()[count++], wordArray()[count++]},
                {wordArray()[count++], wordArray()[count++], wordArray()[count++], wordArray()[count++], wordArray()[count++], wordArray()[count++], wordArray()[count++], wordArray()[count++], wordArray()[count++], wordArray()[count++], wordArray()[count++], wordArray()[count++], wordArray()[count++], wordArray()[count++], wordArray()[count++], wordArray()[count++], wordArray()[count++]},
                {wordArray()[count++], wordArray()[count++], wordArray()[count++], wordArray()[count++], wordArray()[count++], wordArray()[count++], wordArray()[count++], wordArray()[count++], wordArray()[count++], wordArray()[count++], wordArray()[count++], wordArray()[count++], wordArray()[count++], wordArray()[count++], wordArray()[count++], wordArray()[count++], wordArray()[count++]},
                {wordArray()[count++], wordArray()[count++], wordArray()[count++], wordArray()[count++], wordArray()[count++], wordArray()[count++], wordArray()[count++], wordArray()[count++], wordArray()[count++], wordArray()[count++], wordArray()[count++], wordArray()[count++], wordArray()[count++], wordArray()[count++], wordArray()[count++], wordArray()[count++], wordArray()[count++]},
                {wordArray()[count++], wordArray()[count++], wordArray()[count++], wordArray()[count++], wordArray()[count++], wordArray()[count++], wordArray()[count++], wordArray()[count++], wordArray()[count++], wordArray()[count++], wordArray()[count++], wordArray()[count++], wordArray()[count++], wordArray()[count++], wordArray()[count++], wordArray()[count++], wordArray()[count++]},
                {wordArray()[count++], wordArray()[count++], wordArray()[count++], wordArray()[count++], wordArray()[count++], wordArray()[count++], wordArray()[count++], wordArray()[count++], wordArray()[count++], wordArray()[count++], wordArray()[count++], wordArray()[count++], wordArray()[count++], wordArray()[count++], wordArray()[count++], wordArray()[count++], wordArray()[count++]},
                {wordArray()[count++], wordArray()[count++], wordArray()[count++], wordArray()[count++], wordArray()[count++], wordArray()[count++], wordArray()[count++], wordArray()[count++], wordArray()[count++], wordArray()[count++], wordArray()[count++], wordArray()[count++], wordArray()[count++], wordArray()[count++], wordArray()[count++], wordArray()[count++], wordArray()[count++]},
                {wordArray()[count++], wordArray()[count++], wordArray()[count++], wordArray()[count++], wordArray()[count++], wordArray()[count++], wordArray()[count++], wordArray()[count++], wordArray()[count++], wordArray()[count++], wordArray()[count++], wordArray()[count++], wordArray()[count++], wordArray()[count++], wordArray()[count++], wordArray()[count++], wordArray()[count++]},
                {wordArray()[count++], wordArray()[count++], wordArray()[count++], wordArray()[count++], wordArray()[count++], wordArray()[count++], wordArray()[count++], wordArray()[count++], wordArray()[count++], wordArray()[count++], wordArray()[count++], wordArray()[count++], wordArray()[count++], wordArray()[count++], wordArray()[count++], wordArray()[count++], wordArray()[count++]},
                {wordArray()[count++], wordArray()[count++], wordArray()[count++], wordArray()[count++], wordArray()[count++], wordArray()[count++], wordArray()[count++], wordArray()[count++], wordArray()[count++], wordArray()[count++], wordArray()[count++], wordArray()[count++], wordArray()[count++], wordArray()[count++], wordArray()[count++], wordArray()[count++], wordArray()[count++]},
                {wordArray()[count++], wordArray()[count++], wordArray()[count++], wordArray()[count++], wordArray()[count++], wordArray()[count++], wordArray()[count++], wordArray()[count++], wordArray()[count++], wordArray()[count++], wordArray()[count++], wordArray()[count++], wordArray()[count++], wordArray()[count++], wordArray()[count++], wordArray()[count++], wordArray()[count++]},
                {wordArray()[count++], wordArray()[count++], wordArray()[count++], wordArray()[count++], wordArray()[count++], wordArray()[count++], wordArray()[count++], wordArray()[count++], wordArray()[count++], wordArray()[count++], wordArray()[count++], wordArray()[count++], wordArray()[count++], wordArray()[count++], wordArray()[count++], wordArray()[count++], wordArray()[count++]},
                {wordArray()[count++], wordArray()[count++], wordArray()[count++], wordArray()[count++], wordArray()[count++], wordArray()[count++], wordArray()[count++], wordArray()[count++], wordArray()[count++], wordArray()[count++], wordArray()[count++], wordArray()[count++], wordArray()[count++], wordArray()[count++], wordArray()[count++], wordArray()[count++], wordArray()[count++]},
                {wordArray()[count++], wordArray()[count++], wordArray()[count++], wordArray()[count++], wordArray()[count++], wordArray()[count++], wordArray()[count++], wordArray()[count++], wordArray()[count++], wordArray()[count++], wordArray()[count++], wordArray()[count++], wordArray()[count++], wordArray()[count++], wordArray()[count++], wordArray()[count++], wordArray()[count++]},
                {wordArray()[count++], wordArray()[count++], wordArray()[count++], wordArray()[count++], wordArray()[count++], wordArray()[count++], wordArray()[count++], wordArray()[count++], wordArray()[count++], wordArray()[count++], wordArray()[count++], wordArray()[count++], wordArray()[count++], wordArray()[count++], wordArray()[count++], wordArray()[count++], wordArray()[count++]},
                {wordArray()[count++], wordArray()[count++], wordArray()[count++], wordArray()[count++], wordArray()[count++], wordArray()[count++], wordArray()[count++], wordArray()[count++], wordArray()[count++], wordArray()[count++], wordArray()[count++], wordArray()[count++], wordArray()[count++], wordArray()[count++], wordArray()[count++], wordArray()[count++], wordArray()[count++]},
                {wordArray()[count++], wordArray()[count++], wordArray()[count++], wordArray()[count++], wordArray()[count++], wordArray()[count++], wordArray()[count++], wordArray()[count++], wordArray()[count++], wordArray()[count++], wordArray()[count++], wordArray()[count++], wordArray()[count++], wordArray()[count++], wordArray()[count++], wordArray()[count++], wordArray()[count++]},
                {wordArray()[count++], wordArray()[count++], wordArray()[count++], wordArray()[count++], wordArray()[count++], wordArray()[count++], wordArray()[count++], wordArray()[count++], wordArray()[count++], wordArray()[count++], wordArray()[count++], wordArray()[count++], wordArray()[count++], wordArray()[count++], wordArray()[count++], wordArray()[count++], wordArray()[count++]},
                {wordArray()[count++], wordArray()[count++], wordArray()[count++], wordArray()[count++], wordArray()[count++], wordArray()[count++], wordArray()[count++], wordArray()[count++], wordArray()[count++], wordArray()[count++], wordArray()[count++], wordArray()[count++], wordArray()[count++], wordArray()[count++], wordArray()[count++], wordArray()[count++], wordArray()[count++]},
                {wordArray()[count++], wordArray()[count++], wordArray()[count++], wordArray()[count++], wordArray()[count++], wordArray()[count++], wordArray()[count++], wordArray()[count++], wordArray()[count++], wordArray()[count++], wordArray()[count++], wordArray()[count++], wordArray()[count++], wordArray()[count++], wordArray()[count++], wordArray()[count++], wordArray()[count++]},
                {wordArray()[count++], wordArray()[count++], wordArray()[count++], wordArray()[count++], wordArray()[count++], wordArray()[count++], wordArray()[count++], wordArray()[count++], wordArray()[count++], wordArray()[count++], wordArray()[count++], wordArray()[count++], wordArray()[count++], wordArray()[count++], wordArray()[count++], wordArray()[count++], wordArray()[count++]},
                {wordArray()[count++], wordArray()[count++], wordArray()[count++], wordArray()[count++], wordArray()[count++], wordArray()[count++], wordArray()[count++], wordArray()[count++], wordArray()[count++], wordArray()[count++], wordArray()[count++], wordArray()[count++], wordArray()[count++], wordArray()[count++], wordArray()[count++], wordArray()[count++], wordArray()[count++]},
                {wordArray()[count++], wordArray()[count++], wordArray()[count++], wordArray()[count++], wordArray()[count++], wordArray()[count++], wordArray()[count++], wordArray()[count++], wordArray()[count++], wordArray()[count++], wordArray()[count++], wordArray()[count++], wordArray()[count++], wordArray()[count++], wordArray()[count++], wordArray()[count++], wordArray()[count++]},
                {wordArray()[count++], wordArray()[count++], wordArray()[count++], wordArray()[count++], wordArray()[count++], wordArray()[count++], wordArray()[count++], wordArray()[count++], wordArray()[count++], wordArray()[count++], wordArray()[count++], wordArray()[count++], wordArray()[count++], wordArray()[count++], wordArray()[count++], wordArray()[count++], wordArray()[count++]},
                {wordArray()[count++], wordArray()[count++], wordArray()[count++], wordArray()[count++], wordArray()[count++], wordArray()[count++], wordArray()[count++], wordArray()[count++], wordArray()[count++], wordArray()[count++], wordArray()[count++], wordArray()[count++], wordArray()[count++], wordArray()[count++], wordArray()[count++], wordArray()[count++], wordArray()[count++]},
                {wordArray()[count++], wordArray()[count++], wordArray()[count++], wordArray()[count++], wordArray()[count++], wordArray()[count++], wordArray()[count++], wordArray()[count++], wordArray()[count++], wordArray()[count++], wordArray()[count++], wordArray()[count++], wordArray()[count++], wordArray()[count++], wordArray()[count++], wordArray()[count++], wordArray()[count++]},
                {wordArray()[count++], wordArray()[count++], wordArray()[count++], wordArray()[count++], wordArray()[count++], wordArray()[count++], wordArray()[count++], wordArray()[count++], wordArray()[count++], wordArray()[count++], wordArray()[count++], wordArray()[count++], wordArray()[count++], wordArray()[count++], wordArray()[count++], wordArray()[count++], wordArray()[count++]},
                {wordArray()[count++], wordArray()[count++], wordArray()[count++], wordArray()[count++], wordArray()[count++], wordArray()[count++], wordArray()[count++], wordArray()[count++], wordArray()[count++], wordArray()[count++], wordArray()[count++], wordArray()[count++], wordArray()[count++], wordArray()[count++], wordArray()[count++], wordArray()[count++], wordArray()[count++]},
                {wordArray()[count++], wordArray()[count++], wordArray()[count++], wordArray()[count++], wordArray()[count++], wordArray()[count++], wordArray()[count++], wordArray()[count++], wordArray()[count++], wordArray()[count++], wordArray()[count++], wordArray()[count++], wordArray()[count++], wordArray()[count++], wordArray()[count++], wordArray()[count++], wordArray()[count++]},
                {wordArray()[count++], wordArray()[count++], wordArray()[count++], wordArray()[count++], wordArray()[count++], wordArray()[count++], wordArray()[count++], wordArray()[count++], wordArray()[count++], wordArray()[count++], wordArray()[count++], wordArray()[count++], wordArray()[count++], wordArray()[count++], wordArray()[count++], wordArray()[count++], wordArray()[count++]},
                {wordArray()[count++], wordArray()[count++], wordArray()[count++], wordArray()[count++], wordArray()[count++], wordArray()[count++], wordArray()[count++], wordArray()[count++], wordArray()[count++], wordArray()[count++], wordArray()[count++], wordArray()[count++], wordArray()[count++], wordArray()[count++], wordArray()[count++], wordArray()[count++], wordArray()[count++]},
                {wordArray()[count++], wordArray()[count++], wordArray()[count++], wordArray()[count++], wordArray()[count++], wordArray()[count++], wordArray()[count++], wordArray()[count++], wordArray()[count++], wordArray()[count++], wordArray()[count++], wordArray()[count++], wordArray()[count++], wordArray()[count++], wordArray()[count++], wordArray()[count++], wordArray()[count++]},
                {wordArray()[count++], wordArray()[count++], wordArray()[count++], wordArray()[count++], wordArray()[count++], wordArray()[count++], wordArray()[count++], wordArray()[count++], wordArray()[count++], wordArray()[count++], wordArray()[count++], wordArray()[count++], wordArray()[count++], wordArray()[count++], wordArray()[count++], wordArray()[count++], wordArray()[count++]},
                {wordArray()[count++], wordArray()[count++], wordArray()[count++], wordArray()[count++], wordArray()[count++], wordArray()[count++], wordArray()[count++], wordArray()[count++], wordArray()[count++], wordArray()[count++], wordArray()[count++], wordArray()[count++], wordArray()[count++], wordArray()[count++], wordArray()[count++], wordArray()[count++], wordArray()[count++]},
                {wordArray()[count++], wordArray()[count++], wordArray()[count++], wordArray()[count++], wordArray()[count++], wordArray()[count++], wordArray()[count++], wordArray()[count++], wordArray()[count++], wordArray()[count++], wordArray()[count++], wordArray()[count++], wordArray()[count++], wordArray()[count++], wordArray()[count++], wordArray()[count++], wordArray()[count++]},
                {wordArray()[count++], wordArray()[count++], wordArray()[count++], wordArray()[count++], wordArray()[count++], wordArray()[count++], wordArray()[count++], wordArray()[count++], wordArray()[count++], wordArray()[count++], wordArray()[count++], wordArray()[count++], wordArray()[count++], wordArray()[count++], wordArray()[count++], wordArray()[count++], wordArray()[count++]},
                {wordArray()[count++], wordArray()[count++], wordArray()[count++], wordArray()[count++], wordArray()[count++], wordArray()[count++], wordArray()[count++], wordArray()[count++], wordArray()[count++], wordArray()[count++], wordArray()[count++], wordArray()[count++], wordArray()[count++], wordArray()[count++], wordArray()[count++], wordArray()[count++], wordArray()[count++]},
        };

        return data;
    }
    public static String[] salaryTableHeader()
    {
        String[] header = {"ID", "Name", "Surname", "Monthly Salary"};

        return header;
    }
    public static String[][] salaryTableColumns()
    {
        int idArr = 0;
        int nameArr = 1;
        int surnameArr = 2;
        int salaryArr = 15;

        String[][] data = {
                {wordArray()[idArr++], wordArray()[nameArr], wordArray()[surnameArr], wordArray()[salaryArr]},
                {wordArray()[idArr++], wordArray()[nameArr+=17], wordArray()[surnameArr], wordArray()[salaryArr]},
                {wordArray()[idArr++], wordArray()[nameArr], wordArray()[surnameArr], wordArray()[salaryArr]},
                {wordArray()[idArr++], wordArray()[nameArr], wordArray()[surnameArr], wordArray()[salaryArr]},
                {wordArray()[idArr++], wordArray()[nameArr], wordArray()[surnameArr], wordArray()[salaryArr]},
                {wordArray()[idArr++], wordArray()[nameArr], wordArray()[surnameArr], wordArray()[salaryArr]},
                {wordArray()[idArr++], wordArray()[nameArr], wordArray()[surnameArr], wordArray()[salaryArr]},
                {wordArray()[idArr++], wordArray()[nameArr], wordArray()[surnameArr], wordArray()[salaryArr]},
                {wordArray()[idArr++], wordArray()[nameArr], wordArray()[surnameArr], wordArray()[salaryArr]},
                {wordArray()[idArr++], wordArray()[nameArr], wordArray()[surnameArr], wordArray()[salaryArr]},

        };

        return data;
    }
    public static String[] grossTableHeader()
    {
        String[] header = {"ID", "Name", "Surname", "Gross"};

        return header;
    }
    public static String[][] grossTableColumns()
    {
        int idArr = 0;
        int nameArr = 1;
        int surnameArr = 2;
        int salaryArr = 15;

        String[][] data = {
                {wordArray()[idArr++], wordArray()[nameArr], wordArray()[surnameArr], wordArray()[salaryArr]},

        };

        return data;
    }
    public static String[] femaleTableHeader()
    {
        String[] header = {"ID", "Name", "Surname", "Gender"};

        return header;
    }
    public static String[][] femaleTableColumns()
    {
        int idArr = 0;
        int nameArr = 1;
        int surnameArr = 2;
        int salaryArr = 15;

        String[][] data = {
                {wordArray()[idArr++], wordArray()[nameArr], wordArray()[surnameArr], wordArray()[salaryArr]},

        };

        return data;
    }
    public static String[] locationTableHeader()
    {
        String[] header = {"ID", "Name", "Surname", "Location"};

        return header;
    }
    public static String[][] locationTableColumns()
    {
        int idArr = 0;
        int nameArr = 1;
        int surnameArr = 2;
        int salaryArr = 15;

        String[][] data = {
                {wordArray()[idArr++], wordArray()[nameArr], wordArray()[surnameArr], wordArray()[salaryArr]},

        };

        return data;
    }
    public static void allMethods()
    {
        EmployeeSetters employeeSetters = new EmployeeSetters();
        employeeSetters.employeeMethods();

        textFileContents();
        textFileCreateWriter();
        textLines();
    }
}
