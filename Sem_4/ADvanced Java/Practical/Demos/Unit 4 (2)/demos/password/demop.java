import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

class demop extends JFrame implements ActionListener
{
	JPasswordField t1;
	TextField tf1;
	JButton b1;
	
	demop(String s)
	{
		super(s);
		setVisible(true);	
		setSize(250,200);
	
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE) ;	
		setLayout(new FlowLayout(FlowLayout.LEFT));
	
		t1=new JPasswordField();
		t1.setColumns(23);
		tf1=new TextField(30); 
	
		t1.setEchoChar('$');
		System.out.println(t1.getEchoChar());
		System.out.println(t1.echoCharIsSet());
		b1=new JButton("CLICK ME");
		b1.addActionListener(this);
	
		add(t1);	
		add(tf1);
		add(b1);
	}	
	
	public void actionPerformed(ActionEvent e)
	{
		tf1.setText(t1.getText());
	}
	public static void main(String args[])
	{
		new demop("DEMO");
	}
}
