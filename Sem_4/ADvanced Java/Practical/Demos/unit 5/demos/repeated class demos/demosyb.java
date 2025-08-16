import java.sql.*;

class demosyb
{
	public static void main(String args[])
	{
		try
		{
			Class.forName("com.mysql.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost/SYB?useUnicode=true&characterEncoding=UTF-8","root","Root@123");
			
		
		
		}
		
		catch(Exception e)
		{
			System.out.println("Error");
		
		}
	
	
	
	
	}


}
