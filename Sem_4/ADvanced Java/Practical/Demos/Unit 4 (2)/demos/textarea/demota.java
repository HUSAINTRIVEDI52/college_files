import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

class demota extends JFrame implements ActionListener
{
	JTextArea t1,t2,t3;
	JButton b1,b2;
	JLabel lbl1;
	
	demota(String s)
	{
		super(s);
		setVisible(true);	
		setSize(250,200);
	
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE) ;	
		setLayout(new FlowLayout(FlowLayout.LEFT));
	
		Font f=new Font("Arial",Font.BOLD, 15);
		t1=new JTextArea();
		t1.setColumns(30);
		t1.setRows(20);
		t1.setFont(f);
		t1.setText("hello");
		t1.append("  hi");
		t1.insert("abc",3);
		t1.setEditable(false);
		System.out.println(t1.getLineCount());
	//	t2=new JTextArea("gls",5,30);
		
		//t3=new JTextArea(5,30);
	
	
		b1=new JButton("Whole Text");
		b1.addActionListener(this);

		b2=new JButton("Selected Text");
		b2.addActionListener(this);

		lbl1 = new JLabel("Nothing Display");
	
	
		add(t1);
		//add(t2);	
		add(b1);
		add(b2);
		add(lbl1);	
	}	
	
	public void actionPerformed(ActionEvent e)
	{
		if(e.getActionCommand()=="Whole Text")
		{
			lbl1.setText(t1.getText());
		}
		else if(e.getActionCommand()=="Selected Text")
		{
			lbl1.setText(t1.getSelectedText() + t1.getSelectionStart() + " " + t1.getSelectionEnd());
		}
	}
	public static void main(String args[])
	{
		new demota("DEMO");
	
	}
}
