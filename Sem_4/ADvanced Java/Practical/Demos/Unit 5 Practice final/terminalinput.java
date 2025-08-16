import java.sql.*;

public class terminalinput {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/world";
        String user = "root";
        String pass = "1111";
        int id = Integer.parseInt(args[0]);
        String name = args[1];
        String email = args[2];
        String query = "insert into stu values(" + id + ",'" + name + "','" + email + "')";
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection(url, user, pass);
            PreparedStatement st = con.prepareStatement(query);
            st.executeUpdate();
            System.out.println("Updated successfully");
            st.close();
            con.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
