import java.awt.*; 
 import java.awt.event.*; 
import javax.swing.*;
 class demo15 extends JFrame implements ItemListener
 { 
  	JRadioButton b1,b2,b3,b4,b5;
	ButtonGroup bg1,bg2;
	JLabel l1,l2,l3,l4,l5,l6;
	JCheckBox c1,c2,c3,c4;
 	
      demo15() 
         { 
	 setTitle("Toggle Button");	
           setLayout(new FlowLayout(FlowLayout.CENTER)); 
           setSize(600,600); 
           setVisible(true); 
	l1=new JLabel("Select Gender:");
	b1=new JRadioButton("Male");
       b2=new JRadioButton("Female");
	bg1=new ButtonGroup();
	bg1.add(b1);
	bg1.add(b2);
	l2=new JLabel("Select Fruit:");
	bg2=new ButtonGroup();
	b3=new JRadioButton("Apple");
       b4=new JRadioButton("Banana");
       b5=new JRadioButton("Kiwi");
	l3=new JLabel("selected Gender is:");
	l4=new JLabel("Selected Fruit is:");
	bg2.add(b3);
	bg2.add(b4);
	bg2.add(b5);
	l5=new JLabel("Select hobbies:");
	add(l1);
	add(b1);
	add(b2);
	add(l3);
	add(l2);
	add(b3);
	add(b4);
	add(b5);
	add(l4);
	add(l5);
	c1=new JCheckBox("TV");
	c2=new JCheckBox("BOOK");
	c3=new JCheckBox("VollyBall");
	c4=new JCheckBox("Hockey");
	add(c1);
	add(c2);
	add(c3);
	add(c4);
	l6=new JLabel("Hobbies:");
	add(l6);
	b1.addItemListener(this);
	b2.addItemListener(this);
	b3.addItemListener(this);
	b4.addItemListener(this);
	b5.addItemListener(this);
	c1.addItemListener(this);
	c2.addItemListener(this);
	c3.addItemListener(this);
	c4.addItemListener(this);
	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       
         } 
	public void itemStateChanged(ItemEvent ae)
	{
		if(b1.isSelected())
		{
		l3.setText("gender is:" + b1.getText());
		}
		else if(b2.isSelected())
		{
		l3.setText("Gender is: "+ b2.getText());
		}
		
		if(b3.isSelected())
		{
		l4.setText("Fruit is:" + b3.getText());
		}
		else if(b4.isSelected())
		{
		l4.setText("Fruit is: "+ b4.getText());
		}
		else if(b5.isSelected())
		{
		l4.setText("Fruit is: "+ b5.getText());
		}
		
		boolean a1,a2,a3,a4;
		a1=c1.isSelected();
		a2=c2.isSelected();
		a3=c3.isSelected();
		a4=c4.isSelected();
		if(a1 | a2 |a3 |a4)
		{
			String s="";
			if(a1)
			{
			s=s+","+c1.getText();
			}
			if(a2)
			{
			s=s+","+c2.getText();
			}
			if(a3)
			{
			s=s+","+c3.getText();
			}
			if(a4)
			{
			s=s+","+c4.getText();
			}
			l6.setText(s);
		

		}
		else
		{
		l6.setText("Nothing Selected");

		}









	}
              public static void main(String aa[]) 
              { 
                 new demo15(); 
              } 
  } 
