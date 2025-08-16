import java.sql.*;  
//DriverManager class
//Connection Interface :prepareStatement()
//PreparedStatement Interface  : executeUpdate() method 
class demo1_2
{  
	public static void main(String args[])
	{  
		int id=Integer.parseInt(args[0]);
		String name=args[1];
		int age=Integer.parseInt(args[2]);
		try
		{  
		
		Class.forName("com.mysql.jdbc.Driver");  
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/java","root","1111"); 
		//String str ="INSERT INTO emp VALUES(15,'erica',4)";
		String str ="insert into emp values("+ id + ",'" + name + "'," + age+ ")";
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
