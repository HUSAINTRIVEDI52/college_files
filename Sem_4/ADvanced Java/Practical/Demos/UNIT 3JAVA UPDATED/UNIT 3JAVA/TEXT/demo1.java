import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class demo1 extends JFrame implements ActionListener {
	JTextField t1, t2;
	Container con;
	JLabel l1;
	JButton b1;
	JPasswordField p1;

	demo1() {
		setTitle("DEMO");
		setSize(500, 500);
		FlowLayout f1 = new FlowLayout(FlowLayout.CENTER);
		setLayout(f1);
		con = getContentPane();
		t1 = new JTextField("HOME", 10);
		t2 = new JTextField("GLS");
		t2.setColumns(30);
		t1.setText("ENTER name:");
		t2.setEditable(false);
		String s = t2.getText();
		int x = t2.getColumns();
		l1 = new JLabel();
		b1 = new JButton("CLICK");
		p1 = new JPasswordField(10); 
		p1.setEchoChar('#');
		
		con.add(t1);
		con.add(t2);
		con.add(l1);
		con.add(b1);
		con.add(p1);
		b1.addActionListener(this);
		
		setVisible(true);
	}

	public void actionPerformed(ActionEvent ae) {
		String selected = t1.getSelectedText();
		if (selected != null && !selected.isEmpty()) {
			l1.setText("Selected: " + selected);
		} else {
			l1.setText("No text selected.");
		}
		}

	public static void main(String args[]) {

		new demo1();

	}
}
