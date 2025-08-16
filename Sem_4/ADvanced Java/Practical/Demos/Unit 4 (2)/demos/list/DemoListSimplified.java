import javax.swing.*;
import java.awt.*;
import java.util.List;

public class DemoListSimplified extends JFrame {

	JList<String> list1, list2;
	DefaultListModel<String> model1, model2;

	public DemoListSimplified() {
		setTitle("JList Demo");
		setSize(400, 300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(new FlowLayout());

		model1 = new DefaultListModel<>();
		for (String month : new String[] { "January", "February", "March", "April", "May", "June", "July" })
			model1.addElement(month);

		list1 = new JList<>(model1);
		list1.setVisibleRowCount(4);
		list1.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);

		model2 = new DefaultListModel<>();
		list2 = new JList<>(model2);
		list2.setVisibleRowCount(4);

		JButton btnOne = new JButton(">");
		JButton btnMultiple = new JButton(">>");
		JButton btnAll = new JButton(">>>");

		// Single move
		btnOne.addActionListener(e -> {
			String selected = list1.getSelectedValue();
			if (selected != null) {
				model2.addElement(selected);
				model1.removeElement(selected);
			}
		});

		// Multi move
		btnMultiple.addActionListener(e -> {
			List<String> selected = list1.getSelectedValuesList();
			selected.forEach(item -> {
				model2.addElement(item);
				model1.removeElement(item);
			});
		});

		// Move all
		btnAll.addActionListener(e -> {
			for (int i = 0; i < model1.size(); i++)
				model2.addElement(model1.getElementAt(i));
			model1.clear();
		});

		add(new JScrollPane(list1));
		add(btnOne);
		add(btnMultiple);
		add(btnAll);
		add(new JScrollPane(list2));

		setVisible(true);
	}

	public static void main(String[] args) {
		SwingUtilities.invokeLater(DemoListSimplified::new);
	}
}
