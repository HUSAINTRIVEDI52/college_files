import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JScrollPane;
import java.awt.*;

public class Q3_Scroll {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Scroll Bar");
        frame.setSize(300, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        String[] items = { "Apple", "Banana", "Kiwi", "Orange" };
        JList<String> itemsList = new JList<>(items);
        frame.add(new JScrollPane(itemsList));
                frame.setVisible(true);

    }
    
}
