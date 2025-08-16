import java.applet.*;
import java.awt.Graphics;

public class n extends Applet {
    @Override
    public void paint(Graphics g) {
        // Draw Line
        g.drawLine(10, 10, 100, 100);

        // Draw Rectangle
        g.drawRect(120, 10, 80, 50);
        g.fillRect(120, 70, 80, 50);

        // Draw Oval
        
        g.drawOval(220, 50, 80, 50);
        g.fillOval(220, 70, 80, 50);

        // Draw Round Rectangle
        g.drawRoundRect(10, 130, 80, 50, 200, 20);
        g.fillRoundRect(120, 130, 80, 50, 20, 20);

        // Draw Arc
        g.drawArc(220, 130, 80, 50, 0, 180);
        g.fillArc(220, 200, 80, 50, 0, 180);

        // Draw Polygon
        int[] xPoints = {10, 50, 90};
        int[] yPoints = {250, 200, 250};
        g.drawPolygon(xPoints, yPoints, 3);
        g.fillPolygon(xPoints, yPoints, 3) ;

        // Draw String
        g.drawString("Hello, Graphics! 123", 10, 300);
    }
}
/*
<applet code="n.class" height="400" width="400">
</applet>
*/