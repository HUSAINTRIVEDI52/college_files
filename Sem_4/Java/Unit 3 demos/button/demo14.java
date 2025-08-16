import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

class demo14 extends JFrame implements ActionListener
{
	
	JButton b1,b2;
	ImageIcon img1,img2;
	JLabel l1;
	demo14(String s)
	{
	super(s);
	setVisible(true);
	setSize(400,400);
	FlowLayout f1=new FlowLayout(FlowLayout.LEFT);
	setLayout(f1);
setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	b1=new JButton("apple");
	b2=new JButton("banana");
	img1=new ImageIcon("apl.jpeg");
	img2=new ImageIcon("banana.jpeg");
	l1=new JLabel("HELLO");
	add(b1);
	add(b2);
	add(l1);
	b1.addActionListener(this);
	b2.addActionListener(this);
	}
	public void actionPerformed(ActionEvent ae)
	{
		String s=ae.getActionCommand();
		if(s=="apple")
		{
		l1.setText("Apple");
		b1.setIcon(img1);
		}
		if(s=="banana")
		{
		l1.setText("Banana");
		b2.setIcon(img2);
		}
		
	}


	public static void main(String args[])
	{
	new demo14("DEMO");
		
	
	}
	



}
