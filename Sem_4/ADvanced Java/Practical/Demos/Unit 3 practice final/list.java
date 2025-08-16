import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class list extends JFrame implements ActionListener {

    JList l1;
    JScrollPane js;
    JLabel lb;
    JButton b1;

    public list() {
        setSize(500, 500);
        setTitle("Demo");
        setLayout(new FlowLayout());
        lb = new JLabel("Hello");
        String s[] = { "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday" };
        l1 = new JList(s);
        js = new JScrollPane(l1);
        b1 = new JButton("CLick me");
        add(lb);
        add(js);
        add(b1);
        l1.setVisibleRowCount(3);
        l1.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        
        b1.addActionListener(this);
        setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        lb.setText("Selected Item" + l1.getSelectedValue() + " " + l1.getSelectedIndex());
    }

    public static void main(String[] args) {
        new list();
    }
}
