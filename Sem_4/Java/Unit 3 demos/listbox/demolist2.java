import javax.swing.*;
import java.awt.event.*;
import java.awt.*;


class demolist2 extends JFrame implements ActionListener

{
		JList l1;
		JLabel lbl;
		JButton btn;
		JScrollPane sp;
		Container con;
		demolist2()
		{
			setTitle("DMEO");
			FlowLayout fl=new FlowLayout(FlowLayout.CENTER);
			setLayout(fl);
			setVisible(true);
			setSize(400,400);
			con=getContentPane();
			String s[]={"SUN","MON","TUE","WED","THUR","FRI","SAT"};
			l1=new JList(s);
			sp=new JScrollPane(l1);
			btn=new JButton("CLICK ME");
			lbl=new JLabel("NOTHING");
			con.add(sp);
			con.add(btn);
			con.add(lbl);
			l1.setVisibleRowCount(3);
			l1.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
			btn.addActionListener(this);

		}
		
		public void actionPerformed(ActionEvent ae)
		{
			String data=" ";
			if(l1.getSelectedIndex()!=-1)
			{
			for(Object s:l1.getSelectedValues())
				{
				data=data+ s + " ";
				
				}
				lbl.setText(data);
			}
		
		}
		
		
		
		
		
		
		
		
		
		
		




	public static void main(String args[])
	{
		new demolist2();
	
	
	
	
	
	
	}


}


