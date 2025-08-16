import java.sql.*;
import java.applet.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class gui extends JFrame {

    JTextField t1, t2, t3;
    JButton b1;
    JLabel j1, j2, j3;

    public gui() {

        setTitle("Demo");
        setSize(250, 250);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new GridLayout(4, 1, 10, 20));

        j1 = new JLabel("ID");
        add(j1);
        t1 = new JTextField();
        add(t1);
        j2 = new JLabel("Name");
        add(j2);
        t2 = new JTextField();
        add(t2);
        j3 = new JLabel("Email");
        add(j3);
        t3 = new JTextField();
        add(t3);
        b1 = new JButton("Button");
        add(b1);

        setVisible(true);

        b1.addActionListener(_ -> {
            String url = "jdbc:mysql://localhost:3306/world";
            String user = "root";
            String pass = "1111";
            int id = Integer.parseInt(t1.getText());
            String name = t2.getText();
            String email = t3.getText();
            try {
                Class.forName("com.mysql.cj.jdbc.Driver");
                Connection con = DriverManager.getConnection(url, user, pass);
                PreparedStatement st = con.prepareStatement("insert into stu values (?,?,?);");
                st.setInt(1, id);
                st.setString(2, name);
                st.setString(3, email);
                int result = st.executeUpdate();
                if (result > 0) {
                    JOptionPane.showMessageDialog(this, "Inserted successfully");
                    t1.setText("");
                    t2.setText("");
                    t3.setText("");
                } else {

                    JOptionPane.showMessageDialog(this, "Failed");
                }
            } catch (Exception e) {
                e.printStackTrace();
            }

        });

    }

    public static void main(String[] args) {
        new gui();
    }
}
