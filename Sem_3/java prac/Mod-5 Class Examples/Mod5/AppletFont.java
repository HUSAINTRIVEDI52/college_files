    import java.awt.*;    
    import java.applet.*;    
        
    public class AppletFont extends Applet    
     {    
       Font f1,f2,f3;    
        
       public void  init()    
        {    
           f1 = new Font("Arial",Font.BOLD,18);    
           f2 = new Font("Forte",Font.PLAIN,24);    
           f3 = new Font("Elephant",Font.ITALIC,28);    
        }    
       public void  paint(Graphics g)    
       {    
          g.drawString("JAVA",50,50);    
          g.setFont(f1);     
          g.drawString("JAVA",50,80);    
          g.setFont(f2);     
          g.drawString("JAVA",50,110);    
          g.setFont(f1);     
          g.drawString("JAVA",50,140);    
       }    
     }    
        
    /* <applet code = "AppletFont.class" height = 500 width =500>  
       </applet> */

