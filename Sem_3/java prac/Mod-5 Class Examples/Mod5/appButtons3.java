import java.applet.*;
import javax.swing.*;  
// import java.awt.*;
import java.awt.event.*;
//applet: GUI : applet,panel,jframe,container,sub applet
public class appButtons3 extends Applet  implements ActionListener{
	JLabel lb;
	JButton b1;
	JCheckBox cb1,cb2;
	JRadioButton rb1;
	
	public void init(){
		lb=new JLabel("Welcome to Label");
		add(lb);
		b1=new JButton("Get");
		add(b1);
		cb1=new JCheckBox("Reading");
		add(cb1);
		cb2=new JCheckBox("Writing");
		add(cb2);
		rb1=new JRadioButton("Java");
		add(rb1);
		b1.addActionListener(this);
	}
	public void actionPerformed(ActionEvent e)
	{
		if(e.getSource()==b1)
		{
			if(cb1.isSelected())
			{
				System.out.println("Hello");
			}
			
			lb.setText(cb1.getText());						
		}
		
		else
		{
			
		}
		
	}
}

/*
<applet code="appButtons3.class" height="400" width="400">
</applet>
*/