import java.sql.*;
import javax.swing.*;
import java.awt.*;

public class InsertIntoStuWithLambda {
    public static void main(String[] args) {
        new InsertFormStu();
    }
}

class InsertFormStu extends JFrame {
    JTextField idField, nameField, emailField;
    JButton insertButton;

    InsertFormStu() {
        setTitle("Insert Student Data");
        setSize(400, 200);
        setLayout(new GridLayout(4, 2, 10, 10));
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Components
        add(new JLabel("Student ID:"));
        idField = new JTextField();
        add(idField);

        add(new JLabel("Name:"));
        nameField = new JTextField();
        add(nameField);

        add(new JLabel("Email:"));
        emailField = new JTextField();
        add(emailField);

        insertButton = new JButton("Insert");
        add(insertButton);

        // 🎯 Lambda for action listener
        insertButton.addActionListener(e -> {
            try {
                int id = Integer.parseInt(idField.getText());
                String name = nameField.getText();
                String email = emailField.getText();

                // JDBC Connection
                Class.forName("com.mysql.cj.jdbc.Driver");
                Connection con = DriverManager.getConnection(
                        "jdbc:mysql://localhost:3306/world", "root", "1111");

                String query = "INSERT INTO stu (id, name, email) VALUES (?, ?, ?)";
                PreparedStatement stmt = con.prepareStatement(query);
                stmt.setInt(1, id);
                stmt.setString(2, name);
                stmt.setString(3, email);

                int result = stmt.executeUpdate();

                if (result > 0) {
                    JOptionPane.showMessageDialog(this, "Data inserted successfully!");
                    idField.setText("");
                    nameField.setText("");
                    emailField.setText("");
                } else {
                    JOptionPane.showMessageDialog(this, "Insert failed.");
                }

                con.close();
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(this, "Error: " + ex.getMessage());
            }
        });

        setVisible(true);
    }
}
