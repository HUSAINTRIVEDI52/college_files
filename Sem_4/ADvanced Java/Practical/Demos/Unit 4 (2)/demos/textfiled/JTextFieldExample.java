import javax.swing.*; 
 import java.awt.*; 
 class JTextFieldExample extends JFrame 
 { 
    JTextFieldExample() 
    { 
        setLayout(new FlowLayout()); 
        JLabel lblRollno = new JLabel("Rollno : "); 
        JTextField txtRollno = new JTextField(15); 
        JLabel lblName = new JLabel("Name :"); 
        JTextField txtName = new JTextField("Mr Thakur",15); 
        add(lblRollno); add(txtRollno); 
        add(lblName); add(txtName); 
    } 
 
  
        public static void main(String args[]) 
       {  
            JTextFieldExample frame = new JTextFieldExample(); 
             frame.setTitle("JTextField in Java Swing Example"); 
             frame.setBounds(200,250,150,150); 
             frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
              
             frame.setVisible(true); 
   } 
 } 
