import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class comboboxx extends JFrame {

    JComboBox combobox;
    JButton RemoveIndex, Removeall, Removeselectedbutton;
    JLabel selectedlabel;
    JTextField indexfield;

    public comboboxx() {
        setTitle("Demo");
        setSize(500, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());

        combobox = new JComboBox<>(
                new String[] { "jan", "Feb", "Mar", "Apr", "May", "June", "July", "Aug", "Sept", "Oct", "Nov", "Dec" });
        combobox.setEditable(true);

        selectedlabel = new JLabel("Selected Label");

        indexfield = new JTextField(5);

        RemoveIndex = new JButton("Remove Index");
        Removeall = new JButton("Remove All");
        Removeselectedbutton = new JButton("Remove Selected button");

        add(combobox);
        add(selectedlabel);
        add(indexfield);
        add(RemoveIndex);
        add(Removeall);
        add(Removeselectedbutton);

        // combobox:
        combobox.addActionListener(_ -> {
            selectedlabel.setText("Selected:" + combobox.getSelectedItem());
        });

        // remove by index button:
        RemoveIndex.addActionListener(_ -> {
            try {
                int index = Integer.parseInt(indexfield.getText());
                combobox.removeItemAt(index);
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        });
        // remove selected item
        Removeselectedbutton.addActionListener(_ -> {
            combobox.removeItem(combobox.getSelectedItem());
        });
        // remove all items
        Removeall.addActionListener(_ -> {
            combobox.removeAllItems();
        });

        setVisible(true);

    }

    public static void main(String[] args) {
        new comboboxx();
    }
}
