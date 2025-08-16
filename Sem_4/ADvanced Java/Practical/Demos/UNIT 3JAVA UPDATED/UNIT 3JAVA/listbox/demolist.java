import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

class demolist extends JFrame implements ActionListener

{
	JList l1;
	JLabel lbl;
	JButton btn;
	JScrollPane sp;
	Container con;

	demolist() {
		setTitle("DMEO");
		FlowLayout fl = new FlowLayout(FlowLayout.CENTER);
		setLayout(fl);
		setVisible(true);
		setSize(400, 400);
		con = getContentPane();
		String s[] = { "SUN", "MON", "TUE", "WED", "THUR", "FRI", "SAT" };
		l1 = new JList(s);
		sp = new JScrollPane(l1);
		btn = new JButton("CLICK ME");
		lbl = new JLabel("NOTHING");
		con.add(sp);
		con.add(btn);
		con.add(lbl);
		l1.setVisibleRowCount(3);
		l1.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		btn.addActionListener(this);

	}

	public void actionPerformed(ActionEvent ae) {
		lbl.setText("Selected Item :" + l1.getSelectedValue());

	}

	public static void main(String args[]) {
		new demolist();

	}

}
