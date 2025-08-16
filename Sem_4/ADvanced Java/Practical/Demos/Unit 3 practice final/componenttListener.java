import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class componenttListener extends JFrame implements ComponentListener, ActionListener {

    JFrame j1;
    JButton b1;
    JLabel l1;

    public componenttListener() {
        setTitle("Demo");
        setSize(500, 500);
        setLayout(new FlowLayout());
        b1 = new JButton("Click here");
        l1 = new JLabel("CLick here and the label will be hidden");
        b1.addActionListener(this);
        l1.addComponentListener(this);
        add(b1);
        add(l1);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        // TODO Auto-generated method stub
        l1.setVisible(false);
    }

    @Override
    public void componentResized(ComponentEvent e) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'componentResized'");
    }

    @Override
    public void componentMoved(ComponentEvent e) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'componentMoved'");
    }

    @Override
    public void componentShown(ComponentEvent e) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'componentShown'");
    }

    @Override
    public void componentHidden(ComponentEvent e) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'componentHidden'");
    }

    public static void main(String[] args) {
        new componenttListener();
    }

}
