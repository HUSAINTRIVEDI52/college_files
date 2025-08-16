
import java.sql.*;
import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

 
class Demo extends JFrame implements ActionListener
{
	Container con;
	JLabel j1,j2;
	JTextField text1,text2,text3;
	JButton b1;
		
	Demo()
	{
		setVisible(true);
		setSize(500,100);
		con = getContentPane();
		
		con.setLayout(new FlowLayout(FlowLayout.LEFT));
					
		j1=new JLabel("Enter Employee ID");
		text1 = new JTextField(03);
		text2 = new JTextField(20);
		text3 = new JTextField(03);
		b1=new JButton("Insert Data");
		j2 = new JLabel("");
		
		con.add(j1);
		con.add(text1);
		con.add(text2);
		con.add(text3);
		con.add(b1);
		con.add(j2);
					
		b1.addActionListener(this);
		
	}
		
	public void actionPerformed(ActionEvent e)
	{
		try{
				
			Class.forName("com.mysql.jdbc.Driver");
				
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost/SYB?useUnicode=true&characterEncoding=UTF-8","root","Root@123");
				
				int id = Integer.parseInt(text1.getText());
				int age=Integer.parseInt(text3.getText());
				String nm=text2.getText();
				String str ="insert into emp values(?,?,?)";
				PreparedStatement sql = con.prepareStatement(str);
				sql.setInt(1,id);	
				sql.setString(2,nm);	
				sql.setInt(3,age);	
				sql.executeUpdate();
				
				
				System.out.println("Data Inserted");

				j2.setText("Employee data inserted with empid :" + id);
				
				con.close();  
		}
		catch(Exception p)
		{
			System.out.println(p);
		}
	}
}

public class  demosyb7
{
	public static void main(String[] args) 
	{
		Demo d;
		d=new Demo();
	}
}	
	


























