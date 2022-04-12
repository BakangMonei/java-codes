package atmapplication;

import java.sql.*;


public class Conn {
    Connection connection;
    Statement statement;
    ResultSet resultset;

    public Conn(){
        try{
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/atmdb", "root", "@BakangMonei959115515");
            statement = connection.createStatement();
            resultset = (ResultSet) connection.createStatement();
        }
        catch (SQLException e) {
            System.out.println(e);
        }
    }

}
