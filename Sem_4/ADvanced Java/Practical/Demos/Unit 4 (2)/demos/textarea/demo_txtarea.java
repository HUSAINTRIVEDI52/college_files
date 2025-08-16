import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

class demo_txtarea extends JFrame
{
	JTextField t1;
	JPasswordField p1;
	JTextArea t2;

	String txt="irefox is configured to use a proxy server that is refusing conne. ctions.irefox fb  dfgdfgd dgdgd dfgdf g is configured to use a proxy server that is refusing connections.irefox is configured to use a proxy server that is refusing connections.irefox is configured to use a proxy server that is refusing connections.irefox is configured to use a proxy server that is refusing connections.irefox is configured to use a proxy server that is refusing connections.irefox is configured to use a proxy server that is refusing connections.irefox is configured to use a proxy server that is refusing connections.irefox is configured to use a proxy server that is refusing connections.irefox is configured to use a proxy server that is refusing connections.irefox is configured to use a proxy server that is refusing connections.irefox is configured to use a proxy server that is refusing connections.irefox is configured to use a proxy server that is refusing connections.irefox is configured to use a proxy server that is refusing connections.";
	
	demo_txtarea(String s)
	{
		
		super(s);
		setVisible(true);	
		setSize(400,400);
	
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE) ;	
		setLayout(new FlowLayout(FlowLayout.LEFT));
		
		char c='$';
		Font f=new Font("Arial",Font.BOLD, 15);
		t1=new JTextField("ENTER YOUR NAME");
		p1=new JPasswordField(20);
		p1.setEchoChar(c);
		
		t2=new JTextArea(txt,4,20);
		t2.setWrapStyleWord(true);
		t2.setLineWrap(true);
		t2.setFont(f);
		JScrollPane scrollV = new JScrollPane(t2);
		t2.setEditable(false);
		t2.insert("Hello",0);
		add(t1);
		add(p1);
		add(scrollV);
		//add(p);
	}

	public static void main(String args[])
	{
		new demo_txtarea("DEMO");
	
	}
}

