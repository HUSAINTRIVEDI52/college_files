import java.awt.*; 
 import java.awt.event.*; 
import javax.swing.*;
 class demo14 extends JFrame implements ItemListener
 { 
  	JRadioButton b1,b2,b3,b4,b5;
	ButtonGroup bg1,bg2;
	JLabel l1,l2,l3;
	JCheckBox c1,c2,c3,c4;
 
      demo14() 
         { 
	   b1=new JRadioButton();
	     b1=new JRadioButton("Male");
	  b1=new JRadioButton("Male",true);
	ImageIcon i1=new ImageIcon("apl.jpeg");
	  b1=new JRadioButton(i1);
	  b1=new JRadioButton("Apple",i1);
	  b1=new JRadioButton(i1,true);
	  b1=new JRadioButton("Apple",i1,true);
	   setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
           setTitle("Toggle Button"); 
		
           setLayout(new FlowLayout()); 
           setSize(400,400); 
           setVisible(true); 
         } 
              public static void main(String aa[]) 
              { 
                 new demo14(); 
              } 
  } 
