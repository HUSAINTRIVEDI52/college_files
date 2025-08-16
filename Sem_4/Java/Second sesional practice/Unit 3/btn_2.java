import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class btn_2 extends JFrame implements ActionListener {

    JLabel l1;
    JTextField t1, t2;
    JButton b1, b2;

    public btn_2() {
        setTitle("Demo");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(500, 500);
        setLayout(new FlowLayout());

        l1 = new JLabel("Answer");
        t1 = new JTextField(10);
        t2 = new JTextField(10);
        b1 = new JButton("Add");
        b2 = new JButton("Sub");

        b1.addActionListener(e -> {
            try {

                int n1 = Integer.parseInt(t1.getText());
                int n2 = Integer.parseInt(t2.getText());
                int n3 = n1 + n2;
                l1.setText("Ans is " + n3);

            } catch (NumberFormatException ez) {
                l1.setText(ez.getMessage());
            }
        });

        b2.addActionListener(e ->

        {
            try {

                int n1 = Integer.parseInt(t1.getText());
                int n2 = Integer.parseInt(t2.getText());
                int n3 = n1 - n2;
                l1.setText("Ans is " + n3);

            } catch (Exception es) {
                l1.setText(es.getMessage());
            }
        });
        add(l1);
        add(b1);
        add(b2);
        add(t1);
        add(t2);
        setVisible(true);
    }

    public static void main(String[] args) {
        new btn_2();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        // TODO Auto-generated method stub
        // throw new UnsupportedOperationException("Unimplemented method
        // 'actionPerformed'");
    }
}
