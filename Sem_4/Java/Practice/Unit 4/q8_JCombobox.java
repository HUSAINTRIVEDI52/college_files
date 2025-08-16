import javax.swing.JComboBox;
import javax.swing.JFrame;

public class q8_JCombobox {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Scroll");
        frame.setSize(500, 500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        frame.setLayout(null);

        String[] items = { "Select", "India", "U.S.A.", "China", "Africa", "Pakistan" };
        JComboBox<String> combobox = new JComboBox<>(items);

        combobox.setBounds(100, 150, 100, 30);
        frame.add(combobox);
    }

}
