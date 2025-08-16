import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

class DemoMenu  extends JFrame
{	
	JMenuItem albd,blore,cbe,dhi,chni,dgl,mdu;
	JMenuItem ap,up,ka,kr,or,mh,bn,pb,hr,tr;
	
	DemoMenu()
	{
		setTitle("MenuBar DEMO");
		
		JMenuBar mnubar = new JMenuBar();
		setJMenuBar(mnubar);
	
		JMenu city = new JMenu("Cities");
		
		albd = new JMenuItem("Allahabad");
		blore = new JMenuItem("Bangalore");
		cbe = new JMenuItem("Coimbatore");
		dhi = new JMenuItem("Delhi");
		chni = new JMenuItem("Chennai");
		dgl = new JMenuItem("Dindigul");

		Icon img = new ImageIcon("btn.png");
		mdu = new JMenuItem("Madurai",img);

		city.add(albd);
		city.add(blore);
		city.add(cbe);
		city.add(chni);
		city.add(dhi);
		city.add(dgl);
		city.add(mdu);

		mnubar.add(city);

		JMenu states = new JMenu("States");
		
		ap = new JMenuItem("Andhra Pradesh");
		up = new JMenuItem("Uttar Pradesh");
		ka = new JMenuItem("Karnataka");
		kr = new JMenuItem("Kerala");
		or = new JMenuItem("Orissa");
		mh = new JMenuItem("Maharashtra");
		bn = new JMenuItem("West Bengal");
		pb = new JMenuItem("Punjab");
		hr = new JMenuItem("Haryana");
		tr = new JMenuItem("Tamil Nadu");
		

		states.add(ap);
		states.add(hr);
		states.add(ka);
		states.add(kr);
		states.add(mh);
		states.add(or);
		states.add(pb);
		states.add(up);
		states.add(tr);

		mnubar.add(states);

		addWindowListener(new WindowAdapter()
		{
			public void windowClosing(WindowEvent we)
			{
				System.exit(0);
			}
		});
	
		setVisible(true);
		setSize(400,400);
	}//end of constructor
	
	public static void main(String args[])
	{
		new DemoMenu();
	}
}
	
