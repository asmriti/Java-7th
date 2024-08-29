import java.awt.Color;
import java.awt.Container;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Frame extends JFrame {
    Container c;
    JLabel l1;
    JTextField t1;
    Frame() {
    setSize(500,700);
    setTitle("GUI Program");
    // setLocation(120,250);
    setLocationRelativeTo(null);
    setResizable(false);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    c= this.getContentPane();
    c.setBackground(Color.red);
    c.setLayout(null);

    l1= new JLabel("First Number");
    l1.setBounds(50,50,80,20);
    c.add(l1);
    
    t1= new JTextField(); 
    t1.setBounds(130,50,80,30);
    c.add(t1);
    
    setVisible(true);
 }
 public static void main(String[] args){
    new Frame();
 }
}
