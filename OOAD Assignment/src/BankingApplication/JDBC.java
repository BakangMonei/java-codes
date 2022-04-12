package BankingApplication;

import java.sql.*;

public class JDBC {
    public static void main(String[] args) {
        try {
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/", "root", "@BakangMonei959115515");
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("select * from ");

            while (resultSet.next()) {
                System.out.println(resultSet.getString("omangNumber"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}