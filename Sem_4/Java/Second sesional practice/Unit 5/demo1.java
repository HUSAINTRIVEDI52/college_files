import java.lang.Thread.State;
import java.sql.*;

public class demo1 {

    public static void main(String[] args) {
        String user = "root";
        String pass = "1111";
        String url = "jdbc:mysql://localhost:3306/world";
        try {

            Class.forName("com.mysql.cj.jdbc.Driver");
            System.out.println("Driver Connection Successfull");
            Connection con = DriverManager.getConnection(url, user, pass);
            Statement smt = con.createStatement();
            ResultSet rs = smt.executeQuery("desc country;");
        } catch (ClassNotFoundException e) {
            System.out.println("The error is " + e.getMessage());
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
}