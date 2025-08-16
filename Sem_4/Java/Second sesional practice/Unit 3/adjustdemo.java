import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class adjustdemo extends JFrame implements AdjustmentListener {
    private JScrollBar s1, s2;
    private JLabel l1, l2;

    public adjustdemo() {
        setTitle("Adjustment Demo");
        setSize(300, 150);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout()); // Using FlowLayout for automatic positioning

        l1 = new JLabel("Value is: 1");
        l2 = new JLabel("Value is 1");
        s1 = new JScrollBar(JScrollBar.HORIZONTAL, 1, 1, 1, 100);
        s2 = new JScrollBar(JScrollBar.VERTICAL, 1, 1, 1, 100);

        s1.addAdjustmentListener(this);
        s2.addAdjustmentListener(this);

        add(l1);
        add(l2);
        add(s1);
        add(s2);

        setVisible(true);
    }

    @Override
    public void adjustmentValueChanged(AdjustmentEvent e) {
        l1.setText("Value is: " + s1.getValue());
        l2.setText("Value is" + s2.getValue());
    }

    public static void main(String[] args) {
        new adjustdemo();
    }
}
