import java.awt.*;
import javax.swing.*;

public class ComboBoxDemo extends JFrame {
	JComboBox<String> comboBox;
	JTextField indexField;
	JLabel selectedLabel;
	JButton removeByIndexBtn, removeSelectedBtn, removeAllBtn;

	public ComboBoxDemo() {
		setTitle("ComboBox with Lambda");
		setLayout(new FlowLayout());
		setSize(300, 250);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		// ComboBox with items
		comboBox = new JComboBox<>(new String[] { "Jan", "Feb", "March", "April", "May", "June", "July" });
		comboBox.setEditable(true);

		// Label to show selection
		selectedLabel = new JLabel("Selected item:");

		// TextField for index input
		indexField = new JTextField(5);

		// Buttons
		removeByIndexBtn = new JButton("Remove by Index");
		removeSelectedBtn = new JButton("Remove Selected");
		removeAllBtn = new JButton("Remove All");

		// 🔥 Lambda for comboBox selection
		comboBox.addActionListener(e -> {
			selectedLabel.setText("Selected: " + comboBox.getSelectedItem());
		});

		// 🔥 Lambda for Remove by Index button
		removeByIndexBtn.addActionListener(e -> {
			try {
				int index = Integer.parseInt(indexField.getText());
				comboBox.removeItemAt(index);
			} catch (Exception ex) {
				JOptionPane.showMessageDialog(this, "Invalid index");
			}
		});

		// 🔥 Lambda for Remove Selected button
		removeSelectedBtn.addActionListener(e -> {
			comboBox.removeItem(comboBox.getSelectedItem());
		});

		// 🔥 Lambda for Remove All button
		removeAllBtn.addActionListener(e -> {
			comboBox.removeAllItems();
		});

		// Add components to frame
		add(comboBox);
		add(selectedLabel);
		add(new JLabel("Index:"));
		add(indexField);
		add(removeByIndexBtn);
		add(removeSelectedBtn);
		add(removeAllBtn);

		setVisible(true);
	}

	public static void main(String[] args) {
		new ComboBoxDemo();
	}
}
