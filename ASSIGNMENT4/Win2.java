import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class Win2 extends JFrame implements ActionListener{
    Container cn;
    JLabel t1;
    JButton jb1;

    public Win2(){
            cn = getContentPane();
            setTitle("Window 1");
            setLayout(null);
            cn.setBackground(Color.CYAN);
            t1 = new JLabel("You are in Second Window");
            t1.setForeground(Color.BLACK);
            t1.setBounds(250,100,300,50);
            cn.add(t1);
            jb1 = new JButton("Go to 1st Window");
            jb1.setBounds(200,200,250,30);
            jb1.addActionListener(this);
            cn.add(jb1);

            setSize(1000,1000);
            setVisible(true);
    }
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource() == jb1){
            setVisible(false);
            new Win1();
            System.out.println("Hye");
        }
    }
}