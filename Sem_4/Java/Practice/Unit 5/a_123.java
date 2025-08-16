import java.sql.*;

public class a_123 {

    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/world";
        String user = "root";
        String pass = "1111";
        String query = ("select * from city");
        try {

            Class.forName("com.mysql.cj.jdbc.Driver");
            System.out.println("Driver connection successfull");

            Connection con = DriverManager.getConnection(url, user, pass);
            System.out.println("Database connected successfull");
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery(query);
            while (rs.next()) {
                int id = rs.getInt("ID");
                String Name = rs.getString("Name");
                String CountryCode = rs.getString("CountryCode");
                String District = rs.getString("District");
                int Population = rs.getInt("Population");
                System.out.println(
                        "-------------------------------------------------------------------------------------");
                System.out.println("ID: " + id);
                System.out.println("Name: " + Name);
                System.out.println("CountryCode: " + CountryCode);
                System.out.println("Population: " + Population);
            }
            rs.close();
            stmt.close();
            con.close();
            System.out.println("Connection closed successfully");

        } catch (ClassNotFoundException e) {
            System.out.println("Error" + e.getMessage());
        } catch (SQLException e) {
            System.out.println("SQL EXCEPTION " + e.getMessage());
        }
    }
}