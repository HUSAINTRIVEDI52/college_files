import java.awt.*;
import java.applet.*;
import javax.swing.*;
import java.awt.event.*;

public class prac extends Applet implements ActionListener {
    JButton j1,j2,j3;
    JLabel j4;
    JTextField j5,j6;

    public void init()
    {
        j4=new JLabel("WElcome to label");
        add(j4);
        j1=new JButton("+");
        add(j1);
        j2=new JButton("-");
        add(j2);
        j1=new JButton("*");
        add(j3);
        j5=new JTextField("Enter a text",10);
        add(j5);

        
        j6=new JTextField("Enter a text",10);
        add(j6);
        j1.addActionListener(this);
        j2.addActionListener(this);
        j3.addActionListener(this);
    }
        public void actionPerformed(ActionEvent e)
        {
            if(e.getSource()==j1)
            {
             int no1=Integer.parseInt(j5.getText());
             int no2=Integer.parseInt(j6.getText());
             int ans=no1+no2;
             j4.setText(String.valueOf(ans));
            }
            else if(e.getSource()==j2)
            {
                int no=Integer.parseInt(j5.getText());

                int no1=Integer.parseInt(j6.getText());
                int ans=no-no1;
                j4.setText(String.valueOf(ans));
            }else{
                int no1=Integer.parseInt(j1.getText());
                int no2=Integer.parseInt(j2.getText());
                int ans=no1*no2;
                j4.setText(String.valueOf(ans));

            }

        }

    }

// <applet code="prac.class" height="400" width="400">
//</applet>