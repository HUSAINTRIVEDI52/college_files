import javax.swing.*;
import java.awt.event.*;

class Winclose extends WindowAdapter
{
    	public void windowClosing(WindowEvent we)
	{
		System.exit(0);
	}
	
}

class demo7
{
	public static void main(String args[])
	{
	JFrame f1=new JFrame("Frame Title");
	Winclose wc=new Winclose();
	f1.addWindowListener(wc);
		f1.setTitle("title2");
		f1.setVisible(true);
		f1.setSize(200,200);
		f1.setLocation(300,400);

	}

}
