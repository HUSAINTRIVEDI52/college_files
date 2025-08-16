import java.sql.*;  
//DriverManager class
//Connection Interface :prepareStatement()
//PreparedStatement Interface  : executeUpdate() method 
// setInt() setFloat()
class demo1_3
{  
	public static void main(String args[])
	{  
		int id=Integer.parseInt(args[0]);
		String name=args[1];
		int age=Integer.parseInt(args[2]);
		try
		{  
		Class.forName("com.mysql.jdbc.Driver");  
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/java","java","java"); 
		//String str ="INSERT INTO emp VALUES(15,'erica',4)";
		String str ="INSERT INTO emp VALUES(?,?,?)";
		PreparedStatement sql = con.prepareStatement(str);		
		sql.setInt(1,id);
		sql.setString(2,name);
		sql.setInt(3,age);
		sql.executeUpdate();
		System.out.println("inserted");				
		con.close();  
	
		}
		catch(Exception e)
		{ 
			System.out.println(e);
		}  
	}  
}  
