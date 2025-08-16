import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


class demo4 extends JFrame implements ActionListener
{
	JTextField t1;
	JTextField t2;
	JLabel l3;
	JButton b;
	JButton b2;
	demo4(String s)
	{
	super(s);
	setSize(200,200);
	setVisible(true);
	FlowLayout f1=new FlowLayout(FlowLayout.CENTER);
   	setLayout(f1);
	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	JLabel l1=new JLabel("ENter No1:");
	JLabel l2=new JLabel("ENter No2:");
	t1=new JTextField(10);
	t2=new JTextField(10);
	b=new JButton("ADD");
	b2=new JButton("SUB");
	l3=new JLabel("ANSWER");
	b.addActionListener(this);
	b2.addActionListener(this);
	add(l1);
	add(t1);
	add(l2);
	add(t2);
	add(b);
	add(b2);
	add(l3);
	}
	public void actionPerformed(ActionEvent ae)
	{
	int n1,n2,n3;
	n1=Integer.parseInt(t1.getText());
	n2=Integer.parseInt(t2.getText());
	String s=ae.getActionCommand();
	if(s=="ADD")
	{
			n3=n1+n2;
	l3.setText("Ans:"+ n3);
	}
	else
	{
			n3=n1-n2;
	l3.setText("Ans:"+ n3);
	}
	}
	
	public static void main(String args[])
	{
	new demo4("Demo4");

	}

}
