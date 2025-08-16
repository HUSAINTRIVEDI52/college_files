 import java.awt.*; 
 import java.awt.event.*; 
import javax.swing.*;
 class demolist extends JFrame implements ActionListener
 { 
  
 	JList l1;
	JScrollPane p1;
	JButton b1;
	JLabel lbl;
	Container con;
      demolist() 
         { 
           setTitle("JList"); 
           setLayout(new FlowLayout()); 
           setSize(400,400); 
           setVisible(true); 
		con=getContentPane();
		String s[]={"Jan","Feb","March","April","May","June","July","August","sep","oct","nov","dec"};
	l1=new JList(s);
	l1.setVisibleRowCount(4);
	l1.setSelectedIndex(3);
	p1=new JScrollPane(l1);
	l1.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
	b1=new JButton("Click");
	b1.addActionListener(this);
	lbl=new JLabel("Selected item:");
	//con.add(l1);
	con.add(p1);
	con.add(b1);
	con.add(lbl);
	con.setLayout(new FlowLayout(FlowLayout.CENTER));
	
         }
	public void actionPerformed(ActionEvent ae)
	{
		if(l1.getSelectedIndex()!=-1)
		{
			lbl.setText(l1.getSelectedValue().toString());
		}

	} 
              public static void main(String aa[]) 
              { 
                 new demolist(); 
              } 
  } 
