package BankingSystemATM;

import model.Account;

import java.sql.*;

public class App {

    private String url = "jdbc:mysql://localhost/bankingsystem/";
    private String username = "root";
    private String pass = "";

    private static PreparedStatement prst;
    private static ResultSet rs;
    private static Connection conn;

    // TODO declare prepared statements
    //private static final LOGIN;
    //private static final VIEW_BALANCE;
    //private static final WITHDRAW;
    //private static final DEPOSIT;
    //private static final NEW_ACCOUNT;
    //private static final CLOSE_ACCOUNT;
    //private static final RESET_PIN;

    protected Connection getConnection(){
        Connection connection = null;
        try{
            Class.forName("com.mysql.jdbc.Driver");
            connection = DriverManager.getConnection(url, username, pass);
            System.out.println("Connected...");

        } catch (ClassNotFoundException | SQLException e){
            e.printStackTrace();
        }
        return connection;
    }

    // TODO implement prepared statments
    public void login(int accNum, int pin){

    }

    public void withdraw(double amount){

    }
    public void deposit(double amount){

    }
    public void newAcc(Account account){

    }
    public void closeAcc(int accNum, int pin){

    }
    // TODO add main method
    public static void main(String[] args){
     App runApp = new App();
    }
}
