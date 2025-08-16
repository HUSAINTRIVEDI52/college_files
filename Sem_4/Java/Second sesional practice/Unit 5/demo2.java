import java.sql.*;

public class demo2 {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/world";
        String pass = "1111";
        String user = "root";
        String name = args[0];
        int id = Integer.parseInt(args[1]);
        int age = Integer.parseInt(args[2]);
        String query = "Insert into demo1 values(" + name + "," + id + ",+" + age + ")";

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            System.out.println("Connection Successfull of driver");
            Connection con = DriverManager.getConnection(url, user, pass);
            PreparedStatement pst = con.prepareStatement(query);
            pst.executeQuery();

            System.out.println("Database connectivity successfull");
        } catch (ClassNotFoundException e) {
            System.out.println(e.getMessage());
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
    }
}
