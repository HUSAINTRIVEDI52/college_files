import java.sql.*;

class demosya
{
	public static void main(String args[]) 
	{
		try
		{
			Class.forName("com.mysql.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost/SYB?useUnicode=true&characterEncoding=UTF-8","root","Root@123");
		
			System.out.println("Connected");		
		String str="insert into emp values(1,'Zeel',18)";
		PreparedStatement qry=con.prepareStatement(str);				
		qry.executeUpdate();
		System.out.println("inserted");				
		con.close(); 		
					
		
					
					
					
					
					
					
					
					
					
					
					
					
					
					
					
		}
		catch(Exception e)
		{
		
			System.out.println("error is:" + e.getMessage());
		}
	
	}



}
