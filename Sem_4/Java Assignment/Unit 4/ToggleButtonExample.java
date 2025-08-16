

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ToggleButtonExample {
    public static void main(String[] args) {
        // Create the frame
        JFrame frame = new JFrame("JToggleButton Example");
        frame.setSize(300, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new FlowLayout());

        // Create the toggle button
        JToggleButton toggleButton = new JToggleButton("OFF");

        // Add action listener to handle click events
        toggleButton.addItemListener(e -> {
            if (toggleButton.isSelected()) {
                toggleButton.setText("ON");
                System.out.println("ON");
            } else {
                toggleButton.setText("OFF");
                System.out.println("OFF");
            }
        });

        // Add the toggle button to the frame
        frame.add(toggleButton);

        // Set frame visibility
        frame.setVisible(true);
    }
}
