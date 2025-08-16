import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class q5_Calc {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Calculator");
        frame.setSize(300, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        frame.setLayout(new GridLayout(5, 1, 10, 10));

        JTextField num1 = new JTextField();
        JTextField num2 = new JTextField();
        JTextField result = new JTextField();
        result.setEditable(false);

        JPanel panel = new JPanel();
        JButton add = new JButton("+");
        JButton sub = new JButton("-");

        add.addActionListener(_ -> {

            int numb1 = Integer.parseInt(num1.getText());
            int numb2 = Integer.parseInt(num1.getText());
            result.setText(String.valueOf(numb1 + numb2));
        });
        sub.addActionListener(_ -> {
            int numb1 = Integer.parseInt(num1.getText());
            int numb2 = Integer.parseInt(num2.getText());
            result.setText(String.valueOf(numb1 - numb2));

        });

        panel.add(add);
        panel.add(sub);

        frame.add(num1);
        frame.add(num2);
        frame.add(result);
        frame.add(panel);

        frame.setVisible(true);
    }
}
