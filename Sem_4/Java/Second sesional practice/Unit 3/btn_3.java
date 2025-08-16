import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.concurrent.Flow;

public class btn_3 extends JFrame implements addActionListener {
    JLabel j1, j2;
    JButton b1, b2;

    public btn_3() {

        setSize(500, 500);
        setTitle("Demo");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());
        setVisible(true);

        b1 = new JButton("Btn 1");
        b2 = new JButton("btn 2");

        j1 = new JLabel("This is label 1");
        j2 = new JLabel("This is an image label");

        // b1.addActionListener(_ -> {
        // j1.setText("Linkdin Image");
        // j2.setIcon(new ImageIcon("linkedin.png"));
        // });
        b2.addActionListener(_ -> {
            j1.setVisible(false);
        });

        // add(b1);
        add(b2);
        add(j1);
        add(j2);

    }

    public static void main(String[] args) {
        new btn_3();
    }

}
