import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class lists extends JFrame implements ActionListener {
    JList list;
    JScrollPane scroll;
    JLabel label;
    JButton button;

    public lists() {
        setTitle("Demo");
        setSize(500, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());
        list = new JList<>(new String[] { "1", "2", "3", "4", "5", "6" });

        scroll = new JScrollPane(list);
        button = new JButton("Click me");
        label = new JLabel("Label");
        button.addActionListener(this);

        list.setVisibleRowCount(4);
        list.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        // add(list);
        add(scroll);
        add(button);
        add(label);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (list.getSelectedIndex() != -1) {
            label.setText((String) list.getSelectedValue());
        }
    }

    public static void main(String[] args) {
        new lists();

    }

}