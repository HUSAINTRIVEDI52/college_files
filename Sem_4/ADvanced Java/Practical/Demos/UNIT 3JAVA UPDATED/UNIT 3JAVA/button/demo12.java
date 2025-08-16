import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

class demo12 extends JFrame implements ActionListener
{
	
	JButton b1;
	JLabel l1;
	demo12(String s)
	{
	super(s);
	setVisible(true);
	setSize(400,400);
	FlowLayout f1=new FlowLayout(FlowLayout.LEFT);
	setLayout(f1);
setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	b1=new JButton("CLICK");
	l1=new JLabel("HELLO");
	add(b1);
	add(l1);
	b1.addActionListener(this);
	}
	public void actionPerformed(ActionEvent ae)
	{
		l1.setText("Good Morning");
	}


	public static void main(String args[])
	{
	new demo12("DEMO");
		
	
	}
	



}
