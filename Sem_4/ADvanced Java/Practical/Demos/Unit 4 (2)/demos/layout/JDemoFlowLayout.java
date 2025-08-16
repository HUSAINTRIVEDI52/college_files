import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class JDemoFlowLayout extends JFrame implements ActionListener
{
	JButton lb;
	JButton rb,one,two,three;
	Container con;
	FlowLayout layout;
      
	JDemoFlowLayout()
    	{
		setTitle("FlowLayout DEMO");
		layout = new FlowLayout(FlowLayout.LEFT,20,20);
		con=getContentPane();
		con.setLayout(layout);
		lb = new JButton("L Button");
		rb = new JButton("R Button");
		one = new JButton("ONE");
		two = new JButton("TWO");
		three = new JButton("THREE");

     		
      		con.add(lb);
     		con.add(rb);
		con.add(one);
		con.add(two);
		con.add(three);
      		lb.addActionListener(this);
      		rb.addActionListener(this);
		one.addActionListener(this);
		
		addWindowListener(new WindowAdapter()
		{
			public void windowClosing(WindowEvent we)
			{
				System.exit(0);
			}
		});
		setVisible(true);
		setSize(400,200);
    	}
    	public void actionPerformed(ActionEvent event)
    	{
      		Object source = event.getSource();
      		if(source == lb)
         		 layout.setAlignment(FlowLayout.LEFT);
      		else if(source == rb)
         		 layout.setAlignment(FlowLayout.RIGHT);
		else if(source == one)
         		 layout.setAlignment(FlowLayout.CENTER);
      		con.invalidate();
      		con.validate();
    	}
		
	public static void main(String args[])
	{
		new JDemoFlowLayout();
	}
}








