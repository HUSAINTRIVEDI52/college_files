import javax.swing.*;
import java.awt.*;  
import java.awt.event.*;  
public class demo8 extends JFrame implements ComponentListener, ActionListener
{  
	JLabel label1;
	JButton b1;
	Container con;
   	demo8()
	{  
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		addComponentListener(this);  
          	setTitle("Mouse Event");
        	setSize(300,300);  
        	setVisible(true);  
		con = getContentPane();
		FlowLayout f1=new FlowLayout(FlowLayout.LEFT);
		con.setLayout(f1);
		label1  = new JLabel("JLabel Show Or Hide Example.");
		b1=new JButton("click");
		b1.addActionListener(this);
		label1.addComponentListener(this);  
		con.add(label1);
		con.add(b1);
		
    	}  
    public void actionPerformed(ActionEvent e)
	{  
 	label1.setVisible(false);
        }  
	public void componentShown(ComponentEvent evt) {
    System.out.println("componentShown");
  }

  public void componentHidden(ComponentEvent evt) {
	Component c= evt.getComponent();
    System.out.println("componentHidden" +c.getName());
  }

  public void componentMoved(ComponentEvent evt) {
Component c= evt.getComponent();
    System.out.println("componentMoved" + c.getName() );
  }

  public void componentResized(ComponentEvent evt) {
    System.out.println("componentResized");
  }
      
	public static void main(String[] args) 
	{  
    		new demo8();  
		
	}  
}  
