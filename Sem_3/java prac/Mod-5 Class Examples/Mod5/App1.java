import java.applet.*;
// import java.awt.Graphics;
import java.awt.*;

public class App1 extends Applet {
	
	
	Image pic;
	public void init()
	{
		pic=getImage(getDocumentBase(),"n1.jpg");
		
		System.out.println("init");
	}
	public void start()
	{
		System.out.println("started");
	}
	public void paint(Graphics g)
	{
		g.drawString("First Example",180,30);
		g.setColor(Color.red);
		g.fillRect(50,100,200,50);
		g.fillRect(75,75,150,50);
		g.setColor(Color.blue);
		g.fillRect(110,80,30,30);
		g.fillRect(160,80,30,30);
		g.setColor(Color.black);
		g.fillOval(75,140,50,50);
		g.fillOval(175,140,50,50);
		
		g.drawImage(pic,30,30,this);
	}
}	
/*
<applet code="App1.class" height="400" width="400">
</applet>
*/















