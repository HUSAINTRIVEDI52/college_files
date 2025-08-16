import java.awt.*; 
import java.awt.event.*; 
import javax.swing.*;

class event2 extends JFrame implements TextListener 
 { 
   TextField Txt; 
     event2()
         { 
           setTitle("Example of Text Listener"); 
           setLayout(new FlowLayout()); 
           Txt=new TextField("hello",50); 
           add(Txt); 
	   Txt.addTextListener(this); 
           setSize(400,400); 
           setVisible(true); 
         } 
           public void textValueChanged(TextEvent Evnt) 
           { 
              setTitle(Txt.getText()); 
		System.out.println("changed");
           } 
              public static void main(String aa[]) 
              { 
                 new event2(); 
              } 
  } 
