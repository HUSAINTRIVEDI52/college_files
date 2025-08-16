import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class Jlbl_1 extends JFrame implements ActionListener
{
	JButton b1,b2;
	JLabel lbl1,lbl_img;
	Container con;
	Jlbl_1(String s)
	{
		super(s);
		setSize(400,400);
		con = getContentPane();
		con.setLayout(new FlowLayout(FlowLayout.LEFT));
		
		b1= new JButton("Fruit");
		b1.addActionListener(this);
		con.add(b1);
		
		b2= new JButton("Vegetabel");
		b2.addActionListener(this);
		con.add(b2);

		lbl1 = new JLabel("Nothing Display");
		con.add(lbl1);
		
		lbl_img = new JLabel();
		con.add(lbl_img);
		
		addWindowListener(new WindowAdapter()
		{
			public void windowClosing(WindowEvent we)
			{
				System.exit(0);
			}
		});
		addComponentListener(new ComponentAdapter() 
		{  
    public void componentResized(ComponentEvent evt) 
	{
      Component c = (Component)evt.getSource();
    System.out.println("resized" + c.getName());
   	 }
});	
			
	}
	
	

	public void actionPerformed(ActionEvent e)
	{  
		if(e.getActionCommand()=="Fruit")
		{
			lbl1.setText("Fruit Display");
			ImageIcon img = new ImageIcon("btn_img.jpg");
			lbl_img.setIcon(img);
			con.add(lbl_img);
		}
		else if(e.getActionCommand()=="Vegetabel")
		{
			lbl1.setText("Vegetabel Display");
			ImageIcon img = new ImageIcon("btn_img2.jpg");
			lbl_img.setIcon(img);
			con.add(lbl_img);
		}
		System.out.println(e.getActionCommand());
        }  	

}
class JFrmlbl_1
{
	public static void main(String args[])
	{
		Jlbl_1 fb = new Jlbl_1("Label Demo");
		fb.setVisible(true);
	}

}//end of class JFrame2
