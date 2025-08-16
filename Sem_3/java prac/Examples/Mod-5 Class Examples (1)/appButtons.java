import java.applet.*;
import javax.swing.*;  
import java.awt.*;
import java.awt.event.*;
//applet: GUI : applet,panel,jframe,container,sub applet
public class appButtons extends Applet  implements ActionListener{
	JLabel lb;
	JButton b1,b2,b3;
	JTextField tf1,tf2;
	
	public void init(){
		lb=new JLabel("Welcome to Label");
		add(lb);
		b1=new JButton("+");
		add(b1);
		b2=new JButton("*");
		add(b2);
		b3=new JButton("-");
		add(b3);
		tf1=new JTextField("Enter no 1:",20);
		add(tf1);
		tf2=new JTextField("Enter no 2:",20);
		add(tf2);
		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
	}
	public void actionPerformed(ActionEvent e)
	{
		if(e.getSource()==b1)
		{
			//System.out.println("get button cliked");
			//lb.setText("Hello i am changed");	
			int no1=Integer.parseInt(tf1.getText());
			int no2=Integer.parseInt(tf2.getText());
			int ans=no1+no2;
			lb.setText(String.valueOf(ans));
									
		}
		else if(e.getSource()==b2)
		{
			int no1=Integer.parseInt(tf1.getText());
			int no2=Integer.parseInt(tf2.getText());
			int ans=no1*no2;
			lb.setText(String.valueOf(ans));
			
		}
		else
		{
			int no1=Integer.parseInt(tf1.getText());
			int no2=Integer.parseInt(tf2.getText());
			int ans=no1-no2;
			lb.setText(String.valueOf(ans));
			
			}
		
	}
}

/*
<applet code="appButtons.class" height="400" width="400">
</applet>
*/