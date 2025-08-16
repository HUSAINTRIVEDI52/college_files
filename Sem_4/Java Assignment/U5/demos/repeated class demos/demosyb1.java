import java.sql.*;

class demosyb1
{
	public static void main(String args[])
	{
		try
		{
			Class.forName("com.mysql.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost/SYB?useUnicode=true&characterEncoding=UTF-8","root","Root@123");
			String str="insert into emp values(2,'Priyank',15)";
			PreparedStatement stm=con.prepareStatement(str);
			stm.executeUpdate();
			System.out.println("inserted");
		
		}
		
		catch(Exception e)
		{
			System.out.println("Error");
		
		}
	
	
	
	
	}


}
