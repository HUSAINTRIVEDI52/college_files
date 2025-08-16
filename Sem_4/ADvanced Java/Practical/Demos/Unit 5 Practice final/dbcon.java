import java.sql.*;

public class dbcon {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/world";
        String user = "root";
        String pass = "1111";

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection(url, user, pass);
            String query = "select * from stu;";
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(query);
            while (rs.next()) {
                int id = rs.getInt("id");
                String name = rs.getString("name");
                String email = rs.getString("email");
                System.out.println("Id " + id);
                System.out.println("\nName:" + name);
                System.out.println("\nEmail" + email);
                System.out.println("\n");

            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
