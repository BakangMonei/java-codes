package BankingApplication;

import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.rmi.server.UnicastRemoteObject;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.Statement;
import java.util.ArrayList;

public class RMIServer extends UnicastRemoteObject implements RMIInterface {
    static final String DRIVER = "com.mysql.jdbc.Driver";
    static final String DATABASE_URL = "jdbc:mysql://localhost:3306/System";
    Connection conn = null;
    Statement statement = null;
    PreparedStatement ps;
    ResultSet rs;

    public RMIServer() throws RemoteException {
    }

    public void message(String m) throws RemoteException {
        System.out.println(m);
    }

    public String login(String UserName, String Password, String Previlage) throws RemoteException {
        String val = "0";
        String uname = "";
        String pass = "";
        String pre = "";

        try {
            Class.forName("com.mysql.jdbc.Driver");
            this.conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/System", "root", "@BakangMonei959115515");
            this.statement = this.conn.createStatement();
            String query = "SELECT * FROM tblUserAccount WHERE user_name ='" + UserName + "'";

            for(this.rs = this.statement.executeQuery(query); this.rs.next(); pre = this.rs.getString("previlege")) {
                uname = this.rs.getString("userName");
                pass = this.rs.getString("password");
            }

            if (!UserName.intern().equals(uname.intern()) && !Password.intern().equals(pass.intern()) && !Previlage.intern().equals(pre.intern())) {
                if (!UserName.intern().equals(uname.intern()) || !Password.intern().equals(pass.intern()) || !Previlage.intern().equals(pre.intern())) {
                    val = "0";
                }
            } else {
                val = "1";
            }

            this.conn.close();
        } catch (Exception var9) {
            System.out.println(var9.getMessage());
        }

        return val;
    }

    public String registerCustomer(String cus_ID, String cusName, String sex, String dept, String occupation) throws RemoteException {
        String val = "";
        String SID = "";

        try {
            Class.forName("com.mysql.jdbc.Driver");
            this.conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/System", "root", "@BakangMonei959115515");
            this.statement = this.conn.createStatement();
            String query = "SELECT *FROM tblCustomer WHERE cus_ID ='" + cus_ID + "'";
            this.ps = this.conn.prepareStatement(query);

            for(this.rs = this.ps.executeQuery(); this.rs.next(); SID = this.rs.getString("cus_ID")) {
            }

            if (cus_ID.intern().equals(SID.intern())) {
                val = "0";
            } else if (!cus_ID.intern().equals(SID.intern())) {
                this.statement = this.conn.createStatement();
                String sql = "INSERT INTO tblStudent(cus_ID, cusName, sex, department, occupation) VALUES ('" + cus_ID + "' , '" + cusName + "', '" + sex + "', '" + dept + "', '" + occupation + "')";
                this.statement.executeUpdate(sql);
                val = "1";
            }

            return val;
        } catch (Exception var11) {
            return var11.toString();
        }
    }

    public String updateStudent(String cus_ID, String cusName, String sex, String dept, String occupation) throws RemoteException {
        String SID = "";
        String val = "";

        try {
            Class.forName("com.mysql.jdbc.Driver");
            this.conn = DriverManager.getConnection("jdbc:mysql://localhost/system", "root", "@BakangMonei959115515");
            String query = "SELECT *FROM tblCustomer WHERE cus_id ='" + cus_ID + "'";
            this.ps = this.conn.prepareStatement(query);

            for(this.rs = this.ps.executeQuery(); this.rs.next(); SID = this.rs.getString("cus_id")) {
            }

            if (!cus_ID.intern().equals(SID.intern())) {
                val = "0";
            } else if (cus_ID.intern().equals(SID.intern())) {
                this.ps = this.conn.prepareStatement("UPDATE  tblCustomer SET cusName ='" + cusName + "' WHERE cus_id ='" + cus_ID + "'");
                this.ps.executeUpdate();
                this.ps = this.conn.prepareStatement("UPDATE  tblCustomer SET sex ='" + sex + "' WHERE cus_id ='" + cus_ID + "'");
                this.ps.executeUpdate();
                this.ps = this.conn.prepareStatement("UPDATE  tblCustomer SET department ='" + dept + "' WHERE cus_id ='" + cus_ID + "'");
                this.ps.executeUpdate();
                this.ps = this.conn.prepareStatement("UPDATE  tblCustomer SET occupation ='" + occupation + "' WHERE cus_id ='" + cus_ID + "'");
                this.ps.executeUpdate();
                val = "1";
            }
        } catch (Exception var10) {
            var10.printStackTrace();
        }

        return val;
    }

    public String deleteCustomer(String cus_ID) throws RemoteException {
        String SID = "";
        String val = "";

        try {
            Class.forName("com.mysql.jdbc.Driver");
            this.conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/System", "root", "@BakangMonei959115515");
            String query = "SELECT *FROM tblCustomer WHERE cus_ID='" + cus_ID + "'";
            this.ps = this.conn.prepareStatement(query);

            for(this.rs = this.ps.executeQuery(); this.rs.next(); SID = this.rs.getString("cus_ID")) {
            }

            if (!cus_ID.intern().equals(SID.intern())) {
                val = "0";
            } else if (cus_ID.intern().equals(SID.intern())) {
                this.ps = this.conn.prepareStatement("DELETE FROM  tblCustomer WHERE cus_ID = '" + cus_ID + "'");
                this.ps.executeUpdate();
                val = "1";
            }
        } catch (Exception var5) {
            var5.printStackTrace();
        }

        return val;
    }

    public ArrayList searchCustomer(String cus_ID) throws RemoteException {
        ArrayList array = new ArrayList();

        try {
            Class.forName("com.mysql.jdbc.Driver");
            this.conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/System", "root", "@BakangMonei959115515");
            this.statement = this.conn.createStatement();
            String sql = "SELECT * FROM tblCustomer WHERE cus_ID='" + cus_ID + "'";
            this.rs = this.statement.executeQuery(sql);

            while(this.rs.next()) {
                for(int i = 0; i < 5; ++i) {
                    array.add(this.rs.getString(i + 1));
                }
            }
        } catch (Exception var5) {
            System.out.println(var5.getMessage());
        }

        return array;
    }

    public ArrayList searchCustomerByID(int i, String cus_ID) throws RemoteException {
        ArrayList array = new ArrayList();

        try {
            Class.forName("com.mysql.jdbc.Driver");
            this.conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/System", "root", "@BakangMonei959115515");
            this.statement = this.conn.createStatement();
            String sql = "SELECT cus_ID, cusName, sex, department, occupation FROM tblCustomer WHERE cus_ID = '" + cus_ID + "'";
            this.statement.execute(sql);
            this.rs = this.statement.getResultSet();
            ResultSetMetaData var4 = this.rs.getMetaData();

            while(this.rs.next()) {
                array.add(this.rs.getObject(i + 1));
            }
        } catch (Exception var6) {
            var6.printStackTrace();
        }

        return array;
    }

    public ArrayList viewAllCustomers(int i) throws RemoteException {
        ArrayList array = new ArrayList();

        try {
            Class.forName("com.mysql.jdbc.Driver");
            this.conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/System", "root", "@BakangMonei959115515");
            this.statement = this.conn.createStatement();
            String sql = "SELECT cus_ID, cusName, sex, department, occupation FROM tblCustomer ORDER BY cus_ID DESC";
            this.statement.execute(sql);
            this.rs = this.statement.getResultSet();
            ResultSetMetaData var3 = this.rs.getMetaData();

            while(this.rs.next()) {
                array.add(this.rs.getObject(i + 1));
            }
        } catch (Exception var5) {
            var5.printStackTrace();
        }

        return array;
    }

    public static void main(String[] args) throws RemoteException {
        try {
            Registry r = LocateRegistry.createRegistry(3134);
            RMIServer s = new RMIServer();
            r.rebind("x", s);
            System.out.println("The Server is running!!!");
        } catch (RemoteException var3) {
            System.out.println(var3.toString());
        }

    }

    public int message(int x, int y) throws RemoteException {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public String registerStudent(String var1, String var2, String var3, String var4, String var5) throws RemoteException {
        return null;
    }

    @Override
    public String updateCustomer(String var1, String var2, String var3, String var4, String var5) throws RemoteException {
        return null;
    }
}
