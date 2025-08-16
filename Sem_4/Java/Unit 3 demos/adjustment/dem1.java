import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

class dem1 extends JFrame implements AdjustmentListener {
	JScrollBar s1;
	// s2;
	JLabel l1, l2;
	Container con;

	dem1() {
		setTitle("DEMO");
		setSize(500, 500);
		setVisible(true);
		con = getContentPane();
		s1 = new JScrollBar(JScrollBar.HORIZONTAL);
		s1.setMaximum(100);
		s1.setMinimum(1);
		// s2=new JScrollBar(JScrollBar.VERTICAL);
		s1.setBounds(30, 20, 100, 20);
		l1 = new JLabel();

		l1.setBounds(30, 170, 30, 10);
		con.add(s1);
		con.add(l1);
		s1.addAdjustmentListener(this);

		// s2.addAdjustmentListener(this);

		
	}

	public void adjustmentValueChanged(AdjustmentEvent ae) {
		l1.setText("Value is:" + s1.getValue());
	}

	public static void main(String args[]) {

		new dem1();

	}

}
