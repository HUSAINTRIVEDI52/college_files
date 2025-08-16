import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class q6_password {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Password");
        frame.setSize(500, 500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new FlowLayout());
        frame.setVisible(true);

        JLabel label = new JLabel("Enter the password");
        JPasswordField passwordfield = new JPasswordField(15);

        JButton showButton = new JButton("Show Password");
        showButton.addActionListener(_ -> {
            char[] password = passwordfield.getPassword();
            System.out.println("Password" + new String(password));
        });
        frame.add(label);
        frame.add(passwordfield);
        frame.add(showButton);

    }

}
