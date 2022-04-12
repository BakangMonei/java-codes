import java.sql.*;
import java.util.*;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.ResultSet;

public class MyJDBC {

    public static void main(String[] args) {

        try {
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/myjdbc", "root", "@BakangMonei959115515");

            Statement statement = connection.createStatement();

            ResultSet resultSet = statement.executeQuery("select * from people");

            while (resultSet.next()) {
                System.out.println(resultSet.getString("id"));
                System.out.println(resultSet.getString("firstname"));
                System.out.println("============================================================================================================");
            }

        }
        catch (SQLException e) {
            e.printStackTrace();
        }
    }
}

