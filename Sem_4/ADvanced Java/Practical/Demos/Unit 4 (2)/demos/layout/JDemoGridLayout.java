import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class JDemoGridLayout extends JFrame
{
	JButton b1;
	JButton b2;
	JButton b3;
	JButton b4;
	JButton b5;
	Container con;

	JDemoGridLayout()
    	{
		setTitle("Grid Layout DEMO");

		con=getContentPane();
		con.setLayout(new GridLayout(3,2,15,5));
		//3 rows
		//2 cols
		//15 col space
		//5 row space
		b1 = new JButton("Button 1");
		b2 = new JButton("Button 2");
		b3 = new JButton("Button 3");
		b4 = new JButton("Button 4");
		b5 = new JButton("Button 5");
     	
      		con.add(b1);
      		con.add(b2);
      		con.add(b3);
      		con.add(b4);
      		con.add(b5);

		addWindowListener(new WindowAdapter()
		{
			public void windowClosing(WindowEvent we)
			{
				System.exit(0);
			}
		});
		setVisible(true);
		setSize(400,200);
    	}

	public static void main(String args[])
	{
		new JDemoGridLayout();
	}
}
