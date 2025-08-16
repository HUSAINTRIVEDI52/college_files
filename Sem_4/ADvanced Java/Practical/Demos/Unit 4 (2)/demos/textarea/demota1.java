import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

class demota1 extends JFrame implements ActionListener
{
	JTextArea t1,t2,t3;
	JButton b1,b2;
	
	demota1(String s)
	{
		super(s);
		setVisible(true);	
		setSize(250,200);
	
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE) ;	
		setLayout(new FlowLayout(FlowLayout.LEFT));
	
		Font f=new Font("Arial",Font.BOLD, 15);
		//t1=new JTextArea();
		//t1.setColumns(30);
		//t1.setRows(20);
		//add(t1);
		t2=new JTextArea(20,30);
		add(t2);
		b1=new JButton("All");
		add(b1);
		b2=new JButton("Selected");
		add(b2);
		b1.addActionListener(this);
		b2.addActionListener(this);
		t3=new JTextArea("Hello",20,30);
		t3.setFont(f);
		JScrollPane p1=new JScrollPane(t3);
		add(p1);
		
	}	
	public void actionPerformed(ActionEvent ae)
	{	
		if(ae.getSource()==b1)
		{
		t3.setText(t2.getText());
		}
		else if(ae.getSource()==b2)
		{
		t3.append(t2.getSelectedText());
		}
	}
	
	public static void main(String args[])
	{
		new demota1("DEMO");
	
	}
}
