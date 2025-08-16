import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Q1_on_off{
    public static void main(String[] args)
    {
        JFrame frame=new JFrame("New frame for button toggle on off");
        frame.setSize(300,200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new FlowLayout());

        JToggleButton toggleButton=new JToggleButton("Off");
        toggleButton.addItemListener(e->{
            if(toggleButton.isSelected()){
                toggleButton.setText("ON");
                System.out.println("ON");
            }
            else{
                toggleButton.isSelected();
                toggleButton.setText("OFF");
                System.out.println("Off");
            }
        });
        frame.add(toggleButton);
        frame.setVisible(true);
    }
}