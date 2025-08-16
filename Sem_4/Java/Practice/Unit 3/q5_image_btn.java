import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;

public class q5_image_btn {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setSize(500, 500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        frame.setLayout(null);

        ImageIcon image = new ImageIcon(
                "\"C:\\Users\\Husain\\Pictures\\WhatsApp Image 2024-11-15 at 12.02.13_cb7e15fe.jpg\"");

        JButton btn = new JButton(image);
        btn.setBounds(80, 50, 120, 53);
        btn.addActionListener(_ -> System.out.println("Welcome to adv java"));

        frame.add(btn);

    }

}
