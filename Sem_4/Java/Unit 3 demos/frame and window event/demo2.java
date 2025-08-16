import javax.swing.*;
import java.awt.event.*;


class demo2 extends JFrame implements WindowListener
{
	demo2()
	{
	addWindowListener(this);
	setTitle("title2");
	setVisible(true);
	setSize(200,200);
	setLocation(300,400);

	}
	
	
	public static void main(String args[])
	{
	new demo2();

	}


public void windowActivated (WindowEvent wc) {    
    System.out.println("activated");    
}    

   
  public void windowClosed (WindowEvent wc) {    
    System.out.println("closed");    
}    
 public void windowClosing (WindowEvent wc) {    
    System.out.println("closing");    
    dispose();    
}
public void windowDeactivated (WindowEvent wc) {    
    System.out.println("deactivated");    
}    

public void windowDeiconified (WindowEvent wc) {    
    System.out.println("deiconified");    
}    
  

public void windowIconified(WindowEvent wc) {    
    System.out.println("iconified");    
} 
public void windowOpened (WindowEvent wc) {    
    System.out.println("Opened");    
} 
}












