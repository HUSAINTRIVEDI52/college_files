import javax.swing.*;


class demo1 extends JFrame
{
	JButton b1,b2,b3;
	Container con;
	demo1(String s)
	{
		super(s);
		setSize(250,150);
		con = getContentPane();
		FlowLayout f1=new FlowLayout(FlowLayout.LEFT);
		con.setLayout(f1);
		b1= new JButton("ZERO");
		b2= new JButton("ONE");
		b3= new JButton("TWO");
		con.add(b1);
		con.add(b2);
		con.add(b3);
	
		

	}	

}
class demo1
{
	public static void main(String args[])
	{
		demo1 fb = new demo1("Button Demo");
		fb.setVisible(true);
	}

}









