import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class windowsListener extends JFrame implements WindowListener {

    public windowsListener() {
        setTitle("Demo");
        setSize(500, 500);
        setVisible(true);
        setLocation(300, 400);
        addWindowListener(this);
    }

    public static void main(String[] args) {
        new windowsListener();
    }

    @Override
    public void windowOpened(WindowEvent e) {
        System.out.println("Window opened");
    }

    @Override
    public void windowClosing(WindowEvent e) {
        System.out.println("window Closing");
    }

    @Override
    public void windowClosed(WindowEvent e) {
        System.out.println("Window CLosed");
    }

    @Override
    public void windowIconified(WindowEvent e) {
        System.out.println("Iconified");
    }

    @Override
    public void windowDeiconified(WindowEvent e) {
        System.out.println("Window Deiconified");
    }

    @Override
    public void windowActivated(WindowEvent e) {
        System.out.println("Window activated");
    }

    @Override
    public void windowDeactivated(WindowEvent e) {
        System.out.println("Window desctivated");
    }

}
