import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.naming.spi.DirStateFactory.Result;

public class demo2_2 {
    public static void main(String[] args) {
        String user = "root";
        String pass = "1111";
        String url = "jdbc:mysql://localhost:3306/world";

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            System.out.println("Driver Connection Successfull");

            Connection con = DriverManager.getConnection(url, user, pass);
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery("select * from demo1;");
            while (rs.next()) {

                String name = rs.getString("name");
                int id = rs.getInt("id");
                int age = rs.getInt("age");
                System.out.println("\n");
                System.out.println("Name: " + name);
                System.out.println("\n");
                System.out.println("Age: " + age);
                System.out.println("\n");
                System.out.println("Id:" + id);
            }

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

}
