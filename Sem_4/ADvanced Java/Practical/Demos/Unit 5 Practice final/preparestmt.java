import java.sql.*;

public class preparestmt {
    public static void main(String[] args) {

        String url = "jdbc:mysql://localhost:3306/world";
        String user = "root";
        String pass = "1111";

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection(url, user, pass);
            PreparedStatement ps = con.prepareStatement("insert into stu(id,name,email)Values(?,?,?)");

            ps.setInt(1, 3);
            ps.setString(2, "Husain");
            ps.setString(3, "husaintd522@gmail.com");
            int rows = ps.executeUpdate();
            System.out.println(rows + "Rows updated successfully");
            ps.close();
            con.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
