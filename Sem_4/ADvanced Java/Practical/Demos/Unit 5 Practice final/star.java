import java.sql.*;

public class star {
    public static void main(String[] args) {

        String url = "jdbc:mysql://localhost:3306/world";
        String user = "root";
        String pass = "1111";
        String qry = "select * from stu";

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection(url, user, pass);
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(qry);
            while (rs.next()) {
                String name = rs.getString("name");
                String email = rs.getString("email");
                int id = rs.getInt("id");
                System.out.println("\n");
                System.out.println("Email: " + email);
                System.out.println("\nname: " + name);
                System.out.println("Id: " + id);
                System.out.println("\n");
            }

        } catch (Exception e) {
            e.printStackTrace();

        }
    }
}
