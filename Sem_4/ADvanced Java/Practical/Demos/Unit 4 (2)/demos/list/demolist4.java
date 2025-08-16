 import java.awt.*; 
 import java.awt.event.*; 
import javax.swing.*;
 class demolist4 extends JFrame implements ActionListener
 { 
  	Container con;
	JList l1;
	JButton b1,b2;
	JTextField t1;
 	DefaultListModel dm;
      demolist4() 
         { 
           setTitle("JList"); 
           setLayout(new FlowLayout(FlowLayout.CENTER)); 
           setSize(400,400); 
           setVisible(true); 
	    con=getContentPane();
	dm=new DefaultListModel();
	dm.addElement("Abc");
	dm.addElement("BCA");
	dm.addElement("CBA");
	dm.addElement("DBCA");
	dm.addElement("EHR");
	l1=new JList(dm);
	l1.setVisibleRowCount(3);
	JScrollPane sp=new JScrollPane(l1);
	t1=new JTextField("Enter",15);
	b1=new JButton("ADD");
	b2=new JButton("Remove");
	b1.addActionListener(this);
	b2.addActionListener(this);
	con.add(t1);
	con.add(b1);
	con.add(b2);
	con.add(sp);
         }
	public void actionPerformed(ActionEvent ae)
	{
		if(ae.getSource()==b1)
		{
			dm.addElement(t1.getText());
		}
		else if(ae.getSource()==b2)
		{
			dm.remove(l1.getSelectedIndex());
		}
		
	} 
              public static void main(String aa[]) 
              { 
                 new demolist4(); 
              } 
  } 
