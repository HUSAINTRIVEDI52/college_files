import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

class demo1t extends JFrame implements ActionListener
{
	TextField tf1,tf2,tf3;  
        Button b1,b2;  
	demo1t()
	{  
		setLayout(new FlowLayout(FlowLayout.CENTER));  
		setVisible(true);  
		setSize(400,400);
	
		tf1=new TextField(10);  
		
		tf2=new TextField(10);  
		tf3=new TextField(10);  
		tf3.setText("Answer");
		//tf4=new TextField("Hello",40);  
		tf3.setEditable(false);   
	
		b1=new Button("+");  
		b2=new Button("-");  
	
		b1.addActionListener(this);  
		b2.addActionListener(this);  
		
		add(tf1);add(tf2);add(tf3);add(b1);add(b2);  
		tf3.setColumns(5);
		System.out.println(tf1.getColumns());
            	
	       } 
	public void actionPerformed(ActionEvent e) 
	{  
            String s1=tf1.getText();  
            String s2=tf2.getText();  
            int a=Integer.parseInt(s1);  
            int b=Integer.parseInt(s2);  
            int c=0;  
            if(e.getSource()==b1)
	   {  
                c=a+b;  
            }
	    else if(e.getSource()==b2)
            {  
                c=a-b;  
            }  
            String result=String.valueOf(c);  
            tf3.setText(result);  
        }  
	public static void main(String args[])
	{
		new demo1t();
	}
}



