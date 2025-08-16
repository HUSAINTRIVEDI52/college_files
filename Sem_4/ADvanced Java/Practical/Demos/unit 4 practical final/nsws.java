import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.util.concurrent.Flow;

public class nsws extends JFrame {
    JButton e, w, n, s;

    public nsws() {
        setTitle("Demo");
        setSize(500, 500);
        // setLayout(new FlowLayout());
        e = new JButton("East");
        w = new JButton("West");
        n = new JButton("North");
        s = new JButton("South");
        add(e, BorderLayout.EAST);
        add(w, BorderLayout.WEST);
        add(n, BorderLayout.NORTH);
        add(s, BorderLayout.SOUTH);
        setVisible(true);

    }

    public static void main(String[] args) {
        new nsws();
    }
}
