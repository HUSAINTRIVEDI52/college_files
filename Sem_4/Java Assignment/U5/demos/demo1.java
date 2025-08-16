import java.sql.*;  
//DriverManager class
//Connection Interface :prepareStatement()
//PreparedStatement Interface  : executeUpdate() method 
//Statement Interface
class demo1
{  
	public static void main(String args[])
	{  
		try
		{  
		Class.forName("com.mysql.jdbc.Driver");  
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/java","java","java"); 
		String str ="insert into emp values(17,'Raj',20)";
		PreparedStatement qry= con.prepareStatement(str);
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
