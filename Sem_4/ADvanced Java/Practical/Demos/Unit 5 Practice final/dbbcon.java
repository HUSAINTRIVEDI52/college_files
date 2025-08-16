import java.sql.*;

public class dbbcon {

    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/world";
        String user = "root";
        String pass = "1111";
        String createtable = "Create table stu(id int ,name varchar(50),email varchar(50))";

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection(url, user, pass);
            System.out.println("Driver connection successfull");
            Statement st = con.createStatement();
            st.execute(createtable);
            System.out.println("Table created successfuly");
            st.close();
            con.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}