import java.sql.*;

class demosyb2
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
			String str="insert into emp values(" + id + ",'" + name + "'," + age +  ")";
			//str="insert into emp values(1,'vidhi',22)";
			PreparedStatement stm=con.prepareStatement(str);
			stm.executeUpdate();
			System.out.println("inserted");
		
		}
		
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		
		}
	
	
	
	
	}


}
