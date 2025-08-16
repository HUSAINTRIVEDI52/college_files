import java.awt.FlowLayout;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.JFrame;
import javax.swing.JRadioButton;

public class q10_JRadiobtn {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Radio Buttons");
        frame.setSize(500, 500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        frame.setLayout(new FlowLayout());
        JRadioButton Male = new JRadioButton("Male");
        JRadioButton FeMale = new JRadioButton("FeMale");

        ButtonGroup group = new ButtonGroup();
        group.add(Male);
        group.add(FeMale);

        Male.addActionListener(_ -> System.out.println("Male is selected"));
        FeMale.addActionListener(_ -> System.out.println("FeMale is selected"));

        frame.add(Male);
        frame.add(FeMale);
    }

}
