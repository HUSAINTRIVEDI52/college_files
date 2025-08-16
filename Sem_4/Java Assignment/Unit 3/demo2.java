2) Write a Java program to that will Create one frame, when we press on cancel button of the frame the message âframe is closedâshould be printed on the terminal.
-> import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
public class demo2 extends JFrame implements ActionListener
{
JButton b1;
JLabel l1;
demo2(String s)
{
setVisible(true);
setSize(500,500);
FlowLayout f1 = new FlowLayout(FlowLayout.RIGHT);
setLayout(f1);
setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
b1=new JButton("CANCEL");
l1=new JLabel();
add(b1);
add(l1);
b1.addActionListener(this);
}
public void actionPerformed(ActionEvent ae)
{
l1.setText("Frame is closed");
}
public static void main(String args[])
{
new demo2("DEMO2");
}
}