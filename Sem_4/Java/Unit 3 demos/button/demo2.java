import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class demo2 extends JFrame implements ActionListener
{
	JLabel l1;
	JButton b1,b2;
	demo2()
	{
	setSize(250,250);
	setVisible(true);
	setTitle("Calculator");
	FlowLayout f1=new FlowLayout(FlowLayout.CENTER);
   	setLayout(f1);
	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	l1=new JLabel("I M LABEL");
	b1=new JButton("APPLE");
	b2=new JButton("BANANA");
	b1.addActionListener(this);
	b2.addActionListener(this);
	add(b1);
	add(b2);
	add(l1);
	}
	public void actionPerformed(ActionEvent ae)
	{	
		String s=ae.getActionCommand();
		if(s=="APPLE")
		{
		
		
		l1.setText("Apple");
		}
		if(s=="BANANA")
		{
		
	
		l1.setText("BANANA");
		}

	}
	public static void main(String args[])
	{
	new demo2();
	}

}
