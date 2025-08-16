import java.sql.*;

class demosyb4
{
	public static void main(String args[])
	{
		try
		{
			int id=Integer.parseInt(args[0]);
			int age = Integer.parseInt(args[1]);
			
			Class.forName("com.mysql.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost/SYB?useUnicode=true&characterEncoding=UTF-8","root","Root@123");
			String str ="update emp set age = ? where empid = ?";
			PreparedStatement stm=con.prepareStatement(str);
			stm.setInt(1,age);		
			stm.setInt(2,id);
			stm.executeUpdate();
			System.out.println("Updated");
		
		}
		
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		
		}
	
	
	
	
	}


}
