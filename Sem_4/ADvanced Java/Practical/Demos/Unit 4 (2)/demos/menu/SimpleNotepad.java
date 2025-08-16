import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class SimpleNotepad extends JFrame implements ActionListener {

	JTextArea textArea;
	JMenuItem cut, copy, paste, selectAll;

	public SimpleNotepad() {
		setTitle("Simple Notepad");
		setSize(500, 500);
		setDefaultCloseOperation(EXIT_ON_CLOSE);

		// Text Area with Scroll
		textArea = new JTextArea();
		JScrollPane scrollPane = new JScrollPane(textArea);
		add(scrollPane, BorderLayout.CENTER);

		// Menu Bar
		JMenuBar menuBar = new JMenuBar();
		JMenu file = new JMenu("File");
		JMenu edit = new JMenu("Edit");
		JMenu help = new JMenu("Help");

		// Menu Items
		cut = new JMenuItem("Cut");
		copy = new JMenuItem("Copy");
		paste = new JMenuItem("Paste");
		selectAll = new JMenuItem("Select All");

		// Add action listeners
		cut.addActionListener(this);
		copy.addActionListener(this);
		paste.addActionListener(this);
		selectAll.addActionListener(this);

		// Assemble Menu
		edit.add(cut);
		edit.add(copy);
		edit.add(paste);
		edit.add(selectAll);
		menuBar.add(file);
		menuBar.add(edit);
		menuBar.add(help);

		setJMenuBar(menuBar);

		setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		Object src = e.getSource();
		if (src == cut)
			textArea.cut();
		else if (src == copy)
			textArea.copy();
		else if (src == paste)
			textArea.paste();
		else if (src == selectAll)
			textArea.selectAll();
	}

	public static void main(String[] args) {
		SwingUtilities.invokeLater(SimpleNotepad::new);
	}
}
