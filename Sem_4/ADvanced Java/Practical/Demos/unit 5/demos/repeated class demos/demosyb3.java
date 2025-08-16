import java.sql.*;

class demosyb3
{
	public static void main(String args[])
	{
		try
		{
			int id=Integer.parseInt(args[0]);
			
			Class.forName("com.mysql.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost/SYB?useUnicode=true&characterEncoding=UTF-8","root","Root@123");
			String str="delete from emp where empid=" + id ;
			PreparedStatement stm=con.prepareStatement(str);
			stm.executeUpdate();
			System.out.println("deleted");
		
		}
		
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		
		}
	
	
	
	
	}


}
