import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class demo2_1 {
    public static void main(String[] args) {
        String user = "root";
        String pass = "1111";
        String url = "jdbc:mysql://localhost:3306/world";
        String name = args[0];
        int id = Integer.parseInt(args[1]);
        int age = Integer.parseInt(args[2]);

        String query = "insert into world values(?,?,?)";

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            System.out.println("Driver connection successfull");

            Connection con = DriverManager.getConnection(url, user, pass);
            PreparedStatement sql = con.prepareStatement(query);
            sql.setString(1, name);
            sql.setInt(2, id);
            sql.setInt(3, age);
            System.out.println("Successfully inserted");

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        } catch (ClassNotFoundException e) {
            System.out.println(e.getMessage());
        }
    }
}
