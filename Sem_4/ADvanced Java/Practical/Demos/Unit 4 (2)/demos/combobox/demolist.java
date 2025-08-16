import java.awt.*; 
import java.awt.event.*; 
import javax.swing.*;
class demo extends JFrame
 { 
  JComboBox c1;
demo() 
	{ 
           setTitle("ComboBox"); 
           setLayout(new FlowLayout()); 
           setSize(400,400); 
           setVisible(true); 
	   c1=new JComboBox();
		c1.addItem("Jan");
		c1.addItem("Feb");
		c1.addItem("March");
		c1.addItem("April");
	String s[]={"May","June","July"};
	for(int i=0;i<s.length;i++)
	{
		c1.addItem(s[i]);
	}
		add(c1);
	
         } 
              public static void main(String aa[]) 
              { 
                 new demo(); 
              } 
  } 
