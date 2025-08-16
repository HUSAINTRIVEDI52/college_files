import java.awt.*; 
 import java.awt.event.*; 
import javax.swing.*;
 class demo12 extends JFrame implements ActionListener
 { 
 	JRadioButton b1,b2,b3;
	JRadioButton b11,b12;
	JLabel l1,l2;
	ButtonGroup bg1;
	ButtonGroup bg2;
      demo12() 
         { 
	ImageIcon i1=new ImageIcon("apl.jpeg");
	b1=new JRadioButton("Apple",i1,true);
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
                 new demo12(); 
              } 
  } 
