import java.sql.*;  
//DriverManager class
//Connection Interface :prepareStatement()
//PreparedStatement Interface  : executeUpdate() method 
class demo1_4
{  
	public static void main(String args[])
	{  
		try
		{  
		Class.forName("com.mysql.jdbc.Driver");  
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/java","java","java"); 
		String str ="select * from emp";
		Statement stmt = con.createStatement();
		ResultSet rs = stmt.executeQuery(str);
		while(rs.next()){
				int id = rs.getInt("id");
				String name = rs.getString("name");
				int age=rs.getInt("age");
				System.out.println("\n");
				System.out.print("ID: " + id);
				System.out.print(", Name: " + name);
				System.out.print("age: " + age);
				System.out.println("\n");
			}
				
				
		con.close();  
	
		}
		catch(Exception e)
		{ 
			System.out.println(e);
		}  
	}  
}  
