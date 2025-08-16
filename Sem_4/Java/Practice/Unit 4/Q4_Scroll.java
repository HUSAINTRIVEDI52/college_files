import javax.swing.*;

import java.awt.Label;
import java.awt.event.*;

public class Q4_Scroll {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Scroll");
        frame.setSize(200, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JLabel label = new JLabel("Value:0");

        JScrollBar scrollBar = new JScrollBar();
        scrollBar.addAdjustmentListener(_ -> label.setText("Value: " + scrollBar.getValue()));
        // frame.setLayout(new java.awt.BorderLayout());
        frame.add(scrollBar, "South");
        frame.add(label, "North");
        frame.setVisible(true);
    }

}
