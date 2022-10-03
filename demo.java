
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.*;

public class demo {
    public static void main(String[] args) {
        radiodemo obj= new radiodemo();
    }
}
class radiodemo extends JFrame implements ActionListener{
    JLabel l1;
    JTextField t1;
    JRadioButton r1,r2;
    JButton b;
   public void radiodemo(){
   l1=new JLabel("Greetings");
   t1=new JTextField(15);
   b=new JButton("OK");
   ButtonGroup bg=new ButtonGroup();
   bg.add(r1);
   bg.add(r2);
   r1=new JRadioButton("male");
   r2=new JRadioButton("female");
   b.addActionListener(this);
   add(t1);
   add(r1);
   add(r2);
   add(b);
   add(l1);
       setVisible(true);
       setSize(400,400);
       setLayout(new FlowLayout());
       setDefaultCloseOperation(3);
   }
   public void actionPerformed(ActionEvent ae){
    String name = t1.getText();
       if (r1.isSelected()) {
           name="WELCOME  Mr" + name;
       } else {
           name="WELCOME  Mrs." + name;
       }
       l1.setText(name);
   }
}