import java.awt.Color;
import java.awt.Container;
import javax.swing.*;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class Frame extends JFrame implements ActionListener{
    Container c;
    JLabel l1,l2,l3;
    JTextField t1,t2;
    JButton b1,b2;
    Frame() {
    setSize(500,700);
    setTitle("GUI Program");
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
    t1.setBounds(140,50,100,30);
    c.add(t1);

    l2= new JLabel("Second Number");
    l2.setBounds(50,100,80,20);
    c.add(l2);

    t2= new JTextField();
    t2.setBounds(140,100,100,30);
    c.add(t2);

    l3=new JLabel();
    l3.setBounds(100,200,80,20);
    c.add(l3);

    b1=new JButton("Add");
    b1.setBounds(150,150,100,30);
    c.add(b1);

    b2=new JButton("Reset");
    b2.setBounds(50,150,100,30);
    b2.addActionListener(this);
    c.add(b2);
    
    b1.addActionListener(this);
    setVisible(true);
 }
 public static void main(String[] args){
    new Frame();
 }
 
 public void actionPerformed(ActionEvent e){

   if (e.getSource()== b2){
      t1.setText("");
      t2.setText("");

   }
   int a= Integer.parseInt(t1.getText());
   int b= Integer.parseInt(t2.getText());
   int C= a+b;
   l3.setText("sum"+C);
 }
}
