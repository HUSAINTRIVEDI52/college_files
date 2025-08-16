import java.awt.*; 
 import java.awt.event.*; 
import javax.swing.*;
 class demo11 extends JFrame implements ItemListener
 { 
 	JRadioButton b1,b2,b3;
	JRadioButton b11,b12;
	JLabel l1,l2;
	ButtonGroup bg1;
	ButtonGroup bg2;
      demo11() 
         { 
	b1=new JRadioButton("Apple");
	b2=new JRadioButton("Banana");
	b3=new JRadioButton("Kiwi");
	l1=new JLabel("Fruit:");
	bg1=new ButtonGroup();
	bg1.add(b1);
	bg1.add(b2);
	bg1.add(b3);
	b11=new JRadioButton("Male");
	b12=new JRadioButton("Female");
	l2=new JLabel("Gender:");
	bg2=new ButtonGroup();
	bg2.add(b11);
	bg2.add(b12);
	setLayout(new FlowLayout()); 
	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	add(b1);
	add(b2);
	add(b3);
	add(l1);
	add(b11);
	add(b12);
	add(l2);
	b11.setEnabled(true);
	b1.addItemListener(this);
	b2.addItemListener(this);
	b3.addItemListener(this);
	b11.addItemListener(this);
	b12.addItemListener(this);
        setTitle("Toggle Button"); 
        setSize(400,400); 
         setVisible(true); 
         } 
	public void itemStateChanged(ItemEvent ae)
	{
		//Component s=(Component)ae.getSource();
		//System.out.println(s.getName());
if(b1.isSelected())
		{
		l1.setText(b1.getText());
		}
		else if(b2.isSelected())
		{
		l1.setText(b2.getText());
		}
		else if(b3.isSelected())
		{
		l1.setText(b3.getText());
		}

		if(b11.isSelected())
		{
		l2.setText(b11.getText());
		}
		else if(b12.isSelected())
		{
		l2.setText(b12.getText());
		}
		
		
	}
              public static void main(String aa[]) 
              { 
                 new demo11(); 
              } 
  } 
