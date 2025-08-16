import java.sql.*;

public class dbbccon {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/world";
        String user = "root";
        String pass = "1111";

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            System.out.println("Driver connection successfuly established");
            Connection con = DriverManager.getConnection(url, user, pass);
            PreparedStatement ps = con
                    .prepareStatement("insert into stu values(100,'Husain','Husaintd56789@gmail.com')");
            ps.executeUpdate();
            System.out.println("Inserted successfully");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
