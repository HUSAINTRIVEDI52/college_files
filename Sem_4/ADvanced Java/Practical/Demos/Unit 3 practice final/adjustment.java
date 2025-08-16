import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class adjustment extends JFrame implements AdjustmentListener {
    JLabel j1, j2;
    JScrollBar s1;
    Container c1;

    public adjustment() {
        setTitle("Demo");
        setSize(500, 400);
        s1 = new JScrollBar(JScrollBar.HORIZONTAL);
        c1 = getContentPane();
        s1.setMinimum(1);
        s1.setMaximum(100);
        s1.setBounds(30, 20, 100, 20);
        j1 = new JLabel();
        c1.add(s1);
        c1.add(j1);
        s1.addAdjustmentListener(this);
        setVisible(true);

    }

    @Override
    public void adjustmentValueChanged(AdjustmentEvent e) {
        j1.setText("Value is " + s1.getValue());
    }

    public static void main(String[] args) {
        new adjustment();
    }
}