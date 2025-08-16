import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class q9_menubar {

    public static void main(String[] args) {
        JFrame frame = new JFrame("Menus");
        frame.setSize(200, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JMenuBar menubar = new JMenuBar();

        JMenu menu = new JMenu("Menu");

        JMenuItem item1 = new JMenuItem("item 1");
        JMenuItem item2 = new JMenuItem("item 2");
        JMenuItem item3 = new JMenuItem("item 3");

        JMenu subitem = new JMenu("Sub-Item");
        JMenuItem item4 = new JMenuItem("item 4");
        JMenuItem item5 = new JMenuItem("item 5");

        menu.add(item1);
        menu.add(item2);
        menu.add(item3);

        subitem.add(item4);
        subitem.add(item5);
        menu.add(subitem);
        menubar.add(menu);
        frame.setJMenuBar(menubar);

        frame.setVisible(true);

    }
}
