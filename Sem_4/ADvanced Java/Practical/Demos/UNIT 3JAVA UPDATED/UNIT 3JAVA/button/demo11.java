import javax.swing.*;
import java.awt.*;

class demo11
{
	public static void main(String args[])
	{
		JFrame f1=new JFrame("Frame1");
		f1.setTitle("My Frame");
		f1.setVisible(true);
		f1.setSize(100,100);
		f1.setLocation(100,500);
		JButton b1=new JButton("CLICK");
		b1.setText("CLICK ME");
		Container con=f1.getContentPane();
		FlowLayout fl1=new FlowLayout(FlowLayout.RIGHT);
		con.setLayout(fl1);
		ImageIcon img = new ImageIcon("apl.jpeg");
		JButton b2=new JButton("APPLE",img);
		JButton b3=new JButton("SUB");
		con.add(b1);
		con.add(b2);
		con.add(b3);
		f1. setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
		
		
		
		
		
		
		
		
		
	}
	

}













