/**
 * A class that teaches how to perform crud functions using JDBC.
 * @author Themba Moeng
 * @version 1.0
 * */

import java.sql.*;
import java.util.Scanner;
import java.util.ArrayList;

public class JDBCExample {

    Connection conn;
    Statement stmt ;
    PreparedStatement pstmt = null;

    /** constructor to load the Database drive
     * and connect to the database
     *
     */

    public JDBCExample()
    {

        try {
            Class.forName("com.mysql.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://remotemysql.com:3306/CMieISa8Ts", "CMieISa8Ts","aL5uFmBhsJ");
            System.out.println("connected to DB...");
        }
        catch (Exception err) {
            System.out.println( "Error: " + err );
        }
    }

    /**showMenu method displays the menu options available in the application
     *
     */

    public void showMenu()	 {

        System.out.println("************School Database ********************");
        System.out.println("1. add student");
        System.out.println("2. delete student");
        System.out.println("3. update student");
        System.out.println("4. list student");
        System.out.println("5. exit");
    }

    /** addStudent methods inserts a record into the student table
     *
     * @param first		firstname of student
     * @param last		lastname of student
     * @param email		email address of student
     * @exception  SQLException  if the query fails to execute
     */

    public int addStudent(int sid, String first, String last, String email)throws SQLException{

        String query = "insert into student(sid ,first, last, email) values(?,?, ?, ?)";

        pstmt = conn.prepareStatement(query); // create a statement
        pstmt.setInt(1,sid);
        pstmt.setString(2, first); // set input parameter 1
		
        pstmt.setString(3, last); // set input parameter 2
        pstmt.setString(4, email); // set input parameter 3
        int status= pstmt.executeUpdate(); // execute insert statement

        if(status >0)
            System.out.println("record inserted");
        else
            System.out.println("Insert failed");
        return status;


    }

    /** delete Student methods deletes a record from the student table
     *
     * @param first		firstname of student of student to be deleted
     * @param last		lastname of student of student to be deleted
     * @exception  SQLException  if the query fails to execute
     */

    public int deleteStudent(String first, String last)throws SQLException{

        String sql = "DELETE FROM student where first = ? and last =?";
        PreparedStatement prest = conn.prepareStatement(sql);
        prest.setString(1,first);
        prest.setString(2,last);
        int del = prest.executeUpdate();

        if(del >0)
            System.out.println("Number of deleted records: " + del);
        else
            System.out.println("delete failed");

        return del;

    }


    /** updateStudent method changes a record into the student table
     * @param first		sid of student to be updated
     * @param first		new firstname of student
     * @param last		 new lastname of student
     * @param email		 new email address of student
     * @exception  SQLException  if the query fails to execute
     */
    public int updateStudent(int sid, String first, String last,String email)throws SQLException{

        PreparedStatement pst = conn.prepareStatement("update student set first=? ,last=?, email=? where sid =?");

        pst.setString(1, first);
        pst.setString(2, last);
        pst.setString(3, email);
        pst.setInt(4, sid);

        int upd = pst.executeUpdate();

        if(upd >0)
            System.out.println("Number of updated records: " + upd);
        else
            System.out.println("update failed");
        return upd;

    }

    /** listStudents method list students from the student table
     * @exception  SQLException  if the query fails to execute
     */

    public  ArrayList<Student> listStudents()throws SQLException{
        stmt = conn.createStatement();

        String sql = "SELECT sid, first, last, email FROM student";
        ResultSet rs = stmt.executeQuery(sql);
        ArrayList<Student> list = new ArrayList<>();
        while(rs.next()){
            //Retrieve by column name
            int sid  = rs.getInt("sid");

            String first = rs.getString("first");
            String last = rs.getString("last");
            String email = rs.getString("email");

            //Display values
            System.out.print("SID: " + sid);
            System.out.print(", First: " + first);
            System.out.print(", Last: " + last);
            System.out.println(", Email: " + email);

            Student  st = new Student(sid, first, last, email);
            list.add(st);
        }
        rs.close();
        return list;

    }

    public static void main(String []args)throws SQLException{

        Scanner sc = new Scanner(System.in);
        String first,last, email;
        int option;
        JDBCExample dba = new JDBCExample();
        RegistrationForm rf = new RegistrationForm(dba);

        do{
            JDBCExample db = new JDBCExample();
            db.showMenu();
            System.out.println("enter your choice");
            option = sc.nextInt();

            if (option == 1 ){
                System.out.print("enter SID");
                int sid = sc.nextInt();
                System.out.print("enter first name");
                first = sc.next();
                System.out.print("enter last name");
                last = sc.next();
                System.out.print("enter email");
                email = sc.next();

                db.addStudent(sid ,first, last, email);

            }

            else if(option == 2){

                System.out.print("enter first name");
                first = sc.next();
                System.out.print("enter last name");
                last = sc.next();

                db.deleteStudent(first, last);

            }
            else if (option == 3){

                System.out.print("enter SID");
                int sid = sc.nextInt();
                System.out.print("enter first name");
                first = sc.next();
                System.out.print("enter last name");
                last = sc.next();
                System.out.print("enter email");
                email = sc.next();

                db.updateStudent(sid, first, last, email);

            }
            else if (option == 4){

                db.listStudents();
            }


        }while (option !=5);

    }
}