import java.applet.Applet;
import java.awt.*;

public class smiley extends Applet{
    public void paint(Graphics g)
    {
        g.setColor(Color.yellow);
        g.fillOval(20,20,350,350); //for face
        g.setColor(Color.black);
        g.fillOval(210,80,50,50); //for right eye
        g.fillOval(120,80,50,50); // for left eye
        int[] x={190,190,165,190};
        int[] y={202,230,190,192};
        g.drawPolygon(x,y,4); //nose
        g.setColor(Color.black);
      g.drawPolygon(x, y, 4);
        g.drawArc(150,225,100,75,0,-180);  // Smile
         g.drawLine(140,262,170,260);   // Smile arc1
         g.drawLine(230,269,260,260);  // Smile arc2
        
    }
    
}
/*
<applet code="smiley.class" height="500" width="500"> </applet>
*/