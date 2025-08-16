import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class JListExample_2 extends JFrame implements ActionListener
{
	JList month_1;
	Container con;
	JScrollPane mn_pan;
	JButton b1;
	JLabel lbl1;
	
	public JListExample_2()
	{
		setTitle("List DEMO");
		setVisible(true);
		setSize(400,400);
	
		con=getContentPane();
		con.setLayout(new FlowLayout(FlowLayout.CENTER));
	
		DefaultListModel dm=new DefaultListModel();
		dm.addElement("January");
		dm.addElement("February");
		dm.addElement("March");
		dm.addElement("April");
		dm.addElement("May");
		dm.addElement("June");
		dm.addElement("July");
		dm.addElement("August");
		dm.addElement("September");
		dm.addElement("October");
		dm.addElement("November");
		dm.addElement("December");
		month_1 =new JList(dm);
		
		JScrollPane mn_pan = new JScrollPane(month_1);
		b1= new JButton("Show");
		b1.addActionListener(this);
		
		lbl1 = new JLabel("Nothing Display");
		
		
		month_1.setVisibleRowCount(4);
		month_1.setSelectedIndex(1);
		
		// multipale items can be selected with continuty
		//month_1.setSelectionMode(ListSelectionModel.SINGLE_INTERVAL_SELECTION);
		
		// multipale items can be selected with interval
		month_1.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		
		con.add(mn_pan);
		con.add(b1);
		con.add(lbl1);
		//month_model = month_1.getModel();


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
		if(e.getActionCommand()=="Show")
		{
			String data = "";
            		
			if (month_1.getSelectedIndex() != -1) 
			{ 
				 data += " Months selected: ";
               			for(Object mnth:month_1.getSelectedValues())
				{
                  		data += mnth + " ";
				}
			}
			lbl1.setText(data);
		}   
	} 
	public static void main(String[] args)
	{
              new JListExample_2();
         }
   
}
