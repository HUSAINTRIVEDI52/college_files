import javax.swing.*;
import java.awt.*;

public class DrawLineExample extends JPanel {

    // Override the paintComponent method to draw on the JPanel
    @Override
    public  void paintComponent(Graphics g) {
        super.paintComponent(g); // Call the parent class's method to ensure proper painting

        // Set the color of the line (optional)
        g.setColor(Color.BLUE);

        // Draw a line from coordinates (x1, y1) to (x2, y2)
        g.drawLine(50, 50, 250, 250); // (x1, y1) to (x2, y2)
    }

    public static void main(String[] args) {
        // Create a JFrame window
        JFrame frame = new JFrame("Draw Line Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 400);

        // Add the custom JPanel that draws the line
        frame.add(new DrawLineExample());

        // Make the window visible
        frame.setVisible(true);
    }
}
