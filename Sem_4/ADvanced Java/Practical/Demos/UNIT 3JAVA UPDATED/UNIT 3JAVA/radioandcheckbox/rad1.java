import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class rad1 extends JFrame  {
	Container con;
	JRadioButton r1, r2;
	JLabel l1;

	rad1() {
		setTitle("DEMO");
		setSize(500, 500);
		con = getContentPane();
		FlowLayout f1 = new FlowLayout(FlowLayout.LEFT);
		ImageIcon img = new ImageIcon("apl.jpeg");
		ImageIcon img2 = new ImageIcon("banana.jpeg");
		setLayout(f1);
		r1 = new JRadioButton("APPLE", img);
		r2 = new JRadioButton("BANANA", img2);
		con.add(r1);
		con.add(r2);
		l1 = new JLabel("NOTHING SELECTED");
		ButtonGroup bg1 = new ButtonGroup();
		bg1.add(r1);
		bg1.add(r2);
		con.add(l1);
		r1.setEnabled(true);
		r1.addActionListener(_ -> {
			if (r1.isSelected()) {
				l1.setText(r1.getText());
			}
		});
		r2.addActionListener(_ -> {
			if (r2.isSelected()) {
				l1.setText(r2.getText());
			}
		});

	}

	public void itemStateChanged(ItemEvent ae) {
	}

	public static void main(String args[]) {
		rad1 r1 = new rad1();
		r1.setVisible(true);
	} 

}