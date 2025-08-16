import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class Q2_Checkbox {
    public static void main(String[] args)
    {

        JFrame frame = new JFrame("CheckBox");
        frame.setSize(300, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // frame.setLayout(new FlowLayout());

        JCheckBox checkbox = new JCheckBox("C++");
        JCheckBox chekbox2 = new JCheckBox("Java");

        checkbox.addItemListener(e -> {
            if (checkbox.isSelected()) {
                System.out.println("C++ is selected");
            }
            else {
                System.out.println("C++ is not  Selected");
            }
        });


            chekbox2.addItemListener(e -> {
            if (checkbox.isSelected()) {
                System.out.println("Java is selected");
            }
            else {
                System.out.println("Java is not  Selected");
            }

        });
        frame.setLayout(new FlowLayout());
        frame.add(checkbox);
        frame.add(chekbox2);
        frame.setVisible(true);
        


    }
}
