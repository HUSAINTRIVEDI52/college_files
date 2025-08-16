import javax.swing.*;
import java.awt.*;  
import java.awt.event.*;  



public class MouseListenerExample2 extends JFrame implements MouseListener, MouseMotionListener
{  
   	MouseListenerExample2()
	{  
		 setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        	addMouseListener(this);  
        	addMouseMotionListener(this);  
          	setTitle("Mouse Event");
        	setSize(300,300);  
        	setLayout(null);  
        	setVisible(true);  
    	}  
    
	public void mouseClicked(MouseEvent e)
	{  
     
     		Graphics g=getGraphics();  
        //	g.setColor(Color.BLUE);  
        	g.drawOval(e.getX(),e.getY(),30,130);    
        System.out.println("Mouse Clicked"); 
    	}  
    
	public void mouseEntered(MouseEvent e) 
	{
		System.out.println("Mouse Entered in Frame");
	}  
    	public void mouseExited(MouseEvent e) 
	{
		System.out.println("Mouse Exited from the Frame");
	}  
    	public void mousePressed(MouseEvent e) 
	{
		System.out.println("Mouse Clicked");
	}  
    	public void mouseReleased(MouseEvent e) 
	{
		System.out.println("Mouse click released");
	}  
	public void mouseDragged(MouseEvent me)
	{
		System.out.println("Mouse Dragged");
	}
	
      	public void mouseMoved(MouseEvent me)
	{
		System.out.println("Mouse Moved");
	}
      	
	public static void main(String[] args) 
	{  
    		new MouseListenerExample2();  
		
	}  
}  
