import java.applet.*;
import javax.swing.*;  
import java.awt.*;
import java.awt.event.*;
//applet: GUI : applet,panel,jframe,container,sub applet
public class appButtons2 extends Applet  implements ActionListener{
	JLabel lb;
	JButton b1;
	//dropdown
	JComboBox cb;
	
	
	public void init(){
		lb=new JLabel("Welcome to Label");
		add(lb);
		b1=new JButton("Get");
		add(b1);
		String lang[]={"--Select--","Dart","Flutter","Go","Java"};
		cb=new JComboBox(lang);
		add(cb);
		
		b1.addActionListener(this);
	}
	public void actionPerformed(ActionEvent e)
	{
		if(e.getSource()==b1)
		{
			if(cb.getSelectedIndex()==0)
			{
				lb.setText("Select Proper Lang");
			}
			else{
String data="Selected Language is :"+cb.getItemAt(cb.getSelectedIndex());
lb.setText(data);	
				}		
		}
		
		else
		{
			
		}
		
	}
}

/*
<applet code="appButtons2.class" height="400" width="400">
</applet>
*/