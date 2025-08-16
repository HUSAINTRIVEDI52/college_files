import javax.swing.*;

public class ComboBoxExample {
    public static void main(String[] args) {
        // Creating the frame
        JFrame frame = new JFrame("ComboBox Example");
        frame.setSize(300, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null); // Using null layout for custom positioning

        // Creating the JComboBox
        String[] countries = { "India", "Aus", "U.S.A", "England", "Newzealand" };
        JComboBox<String> comboBox = new JComboBox<>(countries);

        // Positioning the ComboBox
        comboBox.setBounds(100, 50, 100, 30);

        // Adding ComboBox to the frame
        frame.add(comboBox);

        // Making the frame visible
        frame.setVisible(true);
    }
}
