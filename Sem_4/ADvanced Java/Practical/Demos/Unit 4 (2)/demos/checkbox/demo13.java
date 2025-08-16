import java.awt.*; 
 import java.awt.event.*; 
import javax.swing.*;
 class demo13 extends JFrame implements ActionListener
 { 
 	JCheckBox b1,b2,b3,b11,b12;
	JLabel l1;
      demo13() 
         { 
	ImageIcon i1=new ImageIcon("apl.jpeg");
	b1=new JCheckBox("Apple",i1,true);
	b2=new JCheckBox("Banana");
	b3=new JCheckBox("Kiwi");
	b11=new JCheckBox("Mango");
	b12=new JCheckBox("Orange");
	l1=new JLabel("Fruit:");
	setLayout(new FlowLayout()); 
	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	add(b1);
	add(b2);
	add(b3);
	add(l1);
	add(b11);
	add(b12);
	b11.setEnabled(true);
	b1.addActionListener(this);
	b2.addActionListener(this);
	b3.addActionListener(this);
	b11.addActionListener(this);
	b12.addActionListener(this);
        setTitle("Toggle Button"); 
        setSize(400,400); 
         setVisible(true); 
         } 
	public void actionPerformed(ActionEvent ae)
	{
		String s=ae.getActionCommand();
		System.out.println(s);

		
	}
              public static void main(String aa[]) 
              { 
                 new demo13(); 
              } 
  } 
