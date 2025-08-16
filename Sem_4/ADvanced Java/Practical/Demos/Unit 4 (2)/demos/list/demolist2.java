 import java.awt.*; 
 import java.awt.event.*; 
import javax.swing.*;
 class demolist2 extends JFrame implements ActionListener
 { 
  
 	JList l1;
	JScrollPane p1;
	JButton b1;
	JTextField t1;
	Container con;
	DefaultListModel dm;
      demolist2() 
         { 
           setTitle("JList"); 
           setLayout(new FlowLayout(FlowLayout.CENTER)); 
           setSize(400,400); 
           setVisible(true); 
	    con=getContentPane();
	dm=new DefaultListModel();
		
		//String s[]={"a","b","c","d","e","f"};
	//	l1=new JList(s);
		dm.addElement("January");
		dm.addElement("Feb");
		dm.addElement("March");
		dm.addElement("April");
		dm.addElement("MAy");
		l1=new JList(dm);
		l1.setVisibleRowCount(4);
		//l1.setSelectedIndex(3);
		p1=new JScrollPane(l1);
		l1.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		t1=new JTextField("Enter text",20);
	b1=new JButton("Click");
	b1.addActionListener(this);
	
	con.add(t1);
	con.add(b1);
	con.add(p1);
	con.setLayout(new FlowLayout(FlowLayout.CENTER));
	
         }
	public void actionPerformed(ActionEvent ae)
	{
			
			dm.addElement(t1.getText());
		//	l1.setModel(dm);
		

	} 
              public static void main(String aa[]) 
              { 
                 new demolist2(); 
              } 
  } 
