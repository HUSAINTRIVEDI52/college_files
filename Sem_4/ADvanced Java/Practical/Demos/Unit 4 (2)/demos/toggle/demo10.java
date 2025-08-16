import java.awt.*; 
 import java.awt.event.*; 
import javax.swing.*;
 class demo10 extends JFrame implements ActionListener
 { 
 	JToggleButton b1,b2;
      demo10() 
         { 
	b1=new JToggleButton("Apple",true);
	ImageIcon i1=new ImageIcon("apl.jpeg");
	b2=new JToggleButton("Banana",i1);
	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	add(b1);
	add(b2);
	b1.addActionListener(this);
	b2.addActionListener(this);
           setTitle("Toggle Button"); 
           setLayout(new FlowLayout()); 
           setSize(400,400); 
           setVisible(true); 
         } 
	public void actionPerformed(ActionEvent ae)
	{
		String s=ae.getActionCommand();
		if(s=="Apple")
		{
		setTitle("Apple");
		}
		if(s=="Banana")
		{
		setTitle("Banana");
		}


	}







              public static void main(String aa[]) 
              { 
                 new demo10(); 
              } 
  } 
