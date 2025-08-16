import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class RadioButtonExample {
    public static void main(String[] args) {
        // Create the frame
        JFrame frame = new JFrame("JRadioButton Example");
        frame.setSize(300, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new FlowLayout());

        // Create radio buttons
        JRadioButton maleButton = new JRadioButton("MALE");
        JRadioButton femaleButton = new JRadioButton("FEMALE");

        // Group the radio buttons to allow only one selection at a time
        ButtonGroup group = new ButtonGroup();
        group.add(maleButton);
        group.add(femaleButton);

        // Add action listeners to print the selected value
        maleButton.addActionListener(e -> System.out.println("MALE"));
        femaleButton.addActionListener(e -> System.out.println("FEMALE"));

        // Add buttons to the frame
        frame.add(maleButton);
        frame.add(femaleButton);

        // Set frame visibility
        frame.setVisible(true);
    }
}
