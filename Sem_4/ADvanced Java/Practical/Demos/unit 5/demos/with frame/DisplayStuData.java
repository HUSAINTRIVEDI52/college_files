import java.sql.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class DisplayStuData {
	public static void main(String[] args) {
		new StuGUI();
	}
}

class StuGUI extends JFrame {
	JTextField idField;
	JLabel idLabel, nameLabel, emailLabel;
	JButton fetchButton;

	StuGUI() {
		setTitle("Student Details");
		setSize(300, 200);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLayout(new GridLayout(5, 1, 5, 5));

		// Input field
		idField = new JTextField();
		add(new JLabel("Enter Student ID:"));
		add(idField);

		// Fetch Button
		fetchButton = new JButton("Fetch Student");
		add(fetchButton);

		// Labels to show result
		idLabel = new JLabel();
		nameLabel = new JLabel();
		emailLabel = new JLabel();
		add(idLabel);
		add(nameLabel);
		add(emailLabel);

		setVisible(true);

		// Lambda action listener
		fetchButton.addActionListener(e -> fetchStudent());
	}

	void fetchStudent() {
		try {
			int studentId = Integer.parseInt(idField.getText());

			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/world", "root", "1111");

			String query = "SELECT * FROM stu WHERE id = ?";
			PreparedStatement stmt = conn.prepareStatement(query, ResultSet.TYPE_SCROLL_INSENSITIVE,
					ResultSet.CONCUR_READ_ONLY);
			stmt.setInt(1, studentId);
			ResultSet rs = stmt.executeQuery();

			if (rs.first()) {
				idLabel.setText("ID: " + rs.getInt("id"));
				nameLabel.setText("Name: " + rs.getString("name"));
				emailLabel.setText("Email: " + rs.getString("email"));
			} else {
				JOptionPane.showMessageDialog(this, "No student found with ID " + studentId);
				idLabel.setText("");
				nameLabel.setText("");
				emailLabel.setText("");
			}

			conn.close();
		} catch (Exception ex) {
			ex.printStackTrace();
			JOptionPane.showMessageDialog(this, "Error: " + ex.getMessage());
		}
	}
}
