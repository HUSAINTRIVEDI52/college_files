import java.sql.*;

public class prac_2 {
    public static void main(String[] args) {

        String url = "jdbc:mysql://localhost:3306/world";
        String user = "root";
        String pass = "1111";
        String query = "INSERT INTO demo VALUES(?,?,?);";
        int id = Integer.parseInt(args[0]);
        String Name = args[1];
        String Address = args[2];
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection(url, user, pass);
            PreparedStatement ps = con.prepareStatement(query);
            ps.setInt(1, id);
            ps.setString(2, Name);
            ps.setString(3, Address);
            ps.executeUpdate();
            System.out.println("Successfully inserted");
            con.close();
            ps.close();
            System.out.println("Closed ");
        }

        catch (ClassNotFoundException e) {
            System.out.println(e.getMessage());
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
}