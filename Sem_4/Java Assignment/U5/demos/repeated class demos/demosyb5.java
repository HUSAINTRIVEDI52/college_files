import java.sql.*;

class demosyb5
{
	public static void main(String args[])
	{
		try
		{
			
			
			Class.forName("com.mysql.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost/SYB?useUnicode=true&characterEncoding=UTF-8","root","Root@123");
			String str ="select * from emp";
			
			Statement stm = con.createStatement();
			ResultSet rs = stm.executeQuery(str);
			while(rs.next()){
				
				int id = rs.getInt("empid");
				String name = rs.getString("ename");
				int age = rs.getInt("age");
				//Display values
				System.out.println(" ");;
				System.out.print("ID: " + id);
				System.out.print(", Name: " + name);
				System.out.print("AGE: " + age);
			}
		
		}
		
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		
		}
	
	
	
	
	}


}
