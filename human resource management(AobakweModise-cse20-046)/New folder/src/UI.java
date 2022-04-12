import javax.swing.*;
import javax.swing.border.LineBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class UI extends JFrame
{
    static int switchAdd;

    JFrame frame = new JFrame();

    JPanel mainPanel = new JPanel(new BorderLayout());

    JPanel headerPanel = new JPanel();
    JPanel buttonPanel = new JPanel();
    JPanel contentPanel = new JPanel();

    JPanel searchContent = new JPanel();
    JPanel employeeContent = new JPanel();
    JPanel salaryContent = new JPanel();
    JPanel grossContent = new JPanel();
    JPanel femaleWorkersContent = new JPanel();
    JPanel censusContent = new JPanel();

    JTable employeeTable;
    JTable salaryTable;
    JTable grossTable;
    JTable femaleWorkersTable;
    JTable censusTable;

    JScrollPane empTableScrollPane;
    JScrollPane salTableScrollPane;
    JScrollPane grossTableScrollPane;
    JScrollPane femTableScrollPane;
    JScrollPane censusTableScrollPane;

    JButton searchBttn = new JButton("Search");
    JButton employeeBttn = new JButton("Employees");
    JButton salaryBttn = new JButton("Salaries");
    JButton grossBttn = new JButton("Gross");
    JButton femaleEmpBttn = new JButton("Female Employees");
    JButton censusBttn = new JButton("Census");

    JLabel banner = new JLabel("Employee Management System");

    //SEARCH
    JLabel searchID = new JLabel("Enter Employee ID (e.g EMP001)");
    JTextField searchInputArea = new JTextField(10);
    JButton searchEmployee = new JButton("Search");
    static String getSearchText = "";
    static String searchText = "";
    static boolean invalidIDSearch;

    static JTextField iDTxt = new JTextField(10);
    static JTextField nameTxt = new JTextField(10);
    static JTextField surnameTxt = new JTextField(10);
    static JTextField dobTxt = new JTextField(10);
    static JTextField genderTxt = new JTextField(10);
    static JTextField addressTxt = new JTextField(10);
    static JTextField jobTxt = new JTextField(10);
    static JTextField hoursTxt = new JTextField(10);
    static JTextField departmentTxt = new JTextField(10);
    static JTextField rateOfPayTxt = new JTextField(10);
    static JTextField carTxt = new JTextField(10);
    static JTextField gratuityTxt = new JTextField(10);
    static JTextField taxTxt = new JTextField(10);

    UI.ButtonListener buttonListener = new UI.ButtonListener();

    public UI()
    {
        DataManager dataManager = new DataManager();
        DataManager.callFileManagerMethods();

        frame.setTitle("Employee Management System - Home");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //Frame dimensions
        int WINDOW_WIDTH = 1280;
        int WINDOW_HEIGHT = 720;
        //Centre Panel dimensions
        int CENTREPANEL_WIDTH = WINDOW_WIDTH - 233;
        int CENTREPANEL_HEIGHT = WINDOW_HEIGHT - 145;
        frame.setSize(WINDOW_WIDTH, WINDOW_HEIGHT);
        frame.setResizable(false);

        frame.add(mainPanel);
        mainPanel.setBorder(new LineBorder(Color.decode("#1A1D23"), 10));

        //Adding panels to main panel
        mainPanel.add(headerPanel, BorderLayout.NORTH);
        mainPanel.add(buttonPanel, BorderLayout.WEST);
        mainPanel.add(contentPanel, BorderLayout.CENTER);

        //Header
        headerPanel.setBackground(Color.decode("#1A1D23"));

        headerPanel.add(banner);
        banner.setPreferredSize(new Dimension(538,34));
        banner.setBackground(Color.decode("#1A1D23"));
        banner.setForeground(Color.WHITE);
        Font titleFont = new Font("Verdana", Font.BOLD, 24);
        banner.setFont(titleFont);

        //Buttons
        buttonPanel.setBackground(Color.decode("#1A1D23"));
        int BUTTON_WIDTH = 150;
        int BUTTON_HEIGHT = 35;
        buttonPanel.setPreferredSize(new Dimension(BUTTON_WIDTH, BUTTON_HEIGHT));

        buttonPanel.add(searchBttn);
        buttonPanel.add(employeeBttn);
        buttonPanel.add(salaryBttn);
        buttonPanel.add(grossBttn);
        buttonPanel.add(femaleEmpBttn);
        buttonPanel.add(censusBttn);

        searchBttn.setPreferredSize(new Dimension(BUTTON_WIDTH, BUTTON_HEIGHT));
        employeeBttn.setPreferredSize(new Dimension(BUTTON_WIDTH, BUTTON_HEIGHT));
        salaryBttn.setPreferredSize(new Dimension(BUTTON_WIDTH, BUTTON_HEIGHT));
        grossBttn.setPreferredSize(new Dimension(BUTTON_WIDTH, BUTTON_HEIGHT));
        femaleEmpBttn.setPreferredSize(new Dimension(BUTTON_WIDTH, BUTTON_HEIGHT));
        censusBttn.setPreferredSize(new Dimension(BUTTON_WIDTH, BUTTON_HEIGHT));

        searchBttn.addActionListener(buttonListener);
        employeeBttn.addActionListener(buttonListener);
        salaryBttn.addActionListener(buttonListener);
        grossBttn.addActionListener(buttonListener);
        femaleEmpBttn.addActionListener(buttonListener);
        censusBttn.addActionListener(buttonListener);
        searchEmployee.addActionListener(buttonListener);

        //Content At Start Of App
        contentPanel.setBackground(Color.decode("#1A1D23"));
        contentPanel.setBorder(new LineBorder(Color.decode("#1A1D23"), 10));
        contentPanel.add(searchContent, BorderLayout.CENTER);
        contentPanel.setBackground(Color.WHITE);
        contentPanel.setPreferredSize(new Dimension(CENTREPANEL_WIDTH, CENTREPANEL_HEIGHT));

        //SEARCH
        SpringLayout layoutSpring = new SpringLayout();
        JPanel layoutPanel = new JPanel(layoutSpring);
        layoutPanel.setPreferredSize(new Dimension(CENTREPANEL_WIDTH, CENTREPANEL_HEIGHT));

        //Top Bar
        layoutPanel.add(searchID);
        layoutPanel.add(searchInputArea);
        layoutPanel.add(searchEmployee);

        layoutSpring.putConstraint(SpringLayout.NORTH, searchID,0,SpringLayout.NORTH, layoutPanel);
        layoutSpring.putConstraint(SpringLayout.WEST, searchID,320,SpringLayout.WEST, layoutPanel);
        layoutSpring.putConstraint(SpringLayout.NORTH, searchInputArea,0,SpringLayout.NORTH, layoutPanel);
        layoutSpring.putConstraint(SpringLayout.WEST, searchInputArea,510,SpringLayout.WEST, layoutPanel);
        layoutSpring.putConstraint(SpringLayout.NORTH, searchEmployee,0,SpringLayout.NORTH, layoutPanel);
        layoutSpring.putConstraint(SpringLayout.WEST, searchEmployee,630,SpringLayout.WEST, layoutPanel);

        //Content
        JLabel empID = new JLabel("Employee ID");
        JLabel empName = new JLabel("First Name");
        JLabel empSurname = new JLabel("Last Name");
        JLabel empDOB = new JLabel("Date Of Birth");
        JLabel empGender = new JLabel("Gender");
        JLabel empAddress = new JLabel("Address");
        JLabel empJob = new JLabel("Job Title");
        JLabel empHours = new JLabel("Hours Worked");
        JLabel empDep = new JLabel("Department");
        JLabel empROP = new JLabel("Rate Of Pay");
        JLabel empCarAll = new JLabel("Car Allowance");
        JLabel empGrat = new JLabel("Monthly Gratuity");
        JLabel empTax = new JLabel("Tax rate");

        layoutPanel.add(empID);
        layoutSpring.putConstraint(SpringLayout.NORTH, empID,50,SpringLayout.NORTH, layoutPanel);
        layoutSpring.putConstraint(SpringLayout.WEST, empID,50,SpringLayout.WEST, layoutPanel);
        layoutPanel.add(iDTxt);
        layoutSpring.putConstraint(SpringLayout.NORTH, iDTxt,50,SpringLayout.NORTH, layoutPanel);
        layoutSpring.putConstraint(SpringLayout.WEST, iDTxt,150,SpringLayout.WEST, layoutPanel);

        layoutPanel.add(empName);
        layoutSpring.putConstraint(SpringLayout.NORTH, empName,100,SpringLayout.NORTH, layoutPanel);
        layoutSpring.putConstraint(SpringLayout.WEST, empName,50,SpringLayout.WEST, layoutPanel);
        layoutPanel.add(nameTxt);
        layoutSpring.putConstraint(SpringLayout.NORTH, nameTxt,100,SpringLayout.NORTH, layoutPanel);
        layoutSpring.putConstraint(SpringLayout.WEST, nameTxt,150,SpringLayout.WEST, layoutPanel);

        layoutPanel.add(empSurname);
        layoutSpring.putConstraint(SpringLayout.NORTH, empSurname,150,SpringLayout.NORTH, layoutPanel);
        layoutSpring.putConstraint(SpringLayout.WEST, empSurname,50,SpringLayout.WEST, layoutPanel);
        layoutPanel.add(surnameTxt);
        layoutSpring.putConstraint(SpringLayout.NORTH, surnameTxt,150,SpringLayout.NORTH, layoutPanel);
        layoutSpring.putConstraint(SpringLayout.WEST, surnameTxt,150,SpringLayout.WEST, layoutPanel);

        layoutPanel.add(empDOB);
        layoutSpring.putConstraint(SpringLayout.NORTH, empDOB,200,SpringLayout.NORTH, layoutPanel);
        layoutSpring.putConstraint(SpringLayout.WEST, empDOB,50,SpringLayout.WEST, layoutPanel);
        layoutPanel.add(dobTxt);
        layoutSpring.putConstraint(SpringLayout.NORTH, dobTxt,200,SpringLayout.NORTH, layoutPanel);
        layoutSpring.putConstraint(SpringLayout.WEST, dobTxt,150,SpringLayout.WEST, layoutPanel);

        layoutPanel.add(empGender);
        layoutSpring.putConstraint(SpringLayout.NORTH, empGender,250,SpringLayout.NORTH, layoutPanel);
        layoutSpring.putConstraint(SpringLayout.WEST, empGender,50,SpringLayout.WEST, layoutPanel);
        layoutPanel.add(genderTxt);
        layoutSpring.putConstraint(SpringLayout.NORTH, genderTxt,250,SpringLayout.NORTH, layoutPanel);
        layoutSpring.putConstraint(SpringLayout.WEST, genderTxt,150,SpringLayout.WEST, layoutPanel);

        layoutPanel.add(empAddress);
        layoutSpring.putConstraint(SpringLayout.NORTH, empAddress,300,SpringLayout.NORTH, layoutPanel);
        layoutSpring.putConstraint(SpringLayout.WEST, empAddress,50,SpringLayout.WEST, layoutPanel);
        layoutPanel.add(addressTxt);
        layoutSpring.putConstraint(SpringLayout.NORTH, addressTxt,300,SpringLayout.NORTH, layoutPanel);
        layoutSpring.putConstraint(SpringLayout.WEST, addressTxt,150,SpringLayout.WEST, layoutPanel);

        layoutPanel.add(empJob);
        layoutSpring.putConstraint(SpringLayout.NORTH, empJob,350,SpringLayout.NORTH, layoutPanel);
        layoutSpring.putConstraint(SpringLayout.WEST, empJob,50,SpringLayout.WEST, layoutPanel);
        layoutPanel.add(jobTxt);
        layoutSpring.putConstraint(SpringLayout.NORTH, jobTxt,350,SpringLayout.NORTH, layoutPanel);
        layoutSpring.putConstraint(SpringLayout.WEST, jobTxt,150,SpringLayout.WEST, layoutPanel);

        layoutPanel.add(empHours);
        layoutSpring.putConstraint(SpringLayout.NORTH, empHours,400,SpringLayout.NORTH, layoutPanel);
        layoutSpring.putConstraint(SpringLayout.WEST, empHours,50,SpringLayout.WEST, layoutPanel);
        layoutPanel.add(hoursTxt);
        layoutSpring.putConstraint(SpringLayout.NORTH, hoursTxt,400,SpringLayout.NORTH, layoutPanel);
        layoutSpring.putConstraint(SpringLayout.WEST, hoursTxt,150,SpringLayout.WEST, layoutPanel);

        layoutPanel.add(empDep);
        layoutSpring.putConstraint(SpringLayout.NORTH, empDep,50,SpringLayout.NORTH, layoutPanel);
        layoutSpring.putConstraint(SpringLayout.WEST, empDep,350,SpringLayout.WEST, layoutPanel);
        layoutPanel.add(departmentTxt);
        layoutSpring.putConstraint(SpringLayout.NORTH, departmentTxt,50,SpringLayout.NORTH, layoutPanel);
        layoutSpring.putConstraint(SpringLayout.WEST, departmentTxt,450,SpringLayout.WEST, layoutPanel);

        layoutPanel.add(empROP);
        layoutSpring.putConstraint(SpringLayout.NORTH, empROP,100,SpringLayout.NORTH, layoutPanel);
        layoutSpring.putConstraint(SpringLayout.WEST, empROP,350,SpringLayout.WEST, layoutPanel);
        layoutPanel.add(rateOfPayTxt);
        layoutSpring.putConstraint(SpringLayout.NORTH, rateOfPayTxt,100,SpringLayout.NORTH, layoutPanel);
        layoutSpring.putConstraint(SpringLayout.WEST, rateOfPayTxt,450,SpringLayout.WEST, layoutPanel);

        layoutPanel.add(empCarAll);
        layoutSpring.putConstraint(SpringLayout.NORTH, empCarAll,150,SpringLayout.NORTH, layoutPanel);
        layoutSpring.putConstraint(SpringLayout.WEST, empCarAll,350,SpringLayout.WEST, layoutPanel);
        layoutPanel.add(carTxt);
        layoutSpring.putConstraint(SpringLayout.NORTH, carTxt,150,SpringLayout.NORTH, layoutPanel);
        layoutSpring.putConstraint(SpringLayout.WEST, carTxt,450,SpringLayout.WEST, layoutPanel);

        layoutPanel.add(empGrat);
        layoutSpring.putConstraint(SpringLayout.NORTH, empGrat,200,SpringLayout.NORTH, layoutPanel);
        layoutSpring.putConstraint(SpringLayout.WEST, empGrat,350,SpringLayout.WEST, layoutPanel);
        layoutPanel.add(gratuityTxt);
        layoutSpring.putConstraint(SpringLayout.NORTH, gratuityTxt,200,SpringLayout.NORTH, layoutPanel);
        layoutSpring.putConstraint(SpringLayout.WEST, gratuityTxt,450,SpringLayout.WEST, layoutPanel);

        layoutPanel.add(empTax);
        layoutSpring.putConstraint(SpringLayout.NORTH, empTax,250,SpringLayout.NORTH, layoutPanel);
        layoutSpring.putConstraint(SpringLayout.WEST, empTax,350,SpringLayout.WEST, layoutPanel);
        layoutPanel.add(taxTxt);
        layoutSpring.putConstraint(SpringLayout.NORTH, taxTxt,250,SpringLayout.NORTH, layoutPanel);
        layoutSpring.putConstraint(SpringLayout.WEST, taxTxt,450,SpringLayout.WEST, layoutPanel);

        iDTxt.setEditable(false);
        nameTxt.setEditable(false);
        surnameTxt.setEditable(false);
        dobTxt.setEditable(false);
        genderTxt.setEditable(false);
        addressTxt.setEditable(false);
        jobTxt.setEditable(false);
        hoursTxt.setEditable(false);
        departmentTxt.setEditable(false);
        rateOfPayTxt.setEditable(false);
        carTxt.setEditable(false);
        gratuityTxt.setEditable(false);
        taxTxt.setEditable(false);

        searchContent.add(layoutPanel);

        //EMPLOYEE TABLE
        String[] empHeader = dataManager.callEmployeeTableHeader();
        String[][] empRec = dataManager.callEmployeeTableData();
        employeeTable = new JTable(empRec, empHeader)
        {
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        };
        employeeTable.getTableHeader().setReorderingAllowed(false);
        empTableScrollPane = new JScrollPane(employeeTable);
        empTableScrollPane.setPreferredSize(new Dimension(CENTREPANEL_WIDTH, CENTREPANEL_HEIGHT));
        //SALARY TABLE
        String[] salHeader = dataManager.callSalaryTableHeader();
        String[][] salRec = dataManager.callSalaryTableData();
        salaryTable = new JTable(salRec, salHeader)
        {
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        };
        salaryTable.getTableHeader().setReorderingAllowed(false);
        salTableScrollPane = new JScrollPane(salaryTable);
        salTableScrollPane.setPreferredSize(new Dimension(CENTREPANEL_WIDTH, CENTREPANEL_HEIGHT));

        //GROSS TABLE
        String[] grossHeader = dataManager.callGrossTableHeader();
        String[][] grossRec = dataManager.callGrossTableData();
        grossTable = new JTable(grossRec, grossHeader)
        {
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        };
        grossTable.getTableHeader().setReorderingAllowed(false);
        grossTableScrollPane = new JScrollPane(grossTable);
        grossTableScrollPane.setPreferredSize(new Dimension(CENTREPANEL_WIDTH, CENTREPANEL_HEIGHT));

        //FEMALE EMPLOYEES TABLE
        String[] femHeader = dataManager.callFemTableHeader();
        String[][] femRec = dataManager.callFemTableData();
        femaleWorkersTable = new JTable(femRec, femHeader)
        {
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        };
        employeeTable.getTableHeader().setReorderingAllowed(false);
        femTableScrollPane = new JScrollPane(femaleWorkersTable);
        femTableScrollPane.setPreferredSize(new Dimension(CENTREPANEL_WIDTH, CENTREPANEL_HEIGHT));

        //CENSUS
        String[] cenHeader = dataManager.callCensusTableHeader();
        String[][] cenRec = dataManager.callCensusTableData();
        censusTable = new JTable(cenRec, cenHeader)
        {
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        };
        censusTable.getTableHeader().setReorderingAllowed(false);
        censusTableScrollPane = new JScrollPane(censusTable);
        censusTableScrollPane.setPreferredSize(new Dimension(CENTREPANEL_WIDTH, CENTREPANEL_HEIGHT));

        frame.setVisible(true);
    }

    public void setContentsOff()
    {
        searchContent.setVisible(false);
        employeeContent.setVisible(false);
        salaryContent.setVisible(false);
        grossContent.setVisible(false);
        femaleWorkersContent.setVisible(false);
        censusContent.setVisible(false);
    }

    private class ButtonListener implements ActionListener
    {
        public void actionPerformed(ActionEvent e)
        {
            if (e.getSource() == searchBttn)
            {
                frame.setTitle("Employee Management System - Home");
                contentPanel.add(searchContent, BorderLayout.CENTER);
                contentPanel.setBackground(Color.WHITE);
                setContentsOff();
                searchContent.setVisible(true);
            }
            if(e.getSource() == employeeBttn)
            {
                frame.setTitle("Employee Management System - Employee Table");
                contentPanel.add(employeeContent, BorderLayout.CENTER);
                employeeContent.add(empTableScrollPane);
                setContentsOff();
                employeeContent.setVisible(true);
            }
            if (e.getSource() == salaryBttn)
            {
                frame.setTitle("Employee Management System - Salary Table");
                contentPanel.add(salaryContent, BorderLayout.CENTER);
                salaryContent.add(salTableScrollPane);
                setContentsOff();
                salaryContent.setVisible(true);
            }
            if (e.getSource() == grossBttn)
            {
                frame.setTitle("Employee Management System - Gross Table");
                contentPanel.add(grossContent, BorderLayout.CENTER);
                grossContent.add(grossTableScrollPane);
                setContentsOff();
                grossContent.setVisible(true);
            }
            if (e.getSource() == femaleEmpBttn)
            {
                frame.setTitle("Employee Management System - Female Employees Table");
                contentPanel.add(femaleWorkersContent, BorderLayout.CENTER);
                femaleWorkersContent.add(femTableScrollPane);
                setContentsOff();
                femaleWorkersContent.setVisible(true);
            }
            if (e.getSource() == censusBttn)
            {
                frame.setTitle("Employee Management System - Census");
                contentPanel.add(censusContent, BorderLayout.CENTER);
                censusContent.add(censusTableScrollPane);
                setContentsOff();
                censusContent.setVisible(true);
            }
            if(e.getSource() == searchEmployee)
            {
                getSearchText = searchInputArea.getText();
                searchText = getSearchText;
                searchEmployee();
                if(invalidIDSearch == true)
                {
                    JOptionPane.showMessageDialog(null, "Invalid ID, Try again");
                }
            }
        }
    }
    public static void searchEmployee()
    {
        invalidIDSearch = false;
        switch (searchText) {
            case "EMP001":
                switchAdd = 0;
                switchData();
                break;
            case "EMP002":
                switchAdd = 13;
                switchData();
                break;
            case "EMP003":
                switchAdd = 26;
                switchData();
                break;
            case "EMP004":
                switchAdd = 39;
                switchData();
                break;
            case "EMP005":
                switchAdd = 52;
                switchData();
                break;
            case "EMP006":
                switchAdd = 65;
                switchData();
                break;
            case "EMP007":
                switchAdd = 78;
                switchData();
                break;
            case "EMP008":
                switchAdd = 91;
                switchData();
                break;
            case "EMP009":
                switchAdd = 104;
                switchData();
                break;
            case "EMP010":
                switchAdd = 117;
                switchData();
                break;
            case "EMP011":
                switchAdd = 130;
                switchData();
                break;
            case "EMP012":
                switchAdd = 143;
                switchData();
                break;
            case "EMP013":
                switchAdd = 156;
                switchData();
                break;
            case "EMP014":
                switchAdd = 169;
                switchData();
                break;
            case "EMP015":
                switchAdd = 182;
                switchData();
                break;
            case "EMP016":
                switchAdd = 195;
                switchData();
                break;
            case "EMP017":
                switchAdd = 208;
                switchData();
                break;
            case "EMP018":
                switchAdd = 221;
                switchData();
                break;
            case "EMP019":
                switchAdd = 234;
                switchData();
                break;
            case "EMP020":
                switchAdd = 247;
                switchData();
                break;
            case "EMP021":
                switchAdd = 260;
                switchData();
                break;
            case "EMP022":
                switchAdd = 273;
                switchData();
                break;
            case "EMP023":
                switchAdd = 286;
                switchData();
                break;
            case "EMP024":
                switchAdd = 299;
                switchData();
                break;
            case "EMP025":
                switchAdd = 312;
                switchData();
                break;
            case "EMP026":
                switchAdd = 325;
                switchData();
                break;
            case "EMP027":
                switchAdd = 338;
                switchData();
                break;
            case "EMP028":
                switchAdd = 351;
                switchData();
                break;
            case "EMP029":
                switchAdd = 364;
                switchData();
                break;
            case "EMP030":
                switchAdd = 377;
                switchData();
                break;
            case "EMP031":
                switchAdd = 390;
                switchData();
                break;
            case "EMP032":
                switchAdd = 403;
                switchData();
                break;
            case "EMP033":
                switchAdd = 416;
                switchData();
                break;
            case "EMP034":
                switchAdd = 429;
                switchData();
                break;
            case "EMP035":
                switchAdd = 442;
                switchData();
                break;
            case "EMP036":
                switchAdd = 455;
                switchData();
                break;
            case "EMP037":
                switchAdd = 468;
                switchData();
                break;
            case "EMP038":
                switchAdd = 481;
                switchData();
                break;
            case "EMP039":
                switchAdd = 494;
                switchData();
                break;
            case "EMP040":
                switchAdd = 507;
                switchData();
                break;
            case "EMP041":
                switchAdd = 520;
                switchData();
                break;
            case "EMP042":
                switchAdd = 533;
                switchData();
                break;
            case "EMP043":
                switchAdd = 546;
                switchData();
                break;
            case "EMP044":
                switchAdd = 559;
                switchData();
                break;
            case "EMP045":
                switchAdd = 572;
                switchData();
                break;
            case "EMP046":
                switchAdd = 585;
                switchData();
                break;
            case "EMP047":
                switchAdd = 598;
                switchData();
                break;
            case "EMP048":
                switchAdd = 611;
                switchData();
                break;
            case "EMP049":
                switchAdd = 624;
                switchData();
                break;
            case "EMP050":
                switchAdd = 637;
                switchData();
                break;
            default:
                //System.out.println("Invalid ID");
                invalidIDSearch = true;
        }
    }

    public static void switchData()
    {
        iDTxt.setText(DataManager.tokenManager()[switchAdd]);
        nameTxt.setText(DataManager.tokenManager()[switchAdd += 1]);
        surnameTxt.setText(DataManager.tokenManager()[switchAdd += 1]);
        dobTxt.setText(DataManager.tokenManager()[switchAdd += 1]);
        genderTxt.setText(DataManager.tokenManager()[switchAdd += 1]);
        addressTxt.setText(DataManager.tokenManager()[switchAdd += 1]);
        jobTxt.setText(DataManager.tokenManager()[switchAdd += 1]);
        hoursTxt.setText(DataManager.tokenManager()[switchAdd += 1]);
        departmentTxt.setText(DataManager.tokenManager()[switchAdd += 1]);
        rateOfPayTxt.setText(DataManager.tokenManager()[switchAdd += 1]);
        carTxt.setText(DataManager.tokenManager()[switchAdd += 1]);
        gratuityTxt.setText(DataManager.tokenManager()[switchAdd += 1]);
        taxTxt.setText(DataManager.tokenManager()[switchAdd += 1]);
    }

}
