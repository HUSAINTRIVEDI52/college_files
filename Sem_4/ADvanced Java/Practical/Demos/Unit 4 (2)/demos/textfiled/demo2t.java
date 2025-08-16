import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

class demo2t extends JFrame implements ActionListener
{  
      TextField tf1,tf2,tf3;  
      Button b1;  
	demo2t()
	{  
		setLayout(new FlowLayout(FlowLayout.LEFT));  
		setVisible(true);  
		setSize(400,400);
	
		tf1=new TextField(30);  
		tf2=new TextField(30);  
		tf3=new TextField(30);  
		tf3.setEditable(false);   
	
		b1=new Button("+");  
		b1.addActionListener(this);  
	  
		add(tf1);add(tf2);add(tf3);add(b1);

		addWindowListener(new WindowAdapter()
		{
			public void windowClosing(WindowEvent we)
			{
				System.exit(0);
			}
		});
		            
        } 
     
	public void actionPerformed(ActionEvent e)
	{  
          tf3.setText(tf1.getText() + " " + tf2.getText());  
        }  
	public static void main(String[] args)
	{  
        	new demo2t();  
    	}  
}  
