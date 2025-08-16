import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class demolist3 extends JFrame implements ActionListener
{
	JList month_1;
	Container con;
	JScrollPane mn_pan;
	JButton b1;
	JTextField tf;
	DefaultListModel dm;
	
	public demolist3()
	{
		setTitle("List DEMO");
		setVisible(true);
		setSize(400,400);
	
		con=getContentPane();
		con.setLayout(new FlowLayout(FlowLayout.CENTER));
	
		dm=new DefaultListModel();
		dm.addElement("January");
		dm.addElement("February");
		dm.addElement("March");
		dm.addElement("April");
		dm.addElement("May");
		
		month_1 =new JList(dm);
		
		JScrollPane mn_pan = new JScrollPane(month_1);
		b1= new JButton("Show");
		b1.addActionListener(this);
		
		tf=new JTextField(20);
		
		
		month_1.setVisibleRowCount(4);
		month_1.setSelectedIndex(1);
		
		
		month_1.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		
		con.add(mn_pan);
		con.add(b1);
		con.add(tf);
		

		
	}
 
	public void actionPerformed(ActionEvent e)
	{  
		   		dm.addElement(tf.getText());
		   		month_1.setModel(dm);
	} 
	public static void main(String[] args)
	{
              new demolist3();
         }
   
}
