import java.applet.Applet;
import java.awt.Color;
import java.awt.Graphics;
import java.util.Random;

public class CircleApplet extends Applet {
    private int radius;

    @Override
    public void init() {
        // Retrieve the radius parameter from the HTML file
        String radiusParam = getParameter("radius");
        radius = Integer.parseInt(radiusParam);
    }

    @Override
    public void paint(Graphics g) {
        // Get the applet's dimensions
        int width = getWidth();
        int height = getHeight();

        // Calculate the center of the applet
        int centerX = width / 2;
        int centerY = height / 2;

        // Generate a random color
        Random random = new Random();
        Color randomColor = new Color(random.nextInt(256), random.nextInt(256), random.nextInt(256));

        // Set the random color
        g.setColor(randomColor);

        // Draw the filled circle
        g.fillOval(centerX - radius, centerY - radius, radius * 2, radius * 2);
    }
}

/*
<applet code="CircleApplet.class" width="400" height="400">
    <param name="radius" value="100">
</applet>
*/
