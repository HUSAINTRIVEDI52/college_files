import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

class demo extends JFrame implements AdjustmentListener
{
	Container con;
	JScrollBar s1;
	JLabel l1;
	demo()
	{
		setTitle("Demo");
		setSize(400,400);
		setVisible(true);
		//FlowLayout l1=new FlowLayout(FlowLayout.CENTER);
		//setLayout(l1);
		con=getContentPane();
		s1=new JScrollBar(JScrollBar.HORIZONTAL);
		con.add(s1);;
		s1.setBounds(30,80,100,20); 
		l1=new JLabel();
		//l1.setBounds(100,300,100,40);
		con.add(l1);
		s1.addAdjustmentListener(this);
		
	}

	public void adjustmentValueChanged(AdjustmentEvent ae)
	{
		l1.setText("Value is:" + s1.getValue());
	
	
	}


	public static void main(String args[])
	{
	new demo();
	}

}
