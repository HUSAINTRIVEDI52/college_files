import java.awt.*; 
 import java.awt.event.*; 
import javax.swing.*;
 class d1 extends JFrame implements ActionListener
 { 
  
 JTextField t3;
JButton b1;
      d1() 
         { 
           setTitle("Toggle Button"); 
           setLayout(new FlowLayout()); 
           setSize(400,400); 
           setVisible(true); 
	JTextField t1=new JTextField();
	t1.setColumns(20);
	
	JTextField t2=new JTextField(15);
	t2.setText(String.valueOf(t1.getColumns()));
	t3=new JTextField("Enter Value");
	JTextField t4=new JTextField("Hello",10);
	t4.setEditable(false);
	b1=new JButton("click");
	add(t1);add(t2);add(t3);add(t4);add(b1);
	b1.addActionListener(this);
         } 
	public void actionPerformed(ActionEvent ae)
	{
		System.out.println(t3.getSelectedText());
	}
              public static void main(String aa[]) 
              { 
                 new d1(); 
              } 
  } 
