import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

class ScrollBarExample1 extends JFrame implements AdjustmentListener
{  
	
	JScrollBar s1;
	Container con;
	JTextArea textarea;
	ScrollBarExample1()
	{  
		setTitle("Scroll Bar DEMO");
		con=getContentPane();
		con.setLayout(new FlowLayout(FlowLayout.LEFT));
		textarea= new JTextArea (" ");  
		textarea.setRows(10);
		textarea.setColumns(10);
		//l1.setBounds(100, 100, 100, 30);
    		s1=new JScrollBar(JScrollBar.HORIZONTAL);  
		s1.setMinimum(1);
 		s1.setMaximum(60);
  		s1.setValue(25);
		s1.addAdjustmentListener(this); 
    		con.add(s1);
		con.add(textarea); 
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
		textarea.setText(s);
    	}

	public static void main(String args[])  
	{  
   		new ScrollBarExample1();  
	}
}  
