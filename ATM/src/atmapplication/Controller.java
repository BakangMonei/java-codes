package atmapplication;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.stage.Stage;

import java.io.IOException;
import java.sql.*;
import java.time.LocalDate;

public class Controller {
    DummyDatabase dummyDatabase = new DummyDatabase();

    private Stage stage;
    private Scene scene;
    private Parent root;

    /**
     * Login FXML
     */
    @FXML
    private TextField accNumberField;
    @FXML
    private PasswordField accPinField;
    @FXML
    private Button loginButton;
    @FXML
    private Button noAccountButton;
    @FXML
    private Label loginDialog;
    /**
     * Signup FXML files
     */
    @FXML
    private TextField firstNameFieldSU;
    String firstname;
    @FXML
    private TextField lastNameFieldSU;
    String lastname;
    @FXML
    private TextField emailFieldSU;
    String email;
    @FXML
    private DatePicker dobFieldSU;
    LocalDate dob;
    @FXML
    private RadioButton maleOptSU;
    @FXML
    private RadioButton femaleOptSU;
    @FXML
    private TextField occupationFieldSU;
    String occupation;
    @FXML
    private TextField companyFieldSU;
    String companyName;
    @FXML
    private TextField addressFieldSU;
    String companyAddress;
    @FXML
    private RadioButton chequeFieldSU;
    @FXML
    private RadioButton savingsFieldSU;
    @FXML
    private RadioButton interestBearingFieldSU;
    @FXML
    private PasswordField pinFieldSU;
    String password;
    @FXML
    private Button createAccountButton;
    @FXML
    private Button exitSignupButton;
    /**
     * Dashboard FXML
     */
    @FXML
    private Button logoutButton;
    /**
     * Balance FXML
     */
    @FXML
    private Label availBalance;
    @FXML
    private Label actualBalance;
    /**
     * Withdraw FXML
     */
    @FXML
    private TextField withdrawTextField;
    @FXML
    private Button confirmWithdrawalButton;
    /**
     * Deposit FXML
     */
    @FXML
    private TextField depositTextField;
    @FXML
    private Button confirmDepositButton;
    /**
     * Profile
     */
    @FXML
    private Label firstNameProfile;
    @FXML
    private Label lastNameProfile;
    @FXML
    private Label accNumberProfile;
    @FXML
    private Label accTypeProfile;
    @FXML
    private Label emailProfile;
    @FXML
    private Label dobProfile;
    @FXML
    private Label genderProfile;
    @FXML
    private Label occupationProfile;
    @FXML
    private Label companyProfile;
    @FXML
    private Label addressProfile;
    /**
     * Statements
     */
    @FXML
    private TableView<?> statTable;
    @FXML
    private Label fullNameStat;
    @FXML
    private Label emailStat;
    @FXML
    private Label accNumber;
    @FXML
    private Label statDate;
    @FXML
    private Label statType;
    @FXML
    private Label statRef;
    @FXML
    private Label statAmount;
    @FXML
    private Label statBalance;
    /**
     * Change PIN
     */
    @FXML
    private TextField previousPin;
    @FXML
    private TextField newPin;
    @FXML
    private TextField confirmNewPin;
    //Var
    private double availBalanceVar;
    private static String sqlStatement = null;


    //Var holders from user input
    private String accNumInput;
    private String accPinInput;
    private double withdrawalInput;
    private double depositInput;

    //From database
    private String accNumDB;
    private String accPinDB;
    private double withdrawalAmount;

    public void ControllerMain(){
        final ToggleGroup genderToggleGroup = new ToggleGroup();
        maleOptSU = new RadioButton();
        femaleOptSU = new RadioButton();
        maleOptSU.setToggleGroup(genderToggleGroup);
        femaleOptSU.setToggleGroup(genderToggleGroup);
    }

    public void RunDatabase() throws SQLException {
        //Account balance
        //availBalance.setText("");
        /*availBalanceVar = 0;
        sqlStatement = "select accountbalance from account where accountid = 111111";
        ResultSet resultSet = CallSQLStatement();
        while (resultSet.next()) {
            availBalanceVar = resultSet.getDouble("accountbalance");
            //System.out.println(resultSet.getString("accountbalance"));
            System.out.println(availBalanceVar);
        }
        //availBalance.setText(String.valueOf(availBalanceVar));
        availBalance = new Label("100000");
        try {
            Conn conn = new Conn();
            int a = 1111113;
            String b = "Savings";
            double c = 595.00;
            String str = "insert into account values(111111, 'Interest Bearing', 100251.00);";
            conn.statement.executeUpdate(str);
            //select accountbalance from tablename where accountid = id
        } catch (SQLException e) {
            System.out.println(e);
        }*/
    }

    public void LoginButton(javafx.event.ActionEvent actionEvent) throws IOException {
        /*Parent root = FXMLLoader.load(getClass().getResource("________Balance.fxml"));
        stage = (Stage)((Node)actionEvent.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();*/

        accNumInput = accNumberField.getText().toString();
        accPinInput = accPinField.getText().toString();

        //Compare account number and pin with source from database

        if(accPinInput.equals(dummyDatabase.accOnePin) &&
                accNumInput.equals(dummyDatabase.accNumberOne)){
            Parent root = FXMLLoader.load(getClass().getResource("________Balance.fxml"));
            stage = (Stage)((Node)actionEvent.getSource()).getScene().getWindow();
            scene = new Scene(root);
            stage.setScene(scene);
            stage.show();
        }else if(accNumberField.getText().isEmpty() && !accPinField.getText().isEmpty()){
            PopUpAlerts("Login Error!", "Please fill in account number");
        }
        else if(accPinField.getText().isEmpty() && !accNumberField.getText().isEmpty()){
            PopUpAlerts("Login Error!", "Please fill in account PIN");
        }
        else if(accNumberField.getText().isEmpty() && accPinField.getText().isEmpty()){
            PopUpAlerts("Login Error!", "Please fill in login credentials");
        }
        else{
            PopUpAlerts("Login Error!", "Invalid login credentials");
        }
    }
    public void PopUpAlerts(String alertTitle, String alertMsg){
        Alert alert = new Alert(Alert.AlertType.ERROR);
        alert.setTitle(alertTitle);
        alert.setContentText(alertMsg);
        alert.showAndWait();
    }

    public void LoginAfterSignup(javafx.event.ActionEvent actionEvent) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("________Balance.fxml"));
        stage = (Stage)((Node)actionEvent.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();

        //compareAccNum = accNumberField.getText().toString();
        //compareAccPin = accPinField.getText().toString();

        /*if(compareAccPin.equals(dummyDatabase.accOnePin) &&
                compareAccNum.equals(dummyDatabase.accNumberOne)){
            Parent root = FXMLLoader.load(getClass().getResource("________Balance.fxml"));
            stage = (Stage)((Node)actionEvent.getSource()).getScene().getWindow();
            scene = new Scene(root);
            stage.setScene(scene);
            stage.show();
        }else{
            loginDialog.setText("Wrong login!");
        }*/

        /*firstname = firstNameFieldSU.getText();
        lastname = lastNameFieldSU.getText();
        email = emailFieldSU.getText();
        dob = dobFieldSU.getValue();*/
    }

    public void LogoutButton(javafx.event.ActionEvent actionEvent) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("__________Login.fxml"));
        stage = (Stage)((Node)actionEvent.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    public void SignupButton(javafx.event.ActionEvent actionEvent) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("_________Signup.fxml"));
        stage = (Stage)((Node)actionEvent.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();

        firstname = firstNameFieldSU.getText();
        lastname = lastNameFieldSU.getText();
        email = emailFieldSU.getText();
        dob = dobFieldSU.getValue();

    }

    //**************************************************************************************

    public void Balance(javafx.event.ActionEvent actionEvent) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("________Balance.fxml"));
        stage = (Stage)((Node)actionEvent.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
    public ResultSet CallSQLStatement(){
        ResultSet resultSet = null;
        try {
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/atmdb", "root", "@BakangMonei959115515");

            Statement statement = connection.createStatement();

            resultSet = statement.executeQuery(sqlStatement);

            /*while (getBalance.next()) {
                balance = getBalance.getDouble("accountbalance");
                //System.out.println(resultSet.getString("accountbalance"));
            }*/
           /* System.out.println(balance);*/
        }catch (Exception e){
            e.printStackTrace();
        }
        return resultSet;
    }
    public static ResultSet SQLCommand(String command){
        ResultSet resultSet = null;
        try {
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/atmdb", "root", "@BakangMonei959115515");

            Statement statement = connection.createStatement();

            resultSet = statement.executeQuery(command);

            /*while (getBalance.next()) {
                balance = getBalance.getDouble("accountbalance");
                //System.out.println(resultSet.getString("accountbalance"));
            }*/
            /* System.out.println(balance);*/
        }catch (Exception e){
            e.printStackTrace();
        }
        return resultSet;
    }
    //*************************************
    public void Withdraw(javafx.event.ActionEvent actionEvent) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("_______Withdraw.fxml"));
        stage = (Stage)((Node)actionEvent.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
    public void ConfirmWithdrawal(javafx.event.ActionEvent actionEvent) throws IOException {
        withdrawalAmount = Double.parseDouble(withdrawTextField.getText());
        if(withdrawalAmount < dummyDatabase.accBalance){
            System.out.println("Success");
        }
        else{
            System.out.println("Not enough funds");
        }
    }
    //*************************************
    public void Deposit(javafx.event.ActionEvent actionEvent) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("______Deposit.fxml"));
        stage = (Stage)((Node)actionEvent.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
    public void ConfirmDeposit(javafx.event.ActionEvent actionEvent) throws IOException {
        depositInput = Double.parseDouble(withdrawTextField.getText());
        if(depositInput < dummyDatabase.accBalance){
            System.out.println("Success");
        }
        else{
            System.out.println("Not enough funds");
        }
    }
    //*************************************
    public void Profile(javafx.event.ActionEvent actionEvent) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("_____Profile.fxml"));
        stage = (Stage)((Node)actionEvent.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
    //*************************************
    public void Statement(javafx.event.ActionEvent actionEvent) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("____Statement.fxml"));
        stage = (Stage)((Node)actionEvent.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
    public void PrintStatement(javafx.event.ActionEvent actionEvent) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("____Statement.fxml"));
        stage = (Stage)((Node)actionEvent.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    //*************************************
    public void ChangePIN(javafx.event.ActionEvent actionEvent) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("___ChangePin.fxml"));
        stage = (Stage)((Node)actionEvent.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
}
