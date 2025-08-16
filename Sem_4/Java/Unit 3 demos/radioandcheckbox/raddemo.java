import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class raddemo extends JFrame {
	Container con;

	raddemo() {
		setTitle("DEMO");
		setSize(500, 500);
		con = getContentPane();
		FlowLayout f1 = new FlowLayout(FlowLayout.LEFT);
		ImageIcon img = new ImageIcon("apl.jpeg");

		setLayout(f1);
		JRadioButton r1 = new JRadioButton();
		JRadioButton r2 = new JRadioButton("Female");
		r1.setText("Male");
		r1.setEnabled(true);
		JRadioButton r3 = new JRadioButton(img);
		JRadioButton r4 = new JRadioButton(img, true);
		JRadioButton r5 = new JRadioButton("Banana", false);
		JRadioButton r6 = new JRadioButton("Banana", img);
		JRadioButton r7 = new JRadioButton("Banana", img, false);
		con.add(r1);
		con.add(r2);
		con.add(r3);
		con.add(r4);

		con.add(r5);
		con.add(r6);
		con.add(r7);
		setVisible(true);

	}

	public static void main(String args[]) {
		new raddemo();
		// d1.setVisible(true);
	}

}
