import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class list3 extends JFrame {
    JList list1,list2;
    DefaultListModel listd1,listd2;
    JButton btn1, btn2, btn3;

    public list3() {
        setTitle("Demo");
        setSize(500, 500);
        setLayout(new FlowLayout());

        //Buttons
        btn1 = new JButton(">>");
        btn2 = new JButton(">>");
        btn3 = new JButton(">>");

        //list
        list1 = new JList(new String[] { "1", "2", "3", "4", "5", "6" });
        list1.setVisibleRowCount(4);


        listd1 = new DefaultListModel<>();
        list2 = new JList(listd);
        list2.setVisibleRowCount(4);

    }

}
