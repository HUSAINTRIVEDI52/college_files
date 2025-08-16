/* THIS JAVA PROGRAMME WILL DRAW THE RECTANGEL, CIRCLE AND ROUNDED RECTANGEL ON BUTTON CLICK*/
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class Jbtn_Shape1 extends JFrame implements ActionListener
{
	JButton b1,b2,b3;
	JLabel lbl1;
	
	Container con;
	Jbtn_Shape1(String s)
	{
		super(s);
		setSize(500,500);
		con = getContentPane();
		con.setLayout(new FlowLayout(FlowLayout.LEFT));
		
		
		b1= new JButton("Circle");
		b1.addActionListener(this);
		con.add(b1);

		b2= new JButton("Rectangle");
		b2.addActionListener(this);
		con.add(b2);

		b3= new JButton("Rounded Rectangle");
		b3.addActionListener(this);
		con.add(b3);
		
		lbl1 = new JLabel("This shape is ");
		con.add(lbl1);
		
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
		Graphics g=getGraphics(); 
		
		if(e.getActionCommand()=="Circle")
		{
			lbl1.setText("This shape is Circle");
			g.drawOval(50,150,100,100); 
			
		}
		else if(e.getActionCommand()=="Rectangle")
		{			
			lbl1.setText("This shape is Rectangle");
			g.drawRect(50,260,150,100); 
		}

		else if(e.getActionCommand()=="Rounded Rectangle")
		{			
			lbl1.setText("This shape is RoundedRectangle");
			g.drawRoundRect(50,370,150,100,20,20); 
		}
		
        }  	

}
class Jbtn_Shape
{
	public static void main(String args[])
	{
		Jbtn_Shape1 fb = new Jbtn_Shape1("Create Shape");
		fb.setVisible(true);
	}

}//end of class JFrame2
