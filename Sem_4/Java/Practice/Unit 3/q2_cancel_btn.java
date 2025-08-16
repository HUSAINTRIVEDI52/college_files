
import java.awt.*;

import java.awt.event.*;

import javax.swing.*;

public class q2_cancel_btn {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setSize(500, 500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);

        JButton cancel = new JButton("Cancel");
        cancel.addActionListener(_ -> System.out.println("Frame closed"));
        frame.add(cancel);
    }

}
