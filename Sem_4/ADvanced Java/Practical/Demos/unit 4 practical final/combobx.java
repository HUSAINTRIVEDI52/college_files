import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class combobx extends JFrame {
    JComboBox combobox;
    JLabel label;

    public combobx() {
        setTitle("Demo");
        setSize(500, 500);
        setLayout(new FlowLayout());

        combobox = new JComboBox<>(new String[] { "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday" });
        label = new JLabel("");

        combobox.addActionListener(_ -> {
            String s = (String) combobox.getSelectedItem();
            int selectedindes = combobox.getSelectedIndex();
            label.setText("The selected item is" + s + "\nThe selected index is " + selectedindes);
        });
        add(combobox);
        add(label);
        setVisible(true);
    }

    public static void main(String[] args) {
        new combobx();
    }
}
