// 1) Write a Java program to that will Create one frame with a label âWELCOME TO GLS UNIVERSITYâ.
-> import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
class demo1 extends JFrame
{
JLabel l1;
demo1(String s)
{
super(s);
setVisible(true);
setSize(500,500);
FlowLayout f1 = new FlowLayout(FlowLayout.CENTER);
setLayout(f1);
setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
l1 = new JLabel("WELCOME TO GLS UNIVERSITY");
add(l1);
}
public static void main(String args[])
{
new demo1("DEMO1");
}
}