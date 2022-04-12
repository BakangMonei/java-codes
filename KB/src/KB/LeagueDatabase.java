package KB;

import java.sql.*;

public class LeagueDatabase {
    public static void main(String[] args) {
        try {
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/leaguedatabase", "root", "@BakangMonei959115515");
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("select * from Coach");


            while (resultSet.next()) {
                System.out.println(resultSet.getString("username") + "\n" + resultSet.getString("firstname") +  "\n" + resultSet.getString("lastname") + "\n" + resultSet.getInt("Age") +  "\n" + resultSet.getString("coachinglicensedetails") + "\n" + resultSet.getString("previousteam") + "\n" + resultSet.getString("currentteam") + "\n" + "++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}