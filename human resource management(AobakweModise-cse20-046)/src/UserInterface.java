import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class UserInterface
{
    //Frame properties
    JFrame mainFrame;
    final int frameWidth = 1024;
    final int frameHeight = 720;

    //Frame BorderLayout panels
    JPanel centrePanel, topPanel;

    //centrePanel panels
    JPanel search, employees, salary, gross, females, location;

    //search content
    JLabel enterIDText;
    JTextField searchBar;
    static String id, name, surname, dob, address, gender, city, rop, gratuity, job, department, allowance,tax, hours, dateHired, leaveDays, monthlySalary;

    //topPanel contents
    JButton searchButton, employeesButton, salaryButton, grossButton, femalesButton, locationButton;
    final int buttonHeight = 30;
    final int buttonWidth = 162;

    //Tables
    JTable employeeTable;
    JScrollPane employeeScrollPane;

    JTable salaryTable;
    JScrollPane salaryScrollPane;

    JTable grossTable;
    JScrollPane grossScrollPane;

    JTable femaleTable;
    JScrollPane femaleScrollPane;

    JTable locationTable;
    JScrollPane locationScrollPane;

    static boolean verifySearch = true;
    static int switchAdd;
    static String getSearchText = "";
    static String searchText = "";
    static boolean invalidIDSearch;
    static JTextArea displaySearch= new JTextArea();
    static JButton searchEmployee = new JButton("Find");

    static String searchResultText = "";

    UserInterface.ButtonListener buttonListener = new UserInterface.ButtonListener();

    public UserInterface()
    {
        TextManager txtMng = new TextManager();
        txtMng.allMethods();
        //Make GUI != null
        mainFrame = new JFrame();

        centrePanel = new JPanel();
        topPanel = new JPanel();
        topPanel = new JPanel();

        search = new JPanel();
        employees = new JPanel();
        salary = new JPanel();
        gross = new JPanel();
        females = new JPanel();
        location = new JPanel();

        searchButton = new JButton("Search");
        employeesButton = new JButton("Employees");
        salaryButton = new JButton("Salary");
        grossButton = new JButton("Gross");
        femalesButton = new JButton("Females");
        locationButton = new JButton("Location");

        //Set button size
        searchButton.setPreferredSize(new Dimension(buttonWidth, buttonHeight));
        employeesButton.setPreferredSize(new Dimension(buttonWidth, buttonHeight));
        salaryButton.setPreferredSize(new Dimension(buttonWidth, buttonHeight));
        grossButton.setPreferredSize(new Dimension(buttonWidth, buttonHeight));
        femalesButton.setPreferredSize(new Dimension(buttonWidth, buttonHeight));
        locationButton.setPreferredSize(new Dimension(buttonWidth, buttonHeight));

        //Set button actions
        searchButton.addActionListener(buttonListener);
        employeesButton.addActionListener(buttonListener);
        salaryButton.addActionListener(buttonListener);
        grossButton.addActionListener(buttonListener);
        femalesButton.addActionListener(buttonListener);
        locationButton.addActionListener(buttonListener);
        searchEmployee.addActionListener(buttonListener);

        //Set mainFrame properties
        mainFrame.setLayout(new BorderLayout());    //Set frame layout manager
        mainFrame.setSize(frameWidth, frameHeight); //Set frame size
        mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);   //Set frame exit button action
        mainFrame.setTitle("Search");

        //Add contents to frame
        mainFrame.add(topPanel, BorderLayout.NORTH);
        mainFrame.add(centrePanel, BorderLayout.CENTER);

        //Add contents to centrePanel
        centrePanel.add(search);
        centrePanel.add(employees);
        centrePanel.add(salary);
        centrePanel.add(gross);
        centrePanel.add(females);
        centrePanel.add(location);

        //Search content
        enterIDText = new JLabel("Enter Employee ID");
        searchBar = new JTextField(10);
        displaySearch.setEditable(false);
        JTextArea searchContent;
        search.add(enterIDText);
        search.add(searchBar);
        search.add(searchEmployee);

        JLabel content = new JLabel(getSearchResults());
        content.setPreferredSize(new Dimension(500, 200));
        search.add(content);


        search.setVisible(true);    //Set starting panel visible

        //Set top panels contents
        topPanel.add(searchButton);
        topPanel.add(employeesButton);
        topPanel.add(salaryButton);
        topPanel.add(grossButton);
        topPanel.add(femalesButton);
        topPanel.add(locationButton);

        //Tables
        //Employees
        String dataEmployee[][]=txtMng.employeeTableColumns();
        String columnEmployee[]=txtMng.employeeTableHeader();
        employeeTable=new JTable(dataEmployee,columnEmployee);
        employeeScrollPane=new JScrollPane(employeeTable);
        employeeScrollPane.setPreferredSize(new Dimension(1014, 568));

        //Salary
        String salaryData[][]=txtMng.salaryTableColumns();
        String salaryHeader[]=txtMng.salaryTableHeader();
        salaryTable=new JTable(salaryData,salaryHeader);
        salaryScrollPane=new JScrollPane(salaryTable);
        salaryScrollPane.setPreferredSize(new Dimension(1014, 568));

        //Gross
        String grossData[][]=txtMng.grossTableColumns();
        String grossHeader[]=txtMng.grossTableHeader();
        grossTable=new JTable(grossData,grossHeader);
        grossScrollPane=new JScrollPane(grossTable);
        grossScrollPane.setPreferredSize(new Dimension(1014, 568));

        //Females
        String femaleData[][]=txtMng.femaleTableColumns();
        String femaleHeader[]=txtMng.femaleTableHeader();
        femaleTable=new JTable(femaleData,femaleHeader);
        femaleScrollPane=new JScrollPane(femaleTable);
        femaleScrollPane.setPreferredSize(new Dimension(1014, 568));

        //Location
        String locationData[][]=txtMng.locationTableColumns();
        String locationHeader[]=txtMng.locationTableHeader();
        locationTable=new JTable(locationData,locationHeader);
        locationScrollPane=new JScrollPane(locationTable);
        locationScrollPane.setPreferredSize(new Dimension(1014, 568));


        mainFrame.setVisible(true);
    }

    public void turnOffPanels()
    {
        search.setVisible(false);
        employees.setVisible(false);
        salary.setVisible(false);
        gross.setVisible(false);
        females.setVisible(false);
        location.setVisible(false);
    }

    public class ButtonListener implements ActionListener
    {
        public void actionPerformed(ActionEvent e)
        {
            if(e.getSource() == searchButton)
            {
                turnOffPanels();
                search.setVisible(true);
                mainFrame.setTitle("Search");
            }
            if(e.getSource() == employeesButton)
            {
                turnOffPanels();
                employees.add(employeeScrollPane);
                employees.setVisible(true);
                mainFrame.setTitle("Employee Table");
            }
            if(e.getSource() == salaryButton)
            {
                turnOffPanels();
                salary.add(salaryScrollPane);
                salary.setVisible(true);
                mainFrame.setTitle("Salary Table");
            }
            if(e.getSource() == grossButton)
            {
                turnOffPanels();
                gross.add(grossScrollPane);
                gross.setVisible(true);
                mainFrame.setTitle("Gross Table");
            }
            if(e.getSource() == femalesButton)
            {
                turnOffPanels();
                females.add(femaleScrollPane);
                females.setVisible(true);
                mainFrame.setTitle("Females Table");
            }
            if(e.getSource() == locationButton)
            {
                turnOffPanels();
                location.add(locationScrollPane);
                location.setVisible(true);
                mainFrame.setTitle("Location Table");
            }
            if(e.getSource() == searchEmployee)
            {
                getSearchText = searchBar.getText();
                searchText = getSearchText;
                searchEmployee();


                System.out.println(getSearchResults());
            }
        }
    }

    public static void searchEmployee()
    {
        verifySearch = false;
        switch (searchText) {
            case "01":
                switchAdd = 0;
                switchData();
                break;
            case "02":
                switchAdd = 17;
                switchData();
                break;
            case "03":
                switchAdd = 34;
                switchData();
                break;
            default:
                //System.out.println("Invalid ID");
                invalidIDSearch = true;
        }
    }

    public static void switchData()
    {
        id = (TextManager.wordArray()[switchAdd]);
        name = (TextManager.wordArray()[switchAdd += 1]);
        surname = (TextManager.wordArray()[switchAdd += 1]);
        dob = (TextManager.wordArray()[switchAdd += 1]);
        gender = (TextManager.wordArray()[switchAdd += 1]);
        address = (TextManager.wordArray()[switchAdd += 1]);
        job = (TextManager.wordArray()[switchAdd += 1]);
        dateHired = (TextManager.wordArray()[switchAdd += 1]);
        department = (TextManager.wordArray()[switchAdd += 1]);
        hours = (TextManager.wordArray()[switchAdd += 1]);
        rop = (TextManager.wordArray()[switchAdd += 1]);
        leaveDays = (TextManager.wordArray()[switchAdd += 1]);
        allowance = (TextManager.wordArray()[switchAdd += 1]);
        gratuity = (TextManager.wordArray()[switchAdd += 1]);
        tax = (TextManager.wordArray()[switchAdd += 1]);
        monthlySalary = (TextManager.wordArray()[switchAdd += 1]);
        city = (TextManager.wordArray()[switchAdd += 1]);

        searchResultText = id + " " + name + " " + surname + " " + dob + " " + gender + " " + address + " " + job + " " +
                dateHired + " " + department + " " + hours + " " + rop + " " + leaveDays + " " + allowance + " " +
                gratuity + " " + tax + " " + monthlySalary + " " + city;

        getSearchResults();
    }

    public static String getSearchResults()
    {
        String results = searchResultText;

        return results;
    }
}

