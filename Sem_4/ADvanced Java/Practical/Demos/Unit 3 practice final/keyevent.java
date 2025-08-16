import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class keyevent extends JFrame implements KeyListener {
    JTextArea j;
    JLabel l1;

    public keyevent() {
        setSize(500, 500);
        setTitle("Demo");
        setLayout(new FlowLayout());
        l1 = new JLabel();
        j = new JTextArea(50, 50);
        // l1.setBounds(50, 50, 20, 20);
        j.addKeyListener(this);
        // j.setBounds(70, 70, 200, 200);
        add(l1);
        add(j);
        setVisible(true);
    }

    @Override
    public void keyTyped(KeyEvent e) {

        l1.setText("Key Typed");
    }

    @Override
    public void keyPressed(KeyEvent e) {
        l1.setText("Key Pressed");
    }

    @Override
    public void keyReleased(KeyEvent e) {
        l1.setText("Key released");
    }

    public static void main(String[] args) {
        new keyevent();
    }
}
