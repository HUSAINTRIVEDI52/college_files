import java.util.*;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class q1_label {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Welcome to gls university:");
        frame.setSize(500, 500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        JLabel label = new JLabel("Welcome to Gls university");
        frame.add(label);
    }
}