import java.sql.*;
import java.sql.DriverManager;
import java.sql.Connection;

class Database_con 
{
	public static void main(String args[])
	{
		try
		{
			System.out.println("hello");
			     			
			Class.forName("com.mysql.jdbc.Driver");  

			Connection con=DriverManager.getConnection("jdbc:mysql://localhost/java?useUnicode=true&characterEncoding=UTF-8","root","Root@123"); 


//Java is database name
//"root" is username
//Root@123 is password


			System.out.print("Database is connected !");			

			System.out.print("Database is connected !");
			con.close();
		}
		catch(Exception e)
		{
			System.out.print("Do not connect to DB - Error:"+e);	
		}
	}
}

//String connectionURL = "jdbc:mysql://localhost:3306/sonoo?verifyServerCertificate=false&useSSL=true";
//con = DriverManager.getConnection(connectionURL, "localhost", "lenovo@123");   
