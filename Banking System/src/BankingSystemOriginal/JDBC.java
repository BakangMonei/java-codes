package BankingSystemOriginal;

import java.sql.*;

public class JDBC {
    public static void main(String[] args) {
        try {
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/Customer", "root", "@BakangMonei959115515");
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("select * from Customer");

            while (resultSet.next()) {
                System.out.println(resultSet.getString("username") + "\n" + resultSet.getString("password") +  "\n"  + "++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    // Connect from the BankTester
}