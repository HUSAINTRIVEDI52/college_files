import javax.swing.*;
import java.awt.*;

public class DemoCombo extends JFrame {
	public DemoCombo() {
		setTitle("COMBOBOX DEMO");
		setSize(400, 200);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(new FlowLayout(FlowLayout.LEFT));

		// Month names
		String[] months = { "Jan", "Feb", "March", "April", "May", "June", "July",
				"Aug", "Sep", "Oct", "Nov", "Dec" };

		// Components
		JComboBox<String> monthCombo = new JComboBox<>(months);
		JLabel lbl1 = new JLabel("Nothing is Selected");
		JLabel lbl2 = new JLabel("Nothing is Selected");

		// 🔥 ActionListener using lambda
		monthCombo.addActionListener(e -> {
			String selectedItem = (String) monthCombo.getSelectedItem();
			int selectedIndex = monthCombo.getSelectedIndex();
			lbl1.setText(selectedItem + " is Selected");
			lbl2.setText("Item index is " + selectedIndex);
		});

		// Add components to frame
		add(monthCombo);
		add(lbl1);
		add(lbl2);

		setVisible(true);
	}

	public static void main(String[] args) {
		new DemoCombo();
	}
}
