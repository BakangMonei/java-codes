import javax.swing.*;
import javax.swing.border.LineBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class UI extends JFrame
{
    static int count;

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

    JButton searchButton = new JButton("Search");
    JButton employeeTableButton = new JButton("Employee Table");
    JButton salaryTableButton = new JButton("Salaries Table");
    JButton grossTableButton = new JButton("Gross Table");
    JButton femaleWorkersTableButton = new JButton("Female Employees");
    JButton censusTableButton = new JButton("Census Table");

    JLabel banner = new JLabel("Employee Management System");

    //SEARCH
    JLabel enterSearchID = new JLabel("Enter Employee ID (e.g EMP001)");
    JTextField searchBar = new JTextField(10);
    JButton findEmployeeButton = new JButton("Search");
    static String getSearchText = "";
    static String searchText = "";
    static boolean invalidIDSearch;

    static JTextArea searchResults = new JTextArea();

    UI.ButtonListener buttonListener = new UI.ButtonListener();

    public UI()
    {
        TextManager txtMng = new TextManager();
        TextManager.allMethods();

        frame.setTitle("Employee Management System - Home");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //Frame dimensions
        int WINDOW_WIDTH = 1280;
        int WINDOW_HEIGHT = 720;
        //Centre Panel dimensions
        int CENTREPANEL_WIDTH = WINDOW_WIDTH - 75;
        int CENTREPANEL_HEIGHT = WINDOW_HEIGHT - 135;
        frame.setSize(WINDOW_WIDTH, WINDOW_HEIGHT);
        frame.setResizable(false);

        frame.add(mainPanel);
        mainPanel.setBorder(new LineBorder(Color.GRAY, 10));

        //Adding panels to main panel
        mainPanel.add(buttonPanel, BorderLayout.NORTH);
        mainPanel.add(contentPanel, BorderLayout.CENTER);

        //Header
        headerPanel.setBackground(Color.GRAY);

        //Buttons
        buttonPanel.setBackground(Color.GRAY);
        int buttonWidth = 150;
        int buttonHeight = 35;
        buttonPanel.setPreferredSize(new Dimension(buttonWidth, buttonHeight));

        buttonPanel.add(searchButton);
        buttonPanel.add(employeeTableButton);
        buttonPanel.add(salaryTableButton);
        buttonPanel.add(grossTableButton);
        buttonPanel.add(femaleWorkersTableButton);
        buttonPanel.add(censusTableButton);

        searchButton.setPreferredSize(new Dimension(buttonWidth, buttonHeight));
        employeeTableButton.setPreferredSize(new Dimension(buttonWidth, buttonHeight));
        salaryTableButton.setPreferredSize(new Dimension(buttonWidth, buttonHeight));
        grossTableButton.setPreferredSize(new Dimension(buttonWidth, buttonHeight));
        femaleWorkersTableButton.setPreferredSize(new Dimension(buttonWidth, buttonHeight));
        censusTableButton.setPreferredSize(new Dimension(buttonWidth, buttonHeight));

        searchButton.addActionListener(buttonListener);
        employeeTableButton.addActionListener(buttonListener);
        salaryTableButton.addActionListener(buttonListener);
        grossTableButton.addActionListener(buttonListener);
        femaleWorkersTableButton.addActionListener(buttonListener);
        censusTableButton.addActionListener(buttonListener);
        findEmployeeButton.addActionListener(buttonListener);

        //Content At Start Of App
        contentPanel.setBackground(Color.GRAY);
        contentPanel.setBorder(new LineBorder(Color.GRAY, 10));
        contentPanel.add(searchContent, BorderLayout.CENTER);
        contentPanel.setBackground(Color.WHITE);
        contentPanel.setPreferredSize(new Dimension(CENTREPANEL_WIDTH, CENTREPANEL_HEIGHT));

        //SEARCH
        SpringLayout layoutSpring = new SpringLayout();
        JPanel layoutPanel = new JPanel(layoutSpring);
        layoutPanel.setPreferredSize(new Dimension(CENTREPANEL_WIDTH, CENTREPANEL_HEIGHT));

        //Top Bar
        layoutPanel.add(enterSearchID);
        layoutPanel.add(searchBar);
        layoutPanel.add(findEmployeeButton);

        layoutSpring.putConstraint(SpringLayout.NORTH, enterSearchID,0,SpringLayout.NORTH, layoutPanel);
        layoutSpring.putConstraint(SpringLayout.WEST, enterSearchID,320,SpringLayout.WEST, layoutPanel);
        layoutSpring.putConstraint(SpringLayout.NORTH, searchBar,0,SpringLayout.NORTH, layoutPanel);
        layoutSpring.putConstraint(SpringLayout.WEST, searchBar,510,SpringLayout.WEST, layoutPanel);
        layoutSpring.putConstraint(SpringLayout.NORTH, findEmployeeButton,0,SpringLayout.NORTH, layoutPanel);
        layoutSpring.putConstraint(SpringLayout.WEST, findEmployeeButton,630,SpringLayout.WEST, layoutPanel);

        //Content
        JLabel empID = new JLabel("Employee ID");

        layoutPanel.add(empID);
        layoutSpring.putConstraint(SpringLayout.NORTH, empID,50,SpringLayout.NORTH, layoutPanel);
        layoutSpring.putConstraint(SpringLayout.WEST, empID,50,SpringLayout.WEST, layoutPanel);
        layoutPanel.add(searchResults);
        layoutSpring.putConstraint(SpringLayout.NORTH, searchResults,50,SpringLayout.NORTH, layoutPanel);
        layoutSpring.putConstraint(SpringLayout.WEST, searchResults,150,SpringLayout.WEST, layoutPanel);

        searchResults.setEditable(false);
        searchResults.setPreferredSize(new Dimension(600, 450));
        Font resultsFont = new Font("Verdana", Font.BOLD, 14);
        searchResults.setFont(resultsFont);

        searchContent.add(layoutPanel);

        //EMPLOYEE TABLE
        String dataEmployee[][]=txtMng.employeeTableColumns();
        String columnEmployee[]=txtMng.employeeTableHeader();
        employeeTable=new JTable(dataEmployee,columnEmployee);
        empTableScrollPane=new JScrollPane(employeeTable);
        empTableScrollPane.setPreferredSize(new Dimension(CENTREPANEL_WIDTH, CENTREPANEL_HEIGHT));
        //SALARY TABLE
        String salaryData[][]=txtMng.salaryTableColumns();
        String salaryHeader[]=txtMng.salaryTableHeader();
        salaryTable=new JTable(salaryData,salaryHeader);
        salTableScrollPane=new JScrollPane(salaryTable);
        salTableScrollPane.setPreferredSize(new Dimension(CENTREPANEL_WIDTH, CENTREPANEL_HEIGHT));

        //GROSS TABLE
        String grossData[][]=txtMng.grossTableColumns();
        String grossHeader[]=txtMng.grossTableHeader();
        grossTable=new JTable(grossData,grossHeader);
        grossTableScrollPane=new JScrollPane(grossTable);
        grossTableScrollPane.setPreferredSize(new Dimension(CENTREPANEL_WIDTH, CENTREPANEL_HEIGHT));

        //FEMALE EMPLOYEES TABLE
        String femaleData[][]=txtMng.femaleTableColumns();
        String femaleHeader[]=txtMng.femaleTableHeader();
        femaleWorkersTable=new JTable(femaleData,femaleHeader);
        femTableScrollPane=new JScrollPane(femaleWorkersTable);
        femTableScrollPane.setPreferredSize(new Dimension(CENTREPANEL_WIDTH, CENTREPANEL_HEIGHT));

        //CENSUS
        String[] cenHeader = txtMng.locationTableHeader();
        String[][] cenRec = txtMng.locationTableColumns();
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
            if (e.getSource() == searchButton)
            {
                frame.setTitle("Employee Management System - Home");
                contentPanel.add(searchContent, BorderLayout.CENTER);
                contentPanel.setBackground(Color.WHITE);
                setContentsOff();
                searchContent.setVisible(true);
            }
            if(e.getSource() == employeeTableButton)
            {
                frame.setTitle("Employee Management System - Employee Table");
                contentPanel.add(employeeContent, BorderLayout.CENTER);
                employeeContent.add(empTableScrollPane);
                setContentsOff();
                employeeContent.setVisible(true);
            }
            if (e.getSource() == salaryTableButton)
            {
                frame.setTitle("Employee Management System - Salary Table");
                contentPanel.add(salaryContent, BorderLayout.CENTER);
                salaryContent.add(salTableScrollPane);
                setContentsOff();
                salaryContent.setVisible(true);
            }
            if (e.getSource() == grossTableButton)
            {
                frame.setTitle("Employee Management System - Gross Table");
                contentPanel.add(grossContent, BorderLayout.CENTER);
                grossContent.add(grossTableScrollPane);
                setContentsOff();
                grossContent.setVisible(true);
            }
            if (e.getSource() == femaleWorkersTableButton)
            {
                frame.setTitle("Employee Management System - Female Employees Table");
                contentPanel.add(femaleWorkersContent, BorderLayout.CENTER);
                femaleWorkersContent.add(femTableScrollPane);
                setContentsOff();
                femaleWorkersContent.setVisible(true);
            }
            if (e.getSource() == censusTableButton)
            {
                frame.setTitle("Employee Management System - Census");
                contentPanel.add(censusContent, BorderLayout.CENTER);
                censusContent.add(censusTableScrollPane);
                setContentsOff();
                censusContent.setVisible(true);
            }
            if(e.getSource() == findEmployeeButton)
            {
                getSearchText = searchBar.getText();
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
                count = 0;
                assignSearchDetails();
                break;
            case "EMP002":
                count = 17;
                assignSearchDetails();
                break;
            case "EMP003":
                count = 34;
                assignSearchDetails();
                break;
            case "EMP004":
                count = 51;
                assignSearchDetails();
                break;
            case "EMP005":
                count = 68;
                assignSearchDetails();
                break;
            case "EMP006":
                count = 85;
                assignSearchDetails();
                break;
            case "EMP007":
                count = 102;
                assignSearchDetails();
                break;
            case "EMP008":
                count = 119;
                assignSearchDetails();
                break;
            case "EMP009":
                count = 136;
                assignSearchDetails();
                break;
            case "EMP010":
                count = 153;
                assignSearchDetails();
                break;
            case "EMP011":
                count = 170;
                assignSearchDetails();
                break;
            case "EMP012":
                count = 187;
                assignSearchDetails();
                break;
            case "EMP013":
                count = 204;
                assignSearchDetails();
                break;
            case "EMP014":
                count = 221;
                assignSearchDetails();
                break;
            case "EMP015":
                count = 238;
                assignSearchDetails();
                break;
            case "EMP016":
                count = 255;
                assignSearchDetails();
                break;
            case "EMP017":
                count = 272;
                assignSearchDetails();
                break;
            case "EMP018":
                count = 289;
                assignSearchDetails();
                break;
            case "EMP019":
                count = 306;
                assignSearchDetails();
                break;
            case "EMP020":
                count = 323;
                assignSearchDetails();
                break;
            case "EMP021":
                count = 340;
                assignSearchDetails();
                break;
            case "EMP022":
                count = 357;
                assignSearchDetails();
                break;
            case "EMP023":
                count = 374;
                assignSearchDetails();
                break;
            case "EMP024":
                count = 391;
                assignSearchDetails();
                break;
            case "EMP025":
                count = 408;
                assignSearchDetails();
                break;
            case "EMP026":
                count = 425;
                assignSearchDetails();
                break;
            case "EMP027":
                count = 442;
                assignSearchDetails();
                break;
            case "EMP028":
                count = 459;
                assignSearchDetails();
                break;
            case "EMP029":
                count = 476;
                assignSearchDetails();
                break;
            case "EMP030":
                count = 493;
                assignSearchDetails();
                break;
            case "EMP031":
                count = 510;
                assignSearchDetails();
                break;
            case "EMP032":
                count = 527;
                assignSearchDetails();
                break;
            case "EMP033":
                count = 544;
                assignSearchDetails();
                break;
            case "EMP034":
                count = 561;
                assignSearchDetails();
                break;
            case "EMP035":
                count = 578;
                assignSearchDetails();
                break;
            case "EMP036":
                count = 595;
                assignSearchDetails();
                break;
            case "EMP037":
                count = 612;
                assignSearchDetails();
                break;
            case "EMP038":
                count = 629;
                assignSearchDetails();
                break;
            case "EMP039":
                count = 646;
                assignSearchDetails();
                break;
            case "EMP040":
                count = 663;
                assignSearchDetails();
                break;
            case "EMP041":
                count = 680;
                assignSearchDetails();
                break;
            case "EMP042":
                count = 697;
                assignSearchDetails();
                break;
            case "EMP043":
                count = 714;
                assignSearchDetails();
                break;
            case "EMP044":
                count = 731;
                assignSearchDetails();
                break;
            case "EMP045":
                count = 748;
                assignSearchDetails();
                break;
            case "EMP046":
                count = 765;
                assignSearchDetails();
                break;
            case "EMP047":
                count = 782;
                assignSearchDetails();
                break;
            case "EMP048":
                count = 799;
                assignSearchDetails();
                break;
            case "EMP049":
                count = 816;
                assignSearchDetails();
                break;
            case "EMP050":
                count = 833;
                assignSearchDetails();
                break;
            default:
                //System.out.println("Invalid ID");
                invalidIDSearch = true;
        }
    }

    public static void assignSearchDetails()
    {
        searchResults.setText("ID: "+TextManager.wordArray()[count]+
                "\n"+"First Name: "+TextManager.wordArray()[count += 1]+
                "\n"+"Last Name: "+TextManager.wordArray()[count += 1]+
                "\n"+"Date Of Birth: "+ TextManager.wordArray()[count += 1]+
                "\n"+"Gender: "+TextManager.wordArray()[count += 1]+
                "\n"+"Address: "+TextManager.wordArray()[count += 1]+
                "\n"+"Title Of Employment: "+TextManager.wordArray()[count += 1]+
                "\n"+"Date Hired: "+TextManager.wordArray()[count += 1]+
                "\n"+"Department: "+TextManager.wordArray()[count += 1]+
                "\n"+"Hours Worked: "+ TextManager.wordArray()[count += 1]+
                "\n"+"Rate Of Pay: "+TextManager.wordArray()[count += 1]+
                "\n"+"Leave Days: "+TextManager.wordArray()[count += 1]+
                "\n"+"Car Allowance: "+ TextManager.wordArray()[count += 1]+
                "\n"+"Monthly Gratuity: "+TextManager.wordArray()[count += 1]+
                "\n"+"Tax Rate: "+TextManager.wordArray()[count += 1]+
                "\n"+"Monthly Salary: "+ TextManager.wordArray()[count += 1]+
                "\n"+"Location: "+TextManager.wordArray()[count += 1]);
    }

}

