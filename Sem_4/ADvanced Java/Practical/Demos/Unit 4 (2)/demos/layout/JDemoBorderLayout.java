import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class JDemoBorderLayout extends JFrame
{
	Container con;
     	JButton nb = new JButton("North Button");
	JButton sb = new JButton("South Button");
    	JButton eb = new JButton("East Button");
   	JButton wb = new JButton("West Button");
    	JButton cb = new JButton("Center Button");
    
	JDemoBorderLayout()
    	{
     		setTitle("BorderLayout DEMO");

		con=getContentPane();
		con.setLayout(new BorderLayout());
	
		con.add(nb, BorderLayout.NORTH);
		
		con.add(sb, BorderLayout.SOUTH);
		con.add(eb, BorderLayout.EAST);
	      	con.add(wb, BorderLayout.WEST);
		con.add(cb, BorderLayout.CENTER);
			
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
		new JDemoBorderLayout();
	}
}
