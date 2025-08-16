import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class acctionListener extends JFrame implements ActionListener {

    JLabel j1;
    JButton b1, b2;

    public acctionListener() {
        setSize(500, 500);
        setTitle("Demo");
        setLayout(new FlowLayout());
        j1 = new JLabel("THis is label");
        b1 = new JButton("Vegetable");
        b1.addActionListener(_ -> {
            j1.setText("Vegetable");
            System.out.println("Vegetable");
        });
        b2 = new JButton("Fruit");
        b2.addActionListener(_ -> {
            j1.setText("Fruit");
            System.out.println("Fruit");

        });
        add(j1);
        add(b1);
        add(b2);
        setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'actionPerformed'");
    }

    public static void main(String[] args) {
        new acctionListener();
    }

}
