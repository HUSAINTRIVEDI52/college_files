import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


class checkboxdemo extends JFrame implements ItemListener
{
	Container con;
	JCheckBox c1,c2,c3,c4,c5;
	JLabel l1;
	checkboxdemo()
	{
		setTitle("DEMO");
		setSize(500,500);
		con=getContentPane();
		FlowLayout f1=new FlowLayout(FlowLayout.LEFT);
		
		l1=new JLabel();
		setLayout(f1);
		c1=new JCheckBox("FootBall");
		c2=new JCheckBox("TT");
		c3=new JCheckBox("RAFTING");
		c4=new JCheckBox("Paramotoring");
		c5=new JCheckBox("Skating");
		c1.addItemListener(this);
		c2.addItemListener(this);
		c3.addItemListener(this);
		c4.addItemListener(this);
		c5.addItemListener(this);
		con.add(c1);
		con.add(c2);
		con.add(c3);
		con.add(c4);
		con.add(c5);
		con.add(l1);
	
	}
	
	public void itemStateChanged(ItemEvent ae)
	{
		String s=" ";
		if(c1.isSelected())
		{
		s=s+" "+c1.getText();
		l1.setText(s);
		}
		if(c2.isSelected())
		{
		s=s+" "+c2.getText();
		l1.setText(s);
		}
		if(c3.isSelected())
		{
		s=s+" "+c3.getText();
		l1.setText(s);
		}
		if(c4.isSelected())
		{
		s=s+" "+c4.getText();
		l1.setText(s);
		}
		if(c5.isSelected())
		{
		s=s+" "+c5.getText();
		l1.setText(s);
		}
	
	}
	
	public static void main(String args[])
	{
	checkboxdemo d1=new checkboxdemo();
	d1.setVisible(true);
	}


}

