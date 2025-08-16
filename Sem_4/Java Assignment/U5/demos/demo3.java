import java.sql.*;  
//DriverManager class
//Connection Interface :prepareStatement()
//PreparedStatement Interface  : executeUpdate() method 
class demo3
{  
	public static void main(String args[])
	{  
		int id=Integer.parseInt(args[0]);
		try
		{  
		Class.forName("com.mysql.jdbc.Driver");  
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/java","java","java"); 
		String str ="delete from emp where id=?";
		PreparedStatement qry= con.prepareStatement(str);
		qry.setInt(1,id);
		qry.executeUpdate();
		System.out.println("inserted");				
		con.close();  
	
		}
		catch(Exception e)
		{ 
			System.out.println(e);
		}  
	}  
}  
