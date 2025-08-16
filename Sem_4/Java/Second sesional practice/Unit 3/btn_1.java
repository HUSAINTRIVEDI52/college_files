import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class btn_1 extends JFrame implements ActionListener {

    JLabel l1;
    JButton b1, b2;

    public btn_1() {

        setSize(500, 500);
        setTitle("Demo");
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());
        l1 = new JLabel("I am label");
        b1 = new JButton("Apple");
        b2 = new JButton("Banana");
        b1.addActionListener(_ -> l1.setText("This is apple"));
        b2.addActionListener(_ -> l1.setText("This is Banana"));
        add(b1);
        add(b2);
        add(l1);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }

    public static void main(String[] args) {
        new btn_1();
    }
}
