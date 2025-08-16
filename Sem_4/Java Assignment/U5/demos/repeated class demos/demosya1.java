import java.sql.*;

class demosya1
{
	public static void main(String args[]) 
	{
		try
		{
			int id,age;
			String name;
			id=Integer.parseInt(args[0]);
			name=args[1];
			age=Integer.parseInt(args[2]);
			Class.forName("com.mysql.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost/SYB?useUnicode=true&characterEncoding=UTF-8","root","Root@123");
		
			System.out.println("Connected");		
		//String str="insert into emp values(1,'Zeel',18)";
		String str="insert into emp values("+ id +",'" + name + "'," + age +")";
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
