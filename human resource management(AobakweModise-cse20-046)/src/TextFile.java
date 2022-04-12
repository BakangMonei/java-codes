import javax.swing.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class TextFile {
    public static void main(String[] args) {
        Employee employee1 = new Employee("001", "Davince", "Modise", "10/03/2001", "M", "P_O_Box_123_Maitengwe", "Maitengwe", "CEO", "10/02/2020", "Management", 80, 500, 50, 0.30 * (80 * 500), 0.218 * (80 * 500), 0.14 * (80 * 500), ((80 * 500) + 0.30 * (80 * 500)) - (0.218 * (80 * 500) - 0.14 * (80 * 500)));
        Employee employee2 = new Employee("002", "Jozi", "Wesly", "19/05/2000", "M", "P_O_Box_817_Mochudi", "Mochudi", "HR", "12/09/2020", "Management", 80, 470, 42, 0.30 * (80 * 470), 0.218 * (80 * 470), 0.14 * (80 * 470), ((80 * 470) + 0.30 * (80 * 470)) - (0.218 * (80 * 470) - 0.14 * (80 * 470)));
        Employee employee3 = new Employee("003", "Monei", "Motshegwe", "13/02/1999", "M", "P_O_Box_253", "palapye", "marketing and finance manager", "11/03/2020", "management", 80, 450, 42, 0.30 * (80 * 450), 0.218 * (80 * 450), 0.14 * (80 * 450), ((80 * 4500) + 0.30 * (80 * 450)) - (0.218 * (80 * 450) - 0.14 * (80 * 450)));
        Employee employee4 = new Employee("004", "Lebogang", "Johnson", "03/05/2001", "M", "P_O_Box_945", "francistown", "finance manager", "12/10/2020", "management", 76, 600, 40, 0.30 * (76 * 600), 0.218 * (76 * 600), 0.14 * (76 * 600), ((76 * 600) + 0.30 * (76 * 600)) - (0.218 * (76 * 600) - 0.14 * (76 * 600)));
        Employee employee5 = new Employee("005", "Kamogelo", "Modisa", "12/07/1998", "F", "P_O_Box_149", "tonota", "marketing management", "24/10/2020", "management", 82, 500, 40, 0.30 * (82 * 500), 0.218 * (82 * 500), 0.14 * (82 * 500), ((82 * 500) + 0.30 * (82 * 500)) - (0.218 * (82 * 500) - 0.14 * (82 * 500)));
        Employee employee6 = new Employee("006", "Karabo", "Sebaga", "11/07/1999", "M", "P_O_Box_674", "lobatse", "ICT", "02/10/2020", "support", 80, 550, 40, 0.15 * (80 * 550), 0.218 * (80 * 550), 0.14 * (80 * 550), ((80 * 550) + 0.15 * (80 * 550)) - (0.218 * (80 * 550) - 0.14 * (80 * 550)));
        Employee employee7 = new Employee("007", "Thato", "Modisa", "15/07/1998", "F", "P_O_Box_452", "gaborone", "drivers", "12/11/2020", "support", 72, 500, 42, 0.15 * (72 * 500), 0.218 * (72 * 500), 0.14 * (72 * 500), ((72 * 500) + 0.15 * (72 * 500)) - (0.218 * (72 * 500) - 0.14 * (72 * 500)));
        Employee employee8 = new Employee("008", "Seo", "Rathipa", "12/08/1998", "M", "P_O_Box_888", "mahalapye", "drivers", "19/10/2020", "support", 82, 500, 40, 0.15 * (82 * 500), 0.218 * (82 * 500), 0.14 * (82 * 500), ((82 * 500) + 0.15 * (82 * 500)) - (0.218 * (82 * 500) - 0.14 * (82 * 500)));
        Employee employee9 = new Employee("009", "Atang", "Tapiwa", "10/05/1998", "F", "P_O_Box_355", "gaborone", "tour operator", "14/08/2020", "support", 80, 400, 40, 0.15 * (80 * 400), 0.218 * (80 * 400), 0.14 * (80 * 400), ((80 * 400) + 0.15 * (80 * 400)) - (0.218 * (80 * 400) - 0.14 * (80 * 400)));
        Employee employee10 = new Employee("010", "Wame", "Basebi", "12/08/1999", "F", "P_O_Box_311", "serowe", "tour operator", "24/10/2020", "support", 80, 500, 40, 0.15 * (80 * 500), 0.218 * (80 * 500), 0.14 * (80 * 500), ((80 * 500) + 0.15 * (80 * 500)) - (0.218 * (80 * 500) - 0.14 * (80 * 500)));
        Employee employee11 = new Employee("011", "Mami", "Baswa", "08/07/2000", "F", "P_O_Box_829", "ramotswa", "sales", "01/11/2020", "support", 78, 500, 40, 0.15 * (78 * 500), 0.218 * (78 * 500), 0.14 * (78 * 500), ((78 * 500) + 0.15 * (78 * 500)) - (0.218 * (78 * 500) - 0.14 * (78 * 500)));
        Employee employee12 = new Employee("012", "Thabiso", "Thipi", "02/08/1998", "M", "P_O_Box_045", "tonota", "sales", "24/11/2020", "support", 80, 500, 40, 0.15 * (80 * 500), 0.218 * (80 * 500), 0.14 * (80 * 500), ((80 * 500) + 0.15 * (80 * 500)) - (0.218 * (80 * 500) - 0.14 * (80 * 500)));
        Employee employee13 = new Employee("013", "Oratile", "Seima", "11/07/1999", "F", "P_O_Box_106", "otse", "sales", "20/10/2020", "support", 82, 500, 40, 0.15 * (82 * 500), 0.218 * (82 * 500), 0.14 * (82 * 500), ((82 * 500) + 0.15 * (82 * 500)) - (0.218 * (82 * 500) - 0.14 * (82 * 500)));
        Employee employee14 = new Employee("014", "Phatsimo", "Baswabi", "10/06/1998", "F", "P_O_Box_407", "tati", "sales", "21/10/2020", "support", 82, 400, 40, 0.15 * (82 * 400), 0.218 * (82 * 400), 0.14 * (82 * 400), ((82 * 400) + 0.15 * (82 * 400)) - (0.218 * (82 * 400) - 0.14 * (82 * 400)));
        Employee employee15 = new Employee("015", "Amantle", "Morwa", "12/07/1996", "F", "P_O_Box_363", "mochudi", "sales", "26/09/2020", "support", 80, 500, 40, 0.15 * (80 * 500), 0.218 * (80 * 500), 0.14 * (80 * 500), ((80 * 500) + 0.15 * (80 * 500)) - (0.218 * (80 * 500) - 0.14 * (80 * 500)));
        Employee employee16 = new Employee("016", "Lame", "Rancholo", "17/07/1999", "M", "P_O_Box_100", "palapye", "account officer", "24/10/2020", "account and HR officers department", 82, 500, 40, 0.15 * (82 * 500), 0.218 * (82 * 500), 0.14 * (82 * 500), ((82 * 500) + 0.15 * (82 * 500)) - (0.218 * (82 * 500) - 0.14 * (82 * 500)));
        Employee employee17 = new Employee("017", "Melissa", "Lele", "12/10/1998", "F", "P_O_Box_392", "gaborone", "account officer", "24/10/2020", "account and HR officers department", 82, 500, 40, 0.15 * (82 * 500), 0.218 * (82 * 500), 0.14 * (82 * 500), ((82 * 500) + 0.15 * (82 * 500)) - (0.218 * (82 * 500) - 0.14 * (82 * 500)));
        Employee employee18 = new Employee("018", "balulame", "Malanga", "13/01/1998", "M", "P_O_Box_303", "lobatse", "account officer", "24/10/2020", "account and HR officers department", 82, 500, 40, 0.15 * (82 * 500), 0.218 * (82 * 500), 0.14 * (82 * 500), ((82 * 500) + 0.15 * (82 * 500)) - (0.218 * (82 * 500) - 0.14 * (82 * 500)));
        Employee employee19 = new Employee("019", "Thabo", "Modirwa", "12/05/1991", "M", "P_O_Box_326", "gaborone", "account officer", "24/10/2020", "account and HR officers department", 82, 500, 40, 0.15 * (82 * 500), 0.218 * (82 * 500), 0.14 * (82 * 500), ((82 * 500) + 0.15 * (82 * 500)) - (0.218 * (82 * 500) - 0.14 * (82 * 500)));
        Employee employee20 = new Employee("020", "Zanele", "Keemo", "22/07/1999", "F", "P_O_Box_765", "molepolole", "account officer", "24/10/2020", "account and HR officers department", 82, 500, 40, 0.15 * (82 * 500), 0.218 * (82 * 500), 0.14 * (82 * 500), ((82 * 500) + 0.15 * (82 * 500)) - (0.218 * (82 * 500) - 0.14 * (82 * 500)));
        Employee employee21 = new Employee("21", "Keletso", "Seje", "12/09/1998", "M", "P_O_Box_378", "thamaga", "HR officer", "24/10/2020", "account and HR officers department", 82, 500, 40, 0.15 * (82 * 500), 0.218 * (82 * 500), 0.14 * (82 * 500), ((82 * 500) + 0.15 * (82 * 500)) - (0.218 * (82 * 500) - 0.14 * (82 * 500)));
        Employee employee22 = new Employee("022", "Aone", "Leano", "15/04/1994", "F", "P_O_Box_456", "tonota", "HR officer", "24/10/2020", "account and HR officers department", 82, 500, 40, 0.15 * (82 * 500), 0.218 * (82 * 500), 0.14 * (82 * 500), ((82 * 500) + 0.15 * (82 * 500)) - (0.218 * (82 * 500) - 0.14 * (82 * 500)));
        Employee employee23 = new Employee("023", "Lebogang", "Kago", "23/07/2000", "M", "P_O_Box_145", "francistown", "HR officer", "24/10/2020", "account and HR officers department", 82, 500, 40, 0.15 * (82 * 500), 0.218 * (82 * 500), 0.14 * (82 * 500), ((82 * 500) + 0.15 * (82 * 500)) - (0.218 * (82 * 500) - 0.14 * (82 * 500)));
        Employee employee24 = new Employee("024", "Palesa", "Kgamanyane", "24/08/1998", "F", "P_O_Box_163", "palapye", "HR officer", "24/10/2020", "account and HR officers department", 82, 500, 40, 0.15 * (82 * 500), 0.218 * (82 * 500), 0.14 * (82 * 500), ((82 * 500) + 0.15 * (82 * 500)) - (0.218 * (82 * 500) - 0.14 * (82 * 500)));
        Employee employee25 = new Employee("025", "Atlang", "Ronald", "12/07/1998", "F", "P_O_Box_362", "gaborone", "HR officer", "24/10/2020", "account and HR officers department", 82, 500, 40, 0.15 * (82 * 500), 0.218 * (82 * 500), 0.14 * (82 * 500), ((82 * 500) + 0.15 * (82 * 500)) - (0.218 * (82 * 500) - 0.14 * (82 * 500)));
        Employee employee26 = new Employee("026", "Keletso", "Lesedi", "11/07/1996", "F", "P_O_Box_784", "tonota", "marketing executive", "24/10/2020", "marketing executive", 82, 500, 40, 0, 0.218 * (82 * 500), 0.14 * (82 * 500), (82 * 500) - (0.218 * (82 * 500) - 0.14 * (82 * 500)));
        Employee employee27 = new Employee("027", "Babedi", "Basebi", "22/07/2000", "M", "P_O_Box_923", "tonota", "marketing executive", "24/10/2020", "marketing executive", 82, 500, 40, 0, 0.218 * (82 * 500), 0.14 * (82 * 500), (82 * 500) - (0.218 * (82 * 500) - 0.14 * (82 * 500)));
        Employee employee28 = new Employee("028", "Resego", "Sesigo", "12/05/1998", "F", "P_O_Box_633", "tonota", "marketing executive", "24/10/2020", "marketing executive", 82, 500, 40, 0, 0.218 * (82 * 500), 0.14 * (82 * 500), (82 * 500) - (0.218 * (82 * 500) - 0.14 * (82 * 500)));
        Employee employee29 = new Employee("029", "John", "Wick", "12/08/1998", "M", "P_O_Box_001", "tonota", "marketing executive", "24/10/2020", "marketing executive", 82, 500, 40, 0, 0.218 * (82 * 500), 0.14 * (82 * 500), (82 * 500) - (0.218 * (82 * 500) - 0.14 * (82 * 500)));
        Employee employee30 = new Employee("030", "Aron", "Amantle", "25/07/1998", "M", "P_O_Box_403", "tonota", "marketing executive", "24/10/2020", "marketing executive", 82, 500, 40, 0, 0.218 * (82 * 500), 0.14 * (82 * 500), (82 * 500) - (0.218 * (82 * 500) - 0.14 * (82 * 500)));
        Employee employee31 = new Employee("031", "Otsile", "Wantlha", "22/07/1998", "M", "P_O_Box_737", "tonota", "marketing executive", "24/10/2020", "marketing executive", 82, 500, 40, 0, 0.218 * (82 * 500), 0.14 * (82 * 500), (82 * 500) - (0.218 * (82 * 500) - 0.14 * (82 * 500)));
        Employee employee32 = new Employee("032", "Kemo", "Lentswe", "12/11/1998", "F", "P_O_Box_356", "tonota", "marketing executive", "24/10/2020", "marketing executive", 82, 500, 40, 0, 0.218 * (82 * 500), 0.14 * (82 * 500), (82 * 500) - (0.218 * (82 * 500) - 0.14 * (82 * 500)));
        Employee employee33 = new Employee("033", "Wame", "wesley", "12/07/1998", "F", "P_O_Box_364", "tonota", "marketing executive", "24/10/2020", "marketing executive", 82, 500, 40, 0, 0.218 * (82 * 500), 0.14 * (82 * 500), (82 * 500) - (0.218 * (82 * 500) - 0.14 * (82 * 500)));
        Employee employee34 = new Employee("034", "Moso", "Masedi", "29/07/1998", "M", "P_O_Box_933", "tonota", "marketing executive", "24/10/2020", "marketing executive", 82, 500, 40, 0, 0.218 * (82 * 500), 0.14 * (82 * 500), (82 * 500) - (0.218 * (82 * 500) - 0.14 * (82 * 500)));
        Employee employee35 = new Employee("035", "Ame", "Ramothibi", "12/07/2001", "F", "P_O_Box_369", "tonota", "marketing executive", "24/10/2020", "marketing executive", 82, 500, 40, 0, 0.218 * (82 * 500), 0.14 * (82 * 500), (82 * 500) - (0.218 * (82 * 500) - 0.14 * (82 * 500)));
        Employee employee36 = new Employee("036", "Rengu", "Mosele", "12/07/1995", "M", "P_O_Box_310", "tonota", "marketing executive", "24/10/2020", "marketing executive", 82, 500, 40, 0, 0.218 * (82 * 500), 0.14 * (82 * 500), (82 * 500) - (0.218 * (82 * 500) - 0.14 * (82 * 500)));
        Employee employee37 = new Employee("037", "Wangu", "Bantsi", "12/12/1999", "F", "P_O_Box_733", "tonota", "marketing executive", "24/10/2020", "marketing executive", 82, 500, 40, 0, 0.218 * (82 * 500), 0.14 * (82 * 500), (82 * 500) - (0.218 * (82 * 500) - 0.14 * (82 * 500)));
        Employee employee38 = new Employee("038", "Tumo", "Tebo", "01/07/2000", "F", "P_O_Box_303", "tonota", "marketing executive", "24/10/2020", "marketing executive", 82, 500, 40, 0, 0.218 * (82 * 500), 0.14 * (82 * 500), (82 * 500) - (0.218 * (82 * 500) - 0.14 * (82 * 500)));
        Employee employee39 = new Employee("039", "Poloko", "Leswe", "17/07/1998", "M", "P_O_Box_393", "tonota", "marketing executive", "24/10/2020", "marketing executive", 82, 500, 40, 0, 0.218 * (82 * 500), 0.14 * (82 * 500), (82 * 500) - (0.218 * (82 * 500) - 0.14 * (82 * 500)));
        Employee employee40 = new Employee("040", "Aone", "Settler", "12/03/1999", "F", "P_O_Box_743", "tonota", "marketing executive", "24/10/2020", "marketing executive", 82, 500, 40, 0, 0.218 * (82 * 500), 0.14 * (82 * 500), (82 * 500) - (0.218 * (82 * 500) - 0.14 * (82 * 500)));
        Employee employee41 = new Employee("041", "Tebogo", "Modirwa", "22/07/1993", "M", "P_O_Box_843", "tonota", "marketing executive", "24/10/2020", "marketing executive", 82, 500, 40, 0, 0.218 * (82 * 500), 0.14 * (82 * 500), (82 * 500) - (0.218 * (82 * 500) - 0.14 * (82 * 500)));
        Employee employee42 = new Employee("042", "Saone", "Moso", "05/09/1998", "F", "P_O_Box_783", "tonota", "marketing executive", "24/10/2020", "marketing executive", 82, 500, 40, 0, 0.218 * (82 * 500), 0.14 * (82 * 500), (82 * 500) - (0.218 * (82 * 500) - 0.14 * (82 * 500)));
        Employee employee43 = new Employee("043", "Fiona", "Mosa", "05/07/1998", "F", "P_O_Box_354", "tonota", "marketing executive", "24/10/2020", "marketing executive", 82, 500, 40, 0, 0.218 * (82 * 500), 0.14 * (82 * 500), (82 * 500) - (0.218 * (82 * 500) - 0.14 * (82 * 500)));
        Employee employee44 = new Employee("044", "Aobakwe", "Fanani", "12/10/1995", "M", "P_O_Box_323", "tonota", "marketing executive", "24/10/2020", "marketing executive", 82, 500, 40, 0, 0.218 * (82 * 500), 0.14 * (82 * 500), (82 * 500) - (0.218 * (82 * 500) - 0.14 * (82 * 500)));
        Employee employee45 = new Employee("045", "Fifi", "Fani", "12/08/1998", "F", "P_O_Box_133", "tonota", "marketing executive", "24/10/2020", "marketing executive", 82, 500, 40, 0, 0.218 * (82 * 500), 0.14 * (82 * 500), (82 * 500) - (0.218 * (82 * 500) - 0.14 * (82 * 500)));
        Employee employee46 = new Employee("046", "Yaone", "Nomani", "12/02/1998", "F", "P_O_Box_353", "tonota", "marketing executive", "24/10/2020", "marketing executive", 82, 500, 40, 0, 0.218 * (82 * 500), 0.14 * (82 * 500), (82 * 500) - (0.218 * (82 * 500) - 0.14 * (82 * 500)));
        Employee employee47 = new Employee("047", "Game", "Galaletsang", "11/07/1999", "M", "P_O_Box_334", "tonota", "marketing executive", "24/10/2020", "marketing executive", 82, 500, 40, 0, 0.218 * (82 * 500), 0.14 * (82 * 500), (82 * 500) - (0.218 * (82 * 500) - 0.14 * (82 * 500)));
        Employee employee48 = new Employee("048", "Gaone", "Kealeboga", "15/06/1998", "F", "P_O_Box_332", "tonota", "marketing executive", "24/10/2020", "marketing executive", 82, 500, 40, 0, 0.218 * (82 * 500), 0.14 * (82 * 500), (82 * 500) - (0.218 * (82 * 500) - 0.14 * (82 * 500)));
        Employee employee49 = new Employee("049", "Davince", "Moswa", "15/03/1998", "M", "P_O_Box_331", "tonota", "marketing executive", "24/10/2020", "marketing executive", 82, 500, 40, 0, 0.218 * (82 * 500), 0.14 * (82 * 500), (82 * 500) - (0.218 * (82 * 500) - 0.14 * (82 * 500)));
        Employee employee50 = new Employee("050", "Wabo", "Babedi", "09/09/1998", "F", "P_O_Box_333", "tonota", "marketing executive", "24/10/2020", "marketing executive", 82, 500, 40, 0, 0.218 * (82 * 500), 0.14 * (82 * 500), (82 * 500) - (0.218 * (82 * 500) - 0.14 * (82 * 500)));
        Employee[] Array = new Employee[50];
        Array[0] = employee1;
        Array[1] = employee2;
        Array[2] = employee3;
        Array[3] = employee4;
        Array[4] = employee5;
        Array[5] = employee6;
        Array[6] = employee7;
        Array[7] = employee8;
        Array[8] = employee9;
        Array[9] = employee10;
        Array[10] = employee11;
        Array[11] = employee12;
        Array[12] = employee13;
        Array[13] = employee14;
        Array[14] = employee15;
        Array[15] = employee16;
        Array[16] = employee17;
        Array[17] = employee18;
        Array[18] = employee19;
        Array[19] = employee20;
        Array[20] = employee21;
        Array[21] = employee22;
        Array[22] = employee23;
        Array[23] = employee24;
        Array[24] = employee25;
        Array[25] = employee26;
        Array[26] = employee27;
        Array[27] = employee28;
        Array[28] = employee29;
        Array[29] = employee30;
        Array[30] = employee31;
        Array[31] = employee32;
        Array[32] = employee33;
        Array[33] = employee34;
        Array[34] = employee35;
        Array[35] = employee36;
        Array[36] = employee37;
        Array[37] = employee38;
        Array[38] = employee39;
        Array[39] = employee40;
        Array[40] = employee41;
        Array[41] = employee42;
        Array[42] = employee43;
        Array[43] = employee44;
        Array[44] = employee45;
        Array[45] = employee46;
        Array[46] = employee47;
        Array[47] = employee48;
        Array[48] = employee49;
        Array[49] = employee50;
        for (
                int x = 0;
                x < Array.length; x++) {
            //Creating a file
            File file = new File("employee.txt");
            try {
                PrintWriter printWriter = new PrintWriter(file);
                printWriter.println(Array[0]);
                printWriter.println(Array[1]);
                printWriter.println(Array[2]);
                printWriter.println(Array[3]);
                printWriter.println(Array[4]);
                printWriter.println(Array[5]);
                printWriter.println(Array[6]);
                printWriter.println(Array[7]);
                printWriter.println(Array[8]);
                printWriter.println(Array[9]);
                printWriter.println(Array[10]);
                printWriter.println(Array[11]);
                printWriter.println(Array[12]);
                printWriter.println(Array[13]);
                printWriter.println(Array[14]);
                printWriter.println(Array[15]);
                printWriter.println(Array[16]);
                printWriter.println(Array[17]);
                printWriter.println(Array[18]);
                printWriter.println(Array[19]);
                printWriter.println(Array[20]);
                printWriter.println(Array[21]);
                printWriter.println(Array[22]);
                printWriter.println(Array[23]);
                printWriter.println(Array[24]);
                printWriter.println(Array[25]);
                printWriter.println(Array[26]);
                printWriter.println(Array[27]);
                printWriter.println(Array[28]);
                printWriter.println(Array[29]);
                printWriter.println(Array[30]);
                printWriter.println(Array[31]);
                printWriter.println(Array[32]);
                printWriter.println(Array[33]);
                printWriter.println(Array[34]);
                printWriter.println(Array[35]);
                printWriter.println(Array[36]);
                printWriter.println(Array[37]);
                printWriter.println(Array[38]);
                printWriter.println(Array[39]);
                printWriter.println(Array[40]);
                printWriter.println(Array[41]);
                printWriter.println(Array[42]);
                printWriter.println(Array[43]);
                printWriter.println(Array[44]);
                printWriter.println(Array[45]);
                printWriter.println(Array[46]);
                printWriter.println(Array[47]);
                printWriter.println(Array[48]);
                printWriter.println(Array[49]);
                printWriter.close();
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }
        }
        return;
    }


    public static void data()
    {
        TextManager txtMng = new TextManager();

    }

    //Table Header
    public String employeeIDTableHeader() {

        return null;
    }

    public String monthlySalaryHeader() {

        return null;
    }

}
