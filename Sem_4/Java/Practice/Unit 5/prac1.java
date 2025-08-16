import java.sql.*;

public class prac1 {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/world";
        String user = "root";
        String pass = "1111";
        try {

            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection(url, user, pass);
            String query = "CREATE TABLE DEMO(ID INT,NAME VARCHAR(20), ADDRESS VARCHAR(20));";
            PreparedStatement ps = con.prepareStatement(query);
            ps.executeUpdate();
            System.out.println("Insertion Successful");
            con.close();
            ps.close();

        } catch (ClassNotFoundException e) {
            System.out.println("Class not found " + e.getMessage());
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
}
