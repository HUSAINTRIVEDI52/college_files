import java.sql.*;  
//DriverManager class
//Connection Interface :prepareStatement()
//PreparedStatement Interface  : executeUpdate() method 
class demo2
{  
	public static void main(String args[])
	{  
		try
		{  
		Class.forName("com.mysql.jdbc.Driver");  
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/java","java","java"); 
		String str ="update emp set age=6 where id=19";
		PreparedStatement qry= con.prepareStatement(str);
		qry.executeUpdate();
		System.out.println("updated");				
		con.close();  
	
		}
		catch(Exception e)
		{ 
			System.out.println(e);
		}  
	}  
}  
