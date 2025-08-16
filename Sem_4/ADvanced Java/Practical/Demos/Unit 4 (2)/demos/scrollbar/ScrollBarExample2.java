import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

class ScrollBarExample2 extends JFrame implements AdjustmentListener
{  
	JLabel l1;
	JScrollBar s1;
	Container con;
	ScrollBarExample2()
	{  
		setTitle("Scroll Bar DEMO");
		con=getContentPane();
		con.setLayout(new FlowLayout(FlowLayout.LEFT));
    		l1 = new JLabel();   
		
		//l1.setBounds(100, 100, 100, 30);
    		s1=new JScrollBar(JScrollBar.HORIZONTAL);  
		s1.setMinimum(0);
 		s1.setMaximum(60);
  		s1.setValue(0);
		s1.addAdjustmentListener(this); 
    		con.add(s1);
		con.add(l1); 
		setVisible(true);
		setSize(400,400);
	}  
	public void adjustmentValueChanged(AdjustmentEvent e)
	{  
		String s="";
		int no=s1.getValue();
		for(int i=1;i<=10;i++)
		{
		s+=no + "*" + i + "=" + (no*i) + "\n";
		}
		l1.setText(s);
    	}

	public static void main(String args[])  
	{  
   		new ScrollBarExample2();  
	}
}  
