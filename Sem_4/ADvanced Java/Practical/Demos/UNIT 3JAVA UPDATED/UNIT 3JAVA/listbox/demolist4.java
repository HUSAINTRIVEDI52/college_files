import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class demolist4 extends JFrame implements ActionListener
{
	JList l1;
	JButton btn;
	JButton btn2;
	JButton btn3;
	JTextField tf;
	DefaultListModel dm;;
	Container con;
	demolist4()
	{
		setSize(400,400);
		setTitle("DEMO");
		setVisible(true);
		setLayout(new FlowLayout(FlowLayout.CENTER));
		con=getContentPane();
		tf=new JTextField(15);
		btn=new JButton("ADD");
		btn2=new JButton("REMOVE");
		btn3=new JButton("REMOVE ALL");
		dm=new DefaultListModel();
		dm.addElement("JAN");
		dm.addElement("FEB");
		dm.addElement("MARCH");
		dm.addElement("APRIL");
		l1=new JList(dm);
		JScrollPane sp=new JScrollPane(l1);
		con.add(tf);
		con.add(btn);
		con.add(btn2);
		con.add(btn3);
		con.add(sp);
		l1.setVisibleRowCount(3);
		btn.addActionListener(this);
		btn2.addActionListener(this);
		btn3.addActionListener(this);
	}
	
	public void actionPerformed(ActionEvent ae)
	{
		String s=ae.getActionCommand();
		if(s=="ADD")
		{
		dm.addElement(tf.getText());
		l1.setModel(dm);
		}
		if (s=="REMOVE")
		{
		dm.remove(l1.getSelectedIndex());
		l1.setModel(dm);
		
		}
		if(s=="REMOVE ALL")
		{
		dm.clear();
		
		
		}
	}
	
	public static void main(String args[])
	{
	new demolist4();
	}

}
