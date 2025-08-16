import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class list2 extends JFrame implements ActionListener {
    JScrollPane scroll;
    JButton button;
    JLabel label;
    JList list;

    public list2() {
        setSize(500, 500);
        setTitle("Demo");
        setLayout(new FlowLayout());

        list = new JList(new String[] { "Jan", "Feb", "Mar", "Apr", "May", "Jun" });
        list.setVisibleRowCount(4);
        scroll = new JScrollPane(list);
        label = new JLabel("This is label");
        button = new JButton("Click me");
        button.addActionListener(this);
        add(scroll);
        add(label);
        add(button);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (list.getSelectedIndex() != -1) {
            label.setText(list.getSelectedValue().toString());
        }
    }

    public static void main(String[] args) {
        new list2();
    }

}
