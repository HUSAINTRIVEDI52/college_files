import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class adjustments extends JFrame implements AdjustmentListener {
    JScrollBar s1,s2;
    JLabel j1,j2;

    public adjustments() {
        setTitle("Demo");
        setSize(500, 500);
        s1 = new JScrollBar(JScrollBar.HORIZONTAL);
        s1.setBounds(50, 50, 80, 20);
        s1.setMinimum(1);
        s1.setMaximum(100);


        s2 = new JScrollBar(JScrollBar.VERTICAL);
        s2.setBounds(50, 50, 20, 80);
        s2.setMinimum(1);
        s2.setMaximum(100);
        j2 = new JLabel(" value 0");

        setLayout(new FlowLayout());
        j1 = new JLabel(" value 0");
        add(s1);
        add(j1);
        add(j2);
        add(s2);
        setVisible(true);
        s1.addAdjustmentListener(this);
        s2.addAdjustmentListener(this);

    }

    @Override
    public void adjustmentValueChanged(AdjustmentEvent e) {
        j1.setText("Value of horizontal " + s1.getValue());
        j2.setText("Value of vertical is " + s2.getValue());
    }

    public static void main(String[] args) {
        new adjustments();
    }

}