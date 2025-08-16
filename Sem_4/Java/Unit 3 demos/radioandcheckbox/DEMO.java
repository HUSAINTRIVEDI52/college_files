import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


class DEMO extends JFrame implements ActionListener
{
	Container con;
	JLabel l1,l2;
	JTextField t1;
	JRadioButton r1,r2;
	JCheckBox c1,c2,c3,c4,c5;
	JRadioButton r3,r4,r5;
	JButton btn;
	
	DEMO()
	{
		setTitle("DEMO");
		setSize(500,500);
		con=getContentPane();
		FlowLayout f1=new FlowLayout(FlowLayout.CENTER);
		
		
		setLayout(f1);
		l1=new JLabel("Enter name:");
		t1=new JTextField(20);
		r1=new JRadioButton("Male");
		r2=new JRadioButton("Female");
		ButtonGroup bg=new ButtonGroup();
		bg.add(r1);
		bg.add(r2);
		c1=new JCheckBox("FootBall");
		c2=new JCheckBox("TT");
		c3=new JCheckBox("RAFTING");
		c4=new JCheckBox("Paramotoring");
		c5=new JCheckBox("Skating");
		r3=new JRadioButton("BCA");
		r4=new JRadioButton("BCOM");
		r5=new JRadioButton("BBA");
		ButtonGroup bg1=new ButtonGroup();
		bg1.add(r3);
		bg1.add(r4);
		bg1.add(r5);
		btn=new JButton("SUBMIT");
		con.add(l1);
		con.add(t1);
		con.add(r1);
		con.add(r2);
		con.add(c1);
		con.add(c2);
		con.add(c3);
	
		con.add(c4);
		con.add(c5);
		
		con.add(r3);
		con.add(r4);
		con.add(r5);
		con.add(btn);
		l2=new JLabel();
		con.add(l2);
		btn.addActionListener(this);
		
		
		
	
	}
	
	public void actionPerformed(ActionEvent ae)
	{
		String s;
		s=t1.getText();
		if(r1.isSelected())
		{
		s=s+" "+r1.getText();
		}
		else 
		{
		s=s+" "+r2.getText();
		}
		
		if(c1.isSelected())
		{
		s =s+" "+ c1.getText();
		}
		if(c2.isSelected())
		{
		s =s+" " +c2.getText();
		}
		if(c3.isSelected())
		{
		s =s+" "+ c3.getText();
		}
		if(c4.isSelected())
		{
		s =s+" "+ c4.getText();
		}
		if(c5.isSelected())
		{
		s =s+" "+ c5.getText();
		}
		
		if(r3.isSelected())
		{
		s =s+" "+ r3.getText();
		}
		else if(r4.isSelected())
		{
		s =s+" "+ r4.getText();
		}
		else if(r5.isSelected())
		{
		s =s+" "+ r5.getText();
		}
		l2.setText(s);
	
	}
	
	public static void main(String args[])
	{
	DEMO d1=new DEMO();
	d1.setVisible(true);
	}


}

