import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Main {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/testdb"; 
        String user = "root"; 
        String password = "1111"; 

        try {
            // Load MySQL driver    
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Connect to database
            Connection conn = DriverManager.getConnection(url, user, password);

            // Create a sample query
            Statement stmt = conn.createStatement();
            stmt.executeUpdate("CREATE TABLE IF NOT EXISTS sample (id INT PRIMARY KEY, name VARCHAR(50))");

            System.out.println("Connected Successfully and Table Created!");

            conn.close();
        } catch (ClassNotFoundException e) {
            System.out.println("MySQL Driver not found! " + e.getMessage());
        } catch (SQLException e) {
            System.out.println("Database connection error! " + e.getMessage());
        }
    }
}
