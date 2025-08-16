import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

class ScrollBarExample extends JFrame implements AdjustmentListener
{  
	JLabel label, label1;
	JScrollBar s1,s2;
	Container con;

	ScrollBarExample()
	{  
		setTitle("Scroll Bar DEMO");
		con=getContentPane();
		//con.setLayout(new FlowLayout(FlowLayout.LEFT));
    		label = new JLabel();  
		label1 = new JLabel();          
    		s1=new JScrollBar(JScrollBar.HORIZONTAL);  
    		s1.setBounds(30,80,200,20); 
		s1.addAdjustmentListener(this); 
		label.setBounds(30,120,300,20);
		s2=new JScrollBar(JScrollBar.VERTICAL);  
    		s2.setBounds(150,200,30,100); 
		s2.addAdjustmentListener(this); 
    		con.add(s1); 
		con.add(s2); 
		con.add(label);  
		con.add(label1);  
		setVisible(true);
		setSize(400,400);
	}  
	public void adjustmentValueChanged(AdjustmentEvent e)
	{  
		label.setText("Horizontal Scrollbar value is:"+ s1.getValue());
		label1.setText("Vertical Scrollbar value is:"+ s2.getValue());  
    	}

	public static void main(String args[])  
	{  
   		new ScrollBarExample();  
	}
}  
